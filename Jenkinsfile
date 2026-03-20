pipeline {
    agent any

    tools {
        // This must match the name you gave in Global Tool Configuration
        maven 'Maven-3.9.14' 
    }
    
    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }
        stage('Build') {
            steps {
                // For Maven projects
                sh 'mvn clean package -DskipTests'
            }
        }
     /*   stage('Test') {
            steps {
                sh 'mvn test'
            }
        }*/
    }
    
    post {
        success {
            echo 'Application built successfully!'
        }
    }
}