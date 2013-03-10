package com.cdiinterceptor.interceptor;

import java.util.logging.Logger;

import javax.inject.Inject;
import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;


@Interceptor
@MyInterceptor
public class MyInterceptorImpl {

    @Inject
    Logger log;

    @AroundInvoke
    public Object invoke(InvocationContext context) throws Exception {
        String methodName = context.getMethod().getName();
        log.info("Before " + methodName + " execution");
        Object result = context.proceed();
        log.info("After " + methodName + " method execution ");
        return result;
    }
}