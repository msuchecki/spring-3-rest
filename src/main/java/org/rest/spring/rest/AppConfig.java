package org.rest.spring.rest;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Created by IntelliJ IDEA.
 * User: msuchecki
 * Date: 3/25/13
 * Time: 5:47 PM
 */
@Configuration
@ComponentScan(basePackages = "org.rest.spring.rest")
@EnableWebMvc
@ImportResource("WEB-INF/ehcache-context.xml")
public class AppConfig {


}
