pipeline {
  agent none
  stages {
    stage('Build') {
      agent {
        label 'build'
      }
      steps {
        echo 'Running ${env.NODE_NAME} on ${env.JENKINS_URL}'
        sh 'cd application; mvn -B compile'
        sh 'echo "Hostname: $(hostname)"'
      }
    }

    stage('Test') {
      agent {
        label 'test'
      }
      steps {
        echo 'Running ${env.NODE_NAME} on ${env.JENKINS_URL}'
        sh 'echo "Hostname: $(hostname)"'
        sh 'cd application; mvn -B test'
      }
    }

  }
}