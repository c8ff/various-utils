package dev.seeight.util;

public class Timer {
	private long time = 0;

	public boolean hasTimePassed(long time) {
		return System.currentTimeMillis() - this.time > time;
	}

	public void reset() {
		this.time = System.currentTimeMillis();
	}
}
