package com.myspace.demo;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class getSessionResponse implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label("sessionid")
	private java.lang.String sessionid;
	@org.kie.api.definition.type.Label("processStep")
	private java.lang.String processStep;
	@org.kie.api.definition.type.Label("completed")
	private java.lang.Boolean completed;
	@org.kie.api.definition.type.Label("offline")
	private java.lang.Boolean offline;
	@org.kie.api.definition.type.Label("offlineAvailable")
	private java.lang.Boolean offlineAvailable;
	@org.kie.api.definition.type.Label("inQes")
	private java.lang.Boolean inQes;
	@org.kie.api.definition.type.Label("qesResultPreliminary")
	private java.lang.Boolean qesResultPreliminary;
	@org.kie.api.definition.type.Label("error")
	private int error;
	@org.kie.api.definition.type.Label("message")
	private java.lang.String message;
	@org.kie.api.definition.type.Label("numberOfSignaturesNeeded")
	private int numberOfSignaturesNeeded;
	@org.kie.api.definition.type.Label("numberOfSignaturesNeededDone")
	private int numberOfSignaturesNeededDone;
	@org.kie.api.definition.type.Label("status")
	private java.lang.String status;

	public getSessionResponse() {
	}

	public java.lang.String getSessionid() {
		return this.sessionid;
	}

	public void setSessionid(java.lang.String sessionid) {
		this.sessionid = sessionid;
	}

	public java.lang.String getProcessStep() {
		return this.processStep;
	}

	public void setProcessStep(java.lang.String processStep) {
		this.processStep = processStep;
	}

	public java.lang.Boolean getCompleted() {
		return this.completed;
	}

	public void setCompleted(java.lang.Boolean completed) {
		this.completed = completed;
	}

	public java.lang.Boolean getOffline() {
		return this.offline;
	}

	public void setOffline(java.lang.Boolean offline) {
		this.offline = offline;
	}

	public java.lang.Boolean getOfflineAvailable() {
		return this.offlineAvailable;
	}

	public void setOfflineAvailable(java.lang.Boolean offlineAvailable) {
		this.offlineAvailable = offlineAvailable;
	}

	public java.lang.Boolean getInQes() {
		return this.inQes;
	}

	public void setInQes(java.lang.Boolean inQes) {
		this.inQes = inQes;
	}

	public java.lang.Boolean getQesResultPreliminary() {
		return this.qesResultPreliminary;
	}

	public void setQesResultPreliminary(java.lang.Boolean qesResultPreliminary) {
		this.qesResultPreliminary = qesResultPreliminary;
	}

	public int getError() {
		return this.error;
	}

	public void setError(int error) {
		this.error = error;
	}

	public java.lang.String getMessage() {
		return this.message;
	}

	public void setMessage(java.lang.String message) {
		this.message = message;
	}

	public int getNumberOfSignaturesNeeded() {
		return this.numberOfSignaturesNeeded;
	}

	public void setNumberOfSignaturesNeeded(int numberOfSignaturesNeeded) {
		this.numberOfSignaturesNeeded = numberOfSignaturesNeeded;
	}

	public int getNumberOfSignaturesNeededDone() {
		return this.numberOfSignaturesNeededDone;
	}

	public void setNumberOfSignaturesNeededDone(int numberOfSignaturesNeededDone) {
		this.numberOfSignaturesNeededDone = numberOfSignaturesNeededDone;
	}

	public java.lang.String getStatus() {
		return this.status;
	}

	public void setStatus(java.lang.String status) {
		this.status = status;
	}

	public getSessionResponse(java.lang.String sessionid,
			java.lang.String processStep, java.lang.Boolean completed,
			java.lang.Boolean offline, java.lang.Boolean offlineAvailable,
			java.lang.Boolean inQes, java.lang.Boolean qesResultPreliminary,
			int error, java.lang.String message, int numberOfSignaturesNeeded,
			int numberOfSignaturesNeededDone, java.lang.String status) {
		this.sessionid = sessionid;
		this.processStep = processStep;
		this.completed = completed;
		this.offline = offline;
		this.offlineAvailable = offlineAvailable;
		this.inQes = inQes;
		this.qesResultPreliminary = qesResultPreliminary;
		this.error = error;
		this.message = message;
		this.numberOfSignaturesNeeded = numberOfSignaturesNeeded;
		this.numberOfSignaturesNeededDone = numberOfSignaturesNeededDone;
		this.status = status;
	}

}