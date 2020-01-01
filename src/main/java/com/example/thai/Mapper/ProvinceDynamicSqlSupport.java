package com.example.thai.Mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class ProvinceDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.762+07:00", comments="Source Table: province")
    public static final Province province = new Province();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.762+07:00", comments="Source field: province.PK_ProvinceID")
    public static final SqlColumn<Integer> pkProvinceid = province.pkProvinceid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.762+07:00", comments="Source field: province.Ten")
    public static final SqlColumn<String> ten = province.ten;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.762+07:00", comments="Source Table: province")
    public static final class Province extends SqlTable {
        public final SqlColumn<Integer> pkProvinceid = column("PK_ProvinceID", JDBCType.INTEGER);

        public final SqlColumn<String> ten = column("Ten", JDBCType.VARCHAR);

        public Province() {
            super("province");
        }
    }
}