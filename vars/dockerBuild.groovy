/*def call(String project, String ImageTag, String dockerHub) {
    sh """
    docker image build -t ${dockerHub}/${project} .
    docker image tag ${dockerHub}/${project} ${dockerHub}/${project}:${ImageTag}
    docker image tag ${dockerHub}/${project} ${dockerHub}/${project}:latest
    
    """
    
}*/


def call(String awsAccountID, String region, String ecrRepoName) {
    sh """
    docker build -t ${ecrRepoName} .
    docker tag ${awsAccountID}.dkr.ecr.${region}.amazonaws.com/${ecrRepoName}:latest
    """
    
}