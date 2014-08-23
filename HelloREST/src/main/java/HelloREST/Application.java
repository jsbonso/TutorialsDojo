package HelloREST;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


// Additional Imports:
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *  TutorialsDojo - Java 
 *  http://www.TutorialsDojo.com
 * 
 *  @author Sensei
 * 
 *  This is a sample RESTful Hello World program using
 *  Spring Boot App in Spring Tool Suite version 3.6.0
 *  
 *  Tutorial Link: 
 *  http://tutorialsdojo.com/java/2014/08/22/simple-rest-service-using-spring-boot-app-in-5-minutes/
 *
 */


@Configuration
@ComponentScan
@EnableAutoConfiguration

// Additional @Controller Annotation

@Controller
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
    
    /**
     *  This is the resource which will return a 
     *  "RESTful Hello" message. It can be accessed by
     *  going to http://localhost:8080/hello 
     */
    
	@RequestMapping("/hello")
	public @ResponseBody String hello(){
		return "RESTful Hello!";
	}
}
