def call(String project, String ImageTag, String dockerHub) {
    sh """
    docker rmi ${dockerHub}/${project}:${ImageTag}
    docker rmi ${dockerHub}/${project} ${dockerHub}/${project}:latest
    
    """
    
