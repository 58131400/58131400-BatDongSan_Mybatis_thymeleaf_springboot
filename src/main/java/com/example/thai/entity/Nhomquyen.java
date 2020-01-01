package com.example.thai.entity;

import javax.annotation.Generated;

public class Nhomquyen {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.764+07:00", comments = "Source field: nhomquyen.PK_NhomQuyenID")
	private Integer pkNhomquyenid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.764+07:00", comments = "Source field: nhomquyen.FK_NhomNguoiDungID")
	private Integer fkNhomnguoidungid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.764+07:00", comments = "Source field: nhomquyen.FK_QuyenID")
	private Integer fkQuyenid;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.764+07:00", comments = "Source field: nhomquyen.PK_NhomQuyenID")
	public Integer getPkNhomquyenid() {
		return pkNhomquyenid;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.764+07:00", comments = "Source field: nhomquyen.PK_NhomQuyenID")
	public void setPkNhomquyenid(Integer pkNhomquyenid) {
		this.pkNhomquyenid = pkNhomquyenid;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.764+07:00", comments = "Source field: nhomquyen.FK_NhomNguoiDungID")
	public Integer getFkNhomnguoidungid() {
		return fkNhomnguoidungid;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.764+07:00", comments = "Source field: nhomquyen.FK_NhomNguoiDungID")
	public void setFkNhomnguoidungid(Integer fkNhomnguoidungid) {
		this.fkNhomnguoidungid = fkNhomnguoidungid;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.764+07:00", comments = "Source field: nhomquyen.FK_QuyenID")
	public Integer getFkQuyenid() {
		return fkQuyenid;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.764+07:00", comments = "Source field: nhomquyen.FK_QuyenID")
	public void setFkQuyenid(Integer fkQuyenid) {
		this.fkQuyenid = fkQuyenid;
	}
}