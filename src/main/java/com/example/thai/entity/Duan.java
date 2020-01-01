package com.example.thai.entity;

import java.util.Date;
import javax.annotation.Generated;

public class Duan {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.777+07:00", comments = "Source field: duan.PK_DuAnID")
	private Integer pkDuanid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.777+07:00", comments = "Source field: duan.FK_UserID")
	private Integer fkUserid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.777+07:00", comments = "Source field: duan.TieuDe")
	private String tieude;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.777+07:00", comments = "Source field: duan.Anh")
	private String anh;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.777+07:00", comments = "Source field: duan.ThoiGian")
	private Date thoigian;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.777+07:00", comments = "Source field: duan.NoiDung")
	private String noidung;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.777+07:00", comments = "Source field: duan.PK_DuAnID")
	public Integer getPkDuanid() {
		return pkDuanid;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.777+07:00", comments = "Source field: duan.PK_DuAnID")
	public void setPkDuanid(Integer pkDuanid) {
		this.pkDuanid = pkDuanid;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.777+07:00", comments = "Source field: duan.FK_UserID")
	public Integer getFkUserid() {
		return fkUserid;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.777+07:00", comments = "Source field: duan.FK_UserID")
	public void setFkUserid(Integer fkUserid) {
		this.fkUserid = fkUserid;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.777+07:00", comments = "Source field: duan.TieuDe")
	public String getTieude() {
		return tieude;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.777+07:00", comments = "Source field: duan.TieuDe")
	public void setTieude(String tieude) {
		this.tieude = tieude;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.777+07:00", comments = "Source field: duan.Anh")
	public String getAnh() {
		return anh;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.777+07:00", comments = "Source field: duan.Anh")
	public void setAnh(String anh) {
		this.anh = anh;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.777+07:00", comments = "Source field: duan.ThoiGian")
	public Date getThoigian() {
		return thoigian;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.777+07:00", comments = "Source field: duan.ThoiGian")
	public void setThoigian(Date thoigian) {
		this.thoigian = thoigian;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.777+07:00", comments = "Source field: duan.NoiDung")
	public String getNoidung() {
		return noidung;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.777+07:00", comments = "Source field: duan.NoiDung")
	public void setNoidung(String noidung) {
		this.noidung = noidung;
	}
}