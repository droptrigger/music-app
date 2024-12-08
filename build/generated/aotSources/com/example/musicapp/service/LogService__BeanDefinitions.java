package com.example.musicapp.service;

import com.example.musicapp.repository.LogRepository;
import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link LogService}.
 */
@Generated
public class LogService__BeanDefinitions {
  /**
   * Get the bean instance supplier for 'logService'.
   */
  private static BeanInstanceSupplier<LogService> getLogServiceInstanceSupplier() {
    return BeanInstanceSupplier.<LogService>forConstructor(LogRepository.class)
            .withGenerator((registeredBean, args) -> new LogService(args.get(0)));
  }

  /**
   * Get the bean definition for 'logService'.
   */
  public static BeanDefinition getLogServiceBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(LogService.class);
    beanDefinition.setInstanceSupplier(getLogServiceInstanceSupplier());
    return beanDefinition;
  }
}
