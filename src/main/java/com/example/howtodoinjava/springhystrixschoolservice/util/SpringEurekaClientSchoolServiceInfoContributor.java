package com.example.howtodoinjava.springhystrixschoolservice.util;

import java.util.Collections;

import org.springframework.boot.actuate.info.Info;
import org.springframework.boot.actuate.info.InfoContributor;
import org.springframework.stereotype.Component;

@Component
public class SpringEurekaClientSchoolServiceInfoContributor implements InfoContributor {

	//http://localhost:9098/info use this in the browser to access the below method to get the details of this servivce
	@Override
	public void contribute(Info.Builder builder) {
		builder.withDetail("details",
				Collections.singletonMap("description", "This is the School service, which is discovery server aware, and this service will Call Student Microservice, fro student details, which is again dicovery server aware!!! "));
	}

}
