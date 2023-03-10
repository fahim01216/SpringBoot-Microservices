package com.codewithfahim.apigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
public class ApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiGatewayApplication.class, args);
	}

}

//  command to create instance of microservice
//  java -jar -Dserver.port=8082 target/department-service-0.0.1-SNAPSHOT.jar

// command to run docker image of rabbitmq
// docker run --rm -it -p 5672:5672 rabbitmq:3.11.10

// command to run zipkin server
// java -jar zipkin-server-2.24.0-exec.jar


