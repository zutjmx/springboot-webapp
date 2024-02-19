package com.zutjmx.curso.springboot.webapp.springbootwebapp;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@Configuration
@PropertySources({
	@PropertySource("classpath:configuracion.properties"),
	@PropertySource("classpath:mensajes.properties")
})
public class AppConfig {

}
