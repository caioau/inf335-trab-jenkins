pipeline {
    agent any
    
    environment {
     // qual nome sera dado para a imagem docker (pra usar o mesmo no docker build e run)
     docker_image_name="java_docker"

    }
    
    stages {
        stage('Build') {
            steps {
                // baixa codigo do github, na branch java_docker
                git branch: 'java_docker' ,url: 'https://github.com/caioau/inf335-trab-jenkins/'

                // faz build da imagem docker
                sh "docker build --pull -t $docker_image_name ."

            }
        }
        
        stage("Run"){
            steps{
                // executa a imagem docker
                sh "docker run --rm $docker_image_name"
            }
        }
    }
}
