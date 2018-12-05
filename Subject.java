package com.heb.commons.test;

import java.io.Serializable;
import java.util.Set;

public class Subject implements Serializable {
	long subjectId;
	String subtitle;
	int durationInHours;
	Set<Book> references;

	public Subject(long subjectId, String subtitle, int durationInHours) {
		this.subjectId = subjectId;
		this.subtitle = subtitle;
		this.durationInHours = durationInHours;

	}

	public long getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(long subjectId) {
		this.subjectId = subjectId;
	}

	public String getSubtitle() {
		return subtitle;
	}

	public void setSubtitle(String subtitle) {
		this.subtitle = subtitle;
	}

	public int getDurationInHours() {
		return durationInHours;
	}

	public void setDurationInHours(int durationInHours) {
		this.durationInHours = durationInHours;
	}

	public Set<Book> getReferences() {
		return references;
	}

	public void setReferences(Set<Book> references) {
		this.references = references;
	}

}
