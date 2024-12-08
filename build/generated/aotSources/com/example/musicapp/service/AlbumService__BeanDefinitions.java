package com.example.musicapp.service;

import com.example.musicapp.repository.AlbumRepository;
import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link AlbumService}.
 */
@Generated
public class AlbumService__BeanDefinitions {
  /**
   * Get the bean instance supplier for 'albumService'.
   */
  private static BeanInstanceSupplier<AlbumService> getAlbumServiceInstanceSupplier() {
    return BeanInstanceSupplier.<AlbumService>forConstructor(AlbumRepository.class)
            .withGenerator((registeredBean, args) -> new AlbumService(args.get(0)));
  }

  /**
   * Get the bean definition for 'albumService'.
   */
  public static BeanDefinition getAlbumServiceBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(AlbumService.class);
    beanDefinition.setInstanceSupplier(getAlbumServiceInstanceSupplier());
    return beanDefinition;
  }
}
