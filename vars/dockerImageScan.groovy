def call(String project, String ImageTag, String dockerHub) {
    sh """
    trivy image ${dockerhub}/${project}:latest > scan.txt
    cat scan.txt
    
    """
}