package com.example.thai.entity;

import javax.annotation.Generated;

public class Quyen {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.757+07:00", comments = "Source field: quyen.PK_QuyenID")
	private Integer pkQuyenid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.757+07:00", comments = "Source field: quyen.Ten")
	private String ten;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.757+07:00", comments = "Source field: quyen.PK_QuyenID")
	public Integer getPkQuyenid() {
		return pkQuyenid;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.757+07:00", comments = "Source field: quyen.PK_QuyenID")
	public void setPkQuyenid(Integer pkQuyenid) {
		this.pkQuyenid = pkQuyenid;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.757+07:00", comments = "Source field: quyen.Ten")
	public String getTen() {
		return ten;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.757+07:00", comments = "Source field: quyen.Ten")
	public void setTen(String ten) {
		this.ten = ten;
	}
}