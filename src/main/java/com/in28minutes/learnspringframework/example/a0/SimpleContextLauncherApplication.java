package com.in28minutes.learnspringframework.example.a0;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import java.util.Arrays;

@Configuration
@ComponentScan
public class SimpleContextLauncherApplication {

    public static void main(String[] args) {

        try(var context = new AnnotationConfigApplicationContext(SimpleContextLauncherApplication.class)){
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        }
    }

}
