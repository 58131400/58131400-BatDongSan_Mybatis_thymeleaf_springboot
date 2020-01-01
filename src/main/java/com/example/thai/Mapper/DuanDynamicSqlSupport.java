package com.example.thai.Mapper;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class DuanDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.778+07:00", comments="Source Table: duan")
    public static final Duan duan = new Duan();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.778+07:00", comments="Source field: duan.PK_DuAnID")
    public static final SqlColumn<Integer> pkDuanid = duan.pkDuanid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.778+07:00", comments="Source field: duan.FK_UserID")
    public static final SqlColumn<Integer> fkUserid = duan.fkUserid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.778+07:00", comments="Source field: duan.TieuDe")
    public static final SqlColumn<String> tieude = duan.tieude;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.778+07:00", comments="Source field: duan.Anh")
    public static final SqlColumn<String> anh = duan.anh;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.778+07:00", comments="Source field: duan.ThoiGian")
    public static final SqlColumn<Date> thoigian = duan.thoigian;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.778+07:00", comments="Source field: duan.NoiDung")
    public static final SqlColumn<String> noidung = duan.noidung;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.778+07:00", comments="Source Table: duan")
    public static final class Duan extends SqlTable {
        public final SqlColumn<Integer> pkDuanid = column("PK_DuAnID", JDBCType.INTEGER);

        public final SqlColumn<Integer> fkUserid = column("FK_UserID", JDBCType.INTEGER);

        public final SqlColumn<String> tieude = column("TieuDe", JDBCType.VARCHAR);

        public final SqlColumn<String> anh = column("Anh", JDBCType.VARCHAR);

        public final SqlColumn<Date> thoigian = column("ThoiGian", JDBCType.DATE);

        public final SqlColumn<String> noidung = column("NoiDung", JDBCType.LONGVARCHAR);

        public Duan() {
            super("duan");
        }
    }
}