pipeline {

  agent any

  tools {
    maven 'maven'
  }

  stages {

    stage('Get from git project') {
      steps {
        git 'https://github.com/GsorinDev/ams-test.git'
      }
    }
    stage('Install package') {

      steps {
        sh 'mvn clean install -DskipTests'
      }
    }

    stage('Test') {
          steps {
            sh 'mvn test'
          }
        }
  }
}