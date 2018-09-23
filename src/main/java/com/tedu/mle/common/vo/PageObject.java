package com.tedu.mle.common.vo;

import java.io.Serializable;
import java.util.List;

/**
 * 封装页码信息
 *
 * @param <T>
 * @author zz
 */
public class PageObject<T> implements Serializable {
    /**
     * 当前页的记录信息
     */
    private List<T> record;
    /**
     * 总记录数
     */
    private int rowCount;
    /**
     * 总页数
     */
    private int pageCount;
    /**
     * 页面大小
     */
    private int pageSize = 3;
    /**
     * 当前页码
     */
    private int pageCurrent;

    private static final long serialVersionUID = 1L;

    public List<T> getRecord() {
        return record;
    }

    public void setRecord(List<T> record) {
        this.record = record;
    }

    public int getRowCount() {
        return rowCount;
    }

    public void setRowCount(int rowCount) {
        this.rowCount = rowCount;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getPageCurrent() {
        return pageCurrent;
    }

    public void setPageCurrent(int pageCurrent) {
        this.pageCurrent = pageCurrent;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    @Override
    public String toString() {
        return "PageObject{" +
                "record=" + "\n" + tPrint() +
                ", rowCount=" + rowCount +
                ", pageCount=" + pageCount +
                ", pageSize=" + pageSize +
                ", pageCurrent=" + pageCurrent +
                '}';
    }

    private String tPrint() {
        StringBuilder stringBuilder = new StringBuilder();
        for (T sysLog : record) {
            stringBuilder.append(sysLog.toString()).append("\n");
        }
        return stringBuilder.toString();

    }
}
