pipeline {
  agent none
  stages {
    stage('Build') {
      agent {
        label 'build'
      }
      steps {
        sh 'cd application; mvn -B compile'
      }
    }

    stage('Test') {
      agent {
        label 'test'
      }
      steps {
        sh 'cd application; mvn -B test'
      }
    }

  }
}
