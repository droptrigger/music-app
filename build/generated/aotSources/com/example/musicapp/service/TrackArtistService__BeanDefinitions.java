package com.example.musicapp.service;

import com.example.musicapp.repository.TrackArtistRepository;
import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link TrackArtistService}.
 */
@Generated
public class TrackArtistService__BeanDefinitions {
  /**
   * Get the bean instance supplier for 'trackArtistService'.
   */
  private static BeanInstanceSupplier<TrackArtistService> getTrackArtistServiceInstanceSupplier() {
    return BeanInstanceSupplier.<TrackArtistService>forConstructor(TrackArtistRepository.class)
            .withGenerator((registeredBean, args) -> new TrackArtistService(args.get(0)));
  }

  /**
   * Get the bean definition for 'trackArtistService'.
   */
  public static BeanDefinition getTrackArtistServiceBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(TrackArtistService.class);
    beanDefinition.setInstanceSupplier(getTrackArtistServiceInstanceSupplier());
    return beanDefinition;
  }
}
