package com.myspace.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class createSessionResult implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label(value = "sessionid")
	private java.lang.String sessionid;
	@org.kie.api.definition.type.Label(value = "error")
	private java.lang.Integer error;
	@org.kie.api.definition.type.Label(value = "message")
	private java.lang.String message;

	public createSessionResult() {
	}

	public java.lang.String getSessionid() {
		return this.sessionid;
	}

	public void setSessionid(java.lang.String sessionid) {
		this.sessionid = sessionid;
	}

	public java.lang.Integer getError() {
		return this.error;
	}

	public void setError(java.lang.Integer error) {
		this.error = error;
	}

	public java.lang.String getMessage() {
		return this.message;
	}

	public void setMessage(java.lang.String message) {
		this.message = message;
	}

	public createSessionResult(java.lang.String sessionid,
			java.lang.Integer error, java.lang.String message) {
		this.sessionid = sessionid;
		this.error = error;
		this.message = message;
	}

}