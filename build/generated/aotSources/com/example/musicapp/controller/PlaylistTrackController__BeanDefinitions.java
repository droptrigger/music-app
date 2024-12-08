package com.example.musicapp.controller;

import com.example.musicapp.service.PlaylistTrackService;
import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link PlaylistTrackController}.
 */
@Generated
public class PlaylistTrackController__BeanDefinitions {
  /**
   * Get the bean instance supplier for 'playlistTrackController'.
   */
  private static BeanInstanceSupplier<PlaylistTrackController> getPlaylistTrackControllerInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<PlaylistTrackController>forConstructor(PlaylistTrackService.class)
            .withGenerator((registeredBean, args) -> new PlaylistTrackController(args.get(0)));
  }

  /**
   * Get the bean definition for 'playlistTrackController'.
   */
  public static BeanDefinition getPlaylistTrackControllerBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(PlaylistTrackController.class);
    beanDefinition.setInstanceSupplier(getPlaylistTrackControllerInstanceSupplier());
    return beanDefinition;
  }
}
