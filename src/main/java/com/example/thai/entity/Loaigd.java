package com.example.thai.entity;

import javax.annotation.Generated;

public class Loaigd {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.77+07:00", comments = "Source field: loaigd.PK_LoaiGiaoDichID")
	private Integer pkLoaigiaodichid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.77+07:00", comments = "Source field: loaigd.Ten")
	private String ten;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.77+07:00", comments = "Source field: loaigd.PK_LoaiGiaoDichID")
	public Integer getPkLoaigiaodichid() {
		return pkLoaigiaodichid;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.77+07:00", comments = "Source field: loaigd.PK_LoaiGiaoDichID")
	public void setPkLoaigiaodichid(Integer pkLoaigiaodichid) {
		this.pkLoaigiaodichid = pkLoaigiaodichid;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.77+07:00", comments = "Source field: loaigd.Ten")
	public String getTen() {
		return ten;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.77+07:00", comments = "Source field: loaigd.Ten")
	public void setTen(String ten) {
		this.ten = ten;
	}
}