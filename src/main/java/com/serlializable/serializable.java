package com.serlializable;

import java.io.Serializable;


public class serializable implements Serializable{

	private static final long serializableUID = 1L;

	public static String username;

	private transient String id;

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}




	@Override
	public String toString() {
		return "people [username=" + username + "]";
	}


}
