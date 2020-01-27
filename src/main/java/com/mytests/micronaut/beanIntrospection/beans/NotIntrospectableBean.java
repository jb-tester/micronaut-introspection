package com.mytests.micronaut.beanIntrospection.beans;

/**
 * *******************************
 * Created by irina on 1/27/2020.
 * Project: micronaut-introspection
 * *******************************
 */
public class NotIntrospectableBean {
    public NotIntrospectableBean(final String p1) {
        this.p1 = p1;
    }

    String p1;

    public String getP1() {
        return p1;
    }

    public void setP1(final String p1) {
        this.p1 = p1;
    }
}
