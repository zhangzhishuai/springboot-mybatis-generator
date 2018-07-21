package com.jiuyue.springbootmybatisgenerator.common.query;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

/**
 * @author hetao
 * @create 2017-12-22
 */
public class PageResult<X> implements Serializable{
    private static final long serialVersionUID = 1L;

    private List<X> result;

	private int pageNo = BaseQuery.DEFAULT_PAGE;

	// 总的数目
	private int totalCount;

	//每一页数目
	private int pageSize = BaseQuery.DEFAULT_PAGE_SIZE;

	public List<X> getResult() {
		return result;
	}

	public void setResult(List<X> result) {
		this.result = result;
	}

    public int getPageNo() {
		return pageNo;
	}

	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}

	public int getTotalPage() {
        if(pageNo < 1){
            pageNo = BaseQuery.DEFAULT_PAGE;
        }
		return totalCount / pageSize + (totalCount % pageSize == 0 ? 0 : 1);
	}


	public int getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}

	public int getPageSize() {
		return pageSize;
	}


	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public PageResult(){

	}

	public PageResult(int size, int no, int count){
		pageSize = size;
		pageNo = no;
		totalCount = count;
		result = new LinkedList<>();
	}

	public PageResult(int size, int no, int count, List<X> xList){
		pageSize = size;
		pageNo = no;
		totalCount = count;
		result = xList;
	}
}
