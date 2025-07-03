# SmartCube Assignment

## Project Overview
SmartCube Assignment is an automated testing project designed to verify the functionality of a web application's authentication and shopping cart features. The project is built using Java and follows the Behavior-Driven Development (BDD) approach with Cucumber for test automation.

## Features

### 1. User Authentication
- **Login Functionality**: Automated tests for user login process
- **User Registration**: Automated tests for new user registration

### 2. Shopping Cart
- **Add to Cart**: Automated tests for adding products to the shopping cart
- **Cart Management**: Verification of product addition and cart updates

## Technology Stack
- **Programming Language**: Java
- **Testing Framework**: JUnit
- **BDD Framework**: Cucumber
- **Build Tool**: Maven
- **Reporting**: Allure Reports (based on the presence of allure-results directory)

## Project Structure
```
src/
├── main/java/          # Main application code (if any)
└── test/java/
    ├── Features/       # Feature files
    │   ├── Login.feature
    │   ├── Cart.feature
    │   └── Registration.feature
    └── stepsDefinition/ # Step definitions
        ├── LoginSteps.java
        ├── CartSteps.java
        └── RegistrationSteps.java
```

## Prerequisites
- Java JDK 11 or higher
- Maven 3.6.3 or higher
- WebDriver compatible with your browser version
- Internet connection (for web application access)

## Setup and Execution

### 1. Clone the Repository
```bash
git clone [repository-url]
cd SmartCubeAssignment
```

### 2. Build the Project
```bash
mvn clean install
```

### 3. Run Tests
To run all tests:
```bash
mvn test
```

To run specific feature:
```bash
mvn test -Dcucumber.filter.tags="@login"
```

### 4. Generate Reports
After test execution, generate Allure reports with:
```bash
allure serve allure-results
```

## Test Scenarios

### Login Feature
- User can successfully log in with valid credentials
- Login page navigation and form submission

### Registration Feature
- New user registration process
- Form validation and submission

### Cart Feature
- Adding products to the cart
- Verifying cart contents

## Contributing
1. Fork the repository
2. Create a feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

## License
This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Contact
For any queries, please contact the project maintainers.
