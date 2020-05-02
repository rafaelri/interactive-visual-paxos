# Visual Interactive (Web) Paxos

Paxos implementation geared towards allowing the students to better understand how the protocol works. 
Part of a Parallel, Concurrent and Distributed Systems undergrad class.

## Running
For running 3 instances (minimal for a paxos run), run in 3 separate terminals (on backend directory):
### Instance 1
```
./mvnw spring-boot:run -Dspring-boot.run.jvmArguments="-Dserver.port=8080" -Dspring-boot.run.arguments="1 localhost:8081 localhost:8082"
```
### Instance 2
```
./mvnw spring-boot:run -Dspring-boot.run.jvmArguments="-Dserver.port=8081" -Dspring-boot.run.arguments="2 localhost:8080 localhost:8082"
```
### Instance 3
```
./mvnw spring-boot:run -Dspring-boot.run.jvmArguments="-Dserver.port=8081" -Dspring-boot.run.arguments="3 localhost:8080 localhost:8081"
```
