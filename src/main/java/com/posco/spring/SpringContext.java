package com.posco.spring;

import com.posco.RunApp;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * Spring ApplicationContext static wrapper.
 *
 * @author Yuriy Tumakha
 */
@Component
public class SpringContext {

  private static ApplicationContext applicationContext;

  public SpringContext(ApplicationContext context) {
    applicationContext = context;
  }

  public static ApplicationContext getApplicationContext() {
    if (applicationContext == null) {
      RunApp.main(new String[0]);
    }
    return applicationContext;
  }

}
