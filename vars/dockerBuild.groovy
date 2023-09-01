def call(String project, String ImageTag, String dockerHub) {
    sh """
    docker image build -t ${dockerhub}/${project} .
    docker image tag ${dockerhub}/${project} ${dockerhub}/${project}:${ImageTag}
    docker image tag ${dockerhub}/${project} ${dockerhub}/${project}:latest
    
    """
    
}