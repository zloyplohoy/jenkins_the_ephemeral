run:
	docker-compose up
re:
	export GITHUB_DEPLOY_KEY=`cat id_rsa` && docker-compose down && docker-compose up --build
