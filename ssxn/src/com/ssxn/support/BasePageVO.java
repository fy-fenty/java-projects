package com.ssxn.support;

public class BasePageVO implements java.io.Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 当前页的第一条记录编号
	 */
	protected int start = 0;

	/**
	 * 每页记录数，默认为20
	 */
	protected int limit = 20;

	public BasePageVO() {
		super();
	}

	public BasePageVO(int start, int limit) {
		super();
		this.start = start;
		this.limit = limit;
	}

	public int getStart() {
		return start <= 0 ? 0 : start;
	}

	public void setStart(int start) {
		this.start = start;
	}

	public int getLimit() {
		return limit;
	}

	public void setLimit(int limit) {
		this.limit = limit;
	}

	/*
	 * public int getPageNo() { return (int)(this.start / this.limit) + 1; }
	 * 
	 * public int getPageSize() { return this.limit; }
	 * 
	 * public int getFirst() { return ((getPageNo() - 1) * getPageSize()) + 1; }
	 */

}
