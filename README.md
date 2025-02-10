# Demo CI/CD Application

This project demonstrates how to set up a CI/CD pipeline using GitHub Actions and Docker for a Spring Boot application.

The README.md you have is a guide for people who want to run your Spring Boot project with Docker. Let's break down the steps from the README and explain where to run these commands.

 # 1. Build the Project:
   bash
   mvn clean package

# What it does: 
  This command builds your Spring Boot application using Maven. It first cleans any previous build artifacts and then creates a new package (usually a .jar file) for your project.

# Where to run it:

   Open a terminal.
   Navigate to your project root directory (demoCICD).
   Run the command inside your project folder.
   This will generate a .jar file in the target/ directory.

# 2. Build the Docker Image:

bash
docker build -t demo-cicd:1.0 .

# What it does: 
This command tells Docker to create an image using the Dockerfile you created earlier. The -t demo-cicd:1.0 part tags the image with the name demo-cicd and version 1.0. The period . tells Docker to use the current directory as the build context (where the Dockerfile is located).

# Where to run it:
Before running this command, ensure that Docker is installed and running on your machine.
Run the command in the project root directory, where your Dockerfile is located. This will create a Docker image using the Dockerfile instructions.

# 3. Run the Docker Container:
   bash
   docker run -p 8080:8080 demo-cicd:1.0

# What it does:
   This command runs the Docker container created in the previous step.
   -p 8080:8080 tells Docker to map port 8080 from the container to port 8080 on your local machine.
   demo-cicd:1.0 refers to the Docker image that you created.

# Where to run it:
This command should also be executed in the terminal.
You can run it in the project root directory, but it doesn't matter where, as long as Docker is able to find the image (demo-cicd:1.0).
After running this, you can access your Spring Boot app by navigating to http://localhost:8080 in a browser.

# Summary of Where to Run the Commands:

Step 1 (Build the project): In the project root directory, run mvn clean package.
Step 2 (Build Docker image): In the project root directory, run docker build -t demo-cicd:1.0 ..
Step 3 (Run Docker container): In the terminal, run docker run -p 8080:8080 demo-cicd:1.0.
