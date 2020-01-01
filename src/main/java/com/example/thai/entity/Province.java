package com.example.thai.entity;

import javax.annotation.Generated;

public class Province {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.762+07:00", comments = "Source field: province.PK_ProvinceID")
	private Integer pkProvinceid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.762+07:00", comments = "Source field: province.Ten")
	private String ten;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.762+07:00", comments = "Source field: province.PK_ProvinceID")
	public Integer getPkProvinceid() {
		return pkProvinceid;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.762+07:00", comments = "Source field: province.PK_ProvinceID")
	public void setPkProvinceid(Integer pkProvinceid) {
		this.pkProvinceid = pkProvinceid;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.762+07:00", comments = "Source field: province.Ten")
	public String getTen() {
		return ten;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.762+07:00", comments = "Source field: province.Ten")
	public void setTen(String ten) {
		this.ten = ten;
	}
}