package com.example.thai.Mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class LoaigdDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.77+07:00", comments="Source Table: loaigd")
    public static final Loaigd loaigd = new Loaigd();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.771+07:00", comments="Source field: loaigd.PK_LoaiGiaoDichID")
    public static final SqlColumn<Integer> pkLoaigiaodichid = loaigd.pkLoaigiaodichid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.771+07:00", comments="Source field: loaigd.Ten")
    public static final SqlColumn<String> ten = loaigd.ten;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.77+07:00", comments="Source Table: loaigd")
    public static final class Loaigd extends SqlTable {
        public final SqlColumn<Integer> pkLoaigiaodichid = column("PK_LoaiGiaoDichID", JDBCType.INTEGER);

        public final SqlColumn<String> ten = column("Ten", JDBCType.VARCHAR);

        public Loaigd() {
            super("loaigd");
        }
    }
}