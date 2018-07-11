package com.Tsugaruweb.springUtils;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor;
import org.springframework.context.annotation.CommonAnnotationBeanPostProcessor;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.config.*;

@Scope(BeanDefinition.SCOPE_SINGLETON)
@Component
public class SpringInjector {
    
    @Autowired
    private AutowiredAnnotationBeanPostProcessor autowiredProcessor;
    
    @Resource
    private CommonAnnotationBeanPostProcessor commonProcessor;
    
    public void inject(final Object unmanagedBean) {
        
        // javax.* 関連のアノテーションのインジェクション(@Resoure)
        commonProcessor.postProcessPropertyValues(null, null, unmanagedBean, unmanagedBean.getClass().getSimpleName());
        
        // @Autowire、@Valueのアノテーションのインジェクション
        autowiredProcessor.processInjection(unmanagedBean);
    }
}