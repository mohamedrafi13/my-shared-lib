def call(String project, String ImageTag, String dockerhub) {
    sh """
    trivy image docker ${dockerhub}/${project} ${dockerhub}/${project}:latest > scan.txt
    cat scan.txt
    """
}