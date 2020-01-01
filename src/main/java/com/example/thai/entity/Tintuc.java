package com.example.thai.entity;

import java.util.Date;
import javax.annotation.Generated;

public class Tintuc {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.748+07:00", comments = "Source field: tintuc.PK_TinTucID")
	private Integer pkTintucid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.748+07:00", comments = "Source field: tintuc.TieuDe")
	private String tieude;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.748+07:00", comments = "Source field: tintuc.FK_UserID")
	private Integer fkUserid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.748+07:00", comments = "Source field: tintuc.ThoiGian")
	private Date thoigian;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.748+07:00", comments = "Source field: tintuc.Anh")
	private String anh;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.748+07:00", comments = "Source field: tintuc.NoiDung")
	private String noidung;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.748+07:00", comments = "Source field: tintuc.PK_TinTucID")
	public Integer getPkTintucid() {
		return pkTintucid;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.748+07:00", comments = "Source field: tintuc.PK_TinTucID")
	public void setPkTintucid(Integer pkTintucid) {
		this.pkTintucid = pkTintucid;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.748+07:00", comments = "Source field: tintuc.TieuDe")
	public String getTieude() {
		return tieude;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.748+07:00", comments = "Source field: tintuc.TieuDe")
	public void setTieude(String tieude) {
		this.tieude = tieude;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.748+07:00", comments = "Source field: tintuc.FK_UserID")
	public Integer getFkUserid() {
		return fkUserid;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.748+07:00", comments = "Source field: tintuc.FK_UserID")
	public void setFkUserid(Integer fkUserid) {
		this.fkUserid = fkUserid;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.748+07:00", comments = "Source field: tintuc.ThoiGian")
	public Date getThoigian() {
		return thoigian;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.748+07:00", comments = "Source field: tintuc.ThoiGian")
	public void setThoigian(Date thoigian) {
		this.thoigian = thoigian;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.748+07:00", comments = "Source field: tintuc.Anh")
	public String getAnh() {
		return anh;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.748+07:00", comments = "Source field: tintuc.Anh")
	public void setAnh(String anh) {
		this.anh = anh;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.748+07:00", comments = "Source field: tintuc.NoiDung")
	public String getNoidung() {
		return noidung;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.748+07:00", comments = "Source field: tintuc.NoiDung")
	public void setNoidung(String noidung) {
		this.noidung = noidung;
	}
}