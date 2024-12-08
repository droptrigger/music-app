package com.example.musicapp.controller;

import com.example.musicapp.service.AlbumService;
import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link AlbumController}.
 */
@Generated
public class AlbumController__BeanDefinitions {
  /**
   * Get the bean instance supplier for 'albumController'.
   */
  private static BeanInstanceSupplier<AlbumController> getAlbumControllerInstanceSupplier() {
    return BeanInstanceSupplier.<AlbumController>forConstructor(AlbumService.class)
            .withGenerator((registeredBean, args) -> new AlbumController(args.get(0)));
  }

  /**
   * Get the bean definition for 'albumController'.
   */
  public static BeanDefinition getAlbumControllerBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(AlbumController.class);
    beanDefinition.setInstanceSupplier(getAlbumControllerInstanceSupplier());
    return beanDefinition;
  }
}
