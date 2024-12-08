package com.example.musicapp.controller;

import com.example.musicapp.service.TrackService;
import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link TrackController}.
 */
@Generated
public class TrackController__BeanDefinitions {
  /**
   * Get the bean instance supplier for 'trackController'.
   */
  private static BeanInstanceSupplier<TrackController> getTrackControllerInstanceSupplier() {
    return BeanInstanceSupplier.<TrackController>forConstructor(TrackService.class)
            .withGenerator((registeredBean, args) -> new TrackController(args.get(0)));
  }

  /**
   * Get the bean definition for 'trackController'.
   */
  public static BeanDefinition getTrackControllerBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(TrackController.class);
    beanDefinition.setInstanceSupplier(getTrackControllerInstanceSupplier());
    return beanDefinition;
  }
}
