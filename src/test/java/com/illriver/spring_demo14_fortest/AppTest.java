package com.illriver.spring_demo14_fortest;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Unit test for simple App.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {TestConfig.class})
@ActiveProfiles("prod")
public class AppTest{
	
	@Autowired
	private TestBean testBean;
	
	@Test
	public void prodBeanShouldInject() {
		String exepected = "from production profile";
		String actual = testBean.getContent();
		Assert.assertEquals(exepected, actual);
	}
}
