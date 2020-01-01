package com.example.thai.Mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class CamquyenDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.759+07:00", comments="Source Table: camquyen")
    public static final Camquyen camquyen = new Camquyen();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.76+07:00", comments="Source field: camquyen.PK_CamQuyenID")
    public static final SqlColumn<Integer> pkCamquyenid = camquyen.pkCamquyenid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.76+07:00", comments="Source field: camquyen.FK_UserID")
    public static final SqlColumn<Integer> fkUserid = camquyen.fkUserid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.76+07:00", comments="Source field: camquyen.QuyenID")
    public static final SqlColumn<Integer> quyenid = camquyen.quyenid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.76+07:00", comments="Source Table: camquyen")
    public static final class Camquyen extends SqlTable {
        public final SqlColumn<Integer> pkCamquyenid = column("PK_CamQuyenID", JDBCType.INTEGER);

        public final SqlColumn<Integer> fkUserid = column("FK_UserID", JDBCType.INTEGER);

        public final SqlColumn<Integer> quyenid = column("QuyenID", JDBCType.INTEGER);

        public Camquyen() {
            super("camquyen");
        }
    }
}