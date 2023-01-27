# Asset Management
## Docker 
##### Pulling postgres docker image.
>     sudo docker pull postgres:alpine
##### Creating docker container. 

>     godmaster@godmaster:~$ sudo docker run --name assetmandb -e POSTGRES_PASSWORD=password -d -p 5432:5432 postgres:alpine
           b5e87ce3c6c0cf87b748e375907585ca0a166ab41cebb3ee41e22748d57bf8a5
##### Listing existing containers.
>     sudo docker ps -a
           CONTAINER ID        IMAGE               COMMAND                  CREATED              STATUS                       PORTS                    NAMES
           b5e87ce3c6c0        postgres:alpine     "docker-entrypoint.s…"   About a minute ago   Up About a minute            0.0.0.0:5432->5432/tcp   assetmandb
##### stopping postgres service if you will be running on port 5432:5432
>     sudo service postgresql stop
##### Running the container using CONTAINER ID. 
>     sudo docker start b5e87ce3c6c0
           b5e87ce3c6c0
##### Initialising a bash interaction environment. 
>     sudo docker exec -it b5e87ce3c6c0 bin/bash
## Postgres database. 
##### Log in to postgres database.
>     bash-5.0# psql -U postgres
>     psql (12.2)
>     Type "help" for help.
##### List existing database. 
>     postgres=# \l
##### Creating database. 
>     postgres=# create database assetpostgresdb;
          CREATE DATABASE
##### Connecting to a database. 
>     postgres=# \c assetpostgresdb 
          You are now connected to database "assetpostgresdb" as user > "postgres".
##### check if there is any data in the database.
>     assetpostgresdb=# \dt
          Did not find any relations.
##### Run Spring Application
>     assetpostgresdb=# The database is ready now you can run AssetManagementApplication
##### check if there is any data in the database.      
>     assetpostgresdb=# \dt

