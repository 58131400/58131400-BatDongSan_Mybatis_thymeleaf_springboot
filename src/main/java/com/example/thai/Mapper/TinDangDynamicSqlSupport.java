package com.example.thai.Mapper;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class TinDangDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.744+07:00", comments="Source Table: tin_dang")
    public static final TinDang tinDang = new TinDang();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.744+07:00", comments="Source field: tin_dang.PK_tindangID")
    public static final SqlColumn<Integer> pkTindangid = tinDang.pkTindangid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.744+07:00", comments="Source field: tin_dang.FK_userID")
    public static final SqlColumn<Integer> fkUserid = tinDang.fkUserid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.744+07:00", comments="Source field: tin_dang.Ngaydangtin")
    public static final SqlColumn<Date> ngaydangtin = tinDang.ngaydangtin;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.744+07:00", comments="Source field: tin_dang.Songaydang")
    public static final SqlColumn<Integer> songaydang = tinDang.songaydang;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.744+07:00", comments="Source field: tin_dang.Totalview")
    public static final SqlColumn<Integer> totalview = tinDang.totalview;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.744+07:00", comments="Source field: tin_dang.Tieudetin")
    public static final SqlColumn<String> tieudetin = tinDang.tieudetin;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.744+07:00", comments="Source field: tin_dang.FK_quanID")
    public static final SqlColumn<Integer> fkQuanid = tinDang.fkQuanid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.744+07:00", comments="Source field: tin_dang.Street")
    public static final SqlColumn<String> street = tinDang.street;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.744+07:00", comments="Source field: tin_dang.FK_loaigiaodichID")
    public static final SqlColumn<Integer> fkLoaigiaodichid = tinDang.fkLoaigiaodichid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.744+07:00", comments="Source field: tin_dang.FK_loaibatdongsanID")
    public static final SqlColumn<Integer> fkLoaibatdongsanid = tinDang.fkLoaibatdongsanid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.744+07:00", comments="Source field: tin_dang.Gia")
    public static final SqlColumn<Double> gia = tinDang.gia;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.745+07:00", comments="Source field: tin_dang.Dientich")
    public static final SqlColumn<Integer> dientich = tinDang.dientich;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.745+07:00", comments="Source field: tin_dang.FK_tinhtrangphaplyID")
    public static final SqlColumn<Integer> fkTinhtrangphaplyid = tinDang.fkTinhtrangphaplyid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.745+07:00", comments="Source field: tin_dang.Sophongngu")
    public static final SqlColumn<Integer> sophongngu = tinDang.sophongngu;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.745+07:00", comments="Source field: tin_dang.Sophongtam")
    public static final SqlColumn<Integer> sophongtam = tinDang.sophongtam;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.745+07:00", comments="Source field: tin_dang.Sotang")
    public static final SqlColumn<Integer> sotang = tinDang.sotang;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.745+07:00", comments="Source field: tin_dang.Tongsophong")
    public static final SqlColumn<Integer> tongsophong = tinDang.tongsophong;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.745+07:00", comments="Source field: tin_dang.Anhmattien")
    public static final SqlColumn<String> anhmattien = tinDang.anhmattien;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.745+07:00", comments="Source field: tin_dang.Motathem")
    public static final SqlColumn<String> motathem = tinDang.motathem;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.744+07:00", comments="Source Table: tin_dang")
    public static final class TinDang extends SqlTable {
        public final SqlColumn<Integer> pkTindangid = column("PK_tindangID", JDBCType.INTEGER);

        public final SqlColumn<Integer> fkUserid = column("FK_userID", JDBCType.INTEGER);

        public final SqlColumn<Date> ngaydangtin = column("Ngaydangtin", JDBCType.DATE);

        public final SqlColumn<Integer> songaydang = column("Songaydang", JDBCType.INTEGER);

        public final SqlColumn<Integer> totalview = column("Totalview", JDBCType.INTEGER);

        public final SqlColumn<String> tieudetin = column("Tieudetin", JDBCType.VARCHAR);

        public final SqlColumn<Integer> fkQuanid = column("FK_quanID", JDBCType.INTEGER);

        public final SqlColumn<String> street = column("Street", JDBCType.VARCHAR);

        public final SqlColumn<Integer> fkLoaigiaodichid = column("FK_loaigiaodichID", JDBCType.INTEGER);

        public final SqlColumn<Integer> fkLoaibatdongsanid = column("FK_loaibatdongsanID", JDBCType.INTEGER);

        public final SqlColumn<Double> gia = column("Gia", JDBCType.DOUBLE);

        public final SqlColumn<Integer> dientich = column("Dientich", JDBCType.INTEGER);

        public final SqlColumn<Integer> fkTinhtrangphaplyid = column("FK_tinhtrangphaplyID", JDBCType.INTEGER);

        public final SqlColumn<Integer> sophongngu = column("Sophongngu", JDBCType.INTEGER);

        public final SqlColumn<Integer> sophongtam = column("Sophongtam", JDBCType.INTEGER);

        public final SqlColumn<Integer> sotang = column("Sotang", JDBCType.INTEGER);

        public final SqlColumn<Integer> tongsophong = column("Tongsophong", JDBCType.INTEGER);

        public final SqlColumn<String> anhmattien = column("Anhmattien", JDBCType.VARCHAR);

        public final SqlColumn<String> motathem = column("Motathem", JDBCType.VARCHAR);

        public TinDang() {
            super("tin_dang");
        }
    }
}