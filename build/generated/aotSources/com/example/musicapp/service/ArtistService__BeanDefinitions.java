package com.example.musicapp.service;

import com.example.musicapp.repository.ArtistRepository;
import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link ArtistService}.
 */
@Generated
public class ArtistService__BeanDefinitions {
  /**
   * Get the bean instance supplier for 'artistService'.
   */
  private static BeanInstanceSupplier<ArtistService> getArtistServiceInstanceSupplier() {
    return BeanInstanceSupplier.<ArtistService>forConstructor(ArtistRepository.class)
            .withGenerator((registeredBean, args) -> new ArtistService(args.get(0)));
  }

  /**
   * Get the bean definition for 'artistService'.
   */
  public static BeanDefinition getArtistServiceBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(ArtistService.class);
    beanDefinition.setInstanceSupplier(getArtistServiceInstanceSupplier());
    return beanDefinition;
  }
}
