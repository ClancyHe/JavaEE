package org.action;

import java.util.Date;
import java.util.List;
import java.util.Map;
import org.dao.DoctorDao;
import org.dao.LendDao;
import org.model.*;
import org.tool.Pager;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class LendAction extends ActionSupport
{
    private int pageNow=1;
    private int pageSize=4;
    private Lend lend;
    private String message;

    public int getPageNow() {
        return pageNow;
    }

    public void setPageNow(int pageNow) {
        this.pageNow = pageNow;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public Lend getLend() {
        return lend;
    }

    public void setLend(Lend lend) {
        this.lend = lend;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    LendDao lendDao=new LendDao();
    public String selectAllLend() throws Exception{
        //判断输入的编号是否为空
        if (lend.getDno()==null||lend.getDno().equals("")){
            this.setMessage("请输入医生编号");
            return SUCCESS;
        }

        List list=lendDao.selectLend(lend.getDno(),this.getPageNow(),this.getPageSize());
        //根据当前页及共多少条记录来创建分页类对象
        Pager pager=new Pager(pageNow,lendDao.selectLendSize(lend.getDno()));
        Map request=(Map) ActionContext.getContext().get("request");
        request.put("list",list);
        request.put("page",page);
        request.put("Dno",lend.getDno());
        return SUCCESS;
    }

}
