package com.example.thai.Mapper;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class GiaodichDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.775+07:00", comments="Source Table: giaodich")
    public static final Giaodich giaodich = new Giaodich();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.775+07:00", comments="Source field: giaodich.PK_GiaoDichID")
    public static final SqlColumn<Integer> pkGiaodichid = giaodich.pkGiaodichid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.775+07:00", comments="Source field: giaodich.FK_UserID")
    public static final SqlColumn<Integer> fkUserid = giaodich.fkUserid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.775+07:00", comments="Source field: giaodich.FK_TinDangID")
    public static final SqlColumn<Integer> fkTindangid = giaodich.fkTindangid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.775+07:00", comments="Source field: giaodich.NgayLuuTin")
    public static final SqlColumn<Date> ngayluutin = giaodich.ngayluutin;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.775+07:00", comments="Source field: giaodich.Status")
    public static final SqlColumn<byte[]> status = giaodich.status;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.775+07:00", comments="Source Table: giaodich")
    public static final class Giaodich extends SqlTable {
        public final SqlColumn<Integer> pkGiaodichid = column("PK_GiaoDichID", JDBCType.INTEGER);

        public final SqlColumn<Integer> fkUserid = column("FK_UserID", JDBCType.INTEGER);

        public final SqlColumn<Integer> fkTindangid = column("FK_TinDangID", JDBCType.INTEGER);

        public final SqlColumn<Date> ngayluutin = column("NgayLuuTin", JDBCType.DATE);

        public final SqlColumn<byte[]> status = column("Status", JDBCType.BIT);

        public Giaodich() {
            super("giaodich");
        }
    }
}