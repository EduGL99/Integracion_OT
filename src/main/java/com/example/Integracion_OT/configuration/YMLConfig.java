package com.example.Integracion_OT.configuration;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties
@ConfigurationProperties
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class YMLConfig {

    private String urlFacebookGraphQL;
    private String authUser;
    private String authPasswd;
}
