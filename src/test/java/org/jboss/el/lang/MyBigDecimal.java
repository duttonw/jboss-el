/**
 * 
 */
package org.jboss.el.lang;

import java.math.BigDecimal;

class MyBigDecimal extends BigDecimal{
    private static final long serialVersionUID = 1L;

	public MyBigDecimal(String val) {
        super(val);
    }
}