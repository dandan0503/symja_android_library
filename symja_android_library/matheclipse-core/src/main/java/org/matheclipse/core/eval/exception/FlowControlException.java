package org.matheclipse.core.eval.exception;

import org.matheclipse.core.basic.Config;

/**
 * Base exception for exceptions, which are used to implement &quot;control flow&quot; functions like for example
 * <code>Break()</code> (BreakException) and <code>Continue()</code> (ContinueException).
 * 
 * 
 */
public abstract class FlowControlException extends SymjaMathException {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7700982641897767896L;

	/**
	 * Constructs a new FlowControlException with the specified detail <code>message=null</code>,
	 * <code>cause=null</code>, <code>enableSuppression=false</code>, and <code>writableStackTrace=false</code> .
	 * 
	 */
	public FlowControlException() {
		super();
	}
}
