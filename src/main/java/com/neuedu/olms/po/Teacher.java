package com.neuedu.olms.po;

import java.util.Date;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Length;


public class Teacher {
	private Long id;
	@NotEmpty(message="�绰���벻��Ϊ��")
	@Pattern(regexp="^1[0-9]{10}$",message="�ֻ������ʽ����ȷ")
	private String tel;
	@NotEmpty(message="���벻��Ϊ��")
	@Length(min=6,message="��������Ϊ6λ")
	private String pwd;
	private String realName;
	@NotNull(message="�Ա���Ϊ��")
	private int gender;
	@Email(message="email��ʽ���Ϸ�")
	@NotNull(message="email����Ϊ��")
	private String email;
	@NotEmpty(message="ѧλ����Ϊ��")
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