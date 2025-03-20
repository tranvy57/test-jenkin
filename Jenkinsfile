pipeline {
    agent any

    stages {
        stage('Checkout Code') {
            steps {
                git branch: 'main', url: 'https://github.com/tranvy57/test-jenkin.git'
            }
        }

        stage('Build') {
                    steps {
                        sh 'chmod +x ./gradlew'  // Cấp quyền thực thi
                        sh './gradlew build'
                    }
                }
    }
}
