package com.tandem.greetings.service;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.context.annotation.Configuration;
import org.springframework.integration.annotation.IntegrationComponentScan;

@Configuration
@EnableBinding(Destination.class)
@IntegrationComponentScan
public class IntegrationConfiguration {

}
