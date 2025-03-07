The repository will conatins applications which we will use for docker image generation


Rest Application:
	To start the tomcat service :
    systemctl daemon-reload


Postgres Db configuration used in the application
    Database name: postgres
    username: postgres
    password: Learn@2025#


Create the images for spring boot application using dockerfile
    docker build -t my-springboot-app .

As we need postgres to run this application, we can download the postgres images from docker hub
    docker pull postgres:latest

Now we have both the images with us, we can write the docker-compose.yml file and run both the images using docker-compose up command
    docker-compose up
