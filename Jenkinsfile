pipeline {
  agent none
  stages {
    stage('Build') {
      agent {
        label 'build'
      }
      steps {
        echo "Running build on node: ${env.NODE_NAME} from controller: ${env.JENKINS_URL}"
        sh 'echo "Node host: $(hostname)"'
        sh 'cd application; mvn -B compile'
      }
    }

    stage('Test') {
      agent {
        label 'test'
      }
      steps {
        echo "Running test on node: ${env.NODE_NAME} from controller: ${env.JENKINS_URL}"
        sh 'echo "Node host: $(hostname)"'
        sh 'cd application; mvn -B test'
      }
    }

  }

  stage('Deploy') {
    agent {
      label 'deploy'
    }
    steps {
      echo "Running deploy on node: ${env.NODE_NAME} from controller: ${env.JENKINS_URL}"
      sh 'cd application; mvn -B verify'
      sh 'cd application; cp target/HelloWorldWithTests*.jar /tmp'

      ansiblePlaybook(inventory: 'infrastructure/ansible/inventory/aws.yml', playbook: 'infrastructure/ansible/playbooks/deploy.yml')
    }
  }
}
