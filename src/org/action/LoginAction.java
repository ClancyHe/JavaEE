package org.action;

import java.util.*;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import org.model.*;
import org.dao.*;

public class LoginAction extends ActionSupport
{
    private Login login;//处理用户请求的execute方法
    private String message;
    public String exrcute() throws Exception//该类为项目与数据的接口（DAO接口），用于处理数据与数据库表的一些操作
    {
        LoginDao loginDao=new LoginDao();
        Login l = loginDao.checkLogin(login.getName(),login.getPassword());
        if (l!=null)//如果登陆成功
        {
            //获得会话，用来保存当前用户信息
            Map session= ActionContext.getContext().getSession();
            session.put("login",l);  //把获取的对象保存在session
            //return SUCCESS; //验证成功返回字符串SUCCESS(session已有用户对象)
            return "admin";
        }else {
            return ERROR;
        }
    }
    public void validate()
    {
        if(login.getName()==null||login.getName().equals(""))
        {
            this.addFieldError("name","用户名不能为空！");
        }else if (login.getPassword()==null||login.getPassword().equals(""))
        {
            this.addFieldError("password","密码不能为空！");
        }
    }
    //然后是login的get/set方法
    public Login getLogin() {
        return login;
    }
    public void setLogin(Login login) {
        this.login = login;
    }
    public String getMessage()
    {
        return message;
    }
    public void setMessage(String message)
    {
        this.message=message;
    }
}
