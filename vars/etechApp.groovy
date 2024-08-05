def call(string repoUrl){
  pipeline{
    agent any
    stages {
      stage ("1-check") {
        steps {
          sh 'ls'
          sh 'java -version'
        }
      }
      stage ("checkout code"){
        steps {
          git branch: 'main'
          url: "${repoUrl}"
        }
      }
      stage ("other checkings"){
        steps {
          sh 'lsblk'
        }
      }
    }
  }
}