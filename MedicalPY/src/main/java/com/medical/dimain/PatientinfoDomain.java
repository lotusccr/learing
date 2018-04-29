package com.medical.dimain;

import java.util.Date;

/**
 * 病人就诊表关联实体类
 * @author yangp
 *
 */
public class PatientinfoDomain {
	/**
	 * 病历编号
	 */
	private String pno;
	/**
	 * 姓名
	 */
	private String pname;
	/**
	 * 身份证号
	 */
	private String identity;
	/**
	 * 性别
	 */
	private Integer psex;
	/**
	 * 年龄
	 */
	private Integer age;
	/**
	 * 主治医生
	 */
	private String dname;
	/**
	 * 就诊科室
	 */
	private String department;
	/**
	 * 就诊费用
	 */
	private Double totalcost;
	/**
	 * 就诊时间
	 */
	private Date treatdate;
	/**
	 * 入院时间
	 */
	private Date arrivedate;
	/**
	 * 备注
	 */
	private String notes;
	public String getPno() {
		return pno;
	}
	public void setPno(String pno) {
		this.pno = pno;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getIdentity() {
		return identity;
	}
	public void setIdentity(String identity) {
		this.identity = identity;
	}
	public Integer getPsex() {
		return psex;
	}
	public void setPsex(Integer psex) {
		this.psex = psex;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public Double getTotalcost() {
		return totalcost;
	}
	public void setTotalcost(Double totalcost) {
		this.totalcost = totalcost;
	}
	public Date getTreatdate() {
		return treatdate;
	}
	public void setTreatdate(Date treatdate) {
		this.treatdate = treatdate;
	}
	public Date getArrivedate() {
		return arrivedate;
	}
	public void setArrivedate(Date arrivedate) {
		this.arrivedate = arrivedate;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	
	@Override
	public String toString() {
		return "PatientinfoDomain [pno=" + pno + ", pname=" + pname + ", identity=" + identity + ", psex=" + psex
				+ ", age=" + age + ", dname=" + dname + ", department=" + department + ", totalcost=" + totalcost
				+ ", treatdate=" + treatdate + ", arrivedate=" + arrivedate + ", notes=" + notes + "]";
	}
}
