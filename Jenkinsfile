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
                            sh 'cp target/*.jar /tmp/'
                            sh 'java -jar /tmp/*.jar'
                            sh 'while ! httping -qc1 http://localhost:8000 ; do sleep 1 ; done'
                        }
                    }
                }

    }


}