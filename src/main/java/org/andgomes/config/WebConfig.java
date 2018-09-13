
package org.andgomes.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"org.andgomes.controller"})
public class WebConfig extends WebMvcConfigurerAdapter {

  @Bean
  public ViewResolver viewResolver() {
		
    InternalResourceViewResolver viewResolver =
        new InternalResourceViewResolver();
		
    viewResolver.setPrefix("/WEB-INF/views/");
    viewResolver.setSuffix(".jsp");
		
    return viewResolver;
		
  }
	
  public void configureDefaultServletHandling(
      DefaultServletHandlerConfigurer configurer) {
    configurer.enable();
  }
  
  @Bean
  public HandlerExceptionResolver sentryExceptionResolver() {
      return new io.sentry.spring.SentryExceptionResolver();
  }
  
  @Bean
  public ServletContextInitializer sentryServletContextInitializer() {
      return new io.sentry.spring.SentryServletContextInitializer();
  }
	
}