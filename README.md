```markdown
# Selenium Automation Project (Java)

This repository contains a basic Selenium automation project written in Java without using any test framework (like TestNG/JUnit).  
The project demonstrates how to automate a simple account creation workflow and validate success messages using hard assertions.

---

## 📌 Features

- Automates a login flow  
- Opens a new account using the UI form  
- Extracts and prints confirmation messages (Account Opened Successfully & Congratulations, your account has been created!)  
- Uses Selenium WebDriver with ChromeDriver  
- Written in pure Java (no external test frameworks used)  

---

## 🛠️ Technologies Used

- Java  
- Selenium WebDriver  
- ChromeDriver  
- Maven (for dependency management, optional)  
- IDE:  Eclipse  

---
---

## ▶️ How to Run

Step 1: Clone this repository  
```bash
git clone https://github.com/your-username/selenium-automation.git
cd selenium-automation
````

Step 2: Download & configure ChromeDriver

* Ensure ChromeDriver version matches your Chrome browser.
* Add it to your system PATH.

Step 3: Open the project in your IDE

* Use Eclipse.

Step 4: Run the Java class

* Run TestCode.java.

---

## 🧾 Sample Output

When the script runs successfully, it prints the account opening confirmation:

```
Print the get String
Account Opened Successfully

Print the get String
Congratulations, your account has been created!
```

---

## 🚀 Future Improvements

* Add TestNG/JUnit for better test structure
* Integrate Page Object Model (POM) for maintainability
* Add Explicit Waits instead of Thread.sleep()
* Extend test coverage for more scenarios

---

## 👩‍💻 Author

Tasnia Sultana Hema
Software Quality Assurance (SQA) Enthusiast | Skilled in Manual & Automation Testing

```
