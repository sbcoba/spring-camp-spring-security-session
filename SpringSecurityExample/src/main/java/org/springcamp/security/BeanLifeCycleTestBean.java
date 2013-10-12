package org.springcamp.security;

import javax.annotation.PostConstruct;
import javax.servlet.ServletContext;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanClassLoaderAware;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.context.MessageSource;
import org.springframework.context.MessageSourceAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.context.weaving.LoadTimeWeaverAware;
import org.springframework.core.io.ResourceLoader;
import org.springframework.instrument.classloading.LoadTimeWeaver;
import org.springframework.jmx.export.notification.NotificationPublisher;
import org.springframework.jmx.export.notification.NotificationPublisherAware;
import org.springframework.web.context.ServletContextAware;

/**
 * @author keesun
 *
 */
public class BeanLifeCycleTestBean implements BeanNameAware,
        BeanClassLoaderAware, BeanFactoryAware, ResourceLoaderAware,
        ApplicationEventPublisherAware, MessageSourceAware,
        ApplicationContextAware, ServletContextAware, BeanPostProcessor,
        InitializingBean, LoadTimeWeaverAware, NotificationPublisherAware,
        BeanDefinitionRegistryPostProcessor{

    public BeanLifeCycleTestBean() {
        System.out.println("생성자를 호출하였습니다 !!!!!!!!!!!");
    }

    String beanName;

    ClassLoader classLoader;

    BeanFactory beanFactory;

    ResourceLoader resourceLoader;

    @PostConstruct
    public void init() {
        System.out.println("BeanLifeCycleTestBean @PostConstruct 실행합니다.");
    }

    public void setBeanName(String beanName) {
        System.out.println("setBeanName() 실행합니다.");
        this.beanName = beanName;
    }

    public String getBeanName() {
        return beanName;
    }

    public void setBeanClassLoader(ClassLoader classLoader) {
        System.out.println("setBeanClassLoader() 실행합니다.");
        this.classLoader = classLoader;
    }

    public ClassLoader getClassLoader() {
        return classLoader;
    }

    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("setBeanFactory() 실행합니다.");
        this.beanFactory = beanFactory;
    }

    public BeanFactory getBeanFactory() {
        return beanFactory;
    }

    public void setResourceLoader(ResourceLoader resourceLoader) {
        System.out.println("setResourceLoader() 실행합니다.");
        this.resourceLoader = resourceLoader;
    }

    public ResourceLoader getResourceLoader() {
        return resourceLoader;
    }

    public void setApplicationEventPublisher(ApplicationEventPublisher arg0) {
        System.out.println("setApplicationEventPublisher() 실행합니다.");
    }

    public void setMessageSource(MessageSource arg0) {
        System.out.println("setMessageSource() 실행합니다.");
    }

    public void setApplicationContext(ApplicationContext context)
            throws BeansException {
        System.out.println("setApplicationContext() 실행합니다.");
    }

    public void setServletContext(ServletContext servletContext) {
        System.out.println("setServletContext() 실행합니다.");
    }

    public Object postProcessBeforeInitialization(Object bean, String beanName)
            throws BeansException {
        System.out.println("postProcessBeforeInitialization()에서 " + beanName
                + "실행합니다.");
        return bean;
    }

    public Object postProcessAfterInitialization(Object bean, String beanName)
            throws BeansException {
        System.out.println("postProcessAfterInitialization() " + beanName
                + "실행합니다.");
        return bean;
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("afterPropertiesSet() 실행합니다.");
    }

    public void customInit() {
        System.out.println("customInit() 실행합니다.");
    }

    public void postProcessBeanFactory(
            ConfigurableListableBeanFactory beanFactory) throws BeansException {
        System.out.println("postProcessBeanFactory() 실행합니다.");

    }

    public void setNotificationPublisher(NotificationPublisher arg0) {
        System.out.println("setNotificationPublisher() 실행합니다.");
    }

    public void setLoadTimeWeaver(LoadTimeWeaver arg0) {
        System.out.println("setLoadTimeWeaver() 실행합니다.");
    }

    public void postProcessBeanDefinitionRegistry(
            BeanDefinitionRegistry registry) throws BeansException {
        System.out.println("postProcessBeanDefinitionRegistry() 실행합니다.");

    }
}