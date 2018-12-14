package com.illriver.spring_demo14_fortest;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * 配置类
 * @author Pactera
 *
 */
@Configuration
public class TestConfig {
	@Bean
	@Profile("dev")
	public TestBean devDemoBean() {
		return new TestBean("from development profile");
	}
	@Bean
	@Profile("prod")
	public TestBean proDemoBean() {
		return new TestBean("from production profile");
	}

}
