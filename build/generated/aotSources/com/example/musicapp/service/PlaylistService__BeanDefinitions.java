package com.example.musicapp.service;

import com.example.musicapp.repository.PlaylistRepository;
import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link PlaylistService}.
 */
@Generated
public class PlaylistService__BeanDefinitions {
  /**
   * Get the bean instance supplier for 'playlistService'.
   */
  private static BeanInstanceSupplier<PlaylistService> getPlaylistServiceInstanceSupplier() {
    return BeanInstanceSupplier.<PlaylistService>forConstructor(PlaylistRepository.class)
            .withGenerator((registeredBean, args) -> new PlaylistService(args.get(0)));
  }

  /**
   * Get the bean definition for 'playlistService'.
   */
  public static BeanDefinition getPlaylistServiceBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(PlaylistService.class);
    beanDefinition.setInstanceSupplier(getPlaylistServiceInstanceSupplier());
    return beanDefinition;
  }
}
