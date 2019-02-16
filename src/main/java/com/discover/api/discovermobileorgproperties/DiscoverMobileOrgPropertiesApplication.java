package com.discover.api.discovermobileorgproperties;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class DiscoverMobileOrgPropertiesApplication {

	public static void main(String[] args) {
		SpringApplication.run(DiscoverMobileOrgPropertiesApplication.class, args);
	}

}

