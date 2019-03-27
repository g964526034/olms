package com.neuedu.olms.po;

import java.util.Date;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class Teacher {
	private Long id;
	@NotEmpty(message="电话号码不能为空")
	@Pattern(regexp="^1[0-9]{10}$",message="手机号码格式不正确")
	private String tel;
	@NotEmpty(message="密码不能为空")
	@Length(min=6,message="密码最少为6位")
	private String pwd;
	private String realName;
	@NotNull(message="性别不能为空")
	private int gender;
	@Email(message="email格式不合法")
	@NotNull(message="email不能为空")
	private String email;
	@NotEmpty(message="学位不能为空")
	private String degree;
	private String desc;
	private Date createTime;
	private Token tokenEntity;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getRealName() {
		return realName;
	}
	public void setRealName(String realName) {
		this.realName = realName;
	}
	public int getGender() {
		return gender;
	}
	public void setGender(int gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDegree() {
		return degree;
	}
	public void setDegree(String degree) {
		this.degree = degree;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Token getTokenEntity() {
		return tokenEntity;
	}
	public void setTokenEntity(Token tokenEntity) {
		this.tokenEntity = tokenEntity;
	}
	@Override
	public String toString() {
		return "Teacher [id=" + id + ", tel=" + tel + ", pwd=" + pwd + ", realName=" + realName + ", gender=" + gender
				+ ", email=" + email + ", degree=" + degree + ", desc=" + desc + ", createTime=" + createTime
				+ ", tokenEntity=" + tokenEntity + "]";
	}
	
	
	
}
