package com.xupt.entity;

import java.io.Serializable;

/**
 * @Auther: liuxun
 * @Date: 2019/3/24
 * @Description:
 */
public class QueryVo implements Serializable {

    /**
     * 查询配置
     */

    private Integer page = 1;
    private Integer start;
    private Integer size = 8;

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getStart() {
        return start;
    }

    public void setStart(Integer start) {
        this.start = start;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }
}
