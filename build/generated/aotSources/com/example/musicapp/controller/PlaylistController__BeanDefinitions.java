package com.example.musicapp.controller;

import com.example.musicapp.service.PlaylistService;
import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link PlaylistController}.
 */
@Generated
public class PlaylistController__BeanDefinitions {
  /**
   * Get the bean instance supplier for 'playlistController'.
   */
  private static BeanInstanceSupplier<PlaylistController> getPlaylistControllerInstanceSupplier() {
    return BeanInstanceSupplier.<PlaylistController>forConstructor(PlaylistService.class)
            .withGenerator((registeredBean, args) -> new PlaylistController(args.get(0)));
  }

  /**
   * Get the bean definition for 'playlistController'.
   */
  public static BeanDefinition getPlaylistControllerBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(PlaylistController.class);
    beanDefinition.setInstanceSupplier(getPlaylistControllerInstanceSupplier());
    return beanDefinition;
  }
}
