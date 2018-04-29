package com.medical.dimain;

/**
 * 医生信息表关联实体类
 * @author yangp
 *
 */
public class DoctorinfoDomain {
	
	/**
	 * 医生编号
	 */
	private String dno;
	/**
	 * 姓名
	 */
	private String dname;
	/**
	 * 性别
	 */
	private Integer dsex;
	/**
	 * 所属科室
	 */
	private String department;
	/**
	 * 职务级别
	 */
	private String position;
	/**
	 * 联系方式
	 */
	private String phone;
	/**
	 * 看诊人数
	 */
	private Integer count;
	
	
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
	public Integer getDsex() {
		return dsex;
	}
	public void setDsex(Integer dsex) {
		this.dsex = dsex;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	
	@Override
	public String toString() {
		return "DoctorinfoDomain [dno=" + dno + ", dname=" + dname + ", dsex=" + dsex + ", department=" + department
				+ ", position=" + position + ", phone=" + phone + ", count=" + count + "]";
	}
	
	
	
}
