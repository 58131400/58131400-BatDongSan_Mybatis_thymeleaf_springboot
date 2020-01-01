package com.example.thai.entity;

import java.util.Date;
import javax.annotation.Generated;

public class TinDang {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.741+07:00", comments = "Source field: tin_dang.PK_tindangID")
	private Integer pkTindangid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.741+07:00", comments = "Source field: tin_dang.FK_userID")
	private Integer fkUserid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.741+07:00", comments = "Source field: tin_dang.Ngaydangtin")
	private Date ngaydangtin;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.742+07:00", comments = "Source field: tin_dang.Songaydang")
	private Integer songaydang;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.742+07:00", comments = "Source field: tin_dang.Totalview")
	private Integer totalview;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.742+07:00", comments = "Source field: tin_dang.Tieudetin")
	private String tieudetin;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.742+07:00", comments = "Source field: tin_dang.FK_quanID")
	private Integer fkQuanid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.742+07:00", comments = "Source field: tin_dang.Street")
	private String street;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.742+07:00", comments = "Source field: tin_dang.FK_loaigiaodichID")
	private Integer fkLoaigiaodichid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.742+07:00", comments = "Source field: tin_dang.FK_loaibatdongsanID")
	private Integer fkLoaibatdongsanid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.742+07:00", comments = "Source field: tin_dang.Gia")
	private Double gia;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.742+07:00", comments = "Source field: tin_dang.Dientich")
	private Integer dientich;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.743+07:00", comments = "Source field: tin_dang.FK_tinhtrangphaplyID")
	private Integer fkTinhtrangphaplyid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.743+07:00", comments = "Source field: tin_dang.Sophongngu")
	private Integer sophongngu;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.743+07:00", comments = "Source field: tin_dang.Sophongtam")
	private Integer sophongtam;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.743+07:00", comments = "Source field: tin_dang.Sotang")
	private Integer sotang;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.743+07:00", comments = "Source field: tin_dang.Tongsophong")
	private Integer tongsophong;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.743+07:00", comments = "Source field: tin_dang.Anhmattien")
	private String anhmattien;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.744+07:00", comments = "Source field: tin_dang.Motathem")
	private String motathem;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.741+07:00", comments = "Source field: tin_dang.PK_tindangID")
	public Integer getPkTindangid() {
		return pkTindangid;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.741+07:00", comments = "Source field: tin_dang.PK_tindangID")
	public void setPkTindangid(Integer pkTindangid) {
		this.pkTindangid = pkTindangid;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.741+07:00", comments = "Source field: tin_dang.FK_userID")
	public Integer getFkUserid() {
		return fkUserid;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.741+07:00", comments = "Source field: tin_dang.FK_userID")
	public void setFkUserid(Integer fkUserid) {
		this.fkUserid = fkUserid;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.741+07:00", comments = "Source field: tin_dang.Ngaydangtin")
	public Date getNgaydangtin() {
		return ngaydangtin;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.741+07:00", comments = "Source field: tin_dang.Ngaydangtin")
	public void setNgaydangtin(Date ngaydangtin) {
		this.ngaydangtin = ngaydangtin;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.742+07:00", comments = "Source field: tin_dang.Songaydang")
	public Integer getSongaydang() {
		return songaydang;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.742+07:00", comments = "Source field: tin_dang.Songaydang")
	public void setSongaydang(Integer songaydang) {
		this.songaydang = songaydang;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.742+07:00", comments = "Source field: tin_dang.Totalview")
	public Integer getTotalview() {
		return totalview;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.742+07:00", comments = "Source field: tin_dang.Totalview")
	public void setTotalview(Integer totalview) {
		this.totalview = totalview;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.742+07:00", comments = "Source field: tin_dang.Tieudetin")
	public String getTieudetin() {
		return tieudetin;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.742+07:00", comments = "Source field: tin_dang.Tieudetin")
	public void setTieudetin(String tieudetin) {
		this.tieudetin = tieudetin;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.742+07:00", comments = "Source field: tin_dang.FK_quanID")
	public Integer getFkQuanid() {
		return fkQuanid;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.742+07:00", comments = "Source field: tin_dang.FK_quanID")
	public void setFkQuanid(Integer fkQuanid) {
		this.fkQuanid = fkQuanid;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.742+07:00", comments = "Source field: tin_dang.Street")
	public String getStreet() {
		return street;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.742+07:00", comments = "Source field: tin_dang.Street")
	public void setStreet(String street) {
		this.street = street;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.742+07:00", comments = "Source field: tin_dang.FK_loaigiaodichID")
	public Integer getFkLoaigiaodichid() {
		return fkLoaigiaodichid;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.742+07:00", comments = "Source field: tin_dang.FK_loaigiaodichID")
	public void setFkLoaigiaodichid(Integer fkLoaigiaodichid) {
		this.fkLoaigiaodichid = fkLoaigiaodichid;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.742+07:00", comments = "Source field: tin_dang.FK_loaibatdongsanID")
	public Integer getFkLoaibatdongsanid() {
		return fkLoaibatdongsanid;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.742+07:00", comments = "Source field: tin_dang.FK_loaibatdongsanID")
	public void setFkLoaibatdongsanid(Integer fkLoaibatdongsanid) {
		this.fkLoaibatdongsanid = fkLoaibatdongsanid;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.742+07:00", comments = "Source field: tin_dang.Gia")
	public Double getGia() {
		return gia;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.742+07:00", comments = "Source field: tin_dang.Gia")
	public void setGia(Double gia) {
		this.gia = gia;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.742+07:00", comments = "Source field: tin_dang.Dientich")
	public Integer getDientich() {
		return dientich;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.742+07:00", comments = "Source field: tin_dang.Dientich")
	public void setDientich(Integer dientich) {
		this.dientich = dientich;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.743+07:00", comments = "Source field: tin_dang.FK_tinhtrangphaplyID")
	public Integer getFkTinhtrangphaplyid() {
		return fkTinhtrangphaplyid;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.743+07:00", comments = "Source field: tin_dang.FK_tinhtrangphaplyID")
	public void setFkTinhtrangphaplyid(Integer fkTinhtrangphaplyid) {
		this.fkTinhtrangphaplyid = fkTinhtrangphaplyid;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.743+07:00", comments = "Source field: tin_dang.Sophongngu")
	public Integer getSophongngu() {
		return sophongngu;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.743+07:00", comments = "Source field: tin_dang.Sophongngu")
	public void setSophongngu(Integer sophongngu) {
		this.sophongngu = sophongngu;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.743+07:00", comments = "Source field: tin_dang.Sophongtam")
	public Integer getSophongtam() {
		return sophongtam;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.743+07:00", comments = "Source field: tin_dang.Sophongtam")
	public void setSophongtam(Integer sophongtam) {
		this.sophongtam = sophongtam;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.743+07:00", comments = "Source field: tin_dang.Sotang")
	public Integer getSotang() {
		return sotang;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.743+07:00", comments = "Source field: tin_dang.Sotang")
	public void setSotang(Integer sotang) {
		this.sotang = sotang;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.743+07:00", comments = "Source field: tin_dang.Tongsophong")
	public Integer getTongsophong() {
		return tongsophong;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.743+07:00", comments = "Source field: tin_dang.Tongsophong")
	public void setTongsophong(Integer tongsophong) {
		this.tongsophong = tongsophong;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.743+07:00", comments = "Source field: tin_dang.Anhmattien")
	public String getAnhmattien() {
		return anhmattien;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.743+07:00", comments = "Source field: tin_dang.Anhmattien")
	public void setAnhmattien(String anhmattien) {
		this.anhmattien = anhmattien;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.744+07:00", comments = "Source field: tin_dang.Motathem")
	public String getMotathem() {
		return motathem;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.744+07:00", comments = "Source field: tin_dang.Motathem")
	public void setMotathem(String motathem) {
		this.motathem = motathem;
	}
}