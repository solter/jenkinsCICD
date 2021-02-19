pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        sh 'cd application; mvn compile'
      }
    }

    stage('Test') {
      steps {
        sh 'cd application; mvn test'
      }
    }

  }
}