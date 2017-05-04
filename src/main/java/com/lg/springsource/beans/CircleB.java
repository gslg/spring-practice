package com.lg.springsource.beans;

/**
 * Created by liuguo on 2017/4/19.
 */
public class CircleB {

    private CircleC testC;

    public CircleB(CircleC testC) {
        this.testC = testC;
    }

    public CircleB() {
    }

    public void b() {
        testC.c();
    }

    public CircleC getTestC() {
        return testC;
    }

    public void setTestC(CircleC testC) {
        this.testC = testC;
    }
}
