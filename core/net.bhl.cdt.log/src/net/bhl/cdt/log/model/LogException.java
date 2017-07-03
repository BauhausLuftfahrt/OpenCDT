/*******************************************************************************
 * <copyright> Copyright (c) 2009-2017 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
package net.bhl.cdt.log.model;

/**
 * Implementation dependent exception class used to avoid references to any
 * bundle defined exception class, which might prevent an uninstalled bundle
 * from being garbage collected. This exception maintains the class of the
 * original exception (as part of the message), the message (appended to the
 * class name) and the stack trace of both the exception thrown and any embedded
 * exceptions.
 */
public final class LogException extends Exception {
    private static final long serialVersionUID = 227832707730544883L;

    /** The class name of the original exception. */
    private final String m_className;
    /** The message from the original exception. */
    private final String m_message;
    /** The localized message from the original exception. */
    private final String m_localizedMessage;

    /**
     * Create a new instance.
     * 
     * @param exception
     *            the original exception.
     */
    private LogException(final Throwable exception) {
	m_className = exception.getClass().getName();
	m_message = exception.getMessage();
	m_localizedMessage = exception.getLocalizedMessage();
	setStackTrace(exception.getStackTrace());

	Throwable cause = exception.getCause();
	if (cause != null) {
	    cause = getException(cause);
	    initCause(cause);
	}
    }

    /**
     * Returns the message associated with the exception. The message will be
     * the class name of the original exception followed by the message of the
     * original exception.
     * 
     * @return the message associated with the exception
     */
    public String getMessage() {
	return m_className + ": " + m_message;
    }

    /**
     * Returns the localized message associated with the exception. The
     * localized message will be the class name of the original exception
     * followed by the localized message of the original exception.
     * 
     * @return the localized message associated with the exception
     */
    public String getLocalizedMessage() {
	return m_className + ": " + m_localizedMessage;
    }

    /** The prefix that identifies classes from the "java" namespace. */
    private static final String JAVA_PACKAGE_PREFIX = "java.";

    /**
     * Returns the exception to store in the {@link LogEntryImpl}.
     * 
     * @param exception
     *            the exception that was originally thrown.
     * @return the exception to store in the {@link LogEntryImpl}
     */
    static Throwable getException(final Throwable exception) {
	Throwable result = null;

	if (exception != null) {
	    String className = exception.getClass().getName();
	    if (exception.getCause() == null && className.startsWith(JAVA_PACKAGE_PREFIX)) {
		result = exception;
	    } else {
		result = new LogException(exception);
	    }
	}

	return result;
    }
}