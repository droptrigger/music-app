package com.example.musicapp;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ConfigurationClassUtils;

/**
 * Bean definitions for {@link MusicApplication}.
 */
@Generated
public class MusicApplication__BeanDefinitions {
  /**
   * Get the bean definition for 'musicApplication'.
   */
  public static BeanDefinition getMusicApplicationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(MusicApplication.class);
    beanDefinition.setTargetType(MusicApplication.class);
    ConfigurationClassUtils.initializeConfigurationClass(MusicApplication.class);
    beanDefinition.setInstanceSupplier(MusicApplication$$SpringCGLIB$$0::new);
    return beanDefinition;
  }
}
