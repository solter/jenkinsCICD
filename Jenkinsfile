pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        sh 'cd application; mvn build'
      }
    }

    stage('Test') {
      steps {
        sh 'cd application; mvn test'
      }
    }

  }
}