package com.example.thai.Mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class ThemquyenDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.754+07:00", comments="Source Table: themquyen")
    public static final Themquyen themquyen = new Themquyen();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.754+07:00", comments="Source field: themquyen.PK_ThemQuyenID")
    public static final SqlColumn<Integer> pkThemquyenid = themquyen.pkThemquyenid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.754+07:00", comments="Source field: themquyen.FK_UserID")
    public static final SqlColumn<Integer> fkUserid = themquyen.fkUserid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.754+07:00", comments="Source field: themquyen.QuyenID")
    public static final SqlColumn<Integer> quyenid = themquyen.quyenid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.754+07:00", comments="Source Table: themquyen")
    public static final class Themquyen extends SqlTable {
        public final SqlColumn<Integer> pkThemquyenid = column("PK_ThemQuyenID", JDBCType.INTEGER);

        public final SqlColumn<Integer> fkUserid = column("FK_UserID", JDBCType.INTEGER);

        public final SqlColumn<Integer> quyenid = column("QuyenID", JDBCType.INTEGER);

        public Themquyen() {
            super("themquyen");
        }
    }
}