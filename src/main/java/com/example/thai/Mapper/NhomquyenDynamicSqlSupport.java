package com.example.thai.Mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class NhomquyenDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.764+07:00", comments="Source Table: nhomquyen")
    public static final Nhomquyen nhomquyen = new Nhomquyen();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.764+07:00", comments="Source field: nhomquyen.PK_NhomQuyenID")
    public static final SqlColumn<Integer> pkNhomquyenid = nhomquyen.pkNhomquyenid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.765+07:00", comments="Source field: nhomquyen.FK_NhomNguoiDungID")
    public static final SqlColumn<Integer> fkNhomnguoidungid = nhomquyen.fkNhomnguoidungid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.765+07:00", comments="Source field: nhomquyen.FK_QuyenID")
    public static final SqlColumn<Integer> fkQuyenid = nhomquyen.fkQuyenid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.764+07:00", comments="Source Table: nhomquyen")
    public static final class Nhomquyen extends SqlTable {
        public final SqlColumn<Integer> pkNhomquyenid = column("PK_NhomQuyenID", JDBCType.INTEGER);

        public final SqlColumn<Integer> fkNhomnguoidungid = column("FK_NhomNguoiDungID", JDBCType.INTEGER);

        public final SqlColumn<Integer> fkQuyenid = column("FK_QuyenID", JDBCType.INTEGER);

        public Nhomquyen() {
            super("nhomquyen");
        }
    }
}