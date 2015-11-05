package com.imoc;

public class Telphone {
	private float screen;
	private float cpu;
	private float mem;

	/**
	 * @return the screen
	 */
	public float getScreen() {
		return screen;
	}

	/**
	 * @param screen
	 *            the screen to set
	 */
	public void setScreen(float screen) {
		this.screen = screen;
	}

	/**
	 * @return the cpu
	 */
	public float getCpu() {
		return cpu;
	}

	/**
	 * @param cpu
	 *            the cpu to set
	 */
	public void setCpu(float cpu) {
		this.cpu = cpu;
	}

	/**
	 * @return the mem
	 */
	public float getMem() {
		return mem;
	}

	/**
	 * @param mem
	 *            the mem to set
	 */
	public void setMem(float mem) {
		this.mem = mem;
	}
	
	public void call(){
		System.out.println("telent phone");
	}

	public void setMessage(){
		System.out.println("send message");
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Telphone [screen=" + screen + ", cpu=" + cpu + ", mem=" + mem + "]";
	}
	
	
}
