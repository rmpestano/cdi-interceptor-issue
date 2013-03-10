/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.cdiinterceptor.boundary;

import java.io.Serializable;

/**
 *
 * @author Rafael M. Pestano - Mar 8, 2013 10:35:39 PM
 */
public abstract class BaseBoundary<T extends Serializable> implements Serializable{
    
    private static final long serialVersionUID = 1L;

    public abstract String getBusinessMessage(T param);
}
