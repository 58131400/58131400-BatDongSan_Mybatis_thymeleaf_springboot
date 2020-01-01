package com.example.thai.entity;

import javax.annotation.Generated;

public class Themquyen {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.754+07:00", comments = "Source field: themquyen.PK_ThemQuyenID")
	private Integer pkThemquyenid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.754+07:00", comments = "Source field: themquyen.FK_UserID")
	private Integer fkUserid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.754+07:00", comments = "Source field: themquyen.QuyenID")
	private Integer quyenid;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.754+07:00", comments = "Source field: themquyen.PK_ThemQuyenID")
	public Integer getPkThemquyenid() {
		return pkThemquyenid;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.754+07:00", comments = "Source field: themquyen.PK_ThemQuyenID")
	public void setPkThemquyenid(Integer pkThemquyenid) {
		this.pkThemquyenid = pkThemquyenid;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.754+07:00", comments = "Source field: themquyen.FK_UserID")
	public Integer getFkUserid() {
		return fkUserid;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.754+07:00", comments = "Source field: themquyen.FK_UserID")
	public void setFkUserid(Integer fkUserid) {
		this.fkUserid = fkUserid;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.754+07:00", comments = "Source field: themquyen.QuyenID")
	public Integer getQuyenid() {
		return quyenid;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.754+07:00", comments = "Source field: themquyen.QuyenID")
	public void setQuyenid(Integer quyenid) {
		this.quyenid = quyenid;
	}
}