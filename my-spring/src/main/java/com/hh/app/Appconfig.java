package com.hh.app;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@ComponentScan("com.hh")
@Configuration
@EnableAspectJAutoProxy
public class Appconfig {
}
