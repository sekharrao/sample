# Intro
This is a Greeting application with two service end points. One that greets with "Hello World" and another with "Hello Management"

Additional service ("/helloInternal") created to demonstrate the communication between the services using http protocol. 

### How to run application

To start the **greetings** application execute the following commands.

	cd greetings
	mvn spring-boot:run
	

To Start the **internal-greetings** application
	
	cd internal-greetings
	mvn spring-boot:run
	
### URL to access the service

To access the greetings application
	
	curl  http://localhost:8000/greetings


To access the internal-greetings application

	curl http://localhost:8080/internal-greetings
	

To check the communication between the services. (HTTP communication)

	curl  http://localhost:8000/helloInternal
	
*The output should be the same as when interal-greetings service is accessed directly.*
