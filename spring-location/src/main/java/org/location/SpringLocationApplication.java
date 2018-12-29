package org.location;


import org.location.dao.TypelogDAO;
import org.location.entities.TypeLog;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringLocationApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(SpringLocationApplication.class, args);
		TypelogDAO typelog=ctx.getBean(TypelogDAO.class);
		
		typelog.save(new TypeLog(1L,"maison","logement de type maison"));
		typelog.save(new TypeLog(2L,"studio","logement de type studio"));
		typelog.save(new TypeLog(3L,"appartement","logement de type appartement"));
		
		
	}

}

