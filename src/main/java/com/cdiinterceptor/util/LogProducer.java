package com.cdiinterceptor.util;

import java.util.logging.Logger;

import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;

public class LogProducer {
	
	@Produces
	public Logger produceLogger(final InjectionPoint ip) {
		return Logger.getLogger(ip.getMember().getDeclaringClass().getCanonicalName());
	}

}
