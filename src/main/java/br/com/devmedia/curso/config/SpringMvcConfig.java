package br.com.devmedia.curso.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

/**
 * 
 * @author Marcelo Stadtlober
 * 
 * Classe que informa ao Springframework com gostariamos de utilizar o SpringMVC
 *
 */

@Configuration	// Informa ao Spring que esta é uma Classe de configuração
public class SpringMvcConfig {
	
	/*
	 * Informa ao Spring como resolver as páginas da aplicação
	 */
	@Bean // Esta anotação torna o método gerenciado pelo Spring
	public InternalResourceViewResolver viewResolver() {
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/views/");
		resolver.setSuffix(".jsp");
		resolver.setViewClass(JstlView.class);
		
		return resolver;
	}

}
