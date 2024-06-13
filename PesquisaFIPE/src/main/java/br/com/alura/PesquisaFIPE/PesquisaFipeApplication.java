package br.com.alura.PesquisaFIPE;

import br.com.alura.PesquisaFIPE.main.Main;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PesquisaFipeApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(PesquisaFipeApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Hello World, by Renthon34!");
		Main main = new Main();
		main.exibeMenu();

	}

}
