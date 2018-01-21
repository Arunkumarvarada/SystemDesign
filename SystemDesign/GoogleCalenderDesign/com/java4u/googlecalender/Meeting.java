package com.java4u.googlecalender;

class Meeting implements Comparable<Meeting> {
	private Integer startTime;
	private Integer endTime;

	Meeting(int startTime, int endTime) {
		this.startTime = startTime;
		this.endTime = endTime;
	}

	public Integer getStartTime() {
		return startTime;
	}

	public Integer getEndTime() {
		return endTime;
	}

	@Override
	public int compareTo(Meeting o) {

		if (o.getStartTime().compareTo(this.endTime) > 0) {
			return 1;
		} else if (o.getEndTime().compareTo(this.startTime) < 0) {
			return -1;
		} else {
			return 0;
		}
	}

}