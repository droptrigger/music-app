package com.example.musicapp.service;

import com.example.musicapp.repository.TrackRepository;
import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link TrackService}.
 */
@Generated
public class TrackService__BeanDefinitions {
  /**
   * Get the bean instance supplier for 'trackService'.
   */
  private static BeanInstanceSupplier<TrackService> getTrackServiceInstanceSupplier() {
    return BeanInstanceSupplier.<TrackService>forConstructor(TrackRepository.class)
            .withGenerator((registeredBean, args) -> new TrackService(args.get(0)));
  }

  /**
   * Get the bean definition for 'trackService'.
   */
  public static BeanDefinition getTrackServiceBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(TrackService.class);
    beanDefinition.setInstanceSupplier(getTrackServiceInstanceSupplier());
    return beanDefinition;
  }
}
