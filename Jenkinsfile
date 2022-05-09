pipeline {
    agent any

    tools {
        // precisa instalar o plugin do maven (Maven Integration)
        // tmb precisa setar o JAVA_HOME em manage jenkins 
        // -> configure system -> Global properties -> Environment variables -> 
        // -> name: JAVA_HOME e value /opt/java/openjdk (pode ser diferente no seu caso)
        maven "M3"
    }

    stages {
        stage('Build') {
            steps {
                // baixa codigo do github, na branch java_maven
                git branch: 'java_maven' ,url: 'https://github.com/caioau/inf335-trab-jenkins/'

                // "compila" o .jar
                sh "mvn -Dmaven.test.failure.ignore=true clean package"

            }

            post {
                // no caso de sucesso, salva o .jar e os resultados dos testes como artefatos
                success {
                    junit '**/target/surefire-reports/TEST-*.xml'
                    archiveArtifacts 'target/*.jar'
                }
            }
        }
    }
}