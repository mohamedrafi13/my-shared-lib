def call(String project, String ImageTag, String dockerHub) {
    sh """
    trivy image ${dockerHub}/${project}:latest > scan.txt
    cat scan.txt
    
    """
}