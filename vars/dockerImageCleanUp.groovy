/*def call(String project, String ImageTag, String dockerHub) {
    sh """
    docker rmi ${dockerHub}/${project}:${ImageTag}
    docker rmi ${dockerHub}/${project} ${dockerHub}/${project}:latest
    
    """
} */

def call(String awsAccountID, String region, String ecrRepoName) {
    sh """
    docker rmi ${ecrRepoName}:latest ${awsAccountID}.dkr.ecr.${region}.amazonaws.com/${ecrRepoName}:latest
    """
    
}