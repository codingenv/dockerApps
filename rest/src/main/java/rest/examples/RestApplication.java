package rest.examples;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.mvc.method.RequestMappingInfo;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

import java.util.Set;
import java.util.stream.Collectors;

@SpringBootApplication

public class RestApplication {

	@Autowired
	private RequestMappingHandlerMapping requestMappingHandlerMapping;

	public static void main(String[] args) {
		System.out.println("Starting SpringBoot application");
		SpringApplication.run(RestApplication.class, args);
	}

	@PostConstruct
	public void printAllEndPoints(){
		System.out.println("Printing all exposed Endpoints");
		Set<String> endpoints = requestMappingHandlerMapping.getHandlerMethods().keySet().stream()
				.map(RequestMappingInfo::toString)
				.collect(Collectors.toSet());

		for(String str: endpoints){
			System.out.println(str);
		}
	}

}
