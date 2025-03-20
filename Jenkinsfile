pipeline {
    agent any

    environment {
        IMAGE_NAME = "your-dockerhub-username/test-jenkin"
        CONTAINER_NAME = "test-jenkin-container"
    }

    stages {
        stage('Checkout Code') {
            steps {
                git branch: 'main', url: 'https://github.com/tranvy57/test-jenkin.git'
            }
        }

        stage('Build with Gradle') {
            steps {
                sh 'chmod +x ./gradlew'  // Cấp quyền thực thi
                sh './gradlew build -x test'  // Bỏ qua test nếu cần
            }
        }

        stage('Build Docker Image') {
            steps {
                sh 'docker build -t $IMAGE_NAME .'
            }
        }

        stage('Push Image to Docker Hub') {
            steps {
                withDockerRegistry([credentialsId: 'docker-hub-credentials', url: '']) {
                    sh 'docker push $IMAGE_NAME'
                }
            }
        }

        stage('Deploy with Docker Compose') {
            steps {
                sh 'docker-compose down || true'  // Dừng container cũ nếu có
                sh 'docker-compose up -d --build'
            }
        }
    }
}
