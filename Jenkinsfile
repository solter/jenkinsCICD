pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        sh 'cd application; mvn -B compile'
      }
    }

    stage('Test') {
      steps {
        sh 'cd application; mvn -B test'
      }
    }

  }
}