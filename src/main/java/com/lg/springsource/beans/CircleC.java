package com.lg.springsource.beans;

/**
 * Created by liuguo on 2017/4/19.
 */
public class CircleC {

    private CircleA testA;

    public CircleC(CircleA testA) {
        this.testA = testA;
    }

    public CircleC() {
    }

    public void c() {
        testA.a();
    }

    public CircleA getTestA() {
        return testA;
    }

    public void setTestA(CircleA testA) {
        this.testA = testA;
    }
}
