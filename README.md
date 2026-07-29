# iua-ru-mock
Mocks the gazelle test environment api for testing a simulator locally. 

It provides:
- an endpoint for simulation reports with path /simulation/v1/report
- a websocket endpoint for alive messages with path /service-registration/:instanceId/:replicaId

## Running the application in dev mode

You can run your application in dev mode that enables live coding using:

```shell script
./mvnw quarkus:dev
```

## Run docker image in bridge network

create network (if not exists):
```
docker network create my_network
```
Compile: 
```
./mvnw clean package -Dmaven.javadoc.skip=true
```

build image:
```
docker build -t iua-ru-mock .
```

run container:
```
docker run -d --name iua-ru-mock -p 9090:9090 --network my_network iua-ru-mock 
``` 
