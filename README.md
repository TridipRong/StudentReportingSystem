# Student Management Application

In this application, we can manage student data, and course data. Admin can add students, courses, and can manage these entities, students can get the courses they are assigned in and can drop from a particular course.

# ER Diagram
[![SwaggerUI](https://github.com/kalevishal52/Student_Management_System/blob/main/StudentManagementApplication/Images/ER%20Diagram%20Student%20Management.png?raw=true)](https://github.com/kalevishal52/Student_Management_System/blob/main/StudentManagementApplication/Images/ER%20Diagram%20Student%20Management.png?raw=true)

# Functionalities
-   Layered architecture
-   Admin can register/login
-   Register Courses,Students
-   Get Courses,Students
-   Student will be verified before ascession API
-   Can update Profile details

## Backend Work
-  Admin Authentication of signUp and Login using Spring security
-  Proper Exception Handling, and Input Validation
-  Data Stored in the database(mySQL)

## Installation and Run
-   Before running the API server, we should update the database config inside the application.properties file.
-   Update the port number, username and password as per your local database config.
```
server.port=8888
spring.datasource.url=jdbc:mysql://localhost:3306/studentsdb
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.datasource.username=root
spring.datasource.password=M@)Vishal!@L
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.mvc.pathmatch.matching-strategy = ANT_PATH_MATCHER
```

# Tech Stacks

-   Java Core
-   Spring Data JPA
-   Spring Security
-   Spring Boot
-   Hibernate
-   MySQL


# Backend

## Admin Controller

#### POST : /admin/register
```
{
    "userId": 1,
    "name": "Vishal Kale",
    "mobileNumber": "8999712976",
    "password": "$2a$10$W.voyfiLVKfrB3u.BM.iRO6I6BN9qik8JNx9Ux./2dEu57.5ZS.rO",
    "role": "ROLE_ADMIN"
}
```

## Course Controller

#### POST : /courses/
```
**Response**
{
  "courseId": 2,
  "courseName": "Java Backend Development",
  "description": "The course is designed for every person from beginner to advance level",
  "courseType": "Live",
  "duration": "8 Months",
  "topics": "Java Core, Hibernate, JDBC, Spring, SpringBoot"
}
{
  "courseId": 4,
  "courseName": "Full Stack Web Development",
  "description": "The course is designed for every person from beginner to advance level",
  "courseType": "Live",
  "duration": "9 Months",
  "topics": "JavaScript, HTML, CSS, NodeJS, React"
}

```
#### GET => getStudentsFromCorseHandler : /courses/    
```
{
  "courseId": 4,
  "courseName": "Full Stack Web Development",
  "description": "The course is designed for every person from beginner to advance level",
  "courseType": "Live",
  "duration": "9 Months",
  "topics": "JavaScript, HTML, CSS, NodeJS, React",
  "studentList": [
    {
      "studentId": 5,
      "name": "Vishal Sahadev Kale",
      "fatherName": "Sahadev Kale",
      "email": "kale@gmail.com",
      "mobileNumber": "8999712976",
      "dob": "2000-12-20",
      "gender": "MALE"
    },
    {
      "studentId": 7,
      "name": "Abhinay Ashok Zagade",
      "fatherName": "Ashok Zagade",
      "email": "zagade@gmail.com",
      "mobileNumber": "8999712977",
      "dob": "2001-02-03",
      "gender": "MALE"
    },
    {
      "studentId": 9,
      "name": "Praneet Pradeep Jagtap",
      "fatherName": "Pradeep Jagtap",
      "email": "jagtap@gmail.com",
      "mobileNumber": "9999712978",
      "dob": "2000-02-29",
      "gender": "MALE"
    },
    {
      "studentId": 11,
      "name": "Prateek Narshiv Gore",
      "fatherName": "Narshiv Gore",
      "email": "gore@gmail.com",
      "mobileNumber": "8499712978",
      "dob": "2003-05-16",
      "gender": "MALE"
    }
  ]
}
```
## Student Controller

#### Get : /students/courses
```
**Response
{
  "name": "Vishal Sahadev Kale",
  "courses": [
    {
      "courseId": 2,
      "courseName": "Java Backend Development",
      "description": "The course is designed for every person from beginner to advance level",
      "courseType": "Live",
      "duration": "8 Months",
      "topics": "Java Core, Hibernate, JDBC, Spring, SpringBoot"
    },
    {
      "courseId": 4,
      "courseName": "Full Stack Web Development",
      "description": "The course is designed for every person from beginner to advance level",
      "courseType": "Live",
      "duration": "9 Months",
      "topics": "JavaScript, HTML, CSS, NodeJS, React"
    }
  ],
  "studentId": 5
}
```

## Swagger UI
## Student Controller
[![SwaggerUI](https://github.com/kalevishal52/Movie_Ticket_Booking_Application_Backend/blob/main/images/Images/s2.png?raw=true)](https://github.com/kalevishal52/Movie_Ticket_Booking_Application_Backend/blob/main/images/Images/s2.png?raw=true)


## Course Controller
[![SwaggerUI](https://github.com/kalevishal52/Movie_Ticket_Booking_Application_Backend/blob/main/images/Images/s1.png?raw=true)](https://github.com/kalevishal52/Movie_Ticket_Booking_Application_Backend/blob/main/images/Images/s1.png?raw=true)
