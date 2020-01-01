package com.example.thai.Mapper;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class TintucDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.749+07:00", comments="Source Table: tintuc")
    public static final Tintuc tintuc = new Tintuc();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.749+07:00", comments="Source field: tintuc.PK_TinTucID")
    public static final SqlColumn<Integer> pkTintucid = tintuc.pkTintucid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.749+07:00", comments="Source field: tintuc.TieuDe")
    public static final SqlColumn<String> tieude = tintuc.tieude;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.749+07:00", comments="Source field: tintuc.FK_UserID")
    public static final SqlColumn<Integer> fkUserid = tintuc.fkUserid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.749+07:00", comments="Source field: tintuc.ThoiGian")
    public static final SqlColumn<Date> thoigian = tintuc.thoigian;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.749+07:00", comments="Source field: tintuc.Anh")
    public static final SqlColumn<String> anh = tintuc.anh;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.749+07:00", comments="Source field: tintuc.NoiDung")
    public static final SqlColumn<String> noidung = tintuc.noidung;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.749+07:00", comments="Source Table: tintuc")
    public static final class Tintuc extends SqlTable {
        public final SqlColumn<Integer> pkTintucid = column("PK_TinTucID", JDBCType.INTEGER);

        public final SqlColumn<String> tieude = column("TieuDe", JDBCType.VARCHAR);

        public final SqlColumn<Integer> fkUserid = column("FK_UserID", JDBCType.INTEGER);

        public final SqlColumn<Date> thoigian = column("ThoiGian", JDBCType.DATE);

        public final SqlColumn<String> anh = column("Anh", JDBCType.VARCHAR);

        public final SqlColumn<String> noidung = column("NoiDung", JDBCType.LONGVARCHAR);

        public Tintuc() {
            super("tintuc");
        }
    }
}