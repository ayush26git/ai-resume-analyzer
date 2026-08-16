# AI Resume Analyzer

AI Resume Analyzer is a Java Spring Boot web application that analyzes resumes and compares the candidate's skills with the requirements mentioned in a job description.

## Features

- User Registration and Login
- Resume PDF Upload
- Resume Text Extraction
- Automatic Skill Detection
- Job Description Analysis
- Resume-to-Job Skill Matching
- Match Score Calculation
- Matched Skills Display
- Missing Skills Display
- Responsive Web Interface

## Tech Stack

- Java
- Spring Boot
- Spring Security
- JWT
- PostgreSQL
- Spring Data JPA
- Apache PDFBox
- HTML
- CSS
- JavaScript
- Maven
- Git & GitHub

## How It Works

1. User uploads a resume in PDF format.
2. The application extracts text from the resume.
3. User enters a job description.
4. The system detects relevant skills from both the resume and job description.
5. Skills are compared automatically.
6. A resume match score is calculated.
7. Matched and missing skills are displayed.
   
 ## Project Structure
 
src/
├── main/
│   ├── java/
│   │   └── com/ayushs/resume_analyzer/
│   │       ├── config/
│   │       ├── controller/
│   │       ├── dto/
│   │       ├── entity/
│   │       ├── repository/
│   │       ├── resume/
│   │       └── service/
│   └── resources/
│       ├── static/
│       └── application.properties
└── test/
