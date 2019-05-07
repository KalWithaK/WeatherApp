package com.tts.WeatherApp;



import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.Data;

@SpringBootApplication
@Data
public class Request {
	private String zipCode;

}
