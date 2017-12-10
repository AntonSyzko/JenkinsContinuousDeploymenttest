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

        stage ('Installation Stage') {
                    steps {
                        withMaven(maven : 'maven_3_5_2') {
                            sh 'mvn install'
                        }
                    }
                }
        stage ('Running stage') {
                    steps {
                        withMaven(maven : 'maven_3_5_2') {
                            sh "cd ~"
                            sh 'java -jar  spring-boot-basewebapp-0.0.1-SNAPSHOT.jar'
                        }
                    }
                }

    }


}