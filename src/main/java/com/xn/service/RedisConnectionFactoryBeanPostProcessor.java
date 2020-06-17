//package com.xn.service;
//
//import io.opentracing.Tracer;
//import io.opentracing.contrib.redis.spring.connection.TracingRedisConnectionFactory;
//import org.springframework.beans.BeansException;
//import org.springframework.beans.factory.config.BeanPostProcessor;
//import org.springframework.data.redis.connection.RedisConnectionFactory;
//import org.springframework.stereotype.Component;
//
//@Component
//public class RedisConnectionFactoryBeanPostProcessor implements BeanPostProcessor {
//
//  private Tracer tracer;
//
//  public RedisConnectionFactoryBeanPostProcessor(Tracer tracer) {
//    this.tracer = tracer;
//  }
//
//  @Override
//  public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
////    if (bean instanceof RedisConnectionFactory) {
////      return new TracingRedisConnectionFactory((RedisConnectionFactory) bean, false, tracer);
////    }
//    return bean;
//  }
//
//  @Override
//  public Object postProcessBeforeInitialization(Object bean, String s) throws BeansException {
////    if (bean instanceof RedisConnectionFactory) {
////      return new TracingRedisConnectionFactory((RedisConnectionFactory) bean, false, tracer);
////    }
////    org.springframework.data.redis.connection.ReactiveRedisConnectionFactory ss = null;
//    return bean;
//  }
//}
