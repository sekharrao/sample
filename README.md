# Intro
This is a Greeting application with two service end points. One that greets with "Hello World" and another with "Hello Management"

a) Additional service ("/helloInternal") created to demonstrate the communication between the services using http protocol. 

b) Additional service ("/sendMessage") created to demonstrate the communication between the services using pub/sub model.
### How to run application

To start the **greetings** application execute the following commands.

	cd greetings
	mvn spring-boot:run
	

To Start the **internal-greetings** application
	
	cd internal-greetings
	mvn spring-boot:run
	
#### For pub/sub model example
Please start RabbitMQ server
	
	rabbitmq-server
	
	
### URL to access the service

a) To access the greetings application
	
	curl  http://localhost:8000/greetings


b) To access the internal-greetings application

	curl http://localhost:8080/internal-greetings
	

c) To check the communication between the services. (HTTP communication)

	curl  http://localhost:8000/helloInternal
	
*The output should be the same as when interal-greetings service is accessed directly.*


d) To send the message to backend service, use the following

	curl http://localhost:8000/sendMessage
	
*The output will be printed in the log files.*