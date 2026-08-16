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

   ## How to Run

### Prerequisites

- Java JDK
- Maven
- PostgreSQL
- IntelliJ IDEA

### Database Configuration

Create a PostgreSQL database named:
resumeanalyzer

Configure the database password using an environment variable:

DB_PASSWORD=your_database_password
Clone the Repository
git clone https://github.com/ayush26git/ai-resume-analyzer.git
Run the Application

Open the project in IntelliJ IDEA and run:

ResumeAnalyzerApplication

Author
Ayush Srivastava

Then open your browser and visit:

http://localhost:8080/
   

