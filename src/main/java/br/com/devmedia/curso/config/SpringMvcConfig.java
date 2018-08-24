package br.com.devmedia.curso.config;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

import br.com.devmedia.curso.web.conversor.TipoSexoConverter;

/**
 * 
 * @author Marcelo Stadtlober
 * 
 * Classe que informa ao Springframework com gostariamos de utilizar o SpringMVC
 *
 */

@Configuration	// Informa ao Spring que esta é uma Classe de configuração
public class SpringMvcConfig extends WebMvcConfigurerAdapter {
	
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

	@Override
	public void addFormatters(FormatterRegistry registry) {
		registry.addConverter(new TipoSexoConverter());
	}
	
	@Bean
	public MessageSource messageSource() {
		ResourceBundleMessageSource source = new ResourceBundleMessageSource();
		source.setBasename("messages");
		
		return source;
	}

}
