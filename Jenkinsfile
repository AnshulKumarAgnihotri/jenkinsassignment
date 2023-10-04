pipeline {
    agent any
    stage('Checking Version') {
        bat label:'',script:'java -version'
    }
    stage('Repo Cloning') {
        git 'https://github.com/AnshulKumarAgnihotri/jenkinsassignment.git'
    }
    stage('Build') {
        echo 'working properly'
    }
    stage('After running all test cases'){
        echo 'Jenkins working properly'
    }
        
}
