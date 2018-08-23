package br.com.devmedia.curso.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * 
 * @author Marcelo Stadtlober
 * 
 * Classe com as configurações do Spring para esta aplicação
 *
 */

@Configuration 							// Informa ao Spring que esta é uma classe de Configuração
@ComponentScan("br.com.devmedia.curso") // Informa ao Spring onde encontrar as Classe que ele irá gerenciar
@EnableWebMvc							// Informa ao SpringFramework que queremos utilizar o SpringMVC
public class RootConfig {

}
