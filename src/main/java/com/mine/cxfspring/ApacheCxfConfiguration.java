package com.mine.cxfspring;

import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApacheCxfConfiguration {
    @Bean
    public JacksonJsonProvider jacksonJsonProvider() {
        return new JacksonJsonProvider();
    }
}
