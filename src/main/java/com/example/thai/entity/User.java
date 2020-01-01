package com.example.thai.entity;

import java.util.Date;
import javax.annotation.Generated;
import java.math.BigDecimal;


public class User {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.732+07:00", comments = "Source field: user.PK_UserID")
	private Integer pkUserid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.732+07:00", comments = "Source field: user.UserEmail")
	private String useremail;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.732+07:00", comments = "Source field: user.UserPassword")
	private String userpassword;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.732+07:00", comments = "Source field: user.FullName")
	private String fullname;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.732+07:00", comments = "Source field: user.NgaySinh")
	private Date ngaysinh;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.732+07:00", comments = "Source field: user.SDT")
	private String sdt;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.733+07:00", comments = "Source field: user.DiaChi")
	private String diachi;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.733+07:00", comments = "Source field: user.FK_NhomNguoiDungID")
	private Integer fkNhomnguoidungid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.733+07:00", comments = "Source field: user.UserStatus")
	private Boolean userstatus;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.733+07:00", comments = "Source field: user.NgayDangKi")
	private Date ngaydangki;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.733+07:00", comments = "Source field: user.NewsLetter")
	private Boolean newsletter;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.734+07:00", comments = "Source field: user.Avatar")
	private String avatar;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.732+07:00", comments = "Source field: user.PK_UserID")
	public Integer getPkUserid() {
		return pkUserid;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.732+07:00", comments = "Source field: user.PK_UserID")
	public void setPkUserid(Integer pkUserid) {
		this.pkUserid = pkUserid;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.732+07:00", comments = "Source field: user.UserEmail")
	public String getUseremail() {
		return useremail;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.732+07:00", comments = "Source field: user.UserEmail")
	public void setUseremail(String useremail) {
		this.useremail = useremail;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.732+07:00", comments = "Source field: user.UserPassword")
	public String getUserpassword() {
		return userpassword;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.732+07:00", comments = "Source field: user.UserPassword")
	public void setUserpassword(String userpassword) {
		this.userpassword = userpassword;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.732+07:00", comments = "Source field: user.FullName")
	public String getFullname() {
		return fullname;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.732+07:00", comments = "Source field: user.FullName")
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.732+07:00", comments = "Source field: user.NgaySinh")
	public Date getNgaysinh() {
		return ngaysinh;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.732+07:00", comments = "Source field: user.NgaySinh")
	public void setNgaysinh(Date ngaysinh) {
		this.ngaysinh = ngaysinh;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.732+07:00", comments = "Source field: user.SDT")
	public String getSdt() {
		return sdt;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.733+07:00", comments = "Source field: user.SDT")
	public void setSdt(String sdt) {
		this.sdt = sdt;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.733+07:00", comments = "Source field: user.DiaChi")
	public String getDiachi() {
		return diachi;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.733+07:00", comments = "Source field: user.DiaChi")
	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.733+07:00", comments = "Source field: user.FK_NhomNguoiDungID")
	public Integer getFkNhomnguoidungid() {
		return fkNhomnguoidungid;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.733+07:00", comments = "Source field: user.FK_NhomNguoiDungID")
	public void setFkNhomnguoidungid(Integer fkNhomnguoidungid) {
		this.fkNhomnguoidungid = fkNhomnguoidungid;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.733+07:00", comments = "Source field: user.UserStatus")
	public Boolean getUserstatus() {
		return userstatus;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.733+07:00", comments = "Source field: user.UserStatus")
	public void setUserstatus(Boolean userstatus) {
		this.userstatus = userstatus;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.733+07:00", comments = "Source field: user.NgayDangKi")
	public Date getNgaydangki() {
		return ngaydangki;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.733+07:00", comments = "Source field: user.NgayDangKi")
	public void setNgaydangki(Date ngaydangki) {
		this.ngaydangki = ngaydangki;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.733+07:00", comments = "Source field: user.NewsLetter")
	public Boolean getNewsletter() {
		return newsletter;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.734+07:00", comments = "Source field: user.NewsLetter")
	public void setNewsletter(Boolean newsletter) {
		this.newsletter = newsletter;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.734+07:00", comments = "Source field: user.Avatar")
	public String getAvatar() {
		return avatar;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.734+07:00", comments = "Source field: user.Avatar")
	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}
}