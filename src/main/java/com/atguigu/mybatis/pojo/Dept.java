package com.atguigu.mybatis.pojo;

public class Dept {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_dept.did
     *
     * @mbggenerated Fri Apr 08 22:06:28 CST 2022
     */
    private Integer did;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_dept.deptName
     *
     * @mbggenerated Fri Apr 08 22:06:28 CST 2022
     */
    private String deptname;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_dept.did
     *
     * @return the value of t_dept.did
     *
     * @mbggenerated Fri Apr 08 22:06:28 CST 2022
     */
    public Integer getDid() {
        return did;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_dept.did
     *
     * @param did the value for t_dept.did
     *
     * @mbggenerated Fri Apr 08 22:06:28 CST 2022
     */
    public void setDid(Integer did) {
        this.did = did;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_dept.deptName
     *
     * @return the value of t_dept.deptName
     *
     * @mbggenerated Fri Apr 08 22:06:28 CST 2022
     */
    public String getDeptname() {
        return deptname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_dept.deptName
     *
     * @param deptname the value for t_dept.deptName
     *
     * @mbggenerated Fri Apr 08 22:06:28 CST 2022
     */
    public void setDeptname(String deptname) {
        this.deptname = deptname == null ? null : deptname.trim();
    }
}