package com.lg.springsource.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * Created by liuguo on 2017/4/27.
 */
@Aspect
public class AspectExample {
    @Before("com.lg.springsource.test.AspectTest.test(..)")
    public void dataCheck(){

    }
}
