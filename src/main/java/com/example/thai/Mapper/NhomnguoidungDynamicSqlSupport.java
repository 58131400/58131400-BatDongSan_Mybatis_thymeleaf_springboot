package com.example.thai.Mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class NhomnguoidungDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.768+07:00", comments="Source Table: nhomnguoidung")
    public static final Nhomnguoidung nhomnguoidung = new Nhomnguoidung();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.768+07:00", comments="Source field: nhomnguoidung.PK_NhomNguoiDungID")
    public static final SqlColumn<Integer> pkNhomnguoidungid = nhomnguoidung.pkNhomnguoidungid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.768+07:00", comments="Source field: nhomnguoidung.Ten")
    public static final SqlColumn<String> ten = nhomnguoidung.ten;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.768+07:00", comments="Source Table: nhomnguoidung")
    public static final class Nhomnguoidung extends SqlTable {
        public final SqlColumn<Integer> pkNhomnguoidungid = column("PK_NhomNguoiDungID", JDBCType.INTEGER);

        public final SqlColumn<String> ten = column("Ten", JDBCType.VARCHAR);

        public Nhomnguoidung() {
            super("nhomnguoidung");
        }
    }
}