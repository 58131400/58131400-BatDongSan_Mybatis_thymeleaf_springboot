package com.example.thai.entity;

import java.util.Date;
import javax.annotation.Generated;

public class Giaodich {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.774+07:00", comments = "Source field: giaodich.PK_GiaoDichID")
	private Integer pkGiaodichid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.774+07:00", comments = "Source field: giaodich.FK_UserID")
	private Integer fkUserid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.774+07:00", comments = "Source field: giaodich.FK_TinDangID")
	private Integer fkTindangid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.774+07:00", comments = "Source field: giaodich.NgayLuuTin")
	private Date ngayluutin;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.774+07:00", comments = "Source field: giaodich.Status")
	private byte[] status;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.774+07:00", comments = "Source field: giaodich.PK_GiaoDichID")
	public Integer getPkGiaodichid() {
		return pkGiaodichid;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.774+07:00", comments = "Source field: giaodich.PK_GiaoDichID")
	public void setPkGiaodichid(Integer pkGiaodichid) {
		this.pkGiaodichid = pkGiaodichid;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.774+07:00", comments = "Source field: giaodich.FK_UserID")
	public Integer getFkUserid() {
		return fkUserid;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.774+07:00", comments = "Source field: giaodich.FK_UserID")
	public void setFkUserid(Integer fkUserid) {
		this.fkUserid = fkUserid;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.774+07:00", comments = "Source field: giaodich.FK_TinDangID")
	public Integer getFkTindangid() {
		return fkTindangid;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.774+07:00", comments = "Source field: giaodich.FK_TinDangID")
	public void setFkTindangid(Integer fkTindangid) {
		this.fkTindangid = fkTindangid;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.774+07:00", comments = "Source field: giaodich.NgayLuuTin")
	public Date getNgayluutin() {
		return ngayluutin;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.774+07:00", comments = "Source field: giaodich.NgayLuuTin")
	public void setNgayluutin(Date ngayluutin) {
		this.ngayluutin = ngayluutin;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.775+07:00", comments = "Source field: giaodich.Status")
	public byte[] getStatus() {
		return status;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.775+07:00", comments = "Source field: giaodich.Status")
	public void setStatus(byte[] status) {
		this.status = status;
	}
}