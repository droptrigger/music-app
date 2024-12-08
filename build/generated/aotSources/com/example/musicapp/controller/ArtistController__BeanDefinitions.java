package com.example.musicapp.controller;

import com.example.musicapp.service.ArtistService;
import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link ArtistController}.
 */
@Generated
public class ArtistController__BeanDefinitions {
  /**
   * Get the bean instance supplier for 'artistController'.
   */
  private static BeanInstanceSupplier<ArtistController> getArtistControllerInstanceSupplier() {
    return BeanInstanceSupplier.<ArtistController>forConstructor(ArtistService.class)
            .withGenerator((registeredBean, args) -> new ArtistController(args.get(0)));
  }

  /**
   * Get the bean definition for 'artistController'.
   */
  public static BeanDefinition getArtistControllerBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(ArtistController.class);
    beanDefinition.setInstanceSupplier(getArtistControllerInstanceSupplier());
    return beanDefinition;
  }
}
