package com.example.thai.Mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class QuyenDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.757+07:00", comments="Source Table: quyen")
    public static final Quyen quyen = new Quyen();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.757+07:00", comments="Source field: quyen.PK_QuyenID")
    public static final SqlColumn<Integer> pkQuyenid = quyen.pkQuyenid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.757+07:00", comments="Source field: quyen.Ten")
    public static final SqlColumn<String> ten = quyen.ten;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.757+07:00", comments="Source Table: quyen")
    public static final class Quyen extends SqlTable {
        public final SqlColumn<Integer> pkQuyenid = column("PK_QuyenID", JDBCType.INTEGER);

        public final SqlColumn<String> ten = column("Ten", JDBCType.VARCHAR);

        public Quyen() {
            super("quyen");
        }
    }
}