package com.example.thai.Mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class DistrictDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.78+07:00", comments="Source Table: district")
    public static final District district = new District();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.781+07:00", comments="Source field: district.PK_DistrictID")
    public static final SqlColumn<Integer> pkDistrictid = district.pkDistrictid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.781+07:00", comments="Source field: district.Ten")
    public static final SqlColumn<String> ten = district.ten;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.781+07:00", comments="Source field: district.FK_ProvinceID")
    public static final SqlColumn<Integer> fkProvinceid = district.fkProvinceid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.781+07:00", comments="Source Table: district")
    public static final class District extends SqlTable {
        public final SqlColumn<Integer> pkDistrictid = column("PK_DistrictID", JDBCType.INTEGER);

        public final SqlColumn<String> ten = column("Ten", JDBCType.VARCHAR);

        public final SqlColumn<Integer> fkProvinceid = column("FK_ProvinceID", JDBCType.INTEGER);

        public District() {
            super("district");
        }
    }
}