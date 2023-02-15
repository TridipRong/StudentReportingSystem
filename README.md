# Student Reporting Application

In this application, we can add student ,there marks,semester &  See multiple reports of students.
- Average Percentage of whole class in recent semester
- Average marks of Students in a subject
- Top 2 Consistent Students across all semesters (Maximum average marks) 

# ER Diagram
[![SwaggerUI](https://github.com/TridipRong/StudentReportingSystem/blob/main/image/erd.png?raw=true)](https://github.com/TridipRong/StudentReportingSystem/blob/main/image/erd.png?raw=true)

# Functionalities
-   Add Student
-   Add subject and number to student
-   Get Average Percentage of whole class in recent semester
- Get Average marks of Students in a subject
- Get top 2 Consistent Students across all semesters (Maximum average marks) 

## Backend Work
-  Proper Exception Handling, and Input Validation
-  Data Stored in the database(mySQL)

## Installation and Run
-   Before running the API server, we should update the database config inside the application.properties file.
-   Update the port number, username and password as per your local database config.
```
server.port=8901
spring.datasource.url=jdbc:mysql://localhost:3306/salesken
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.datasource.username=root
spring.datasource.password=Tridip123@
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.mvc.pathmatch.matching-strategy = ANT_PATH_MATCHER
```

# Tech Stacks

-   Java Core
-   Spring Data JPA
-   Spring Boot
-   Hibernate
-   MySQL


# Backend

## Student Controller

#### POST : /addStudent
```
{
    "studentId": 1,
      "name": "Tridip Rong",
      "fatherName": "Tapas Rong",
      "email": "zagade@gmail.com",
      "mobileNumber": "8999712977",
      "gender": "MALE"
      "Subject":[]
    
}
```

#### PUT : /addSubjectToStudent/{studentId}
```
{
    "subjectId" : 2,
    "studentId": 1,
     "Semester":FIRST,
     "Subject":"Maths",
     "Marks":75
    
}
```


#### Get :/getAverageOfRecentSemester
```
89.33
```

#### Get : /averageMarksOfStudents
```
{
  "Name": "Tridip Rong"
  "English" : 71,
  "Math" : 55,
  "Science" : 88
}
```

#### Get : //top2ConsistentStudents
```
{
  "Tridip" : 72,
  "Rong" : 65
}
```

