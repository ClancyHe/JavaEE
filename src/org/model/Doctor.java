package org.model;

public class Doctor
{
    public String getDno() {
        return dno;
    }

    public void setDno(String dno) {
        this.dno = dno;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getWorkterm() {
        return workterm;
    }

    public void setWorkterm(int workterm) {
        this.workterm = workterm;
    }

    public String getEduacationlevel() {
        return eduacationlevel;
    }

    public void setEduacationlevel(String eduacationlevel) {
        this.eduacationlevel = eduacationlevel;
    }

    public String getDepartmentno() {
        return departmentno;
    }

    public void setDepartmentno(String departmentno) {
        this.departmentno = departmentno;
    }

    private String dno; //医生编号
    private String dname; //医生姓名
    private String sex; //性别
    private String birthday; //出生日期
    private String nation; //民族
    private String telephone; //联系电话
    private String position; //职位特长
    private int workterm; //工作年限
    private String eduacationlevel; //学历水平
    private String departmentno; //隶属科室编号
}
