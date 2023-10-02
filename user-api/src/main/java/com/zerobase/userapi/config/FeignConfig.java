package com.zerobase.userapi.config;

import feign.auth.BasicAuthRequestInterceptor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeignConfig {

    @Qualifier(value = "mailgun")
    public BasicAuthRequestInterceptor basicAuthRequestInterceptor () {
        return new BasicAuthRequestInterceptor("api", "a5549b62ab89029d303b206b8faa5fc4-77316142-3946f2aa");

    }
}
