package com.example.musicapp.service;

import com.example.musicapp.repository.PlaylistTrackRepository;
import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link PlaylistTrackService}.
 */
@Generated
public class PlaylistTrackService__BeanDefinitions {
  /**
   * Get the bean instance supplier for 'playlistTrackService'.
   */
  private static BeanInstanceSupplier<PlaylistTrackService> getPlaylistTrackServiceInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<PlaylistTrackService>forConstructor(PlaylistTrackRepository.class)
            .withGenerator((registeredBean, args) -> new PlaylistTrackService(args.get(0)));
  }

  /**
   * Get the bean definition for 'playlistTrackService'.
   */
  public static BeanDefinition getPlaylistTrackServiceBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(PlaylistTrackService.class);
    beanDefinition.setInstanceSupplier(getPlaylistTrackServiceInstanceSupplier());
    return beanDefinition;
  }
}
