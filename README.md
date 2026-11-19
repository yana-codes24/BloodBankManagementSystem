# Blood Bank Management System

## 1. Project Description

The Blood Bank Management System is a Java-based web application designed to manage blood donor information efficiently. It provides an interface for administrators to log in, register donors, view donor records, edit donor details and delete donor records.

The application uses Java Servlets, JSP, JDBC and MySQL for its web and database functionality. It also includes demonstrations of Spring Dependency Injection and Java Swing.

## 2. Technologies and Tools Used

- **Programming Language:** Java
- **Frontend:** HTML, JSP
- **Backend:** Java Servlets
- **Database Connectivity:** JDBC
- **Database:** MySQL
- **Database Management:** XAMPP and phpMyAdmin
- **Java Framework:** Spring Framework (Dependency Injection demonstration)
- **Desktop GUI:** Java Swing demonstration
- **Web Server:** Apache Tomcat 8.5.96
- **Build Tool:** Maven
- **IDE:** Apache NetBeans

## 3. Features and Functionalities

- Administrator login and logout.
- Session management and protected donor pages.
- Donor registration.
- Display of registered donor details.
- Display of donor blood groups.
- Editing donor information.
- Deleting donor records.
- MySQL database connectivity using JDBC.
- Spring Dependency Injection demonstration.
- Java Swing graphical interface demonstration.

## 4. Database Details

**Database Name:** `blood_bank`

The database contains the following seven tables:

1. ADMIN
2. BLOOD_GROUP
3. DONOR
4. DONATION
5. BLOOD_STOCK
6. HOSPITAL
7. BLOOD_REQUEST

The database export is included in this repository as `blood_bank.sql`.

## 5. Installation and Execution Instructions

### Prerequisites

Install the following software:

- JDK 17 or compatible Java version
- Apache NetBeans IDE
- XAMPP
- Apache Tomcat 8.5.96 or a compatible Tomcat version

### Step 1: Clone or Download the Repository

Download the project from this GitHub repository:

https://github.com/yana-codes24/BloodBankManagementSystem

### Step 2: Start XAMPP

1. Open XAMPP Control Panel.
2. Start Apache and MySQL.
3. Open phpMyAdmin using `http://localhost/phpmyadmin`.

### Step 3: Import the Database

1. Create a database named `blood_bank`.
2. Select the database.
3. Open the Import tab.
4. Choose the `blood_bank.sql` file.
5. Click Import.

### Step 4: Configure Database Connectivity

Open the `DBConnection.java` file.

Check and update the database URL, username and password according to your local MySQL configuration.

### Step 5: Open the Project

1. Open Apache NetBeans.
2. Select File → Open Project.
3. Choose the downloaded `BloodBankManagementSystem` folder.
4. Allow Maven to download the required dependencies.
5. Configure Apache Tomcat as the application server.

### Step 6: Run the Application

1. Build the project using Clean and Build.
2. Run the project on Apache Tomcat.
3. Open the application in your browser.

Local application URL:

`http://localhost:8080/BloodBankManagementSystem/`

## 6. Application Screenshots

Screenshots of the application, including the homepage, administrator login, donor registration, donor records, Spring Dependency Injection and Swing interface, will be included in the repository.

### Homepage
![Homepage](screenshots/Screenshot%202026-11-19%20194250.png)

### Admin Login
![Admin Login](screenshots/Screenshot%202026-11-19%20194303.png)

### Donor List
![Donor List](screenshots/Screenshot%202026-11-19%20194333.png)

### Register Donor
![Register Donor](screenshots/Screenshot%202026-11-19%20194353.png)

### Edit Donor
![Edit Donor](screenshots/Screenshot%202026-11-19%20194411.png)

### Spring DI Output
![Spring DI](screenshots/Screenshot%202026-11-19%20194608.png)

### Swing GUI
![Swing GUI](screenshots/Screenshot%202026-11-19%20194626.png)

### Database Structure
![Database Structure](screenshots/Screenshot%202026-11-19%20194803.png)

![Screenshot 9](screenshots/Screenshot%202026-11-19%20194832.png)

![Screenshot 10](screenshots/Screenshot%202026-11-19%20194908.png)


## 7. GitHub Repository

https://github.com/yana-codes24/BloodBankManagementSystem

## 8. Project Information

**Project Title:** Blood Bank Management System

