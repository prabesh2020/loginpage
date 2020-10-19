# Project Information:
1. Register New User
2. Login Authentication 


# Project Demo Preview
	1. For New User

The link "http://localhost:8080/registration" will allow customer to create a new 	account. Or the link "http://localhost:8080/" have a "Register here" link that 	will redirect the new user to registration page. 

![](Capture.gif)

	2. For current user login page
From the homepage or "http://localhost:8080/login" customer will be able to login with the same username and password they provided during their registration. Username will be assigned same as email.

![](Capture.gif)

# Tools Used
- Spring Boot
- JDK 1.8
- Spring Framework
- Maven 
- Bootstrap
- Hibernate
- MySQL

# Dependencies for spring boot application
Spring Web, JPA, MySQL, Thymeleaf , Security

#Relational Database Model
The entity User and Role have ManyToMany relation. To create a relational database between
User and Role we need to have another table/entity "user_role" that holds the information for both table.

![](Capture.gif)

#Spring MVC Framework

![](Capture.gif)










