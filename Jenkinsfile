pipeline {
  agent none
  stages {
    stage('Build') {
      agent {
        label 'build'
      }
      steps {
        echo "Running ${env.NODE_NAME} on ${env.JENKINS_URL}"
        sh 'echo "Hostname: $(hostname)"'
        sh 'cd application; mvn -B compile'
      }
    }

    stage('Test') {
      agent {
        label 'test'
      }
      steps {
        echo "Running ${env.NODE_NAME} on ${env.JENKINS_URL}"
        sh 'echo "Hostname: $(hostname)"'
        sh 'cd application; mvn -B test'
      }
    }

  }
}
