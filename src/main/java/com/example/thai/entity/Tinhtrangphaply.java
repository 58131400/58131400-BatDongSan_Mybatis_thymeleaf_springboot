package com.example.thai.entity;

import javax.annotation.Generated;

public class Tinhtrangphaply {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.751+07:00", comments = "Source field: tinhtrangphaply.PK_TinhTrangPhapLy_ID")
	private Integer pkTinhtrangphaplyId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.751+07:00", comments = "Source field: tinhtrangphaply.Ten")
	private String ten;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.751+07:00", comments = "Source field: tinhtrangphaply.PK_TinhTrangPhapLy_ID")
	public Integer getPkTinhtrangphaplyId() {
		return pkTinhtrangphaplyId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.751+07:00", comments = "Source field: tinhtrangphaply.PK_TinhTrangPhapLy_ID")
	public void setPkTinhtrangphaplyId(Integer pkTinhtrangphaplyId) {
		this.pkTinhtrangphaplyId = pkTinhtrangphaplyId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.752+07:00", comments = "Source field: tinhtrangphaply.Ten")
	public String getTen() {
		return ten;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.752+07:00", comments = "Source field: tinhtrangphaply.Ten")
	public void setTen(String ten) {
		this.ten = ten;
	}
}