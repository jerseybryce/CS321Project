package mason.patriotmaps.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

//web configurer for Rest API, so we get the data in Json format
@Configuration
public class WebConfig implements WebMvcConfigurer{
    public void configureContentNegotiation(ContentNegotiationConfigurer configurer){
        configurer.favorParameter(true).parameterName("mediaType").defaultContentType(MediaType.APPLICATION_JSON).mediaType("xml", MediaType.APPLICATION_XML).mediaType("json", MediaType.APPLICATION_JSON);
    }
}
