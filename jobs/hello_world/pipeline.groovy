pipeline {
    stages {
        stage('Hello') {
            steps {
                sh 'echo Hello'
            }
        }

        stage('world') {
            steps {
                sh 'echo world'
            }
        }
    }
}
