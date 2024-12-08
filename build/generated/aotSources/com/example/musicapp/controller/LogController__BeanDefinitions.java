package com.example.musicapp.controller;

import com.example.musicapp.service.LogService;
import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link LogController}.
 */
@Generated
public class LogController__BeanDefinitions {
  /**
   * Get the bean instance supplier for 'logController'.
   */
  private static BeanInstanceSupplier<LogController> getLogControllerInstanceSupplier() {
    return BeanInstanceSupplier.<LogController>forConstructor(LogService.class)
            .withGenerator((registeredBean, args) -> new LogController(args.get(0)));
  }

  /**
   * Get the bean definition for 'logController'.
   */
  public static BeanDefinition getLogControllerBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(LogController.class);
    beanDefinition.setInstanceSupplier(getLogControllerInstanceSupplier());
    return beanDefinition;
  }
}
