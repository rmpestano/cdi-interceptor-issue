/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdiinterceptor.bean;

import com.cdiinterceptor.boundary.BaseBoundary;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.Date;
import java.util.Random;

/**
 *
 * @author Rafael M. Pestano - Mar 8, 2013 10:44:58 PM
 */
public abstract class BaseBean<Boundary extends BaseBoundary<T>,T extends Serializable> implements Serializable{

    private BaseBoundary boundary;

    public BaseBoundary getBoundary() {
        if (boundary == null) {
            Class type = (Class) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
            boundary = (BaseBoundary) BeanManagerController.getBeanByType(type);
        }
        return boundary;
    }

    public void setBoundary(BaseBoundary boundary) {
        this.boundary = boundary;
    }
    
    public String getMessage(){
        return getBoundary().getBusinessMessage(new Random(new Date().getTime()).nextLong());
    }
}
