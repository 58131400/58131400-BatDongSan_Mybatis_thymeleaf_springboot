package com.example.thai.Mapper;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class UserDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.736+07:00", comments="Source Table: user")
    public static final User user = new User();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.736+07:00", comments="Source field: user.PK_UserID")
    public static final SqlColumn<Integer> pkUserid = user.pkUserid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.737+07:00", comments="Source field: user.UserEmail")
    public static final SqlColumn<String> useremail = user.useremail;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.737+07:00", comments="Source field: user.UserPassword")
    public static final SqlColumn<String> userpassword = user.userpassword;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.737+07:00", comments="Source field: user.FullName")
    public static final SqlColumn<String> fullname = user.fullname;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.737+07:00", comments="Source field: user.NgaySinh")
    public static final SqlColumn<Date> ngaysinh = user.ngaysinh;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.737+07:00", comments="Source field: user.SDT")
    public static final SqlColumn<String> sdt = user.sdt;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.737+07:00", comments="Source field: user.DiaChi")
    public static final SqlColumn<String> diachi = user.diachi;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.737+07:00", comments="Source field: user.FK_NhomNguoiDungID")
    public static final SqlColumn<Integer> fkNhomnguoidungid = user.fkNhomnguoidungid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.737+07:00", comments="Source field: user.UserStatus")
    public static final SqlColumn<Boolean> userstatus = user.userstatus;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.737+07:00", comments="Source field: user.NgayDangKi")
    public static final SqlColumn<Date> ngaydangki = user.ngaydangki;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.737+07:00", comments="Source field: user.NewsLetter")
    public static final SqlColumn<Boolean> newsletter = user.newsletter;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.737+07:00", comments="Source field: user.Avatar")
    public static final SqlColumn<String> avatar = user.avatar;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.736+07:00", comments="Source Table: user")
    public static final class User extends SqlTable {
        public final SqlColumn<Integer> pkUserid = column("PK_UserID", JDBCType.INTEGER);

        public final SqlColumn<String> useremail = column("UserEmail", JDBCType.VARCHAR);

        public final SqlColumn<String> userpassword = column("UserPassword", JDBCType.VARCHAR);

        public final SqlColumn<String> fullname = column("FullName", JDBCType.VARCHAR);

        public final SqlColumn<Date> ngaysinh = column("NgaySinh", JDBCType.DATE);

        public final SqlColumn<String> sdt = column("SDT", JDBCType.VARCHAR);

        public final SqlColumn<String> diachi = column("DiaChi", JDBCType.VARCHAR);

        public final SqlColumn<Integer> fkNhomnguoidungid = column("FK_NhomNguoiDungID", JDBCType.INTEGER);

        public final SqlColumn<Boolean> userstatus = column("UserStatus", JDBCType.BIT);

        public final SqlColumn<Date> ngaydangki = column("NgayDangKi", JDBCType.DATE);

        public final SqlColumn<Boolean> newsletter = column("NewsLetter", JDBCType.BIT);

        public final SqlColumn<String> avatar = column("Avatar", JDBCType.VARCHAR);

        public User() {
            super("user");
        }
    }
}