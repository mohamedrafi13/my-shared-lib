def call(string project, string ImageTag, string dockerHub) {
    sh """
    docker image build -t ${docker}/${project} .
    docker image tag ${dockerhub}/${project} ${dockerhub}/${project}:${ImageTag}
    docker image tag ${dockerhub}/${project} ${dockerhub}/${project}:latest
    
    """
    
}