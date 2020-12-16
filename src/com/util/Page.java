package com.util;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Enumeration;

/**
 * @ProjectName: SSM-springMVC
 * @Package: com.util
 * @Description: java类作用描述
 * @Author: 张子凡
 * @CreateDate: 2020/12/15 16:30
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2020
 */
public class Page {
    //每页记录数
    private int PAGE_SIZE = 10;
    //当前页码
    private int pageNo = 1;
    //总记录数
    private int totalCount = 0;
    //总页数
    private int pages = 1;
    //每页起始页码
    private int pageStart = 0;
    //是否有上一页
    private boolean hasPrePage;
    //是否有下一页
    private boolean hasNextPage;

    private String url;

    public Page() {
        //从本地线程池中获取请求
        HttpServletRequest request = ((ServletRequestAttributes) (RequestContextHolder.currentRequestAttributes())).getRequest();
        String uri = request.getRequestURI() + "?1=1";
        Enumeration<String> parameterNames = request.getParameterNames();
        while (parameterNames.hasMoreElements()) {
            String param = parameterNames.nextElement();
            String value = request.getParameter(param);
            if (null != value && (!"".equals(value)) && (!"1".equals(param)) && (!"pageNo".equals(param))) {
                try {
                    value = URLEncoder.encode(value, "UTF-8");
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                }

                uri += ("&" + param + "=" + value);

            }
        }

        url = uri;

    }

    public void recountPageStart() {
        this.pageStart = (this.pageNo - 1) * PAGE_SIZE;
    }

    public void recountPages() {
        this.pages = (int) Math.ceil(this.totalCount * 1.0 / PAGE_SIZE);
    }

    public void recountHasPrePage() {
        this.hasPrePage = (this.pageNo == 1);
    }

    public void recountHasNextPage() {
        this.hasNextPage = (this.pageNo != this.pages);
    }

    public int getPAGE_SIZE() {
        return PAGE_SIZE;
    }

    public void setPAGE_SIZE(int PAGE_SIZE) {
        this.PAGE_SIZE = PAGE_SIZE;
        recountPageStart();
    }

    public int getPageNo() {
        return pageNo;
    }

    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
        recountPageStart();
        recountHasPrePage();
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
        recountPages();
        recountHasNextPage();
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;

    }

    public int getPageStart() {
        return pageStart;
    }

    public void setPageStart(int pageStart) {
        this.pageStart = pageStart;
    }

    public boolean getHasPrePage() {
        return hasPrePage;
    }

    public void setHasPrePage(boolean hasPrePage) {
        this.hasPrePage = hasPrePage;
    }

    public boolean getHasNextPage() {
        return hasNextPage;
    }

    public void setHasNextPage(boolean hasNextPage) {
        this.hasNextPage = hasNextPage;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
