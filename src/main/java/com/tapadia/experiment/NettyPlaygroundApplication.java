package com.tapadia.experiment;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class NettyPlaygroundApplication implements CommandLineRunner {

    private static Logger logger = LoggerFactory.getLogger(NettyPlaygroundApplication.class);

	public static void main(String[] args) {
		new SpringApplicationBuilder(NettyPlaygroundApplication.class).web(false).run(args);
	}

    @Override
    public void run(String... strings) throws Exception {
        logger.info("App started");
    }
}
