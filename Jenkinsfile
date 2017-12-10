pipeline {
    agent any

    stages {
        stage ('Compile Stage') {

            steps {
                echo "Starting maven build"
                withMaven(maven : 'maven_3_5_2') {
                    sh 'mvn clean compile'
                }
            }
        }

        stage ('Testing Stage') {

            steps {
                withMaven(maven : 'maven_3_5_2') {
                    sh 'mvn test'
                }
            }
        }

    }

    node {
       stage 'looking for JAR '
       sh 'echo "ls -la | grep spring-boot-basewebapp-0.0.1-SNAPSHOT.jar"; sleep 5;'

       stage 'deploy Production'
       input 'Proceed?'
       sh 'echo "java -jar ~/spring-boot-basewebapp-0.0.1-SNAPSHOT.jar";'
    }
}