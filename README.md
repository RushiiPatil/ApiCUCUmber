
```markdown
# ApiCUCUmber

> A BDD-style API automation framework using Cucumber & Java / RestAssured  

---

## 🧰 Overview

This project demonstrates building an API testing framework using **Cucumber** for BDD with **RestAssured** in Java. The goal is to structure tests in a way that's readable by both technical and non-technical stakeholders, while keeping it maintainable and scalable.

---

## 🔍 Features & Highlights

- BDD (Behavior-Driven Development) style tests with **Gherkin** syntax  
- Mapping feature files to step definitions  
- REST API testing: CRUD operations, request/response validations  
- Integration with RestAssured for HTTP requests  
- Assertion of status codes, headers, response body content  
- Logging support for better debugging (via logs)  
- Maven for dependencies and build management  

---

## 🛠️ Tech Stack

| Category        | Tools / Technologies              |
|------------------|------------------------------------|
| Language         | Java                               |
| BDD Framework    | Cucumber (Gherkin + Step Definitions) |
| API Testing      | RestAssured                        |
| Build Tool       | Maven                              |
| Logging / Debug  | Standard Java logging or custom logs |
| Version Control  | Git                                |

---

## 📁 Project Structure

```

ApiCUCUmber/
├── src/
│   ├── main/
│   │   └── java/
│   │       └── steps/                ← Step definition classes for Cucumber
│   │       └── utils/                ← Helpers / request specs / common code
│   ├── test/
│   │   └── java/
│   │       └── features/             ← .feature files (Gherkin scenarios)
├── pom.xml                         ← Maven configuration with dependencies
├── .gitignore                      ← Files/folders to ignore
├── logging.txt                     ← (Optional) sample log output for debugging

````

---

## 🚀 Setup & How to Run

1. Clone the repository:  
   ```bash
   git clone https://github.com/RushiiPatil/ApiCUCUmber.git
````

2. Navigate to the project directory:

   ```bash
   cd ApiCUCUmber
   ```

3. Run tests using Maven:

   ```bash
   mvn clean test
   ```

4. To run specific scenarios or feature files, use tags or specify the feature file path (if configured).

---

## ✅ Learning Outcomes

* Understanding how to write BDD Style tests using Cucumber
* Structuring feature files to be readable and reusable
* Mapping feature files to step definitions effectively
* Using RestAssured for API request & response validation
* Logging and debugging tests to diagnose failures

---

## 📂 What's Next / Planned Enhancements

* Add support for **environment configuration** (dev, staging, production)
* Integrate with **reporting tools** (Allure / Extent) for better visibility
* Implement **data-driven tests** using external data sources (CSV / JSON / Excel)
* Add continuous integration (CI) pipeline to automatically run tests on push/PR
* Cover negative test cases, parameterized tests, and more complex scenarios

---

## 📫 Contributing & Contact

Found a bug or want to suggest enhancements? Feel free to open an issue or submit a pull request!

Thanks for visiting this project 😊

---

⭐ Happy Testing!
**Rushikesh Patil**


