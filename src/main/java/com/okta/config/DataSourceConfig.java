package com.okta.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@ConfigurationProperties(prefix = "okta")
@EnableConfigurationProperties
public class DataSourceConfig {
    @Value("${okta.baseurl}")
    private String baseurl;
    @Value("${okta.apikey}")
    private String apikey;


    public DataSourceConfig(){
        System.out.print("Base URL " + baseurl);
        System.out.print("API Key " + apikey);
    }

    public String getBaseUrl(){
        return this.baseurl;
    }

    public String getApikey(){
        return this.baseurl;
    }
}
