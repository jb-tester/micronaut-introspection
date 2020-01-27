package com.mytests.micronaut.beanIntrospection;

import com.mytests.micronaut.beanIntrospection.beans.Bean1;
import com.mytests.micronaut.beanIntrospection.beans.Bean2;
import com.mytests.micronaut.beanIntrospection.beans.NotIntrospectableBean;
import io.micronaut.core.beans.BeanIntrospection;
import io.micronaut.core.beans.exceptions.IntrospectionException;
import io.micronaut.core.reflect.exception.InstantiationException;
import io.micronaut.runtime.Micronaut;

/**
 * *******************************
 * Created by irina on 1/27/2020.
 * Project: micronaut-introspection
 * *******************************
 */
public class Application {
    public static void main(String[] args) {
        Micronaut.run(Application.class);
         introspectBean1();
         introspectBean2();
         introspectBean1ByIncorrectConstructor();
         introspectNotInrospectableBean();
    }
    static void introspectNotInrospectableBean() {
        try {
            BeanIntrospection<NotIntrospectableBean> intro = BeanIntrospection.getIntrospection(NotIntrospectableBean.class);
            NotIntrospectableBean bean = intro.instantiate("p1");
        } catch (IntrospectionException e) {

            System.out.println("**********************************");
            System.out.println(e.getMessage());
            System.out.println("**********************************");;
        }

    }
    static void introspectBean1(){

        BeanIntrospection<Bean1> b1intro = BeanIntrospection.getIntrospection(Bean1.class);
        Bean1 bean1_1 = b1intro.instantiate("p1_value","p2_value",100);
        System.out.println(bean1_1.toString());

    }
    static void introspectBean1ByIncorrectConstructor(){

        try {
            BeanIntrospection<Bean1> b1intro = BeanIntrospection.getIntrospection(Bean1.class);
            Bean1 bean1_1 = b1intro.instantiate("p1_value","p2_value");
        } catch (final InstantiationException e) {
            System.out.println("**********************************");
            System.out.println(e.getMessage());
            System.out.println("**********************************");
        }

    }
    static void introspectBean2(){
        BeanIntrospection<Bean2> b2intro = BeanIntrospection.getIntrospection(Bean2.class);
        Bean2 bean2 = b2intro.instantiate("p1_value");
        System.out.println(bean2.toString());
    }
}
