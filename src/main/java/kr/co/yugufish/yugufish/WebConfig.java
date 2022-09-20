package kr.co.yugufish.yugufish;

import java.io.IOException;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.resource.PathResourceResolver;

@Configuration
public class WebConfig implements WebMvcConfigurer{

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        // TODO Auto-generated method stub

        registry.addResourceHandler("/js/**")
                .addResourceLocations("classpath:/static/vue/js/");

        registry.addResourceHandler("/img/**")
                .addResourceLocations("classpath:/static/vue/img/");

        registry.addResourceHandler("/css/**")
                .addResourceLocations("classpath:/static/vue/css/");

        registry.addResourceHandler("/uploads/**")
                .addResourceLocations("file:/Users/jschoi/Documents/img/");

        registry.addResourceHandler("/route/**")
                .addResourceLocations("classpath:/static")
                .resourceChain(true)
                .addResolver(new PathResourceResolver(){
                    @Override
                    protected Resource getResource(String resourcePath, Resource location) throws IOException {
                        // TODO Auto-generated method stub
                        return new ClassPathResource("/templates/index.html");
                    }
                });
    }
    
}
