**Here's a README.md file based on the information provided:**

**Spring MVC Employee CRUD Application**

This project demonstrates a Spring MVC application with Thymeleaf templating for managing employee data using CRUD (Create, Read, Update, Delete) operations.

**Getting Started**

1. **Prerequisites:**
    - Java Development Kit (JDK) 11 or later ([https://www.oracle.com/java/technologies/javase/downloads.html](https://www.oracle.com/java/technologies/javase/downloads.html))
    - Maven ([https://maven.apache.org/](https://maven.apache.org/))
    - An IDE like Eclipse, IntelliJ IDEA, or Spring Tool Suite ([https://spring.io/tools](https://spring.io/tools))

2. **Clone the Repository:**
   ```bash
   git clone https://github.com/<your-username>/<your-repository-name>.git
   cd <your-repository-name>
   ```

3. **Install Dependencies:**
   Run `mvn clean install` to download and install the necessary dependencies.

4. **Configure Database:**
    - Update `src/main/resources/application.properties` with your database connection details (e.g., URL, username, password).
    - Create the database schema using the provided `src/main/resources/schema.sql` script (if applicable).

5. **Run the Application:**
    - Run the main application class (e.g., `com.example.demo.EmployeeCrudApplication`) using your IDE or from the command line: `mvn spring-boot:run`.

**Project Structure:**

- `src/main/java`: Contains Java source code for controllers, services, models, and utilities.
- `src/main/resources`: Stores application properties, database schema (if applicable), and static resources (e.g., CSS, JavaScript).
- `src/main/webapp`: Holds Thymeleaf templates for rendering web pages.
- `pom.xml`: Defines project dependencies and build configuration.

**Understanding the Code:**

- **Employee Model (`com.example.demo.model.Employee`):** Represents employee data (ID, first name, last name, email).
- **Employee Service (`com.example.demo.service.EmployeeService`):** Provides business logic for interacting with employee data (CRUD operations).
- **Employee Controller (`com.example.demo.controller.EmployeeController`):** Handles incoming requests, interacts with the service layer, and populates Thymeleaf templates with data.
- **Thymeleaf Templates (`src/main/webapp/WEB-INF/templates`):** Define the structure and content of web pages, incorporating dynamic data from the controller.

**Key Functionalities:**

- **List Employees:** Displays a table of all employees in the database.
- **Search Employees:** Allows searching for employees by last name.
- **Add Employee:** Creates a new employee record.
- **Update Employee:** Edits the details of an existing employee.
- **Delete Employee:** Removes an employee from the database (with confirmation).

**Additional Notes:**

- This is a basic CRUD application; you can extend it with features like validation, pagination, security, etc.
- Refer to the Spring MVC and Thymeleaf documentation for more in-depth usage and customization.

**Contributing**

I welcome contributions to improve this project. Please follow these guidelines:

- Fork the repository on GitHub.
- Create a new branch for your changes.
- Submit a pull request with clear descriptions of your modifications.
- Adhere to the existing code style and formatting.
