package utils;

import com.formdev.flatlaf.FlatLightLaf;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import javax.swing.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class BaseTest {
    protected static String browser = null;
    protected WebDriver driver;
    protected String baseUrl;
    protected webSteps webSteps;

    public void setUpBrowser() {
        // Only ask for the browser if it's not already set
        if (browser == null) {
            browser = getUserBrowserInput();
        }

        System.out.println("Selected Browser: " + browser);

        switch (browser.toLowerCase()) {
            case "chrome":
                driver = new ChromeDriver();
                break;
            case "firefox":
                driver = new FirefoxDriver();
                break;
            case "edge":
                driver = new EdgeDriver();
                break;
            default:
                throw new RuntimeException("Browser is not supported: " + browser);
        }
    }

    public void loadUrl() throws InterruptedException, IOException {
        Properties properties = new Properties();
        FileInputStream fis = new FileInputStream("src/main/resources/config.properties");
        properties.load(fis);
        baseUrl = properties.getProperty("baseUrl");
        // Set up browser (this will only ask for user input once)
        setUpBrowser();
        webSteps = new webSteps(driver);

        driver.manage().window().maximize();
        driver.get(baseUrl);
        webSteps.waiting();
    }

    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    private String getUserBrowserInput() {
        try {
            UIManager.setLookAndFeel(new FlatLightLaf());
        } catch (Exception e) {
            e.printStackTrace();
        }

        Object[] options = {"Chrome", "Firefox", "Edge"};

        int choice = JOptionPane.showOptionDialog(null,
                "Select a browser:",
                "Browser Selection",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,
                options[0]); // Default to Chrome

        if (choice == -1) {
            throw new RuntimeException("No browser selected. Test aborted!");
        }

        return options[choice].toString().toLowerCase();
    }
}
