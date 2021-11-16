package com.example.patroncliente;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PatronClienteApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(PatronClienteApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Service s = new Service();
		
		String abierto = "Abierto";
		String cerrado = "Cerrado";
		String medioabierto = "Semiabierto";
		CBuilder b = new CBuilder();
		Coche c = b.status(abierto).build();
		
		
		for(int i=0; i <= 5 && c.getStatus().equals(abierto); i++) {
			c.setStatus(medioabierto);
			s.gAmedias();
			Thread.sleep(3000);
			if(i >= 3) {
				c.setStatus(cerrado);
				s.gCerrar();
				Thread.sleep(3000);
			}else {
				c.setStatus(abierto);
				s.gAbrir();
				Thread.sleep(3000);
			}
			
		}
		
		
	}

}
