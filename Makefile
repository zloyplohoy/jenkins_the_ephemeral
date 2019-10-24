start:
	export GITHUB_DEPLOY_KEY=`cat id_rsa` && docker-compose down && docker rmi jenkins_the_ephemeral_jenkins && docker-compose up --build
