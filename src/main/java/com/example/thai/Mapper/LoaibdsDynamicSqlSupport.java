package com.example.thai.Mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class LoaibdsDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.773+07:00", comments="Source Table: loaibds")
    public static final Loaibds loaibds = new Loaibds();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.773+07:00", comments="Source field: loaibds.PK_LoaiBDS_ID")
    public static final SqlColumn<Integer> pkLoaibdsId = loaibds.pkLoaibdsId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.773+07:00", comments="Source field: loaibds.Ten")
    public static final SqlColumn<String> ten = loaibds.ten;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.773+07:00", comments="Source Table: loaibds")
    public static final class Loaibds extends SqlTable {
        public final SqlColumn<Integer> pkLoaibdsId = column("PK_LoaiBDS_ID", JDBCType.INTEGER);

        public final SqlColumn<String> ten = column("Ten", JDBCType.VARCHAR);

        public Loaibds() {
            super("loaibds");
        }
    }
}