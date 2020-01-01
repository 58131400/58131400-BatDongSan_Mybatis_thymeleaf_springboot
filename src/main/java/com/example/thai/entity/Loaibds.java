package com.example.thai.entity;

import javax.annotation.Generated;

public class Loaibds {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.772+07:00", comments = "Source field: loaibds.PK_LoaiBDS_ID")
	private Integer pkLoaibdsId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.772+07:00", comments = "Source field: loaibds.Ten")
	private String ten;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.772+07:00", comments = "Source field: loaibds.PK_LoaiBDS_ID")
	public Integer getPkLoaibdsId() {
		return pkLoaibdsId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.772+07:00", comments = "Source field: loaibds.PK_LoaiBDS_ID")
	public void setPkLoaibdsId(Integer pkLoaibdsId) {
		this.pkLoaibdsId = pkLoaibdsId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.772+07:00", comments = "Source field: loaibds.Ten")
	public String getTen() {
		return ten;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.772+07:00", comments = "Source field: loaibds.Ten")
	public void setTen(String ten) {
		this.ten = ten;
	}
}