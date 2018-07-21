package com.jiuyue.springbootmybatisgenerator.common.query;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

/**
 * @author hetao
 * @create 2017-12-22
 */
public class PageResultV<X> implements Serializable{
    private static final long serialVersionUID = 1L;

    private List<X> rows;

	private int pageNo = BaseQuery.DEFAULT_PAGE;

	// 总的数目
	private int total;

	//每一页数目
	private int pageSize = BaseQuery.DEFAULT_PAGE_SIZE;

	public List<X> getRows() {
		return rows;
	}

	public void setRows(List<X> rows) {
		this.rows = rows;
	}

	public int getPageNo() {
		return pageNo;
	}

	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public int getTotalPage() {
        if(pageNo < 1){
            pageNo = BaseQuery.DEFAULT_PAGE;
        }
		return total / pageSize + (total % pageSize == 0 ? 0 : 1);
	}


	public int getPageSize() {
		return pageSize;
	}


	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public PageResultV(){

	}

	public PageResultV(int size, int no, int count){
		pageSize = size;
		pageNo = no;
		count = count;
		rows = new LinkedList<>();
	}

	public PageResultV(int size, int no, int count, List<X> xList){
		pageSize = size;
		pageNo = no;
		count = count;
		rows = xList;
	}
}
