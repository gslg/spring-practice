package com.lg.springsource.beans;

/**
 * Created by liuguo on 2017/4/19.
 */
public class CircleA {
    private CircleB testB;

    public CircleA() {
    }

    public CircleA(CircleB testB) {
        this.testB = testB;
    }

    public void a(){
        testB.b();
    }

    public CircleB getTestB() {
        return testB;
    }

    public void setTestB(CircleB testB) {
        this.testB = testB;
    }
}
