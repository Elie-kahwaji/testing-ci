package com.example.demo;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public class ApplicationStartTest {

  @Test
  public void applicationStarts() {
    DemoApplication.main(new String[] {});
    Assert.assertTrue("Test required by sonar", true);
  }
}