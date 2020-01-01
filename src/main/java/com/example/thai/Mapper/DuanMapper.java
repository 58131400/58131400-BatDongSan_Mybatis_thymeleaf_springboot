package com.example.thai.Mapper;

import static com.example.thai.Mapper.DuanDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.example.thai.entity.Duan;
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
public interface DuanMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.779+07:00", comments="Source Table: duan")
    BasicColumn[] selectList = BasicColumn.columnList(pkDuanid, fkUserid, tieude, anh, thoigian, noidung);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.778+07:00", comments="Source Table: duan")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.778+07:00", comments="Source Table: duan")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.778+07:00", comments="Source Table: duan")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<Duan> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.778+07:00", comments="Source Table: duan")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<Duan> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.778+07:00", comments="Source Table: duan")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("DuanResult")
    Optional<Duan> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.778+07:00", comments="Source Table: duan")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="DuanResult", value = {
        @Result(column="PK_DuAnID", property="pkDuanid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="FK_UserID", property="fkUserid", jdbcType=JdbcType.INTEGER),
        @Result(column="TieuDe", property="tieude", jdbcType=JdbcType.VARCHAR),
        @Result(column="Anh", property="anh", jdbcType=JdbcType.VARCHAR),
        @Result(column="ThoiGian", property="thoigian", jdbcType=JdbcType.DATE),
        @Result(column="NoiDung", property="noidung", jdbcType=JdbcType.LONGVARCHAR)
    })
    List<Duan> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.778+07:00", comments="Source Table: duan")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.778+07:00", comments="Source Table: duan")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, duan, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.779+07:00", comments="Source Table: duan")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, duan, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.779+07:00", comments="Source Table: duan")
    default int deleteByPrimaryKey(Integer pkDuanid_) {
        return delete(c -> 
            c.where(pkDuanid, isEqualTo(pkDuanid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.779+07:00", comments="Source Table: duan")
    default int insert(Duan record) {
        return MyBatis3Utils.insert(this::insert, record, duan, c ->
            c.map(pkDuanid).toProperty("pkDuanid")
            .map(fkUserid).toProperty("fkUserid")
            .map(tieude).toProperty("tieude")
            .map(anh).toProperty("anh")
            .map(thoigian).toProperty("thoigian")
            .map(noidung).toProperty("noidung")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.779+07:00", comments="Source Table: duan")
    default int insertMultiple(Collection<Duan> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, duan, c ->
            c.map(pkDuanid).toProperty("pkDuanid")
            .map(fkUserid).toProperty("fkUserid")
            .map(tieude).toProperty("tieude")
            .map(anh).toProperty("anh")
            .map(thoigian).toProperty("thoigian")
            .map(noidung).toProperty("noidung")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.779+07:00", comments="Source Table: duan")
    default int insertSelective(Duan record) {
        return MyBatis3Utils.insert(this::insert, record, duan, c ->
            c.map(pkDuanid).toPropertyWhenPresent("pkDuanid", record::getPkDuanid)
            .map(fkUserid).toPropertyWhenPresent("fkUserid", record::getFkUserid)
            .map(tieude).toPropertyWhenPresent("tieude", record::getTieude)
            .map(anh).toPropertyWhenPresent("anh", record::getAnh)
            .map(thoigian).toPropertyWhenPresent("thoigian", record::getThoigian)
            .map(noidung).toPropertyWhenPresent("noidung", record::getNoidung)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.779+07:00", comments="Source Table: duan")
    default Optional<Duan> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, duan, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.779+07:00", comments="Source Table: duan")
    default List<Duan> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, duan, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.779+07:00", comments="Source Table: duan")
    default List<Duan> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, duan, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.779+07:00", comments="Source Table: duan")
    default Optional<Duan> selectByPrimaryKey(Integer pkDuanid_) {
        return selectOne(c ->
            c.where(pkDuanid, isEqualTo(pkDuanid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.779+07:00", comments="Source Table: duan")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, duan, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.779+07:00", comments="Source Table: duan")
    static UpdateDSL<UpdateModel> updateAllColumns(Duan record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(pkDuanid).equalTo(record::getPkDuanid)
                .set(fkUserid).equalTo(record::getFkUserid)
                .set(tieude).equalTo(record::getTieude)
                .set(anh).equalTo(record::getAnh)
                .set(thoigian).equalTo(record::getThoigian)
                .set(noidung).equalTo(record::getNoidung);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.779+07:00", comments="Source Table: duan")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(Duan record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(pkDuanid).equalToWhenPresent(record::getPkDuanid)
                .set(fkUserid).equalToWhenPresent(record::getFkUserid)
                .set(tieude).equalToWhenPresent(record::getTieude)
                .set(anh).equalToWhenPresent(record::getAnh)
                .set(thoigian).equalToWhenPresent(record::getThoigian)
                .set(noidung).equalToWhenPresent(record::getNoidung);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.779+07:00", comments="Source Table: duan")
    default int updateByPrimaryKey(Duan record) {
        return update(c ->
            c.set(fkUserid).equalTo(record::getFkUserid)
            .set(tieude).equalTo(record::getTieude)
            .set(anh).equalTo(record::getAnh)
            .set(thoigian).equalTo(record::getThoigian)
            .set(noidung).equalTo(record::getNoidung)
            .where(pkDuanid, isEqualTo(record::getPkDuanid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.779+07:00", comments="Source Table: duan")
    default int updateByPrimaryKeySelective(Duan record) {
        return update(c ->
            c.set(fkUserid).equalToWhenPresent(record::getFkUserid)
            .set(tieude).equalToWhenPresent(record::getTieude)
            .set(anh).equalToWhenPresent(record::getAnh)
            .set(thoigian).equalToWhenPresent(record::getThoigian)
            .set(noidung).equalToWhenPresent(record::getNoidung)
            .where(pkDuanid, isEqualTo(record::getPkDuanid))
        );
    }
}