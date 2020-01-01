package com.example.thai.entity;

import javax.annotation.Generated;

public class Nhomnguoidung {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.768+07:00", comments = "Source field: nhomnguoidung.PK_NhomNguoiDungID")
	private Integer pkNhomnguoidungid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.768+07:00", comments = "Source field: nhomnguoidung.Ten")
	private String ten;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.768+07:00", comments = "Source field: nhomnguoidung.PK_NhomNguoiDungID")
	public Integer getPkNhomnguoidungid() {
		return pkNhomnguoidungid;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.768+07:00", comments = "Source field: nhomnguoidung.PK_NhomNguoiDungID")
	public void setPkNhomnguoidungid(Integer pkNhomnguoidungid) {
		this.pkNhomnguoidungid = pkNhomnguoidungid;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.768+07:00", comments = "Source field: nhomnguoidung.Ten")
	public String getTen() {
		return ten;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.768+07:00", comments = "Source field: nhomnguoidung.Ten")
	public void setTen(String ten) {
		this.ten = ten;
	}
}