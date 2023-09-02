def call(String project, String ImageTag, String dockerhub) {
    sh """
    trivy image ${dockerhub}/${project}:latest > scan.txt
    cat scan.txt
    
        """
}