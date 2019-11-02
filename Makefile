start:
	\
	export GITHUB_DEPLOY_KEY=`cat id_rsa` && \
	docker-compose down --rmi all && \
	docker-compose up --build
stop:
	docker-compose down --rmi all
