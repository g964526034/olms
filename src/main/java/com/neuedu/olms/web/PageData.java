package com.neuedu.olms.web;

import java.util.List;

public class PageData<T> {
	//当前�?
	private int curPage;
	//总页�?
	private int totalPage;
	//数据总数
	private int totalRecord;
	//每页数据�?
	private int pageSize;
	//返回的数�?
	private List<T> data;
	
	
	public PageData(int curPage, int pageSize) {
		this.curPage = curPage;
		this.pageSize = pageSize;
	}
	public int getCurPage() {
		return curPage;
	}
	public void setCurPage(int curPage) {
		this.curPage = curPage;
	}
	public int getTotalPage() {
		totalPage = totalRecord % pageSize ==0 ? totalRecord / pageSize : (totalRecord / pageSize) +1;
		return totalPage;
	}
	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}
	public int getTotalRecord() {
		return totalRecord;
	}
	public void setTotalRecord(int totalRecord) {
		this.totalRecord = totalRecord;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public List<T> getData() {
		return data;
	}
	public void setData(List<T> data) {
		this.data = data;
	}
	@Override
	public String toString() {
		return "PageData [curPage=" + curPage + ", totalPage=" + totalPage + ", totalRecord=" + totalRecord
				+ ", pageSize=" + pageSize + ", data=" + data + "]";
	}
	
	
}
