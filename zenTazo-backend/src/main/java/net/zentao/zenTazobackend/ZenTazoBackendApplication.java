package net.zentao.zenTazobackend;

import net.zentao.zenTazobackend.controller.ZtBuildController;
import net.zentao.zenTazobackend.repository.PersonsRepository;
import net.zentao.zenTazobackend.repository.ZtBuildRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ZenTazoBackendApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ZenTazoBackendApplication.class, args);
	}

	@Autowired
	private ZtBuildRepository ztBuildRepository;

	@Autowired
	private PersonsRepository personsRepository;


	@Override
	public void run(String... args) throws Exception {










	}
}
