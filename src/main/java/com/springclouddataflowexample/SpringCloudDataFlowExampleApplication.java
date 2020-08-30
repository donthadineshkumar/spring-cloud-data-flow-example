package com.springclouddataflowexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.dataflow.server.EnableDataFlowServer;

@SpringBootApplication
@EnableDataFlowServer
public class SpringCloudDataFlowExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudDataFlowExampleApplication.class, args);
	}

}
