package com.myspace.demo;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class uploadDocumentReq implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label(value = "sessionid")
	private java.lang.String sessionid;
	@org.kie.api.definition.type.Label(value = "docid")
	private java.lang.String docid;
	@org.kie.api.definition.type.Label(value = "filename")
	private java.lang.String filename;

	public uploadDocumentReq() {
	}

	public java.lang.String getSessionid() {
		return this.sessionid;
	}

	public void setSessionid(java.lang.String sessionid) {
		this.sessionid = sessionid;
	}

	public java.lang.String getDocid() {
		return this.docid;
	}

	public void setDocid(java.lang.String docid) {
		this.docid = docid;
	}

	public java.lang.String getFilename() {
		return this.filename;
	}

	public void setFilename(java.lang.String filename) {
		this.filename = filename;
	}

	public uploadDocumentReq(java.lang.String sessionid,
			java.lang.String docid, java.lang.String filename) {
		this.sessionid = sessionid;
		this.docid = docid;
		this.filename = filename;
	}

}