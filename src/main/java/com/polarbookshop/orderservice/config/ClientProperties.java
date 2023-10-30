package com.polarbookshop.orderservice.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.net.URI;

@ConfigurationProperties(prefix = "polar")
public record ClientProperties (

    URI catalogServiceUri

){}
