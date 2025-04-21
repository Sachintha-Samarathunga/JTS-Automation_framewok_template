# JTS Automation Framework

## Overview
The **JTS Automation Framework** is a powerful and flexible automation testing framework built using Selenium and TestNG. It is designed to simplify and optimize test automation processes, supporting multiple browsers, advanced reporting, and configuration management.

## Features
- **Selenium & TestNG Integration** - Ensures efficient test execution and reporting.
- **Cross-Browser Support** - Supports Chrome, Firefox, and Edge without requiring manual WebDriver downloads.
- **Dynamic Browser Selection** - Choose the browser at runtime when executing automation.
- **Centralized XPath Management** - Stores all element locators in an Excel file for easy updates and maintenance.
- **Flexible Test Execution** - Run selected test cases using TestNG XML configuration.
- **Reusable Methods** - Maintains all utility methods in a single Java file to reduce code duplication.
- **Secure Configuration Management** - Stores sensitive information (URLs, credentials) securely in configuration files.
- **Support for BDD & TDD** - Adaptable to both Behavior-Driven Development (BDD) and Test-Driven Development (TDD) methodologies.
- **Advanced Extent Reports** - Generates detailed test execution reports with step-by-step logs, error screenshots, and automatic report opening post-execution.
- **Optimized & Scalable** - Designed for easy integration and use in any automation project.

## Authors
Developed and maintained by:
- **Sachintha Samarathunga**
- **Samindya Vass** - https://github.com/samindyauv
- **Wishmi Hiranya** - https://github.com/Wish0110

## Getting Started
1. Clone the repository:
   ```sh
   git clone https://github.com/your-repo/ssw-automation-framework.git
   ```
2. Configure the project:
   - Update the configuration file with your test URLs and credentials.
   - Add XPath values in the provided Excel file.
3. Run tests:
   - Execute tests using TestNG XML file.
   - Choose the desired browser at runtime.

## Reporting
- After test execution, the **Extent Report** will be generated.
- Reports include error screenshots for failed test cases.
- The report automatically opens after each test run.

## License
This project is licensed under the MIT License - see the http://www.apache.org/licenses/ file for details.
