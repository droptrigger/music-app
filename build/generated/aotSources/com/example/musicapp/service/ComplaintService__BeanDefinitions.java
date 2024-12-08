package com.example.musicapp.service;

import com.example.musicapp.repository.ComplaintRepository;
import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link ComplaintService}.
 */
@Generated
public class ComplaintService__BeanDefinitions {
  /**
   * Get the bean instance supplier for 'complaintService'.
   */
  private static BeanInstanceSupplier<ComplaintService> getComplaintServiceInstanceSupplier() {
    return BeanInstanceSupplier.<ComplaintService>forConstructor(ComplaintRepository.class)
            .withGenerator((registeredBean, args) -> new ComplaintService(args.get(0)));
  }

  /**
   * Get the bean definition for 'complaintService'.
   */
  public static BeanDefinition getComplaintServiceBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(ComplaintService.class);
    beanDefinition.setInstanceSupplier(getComplaintServiceInstanceSupplier());
    return beanDefinition;
  }
}
