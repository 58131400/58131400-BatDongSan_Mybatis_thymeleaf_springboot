package com.example.thai.Mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class TinhtrangphaplyDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.752+07:00", comments="Source Table: tinhtrangphaply")
    public static final Tinhtrangphaply tinhtrangphaply = new Tinhtrangphaply();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.752+07:00", comments="Source field: tinhtrangphaply.PK_TinhTrangPhapLy_ID")
    public static final SqlColumn<Integer> pkTinhtrangphaplyId = tinhtrangphaply.pkTinhtrangphaplyId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.752+07:00", comments="Source field: tinhtrangphaply.Ten")
    public static final SqlColumn<String> ten = tinhtrangphaply.ten;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.752+07:00", comments="Source Table: tinhtrangphaply")
    public static final class Tinhtrangphaply extends SqlTable {
        public final SqlColumn<Integer> pkTinhtrangphaplyId = column("PK_TinhTrangPhapLy_ID", JDBCType.INTEGER);

        public final SqlColumn<String> ten = column("Ten", JDBCType.VARCHAR);

        public Tinhtrangphaply() {
            super("tinhtrangphaply");
        }
    }
}