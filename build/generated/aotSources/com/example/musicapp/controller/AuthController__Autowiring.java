package com.example.musicapp.controller;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link AuthController}.
 */
@Generated
public class AuthController__Autowiring {
  /**
   * Apply the autowiring.
   */
  public static AuthController apply(RegisteredBean registeredBean, AuthController instance) {
    AutowiredFieldValueResolver.forRequiredField("authService").resolveAndSet(registeredBean, instance);
    return instance;
  }
}
