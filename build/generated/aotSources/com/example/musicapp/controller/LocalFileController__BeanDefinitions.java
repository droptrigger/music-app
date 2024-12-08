package com.example.musicapp.controller;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link LocalFileController}.
 */
@Generated
public class LocalFileController__BeanDefinitions {
  /**
   * Get the bean definition for 'localFileController'.
   */
  public static BeanDefinition getLocalFileControllerBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(LocalFileController.class);
    beanDefinition.setInstanceSupplier(LocalFileController::new);
    return beanDefinition;
  }
}
