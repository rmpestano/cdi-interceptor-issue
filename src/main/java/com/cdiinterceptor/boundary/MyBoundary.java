/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.cdiinterceptor.boundary;

import com.cdiinterceptor.interceptor.MyInterceptor;
import javax.ejb.Stateless;

/**
 *
 * @author Rafael M. Pestano - Mar 8, 2013 10:51:53 PM
 */

@Stateless
@MyInterceptor
public class MyBoundary extends BaseBoundary<Long>{

    @Override
    public String getBusinessMessage(Long param) {
         return "calling a business method with param " + param;
    }

}
