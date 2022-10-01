package org.example.configuration;

import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;

public class MySecurityInitializer extends AbstractSecurityWebApplicationInitializer {
}

// Создание Security Initializer
//  без этого класса не будет запрашиваться форма аутентификации, то есть не будет работать Spring Security