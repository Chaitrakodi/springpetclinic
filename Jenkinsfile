pipeline {
  agent any
  stages {
    stage('build') {
      steps {
        sh './mvnw clean package -Dmaven.test.skip=true '
      }
    }

    stage('sonar') {
      steps {
        withSonarQubeEnv(installationName:'sonar-1')
        {
        sh './mvnw sonar:sonar -Dsonar.java.binaries=target/classes'
        }
      }
    }

  }
}
