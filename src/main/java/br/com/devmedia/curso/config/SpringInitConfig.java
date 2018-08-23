package br.com.devmedia.curso.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * 
 * @author Marcelo Stadtlober
 * 
 * Classe que inicia as configurações da aplicação.
 * Esta Classe meio que substitui o arquivo web.xml
 *
 */

public class SpringInitConfig extends AbstractAnnotationConfigDispatcherServletInitializer {

	/*
	 * Informa ao Spring a Classe raiz das configurações da aplicação 
	 */
	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class[] {RootConfig.class};
	}

	/*
	 * Informa ao Spring a Classe responsável pela configuração dos Servlets da aplicação 
	 */
	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class[] {SpringMvcConfig.class};
	}

	/*
	 * Mapiamento dos Servlets da aplicação 
	 */
	@Override
	protected String[] getServletMappings() {
		return new String[] {"/"};
	}

}
