package com.myspace.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * This class was automatically generated by the data modeler tool.
 */
 
public class document implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label(value = "displayname")
	private java.lang.String displayname;
	@org.kie.api.definition.type.Label(value = "id")
	public java.lang.String id;

    public document() {
	}

    @Override
    public String toString() {
        return this.displayname + "" + this.id;
    }

	public java.lang.String getDisplayname() {
		return this.displayname;
	}

	public void setDisplayname(java.lang.String displayname) {
		this.displayname = displayname;
	}

	public java.lang.String getId() {
		return this.id;
	}

	public void setId(java.lang.String id) {
		this.id = id;
	}

	public document(java.lang.String displayname, java.lang.String id) {
		this.displayname = displayname;
		this.id = id;
	}

}