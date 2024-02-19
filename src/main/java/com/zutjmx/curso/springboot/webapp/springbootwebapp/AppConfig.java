package com.zutjmx.curso.springboot.webapp.springbootwebapp;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@Configuration
@PropertySources({
	@PropertySource(value = "classpath:configuracion.properties", encoding = "UTF-8"),
	@PropertySource(value = "classpath:mensajes.properties", encoding = "UTF-8")
})
public class AppConfig {

}
