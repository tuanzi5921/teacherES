package com.zzuli.po;

import java.util.Date;

public class TrackRecordInfo {
	private Integer trackRecordId;

	private Integer studentId;

	private String trackRecordTitle;

	private String trackRecordContent;

	private Date trackRecordTime;

	private Integer enrollment;

	private Date nextRecordTime;

	private String staffName;

	private String studentName;

	private String dataContent;

	public String getStaffName() {
		return staffName;
	}

	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getDataContent() {
		return dataContent;
	}

	public void setDataContent(String dataContent) {
		this.dataContent = dataContent;
	}

	public Integer getTrackRecordId() {
		return trackRecordId;
	}

	public void setTrackRecordId(Integer trackRecordId) {
		this.trackRecordId = trackRecordId;
	}

	public Integer getStudentId() {
		return studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	public String getTrackRecordTitle() {
		return trackRecordTitle;
	}

	public void setTrackRecordTitle(String trackRecordTitle) {
		this.trackRecordTitle = trackRecordTitle;
	}

	public String getTrackRecordContent() {
		return trackRecordContent;
	}

	public void setTrackRecordContent(String trackRecordContent) {
		this.trackRecordContent = trackRecordContent;
	}

	public Date getTrackRecordTime() {
		return trackRecordTime;
	}

	public void setTrackRecordTime(Date trackRecordTime) {
		this.trackRecordTime = trackRecordTime;
	}

	public Integer getEnrollment() {
		return enrollment;
	}

	public void setEnrollment(Integer enrollment) {
		this.enrollment = enrollment;
	}

	public Date getNextRecordTime() {
		return nextRecordTime;
	}

	public void setNextRecordTime(Date nextRecordTime) {
		this.nextRecordTime = nextRecordTime;
	}
}