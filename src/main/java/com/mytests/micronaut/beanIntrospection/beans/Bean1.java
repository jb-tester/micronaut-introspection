package com.mytests.micronaut.beanIntrospection.beans;

import io.micronaut.core.annotation.Creator;
import io.micronaut.core.annotation.Introspected;

/**
 * *******************************
 * Created by irina on 1/27/2020.
 * Project: micronaut-introspection
 * *******************************
 */
@Introspected
public class Bean1 {
    
    String p1;
    String p2;
    int p3;
    
    public Bean1(final String p1) {
        System.out.println("Bean1 constructor with 1 arg p1 = "+p1+" is called");
        this.p1 = p1;
    }

    public Bean1(final String p1, final String p2) {
        System.out.println("Bean1 constructor with 2 args p1 = "+p1+", p2 ="+p2+" is called");
        this.p1 = p1;
        this.p2 = p2;
    }
     @Creator
    public Bean1(final String p1, final String p2, final int p3) {
        System.out.println("Bean1 constructor with 3 args p1 = "+p1+", p2 ="+p2+", p3 ="+p3+" is called");
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public Bean1(final int p3) {
        System.out.println("Bean1 constructor with 1 arg p3 = "+p3+" is called");
        this.p3 = p3;
    }

    public String getP1() {
        return p1;
    }

    public void setP1(final String p1) {
        this.p1 = p1;
    }

    public String getP2() {
        return p2;
    }

    public void setP2(final String p2) {
        this.p2 = p2;
    }

    public int getP3() {
        return p3;
    }

    public void setP3(final int p3) {
        this.p3 = p3;
    }

    @Override
    public String toString() {
        return "Bean1: " +
                "p1='" + p1 + '\'' +
                ", p2='" + p2 + '\'' +
                ", p3=" + p3 +
                ' ';
    }
}
