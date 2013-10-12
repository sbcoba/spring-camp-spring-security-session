package org.springcamp.security;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.stereotype.Component;

public class FilterModifiy implements BeanDefinitionRegistryPostProcessor {
	private static final Logger log = LoggerFactory.getLogger(FilterModifiy.class);
	@Override
	public void postProcessBeanFactory( ConfigurableListableBeanFactory beanFactory) throws BeansException {
	}

	@Override
	public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
		log.debug(Arrays.toString(registry.getBeanDefinitionNames()));
	}

}
