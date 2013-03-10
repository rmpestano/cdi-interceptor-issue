/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.cdiinterceptor.bean;

import com.cdiinterceptor.boundary.MyBoundary;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author Rafael M. Pestano - Mar 8, 2013 10:53:12 PM
 */
@Named
@SessionScoped
public class MyBean extends BaseBean<MyBoundary,Long> {

//    @Inject
//    public void initBoundary(MyBoundary boundary) {
//        super.setBoundary(boundary); 
//    }

    
}
