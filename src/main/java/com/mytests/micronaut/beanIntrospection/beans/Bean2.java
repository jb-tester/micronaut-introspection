package com.mytests.micronaut.beanIntrospection.beans;

import io.micronaut.core.annotation.Creator;

/**
 * *******************************
 * Created by irina on 1/27/2020.
 * Project: micronaut-introspection
 * *******************************
 */
public class Bean2 {
    
    String p1;
    String p2;
    int p3;

    private Bean2(final String p1) {
        this.p1 = p1;
    }

    private Bean2(final int p3) {
        this.p3 = p3;
    }

    private Bean2(final String p1, final String p2, final int p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }
     @Creator
    public static Bean2 forP1(String p1){
        
        return new Bean2(p1);
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
        return "Bean2: " +
                "p1='" + p1 + '\'' +
                ", p2='" + p2 + '\'' +
                ", p3=" + p3 +
                ' ';
    }
}
