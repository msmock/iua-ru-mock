# iua-ru-mock
Mocks a gazelle test environment with the simulation api. 

Provides:
- an endpoint for simulation reports with path /simulation/v1/report
- a websocket endpoint for alive messages with path /service-registration/:instanceId/:replicaId

## Running the application in dev mode

You can run your application in dev mode that enables live coding using:

```shell script
./mvnw quarkus:dev
```

> **_NOTE:_**  Quarkus ships with a Dev UI, which is available in dev mode only at <http://localhost:8080/q/dev/>.

## Creating a native executable

You can run the native executable build in a container using:

```shell script
./mvnw clean package -Dnative -Dquarkus.native.container-build=true -Dmaven.javadoc.skip=true
```

## Create docker image 

```
docker build -t iua-ru-mock .
```

run docker container:
```
docker run -d --name iua-ru-mock -p 9090:9090 --network my_network iua-ru-mock   
```