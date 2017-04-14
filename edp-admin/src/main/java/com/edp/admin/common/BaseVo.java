package com.edp.admin.common;

import java.io.Serializable;
import java.util.List;

@SuppressWarnings("rawtypes")
public class BaseVo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6960433987318224772L;
	
	private Integer start;
    private Integer limit;
    private Integer pageIndex;
    
    //回传数据使用
	private List rows;
    private Integer results;
    
    //返回信息
    private String returnCode;//返回码
    private String returnInfo;//返回信息
    
	public Integer getStart() {
		return start;
	}
	public void setStart(Integer start) {
		this.start = start;
	}
	public Integer getLimit() {
		return limit;
	}
	public void setLimit(Integer limit) {
		this.limit = limit;
	}
	public Integer getPageIndex() {
		return pageIndex;
	}
	public void setPageIndex(Integer pageIndex) {
		this.pageIndex = pageIndex;
	}
	public List getRows() {
		return rows;
	}
	public void setRows(List rows) {
		this.rows = rows;
	}
	public Integer getResults() {
		return results;
	}
	public void setResults(Integer results) {
		this.results = results;
	}
    public String getReturnCode() {
        return returnCode;
    }
    public void setReturnCode(String returnCode) {
        this.returnCode = returnCode;
    }
    public String getReturnInfo() {
        return returnInfo;
    }
    public void setReturnInfo(String returnInfo) {
        this.returnInfo = returnInfo;
    }

}
