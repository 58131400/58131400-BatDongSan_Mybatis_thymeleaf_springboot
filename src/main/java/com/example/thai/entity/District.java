package com.example.thai.entity;

import javax.annotation.Generated;

public class District {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.78+07:00", comments = "Source field: district.PK_DistrictID")
	private Integer pkDistrictid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.78+07:00", comments = "Source field: district.Ten")
	private String ten;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.78+07:00", comments = "Source field: district.FK_ProvinceID")
	private Integer fkProvinceid;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.78+07:00", comments = "Source field: district.PK_DistrictID")
	public Integer getPkDistrictid() {
		return pkDistrictid;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.78+07:00", comments = "Source field: district.PK_DistrictID")
	public void setPkDistrictid(Integer pkDistrictid) {
		this.pkDistrictid = pkDistrictid;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.78+07:00", comments = "Source field: district.Ten")
	public String getTen() {
		return ten;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.78+07:00", comments = "Source field: district.Ten")
	public void setTen(String ten) {
		this.ten = ten;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.78+07:00", comments = "Source field: district.FK_ProvinceID")
	public Integer getFkProvinceid() {
		return fkProvinceid;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.78+07:00", comments = "Source field: district.FK_ProvinceID")
	public void setFkProvinceid(Integer fkProvinceid) {
		this.fkProvinceid = fkProvinceid;
	}
}