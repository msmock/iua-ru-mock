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
./mvnw package -Dnative -Dquarkus.native.container-build=true
```

You can then execute your native executable with: `./target/quarkus-test-1.0.0-SNAPSHOT-runner`

## Create docker image 

```shell script
docker build -t iua-ru-mock .
```