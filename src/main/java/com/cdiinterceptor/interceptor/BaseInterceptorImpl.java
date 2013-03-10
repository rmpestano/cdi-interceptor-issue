package com.cdiinterceptor.interceptor;

import java.util.logging.Logger;

import javax.inject.Inject;
import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;


@Interceptor
@BaseInterceptor
public class BaseInterceptorImpl {

    @Inject
    Logger log;

    @AroundInvoke
    public Object invoke(InvocationContext context) throws Exception {
        log.info("Before base interceptor execution");
        Object result = context.proceed();
        log.info("After base interceptor  execution ");
        return result;
    }
}