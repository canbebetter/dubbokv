/*
 * Copyright 1999-2011 Alibaba Group.
 *  
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *  
 *      http://www.apache.org/licenses/LICENSE-2.0
 *  
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.alibaba.dubbo.config.spring;

import com.alibaba.dubbo.config.*;
import com.alibaba.dubbo.config.annotation.Service;
import com.alibaba.dubbo.config.spring.extension.SpringExtensionFactory;
import org.springframework.beans.factory.BeanFactoryUtils;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.support.AbstractApplicationContext;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * ServiceFactoryBean
 * 
 * @author william.liangf
 * @export
 */
public class ServiceImpl<T> implements Service {

    public Class<?> interfaceClass() {
        return void.class;
    }

    public String interfaceName() {
        return "";
    }

    public String version() {
        return "";
    }

    public String group() {
        return "";
    }

    public String path() {
        return "";
    }

    public boolean export() {
        return false;
    }

    public String token() {
        return "";
    }

    public boolean deprecated() {
        return false;
    }

    public boolean dynamic() {
        return false;
    }

    public String accesslog() {
        return "";
    }

    public int executes() {
        return 0;
    }

    public boolean register() {
        return false;
    }

    public int weight() {
        return 0;
    }

    public String document() {
        return "";
    }

    public int delay() {
        return 0;
    }

    public String local() {
        return "";
    }

    public String stub() {
        return "";
    }

    public String cluster() {
        return "";
    }

    public String proxy() {
        return "";
    }

    public int connections() {
        return 0;
    }

    public int callbacks() {
        return 0;
    }

    public String onconnect() {
        return "";
    }

    public String ondisconnect() {
        return "";
    }

    public String owner() {
        return "";
    }

    public String layer() {
        return "";
    }

    public int retries() {
        return 0;
    }

    public String loadbalance() {
        return "";
    }

    public boolean async() {
        return false;
    }

    public int actives() {
        return 0;
    }

    public boolean sent() {
        return false;
    }

    public String mock() {
        return "";
    }

    public String validation() {
        return "";
    }

    public int timeout() {
        return 0;
    }

    public String cache() {
        return "";
    }

    public String[] filter() {
        return new String[0];
    }

    public String[] listener() {
        return new String[0];
    }

    public String[] parameters() {
        return new String[0];
    }

    public String application() {
        return "";
    }

    public String module() {
        return "";
    }

    public String provider() {
        return "";
    }

    public String[] protocol() {
        return new String[0];
    }

    public String monitor() {
        return "";
    }

    public String[] registry() {
        return new String[0];
    }

    public Class<? extends Annotation> annotationType() {
        return null;
    }
}