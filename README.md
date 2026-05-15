# 🚀 Selenium Automation Framework

An advanced Selenium Automation Testing Framework built using **Java, Selenium WebDriver, Maven, TestNG, Page Object Model (POM), Screenshot Utility, and Extent Reports**.

This project automates core functionalities of the Demo Web Shop application and demonstrates an industry-standard automation framework structure.

---

# 📌 Project Highlights

✅ Selenium WebDriver Automation
✅ Maven Dependency Management
✅ TestNG Test Execution
✅ Page Object Model (POM) Design Pattern
✅ Screenshot Capture on Failure
✅ Extent HTML Reporting
✅ Reusable BaseTest Architecture
✅ Automated Login Testing
✅ Search Product Testing
✅ Add To Cart Automation
✅ testng.xml Suite Execution
✅ Organized Project Structure

---

# 🛠️ Tech Stack

| Technology         | Purpose                       |
| ------------------ | ----------------------------- |
| Java               | Programming Language          |
| Selenium WebDriver | Browser Automation            |
| Maven              | Build & Dependency Management |
| TestNG             | Test Execution & Assertions   |
| Extent Reports     | Advanced HTML Reports         |
| Git & GitHub       | Version Control               |
| Eclipse IDE        | Development Environment       |

---

# 📂 Project Structure

```bash
SeleniumMavenProject
│
├── src/test/java
│   ├── pageobjects
│   │   └── LoginPage.java
│   │
│   ├── testcases
│   │   ├── LoginAutomationTest.java
│   │   ├── SearchProductTest.java
│   │   └── AddToCartAutomationTest.java
│   │
│   └── utilities
│       ├── BaseTest.java
│       ├── ScreenshotUtil.java
│       └── ExtentManager.java
│
├── screenshots
├── reports
├── test-output
├── pom.xml
└── testng.xml
```

---

# ⚡ Features Implemented

## 🔐 Login Automation

* Invalid login testing
* Assertion validation
* Screenshot capture on failure
* Extent report logging

## 🔍 Product Search Automation

* Automated product search functionality
* Result verification using assertions

## 🛒 Add To Cart Automation

* Product selection
* Add to cart validation
* Cart success message verification

## 📸 Screenshot Utility

Automatically captures screenshots whenever a test fails.

## 📊 Extent Reports

Generates professional HTML reports with:

* Test status
* Execution logs
* Pass/Fail information
* Screenshot integration

---

# 🧠 Framework Design Patterns

## ✅ Page Object Model (POM)

The framework follows the POM architecture where:

* Locators are separated from test logic
* Reusable methods improve maintainability
* Framework becomes scalable and cleaner

---

# 🧪 Test Execution

## Run Individual Test

```bash
Right Click Test Class
→ Run As
→ TestNG Test
```

## Run Complete Test Suite

```bash
Right Click testng.xml
→ Run As
→ TestNG Suite
```

---

# 📈 Reports

## TestNG Reports

Generated inside:

```bash
test-output/
```

Files:

* emailable-report.html
* index.html

## Extent Reports

Generated inside:

```bash
reports/ExtentReport.html
```

---

# 📸 Screenshot Location

Failed test screenshots are stored inside:

```bash
screenshots/
```

---

# ⚙️ Maven Dependencies Used

```xml
<dependency>
    <groupId>org.seleniumhq.selenium</groupId>
    <artifactId>selenium-java</artifactId>
    <version>4.21.0</version>
</dependency>

<dependency>
    <groupId>org.testng</groupId>
    <artifactId>testng</artifactId>
    <version>7.10.2</version>
    <scope>test</scope>
</dependency>

<dependency>
    <groupId>com.aventstack</groupId>
    <artifactId>extentreports</artifactId>
    <version>5.1.2</version>
</dependency>
```

---

# ▶️ How To Run Project

## Step 1

Clone repository:

```bash
git clone https://github.com/AnuradhaKashaudhan/SeleniumMavenProject.git
```

## Step 2

Open project in Eclipse IDE.

## Step 3

Update Maven Dependencies:

```bash
Right Click Project
→ Maven
→ Update Project
```

## Step 4

Run testng.xml:

```bash
Run As → TestNG Suite
```

---

# 🔥 Advanced Concepts Used

* Selenium WebDriver
* XPath & CSS Selectors
* Alerts Handling
* Frames Handling
* Mouse Hover Actions
* Double Click Actions
* Implicit Waits
* Assertions
* Maven Integration
* TestNG Framework
* POM Architecture
* Reporting Utilities
* Screenshot Utilities

---

# 📚 Learning Outcomes

Through this project, the following concepts were explored:

* End-to-End Test Automation
* Framework Development
* Reusable Automation Architecture
* Selenium Best Practices
* Test Reporting
* Failure Debugging
* Version Control using Git & GitHub

---

# 🚀 Future Enhancements

* Jenkins CI/CD Integration
* Parallel Test Execution
* Data Driven Testing using Excel
* Cross Browser Testing
* Selenium Grid Integration
* Docker Support
* GitHub Actions CI Pipeline

---

# 👩‍💻 Author

### Anuradha Kashaudhan

CSE Student | AI/ML Enthusiast | Automation Testing Learner

GitHub: [https://github.com/AnuradhaKashaudhan](https://github.com/AnuradhaKashaudhan)

---

# ⭐ If you found this project useful

Give this repository a ⭐ on GitHub.
