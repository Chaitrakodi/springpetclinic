pipeline {

    environment { 
        DOCKERHUB_CREDENTIALS=credentials('rolandgryddynamics-dockerhub')
    }

    agent {
        node {
            label 'ubuntu-master'
        }
    }
    stages {
        // stage('checkstyle') {
        //     steps {
        //         sh './gradlew checkstyleMain'
        //         archiveArtifacts artifacts: 'build/reports/checkstyle/main.html'
        //     }
        // }
        // stage('test') {
        //     steps {
        //         sh './gradlew compileJava'
        //     }
        // }
        // stage('build') {
        //     steps {
        //         sh './gradlew build -x test'
        //     }
        // }
 
        // stage('docker') {
        //     steps {
        //             // sh 'docker version'
        //             // app = docker.build("rolandgryddynamics/mr")
        //             sh 'docker build -t rolandgryddynamics/mr:latest .'
                    
        //             // sh 'docker tag my/app rolandgryddynamics/mr'
        //             // sh 'docker tag push rolandgryddynamics/mr'
        //     }
        // }
        // stage('login') {
        //     steps {
        //         sh 'echo DOCKERHUB_CREDENTIALS_PSW | docker login $DOCKERHUB_CREDENTIALS_USR --password-stdin'
        //     }
        // }
        stage('deploy to dockerhub') {
            steps {
                // sh 'docker tag push rolandgryddynamics/mr:latest'
                script {
                    echo $DOCKERHUB_CREDENTIALS_USR
                    echo DOCKERHUB_CREDENTIALS_PSW
                    echo $DOCKERHUB_CREDENTIALS
                    echo rolandgryddynamics-dockerhub
                    dockerImage = docker.withRegistry('https://registry.hub.docker.com', 'rolandgryddynamics-dockerhub' )
                    dockerImage.push()
                }
            }
        }
    }
}