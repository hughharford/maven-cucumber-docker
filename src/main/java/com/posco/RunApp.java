package com.posco;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RunApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    SpringApplication.run(RunApp.class, args);

		System.out.println(""
				+ ""
				+ "____                    ____                  \n"
				+ "|   |                  |    |                 \n"
				+ "|    |         ___     |    |  ___   ___    \n"
				+ "|___|  |   |  |   |    |----| |   | |   |   \n"
				+ "|   |  |   |  |   |    |    | |   | |   |   \n"
				+ "|    |  |_|   |   |    |    | |__|  |__|    \n"
				+ "                              |      |      \n"
				+ "                              |      |      \n"
				+ "run it, run it, run it! \n\n"
				);
	}

}
