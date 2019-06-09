package org.action;

import java.io.File;
import java.io.FileInputStream;
import java.util.Map;
import javax.print.Doc;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;

import com.opensymphony.xwork2.Action;
import com.sun.net.httpserver.Authenticator;
import org.apache.struts2.ServletActionContext;
import org.dao.*;
import org.model.Doctor;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
public class DoctorAction extends ActionSupport
{


    private String message;
    private Doctor doctor;
    public String getMessage()
    {
        return message;
    }
    public void setMessage(String message)
    {
        this.message = message;
    }
    public Doctor getDoctor()
    {
        return doctor;
    }
    public void setDoctor(Doctor doctor)
    {
        this.doctor = doctor;
    }

    DoctorDao doctorDao=new DoctorDao();

    public String addDoctor() throws Exception //添加
    {
        /*Doctor do=doctorDao.selectDoctor(doctor.getDno());
        if (do!=null) //判断要添加的医生是否存在
        {
            this.setMessage("该医生已存在");
            return SUCCESS;
        }*/
        Doctor d=new Doctor();
        d.setDno(doctor.getDno());
        d.setDname(doctor.getDname());
        d.setSex(doctor.getSex());
        d.setBirthday(doctor.getBirthday());
        d.setNation(doctor.getNation());
        d.setTelephone(doctor.getTelephone());
        d.setPosition(doctor.getPosition());
        d.setWorkterm(doctor.getWorkterm());
        d.setEduacationlevel(doctor.getEduacationlevel());
        d.setDepartmentno(doctor.getDepartmentno());
        doctorDao.addDoctor(d);
        this.setMessage("添加成功!");
        return SUCCESS;
    }

    public String deleteDoctor() throws Exception //删除
    {
        Doctor d = doctorDao.selectDoctor(doctor.getDno());
        if (d==null)
        {
            this.setMessage("要删除的医生不存在！");
            return SUCCESS;
        }

        doctorDao.deleteDoctor(doctor.getDno());
        this.setMessage("删除成功!");
        return SUCCESS;
    }

    public String selectDoctor() throws Exception //选择查询
    {
        Doctor onedoctor=doctorDao.selectDoctor(doctor.getDno());
        if (onedoctor==null)
        {
            this.setMessage("不存在该医生！");
            return SUCCESS;
        }
        Map request=(Map) ActionContext.getContext().get("request");
        request.put("onedoctor",onedoctor);
        return SUCCESS;
    }

    public String updateDoctor() throws Exception //更新
    {
        Doctor d = doctorDao.selectDoctor(doctor.getDno());
        if (d==null)
        {
            this.setMessage("要修改的医生不存在，请先查看是否存在该医生！");
            return SUCCESS;
        }
        d.setDno(doctor.getDno());
        d.setDname(doctor.getDname());
        d.setSex(doctor.getSex());
        d.setBirthday(doctor.getBirthday());
        d.setNation(doctor.getNation());
        d.setTelephone(doctor.getTelephone());
        d.setPosition(doctor.getPosition());
        d.setWorkterm(doctor.getWorkterm());
        d.setEduacationlevel(doctor.getEduacationlevel());
        d.setDepartmentno(doctor.getDepartmentno());
        doctorDao.updateDoctor(d);
        this.setMessage("修改成功!");
        return SUCCESS;
    }
}
