package com.example.musicapp.controller;

import com.example.musicapp.service.TrackArtistService;
import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link TrackArtistController}.
 */
@Generated
public class TrackArtistController__BeanDefinitions {
  /**
   * Get the bean instance supplier for 'trackArtistController'.
   */
  private static BeanInstanceSupplier<TrackArtistController> getTrackArtistControllerInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<TrackArtistController>forConstructor(TrackArtistService.class)
            .withGenerator((registeredBean, args) -> new TrackArtistController(args.get(0)));
  }

  /**
   * Get the bean definition for 'trackArtistController'.
   */
  public static BeanDefinition getTrackArtistControllerBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(TrackArtistController.class);
    beanDefinition.setInstanceSupplier(getTrackArtistControllerInstanceSupplier());
    return beanDefinition;
  }
}
