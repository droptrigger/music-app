package com.example.musicapp.controller;

import com.example.musicapp.service.ComplaintService;
import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link ComplaintController}.
 */
@Generated
public class ComplaintController__BeanDefinitions {
  /**
   * Get the bean instance supplier for 'complaintController'.
   */
  private static BeanInstanceSupplier<ComplaintController> getComplaintControllerInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<ComplaintController>forConstructor(ComplaintService.class)
            .withGenerator((registeredBean, args) -> new ComplaintController(args.get(0)));
  }

  /**
   * Get the bean definition for 'complaintController'.
   */
  public static BeanDefinition getComplaintControllerBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(ComplaintController.class);
    beanDefinition.setInstanceSupplier(getComplaintControllerInstanceSupplier());
    return beanDefinition;
  }
}
