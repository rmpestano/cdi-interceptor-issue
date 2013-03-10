/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.cdiinterceptor.bean;

import com.cdiinterceptor.boundary.MyBoundary;
import javax.inject.Named;
import org.apache.myfaces.extensions.cdi.core.api.scope.conversation.ViewAccessScoped;

/**
 *
 * @author Rafael M. Pestano - Mar 8, 2013 10:53:12 PM
 */
@Named
@ViewAccessScoped
public class MyBean extends BaseBean<MyBoundary,Long> {

//    @Inject
//    public void initBoundary(MyBoundary boundary) {
//        super.setBoundary(boundary); 
//    }

    
}
