package com.example.thai.entity;

import javax.annotation.Generated;

public class Camquyen {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.759+07:00", comments = "Source field: camquyen.PK_CamQuyenID")
	private Integer pkCamquyenid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.759+07:00", comments = "Source field: camquyen.FK_UserID")
	private Integer fkUserid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.759+07:00", comments = "Source field: camquyen.QuyenID")
	private Integer quyenid;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.759+07:00", comments = "Source field: camquyen.PK_CamQuyenID")
	public Integer getPkCamquyenid() {
		return pkCamquyenid;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.759+07:00", comments = "Source field: camquyen.PK_CamQuyenID")
	public void setPkCamquyenid(Integer pkCamquyenid) {
		this.pkCamquyenid = pkCamquyenid;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.759+07:00", comments = "Source field: camquyen.FK_UserID")
	public Integer getFkUserid() {
		return fkUserid;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.759+07:00", comments = "Source field: camquyen.FK_UserID")
	public void setFkUserid(Integer fkUserid) {
		this.fkUserid = fkUserid;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.759+07:00", comments = "Source field: camquyen.QuyenID")
	public Integer getQuyenid() {
		return quyenid;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-25T14:56:04.759+07:00", comments = "Source field: camquyen.QuyenID")
	public void setQuyenid(Integer quyenid) {
		this.quyenid = quyenid;
	}
}