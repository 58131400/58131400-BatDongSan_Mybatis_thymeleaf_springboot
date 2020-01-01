package com.example.thai.Mapper;

import static com.example.thai.Mapper.UserDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.example.thai.entity.User;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;
import org.mybatis.dynamic.sql.BasicColumn;
import org.mybatis.dynamic.sql.delete.DeleteDSLCompleter;
import org.mybatis.dynamic.sql.delete.render.DeleteStatementProvider;
import org.mybatis.dynamic.sql.insert.render.InsertStatementProvider;
import org.mybatis.dynamic.sql.insert.render.MultiRowInsertStatementProvider;
import org.mybatis.dynamic.sql.select.CountDSLCompleter;
import org.mybatis.dynamic.sql.select.SelectDSLCompleter;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.mybatis.dynamic.sql.update.UpdateDSL;
import org.mybatis.dynamic.sql.update.UpdateDSLCompleter;
import org.mybatis.dynamic.sql.update.UpdateModel;
import org.mybatis.dynamic.sql.update.render.UpdateStatementProvider;
import org.mybatis.dynamic.sql.util.SqlProviderAdapter;
import org.mybatis.dynamic.sql.util.mybatis3.MyBatis3Utils;

@Mapper
public interface UserMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.739+07:00", comments="Source Table: user")
    BasicColumn[] selectList = BasicColumn.columnList(pkUserid, useremail, userpassword, fullname, ngaysinh, sdt, diachi, fkNhomnguoidungid, userstatus, ngaydangki, newsletter, avatar);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.737+07:00", comments="Source Table: user")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.738+07:00", comments="Source Table: user")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.738+07:00", comments="Source Table: user")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<User> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.738+07:00", comments="Source Table: user")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<User> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.738+07:00", comments="Source Table: user")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("UserResult")
    Optional<User> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.738+07:00", comments="Source Table: user")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="UserResult", value = {
        @Result(column="PK_UserID", property="pkUserid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="UserEmail", property="useremail", jdbcType=JdbcType.VARCHAR),
        @Result(column="UserPassword", property="userpassword", jdbcType=JdbcType.VARCHAR),
        @Result(column="FullName", property="fullname", jdbcType=JdbcType.VARCHAR),
        @Result(column="NgaySinh", property="ngaysinh", jdbcType=JdbcType.DATE),
        @Result(column="SDT", property="sdt", jdbcType=JdbcType.VARCHAR),
        @Result(column="DiaChi", property="diachi", jdbcType=JdbcType.VARCHAR),
        @Result(column="FK_NhomNguoiDungID", property="fkNhomnguoidungid", jdbcType=JdbcType.INTEGER),
        @Result(column="UserStatus", property="userstatus", jdbcType=JdbcType.BIT),
        @Result(column="NgayDangKi", property="ngaydangki", jdbcType=JdbcType.DATE),
        @Result(column="NewsLetter", property="newsletter", jdbcType=JdbcType.BIT),
        @Result(column="Avatar", property="avatar", jdbcType=JdbcType.VARCHAR)
    })
    List<User> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.738+07:00", comments="Source Table: user")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.738+07:00", comments="Source Table: user")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, user, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.738+07:00", comments="Source Table: user")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, user, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.738+07:00", comments="Source Table: user")
    default int deleteByPrimaryKey(Integer pkUserid_) {
        return delete(c -> 
            c.where(pkUserid, isEqualTo(pkUserid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.738+07:00", comments="Source Table: user")
    default int insert(User record) {
        return MyBatis3Utils.insert(this::insert, record, user, c ->
            c.map(pkUserid).toProperty("pkUserid")
            .map(useremail).toProperty("useremail")
            .map(userpassword).toProperty("userpassword")
            .map(fullname).toProperty("fullname")
            .map(ngaysinh).toProperty("ngaysinh")
            .map(sdt).toProperty("sdt")
            .map(diachi).toProperty("diachi")
            .map(fkNhomnguoidungid).toProperty("fkNhomnguoidungid")
            .map(userstatus).toProperty("userstatus")
            .map(ngaydangki).toProperty("ngaydangki")
            .map(newsletter).toProperty("newsletter")
            .map(avatar).toProperty("avatar")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.738+07:00", comments="Source Table: user")
    default int insertMultiple(Collection<User> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, user, c ->
            c.map(pkUserid).toProperty("pkUserid")
            .map(useremail).toProperty("useremail")
            .map(userpassword).toProperty("userpassword")
            .map(fullname).toProperty("fullname")
            .map(ngaysinh).toProperty("ngaysinh")
            .map(sdt).toProperty("sdt")
            .map(diachi).toProperty("diachi")
            .map(fkNhomnguoidungid).toProperty("fkNhomnguoidungid")
            .map(userstatus).toProperty("userstatus")
            .map(ngaydangki).toProperty("ngaydangki")
            .map(newsletter).toProperty("newsletter")
            .map(avatar).toProperty("avatar")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.739+07:00", comments="Source Table: user")
    default int insertSelective(User record) {
        return MyBatis3Utils.insert(this::insert, record, user, c ->
            c.map(pkUserid).toPropertyWhenPresent("pkUserid", record::getPkUserid)
            .map(useremail).toPropertyWhenPresent("useremail", record::getUseremail)
            .map(userpassword).toPropertyWhenPresent("userpassword", record::getUserpassword)
            .map(fullname).toPropertyWhenPresent("fullname", record::getFullname)
            .map(ngaysinh).toPropertyWhenPresent("ngaysinh", record::getNgaysinh)
            .map(sdt).toPropertyWhenPresent("sdt", record::getSdt)
            .map(diachi).toPropertyWhenPresent("diachi", record::getDiachi)
            .map(fkNhomnguoidungid).toPropertyWhenPresent("fkNhomnguoidungid", record::getFkNhomnguoidungid)
            .map(userstatus).toPropertyWhenPresent("userstatus", record::getUserstatus)
            .map(ngaydangki).toPropertyWhenPresent("ngaydangki", record::getNgaydangki)
            .map(newsletter).toPropertyWhenPresent("newsletter", record::getNewsletter)
            .map(avatar).toPropertyWhenPresent("avatar", record::getAvatar)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.74+07:00", comments="Source Table: user")
    default Optional<User> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, user, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.74+07:00", comments="Source Table: user")
    default List<User> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, user, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.74+07:00", comments="Source Table: user")
    default List<User> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, user, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.74+07:00", comments="Source Table: user")
    default Optional<User> selectByPrimaryKey(Integer pkUserid_) {
        return selectOne(c ->
            c.where(pkUserid, isEqualTo(pkUserid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.74+07:00", comments="Source Table: user")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, user, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.74+07:00", comments="Source Table: user")
    static UpdateDSL<UpdateModel> updateAllColumns(User record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(pkUserid).equalTo(record::getPkUserid)
                .set(useremail).equalTo(record::getUseremail)
                .set(userpassword).equalTo(record::getUserpassword)
                .set(fullname).equalTo(record::getFullname)
                .set(ngaysinh).equalTo(record::getNgaysinh)
                .set(sdt).equalTo(record::getSdt)
                .set(diachi).equalTo(record::getDiachi)
                .set(fkNhomnguoidungid).equalTo(record::getFkNhomnguoidungid)
                .set(userstatus).equalTo(record::getUserstatus)
                .set(ngaydangki).equalTo(record::getNgaydangki)
                .set(newsletter).equalTo(record::getNewsletter)
                .set(avatar).equalTo(record::getAvatar);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.74+07:00", comments="Source Table: user")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(User record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(pkUserid).equalToWhenPresent(record::getPkUserid)
                .set(useremail).equalToWhenPresent(record::getUseremail)
                .set(userpassword).equalToWhenPresent(record::getUserpassword)
                .set(fullname).equalToWhenPresent(record::getFullname)
                .set(ngaysinh).equalToWhenPresent(record::getNgaysinh)
                .set(sdt).equalToWhenPresent(record::getSdt)
                .set(diachi).equalToWhenPresent(record::getDiachi)
                .set(fkNhomnguoidungid).equalToWhenPresent(record::getFkNhomnguoidungid)
                .set(userstatus).equalToWhenPresent(record::getUserstatus)
                .set(ngaydangki).equalToWhenPresent(record::getNgaydangki)
                .set(newsletter).equalToWhenPresent(record::getNewsletter)
                .set(avatar).equalToWhenPresent(record::getAvatar);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.74+07:00", comments="Source Table: user")
    default int updateByPrimaryKey(User record) {
        return update(c ->
            c.set(useremail).equalTo(record::getUseremail)
            .set(userpassword).equalTo(record::getUserpassword)
            .set(fullname).equalTo(record::getFullname)
            .set(ngaysinh).equalTo(record::getNgaysinh)
            .set(sdt).equalTo(record::getSdt)
            .set(diachi).equalTo(record::getDiachi)
            .set(fkNhomnguoidungid).equalTo(record::getFkNhomnguoidungid)
            .set(userstatus).equalTo(record::getUserstatus)
            .set(ngaydangki).equalTo(record::getNgaydangki)
            .set(newsletter).equalTo(record::getNewsletter)
            .set(avatar).equalTo(record::getAvatar)
            .where(pkUserid, isEqualTo(record::getPkUserid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.74+07:00", comments="Source Table: user")
    default int updateByPrimaryKeySelective(User record) {
        return update(c ->
            c.set(useremail).equalToWhenPresent(record::getUseremail)
            .set(userpassword).equalToWhenPresent(record::getUserpassword)
            .set(fullname).equalToWhenPresent(record::getFullname)
            .set(ngaysinh).equalToWhenPresent(record::getNgaysinh)
            .set(sdt).equalToWhenPresent(record::getSdt)
            .set(diachi).equalToWhenPresent(record::getDiachi)
            .set(fkNhomnguoidungid).equalToWhenPresent(record::getFkNhomnguoidungid)
            .set(userstatus).equalToWhenPresent(record::getUserstatus)
            .set(ngaydangki).equalToWhenPresent(record::getNgaydangki)
            .set(newsletter).equalToWhenPresent(record::getNewsletter)
            .set(avatar).equalToWhenPresent(record::getAvatar)
            .where(pkUserid, isEqualTo(record::getPkUserid))
        );
    }
}