package com.example.thai.Mapper;

import static com.example.thai.Mapper.TintucDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.example.thai.entity.Tintuc;
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
public interface TintucMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.75+07:00", comments="Source Table: tintuc")
    BasicColumn[] selectList = BasicColumn.columnList(pkTintucid, tieude, fkUserid, thoigian, anh, noidung);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.749+07:00", comments="Source Table: tintuc")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.75+07:00", comments="Source Table: tintuc")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.75+07:00", comments="Source Table: tintuc")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<Tintuc> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.75+07:00", comments="Source Table: tintuc")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<Tintuc> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.75+07:00", comments="Source Table: tintuc")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("TintucResult")
    Optional<Tintuc> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.75+07:00", comments="Source Table: tintuc")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="TintucResult", value = {
        @Result(column="PK_TinTucID", property="pkTintucid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="TieuDe", property="tieude", jdbcType=JdbcType.VARCHAR),
        @Result(column="FK_UserID", property="fkUserid", jdbcType=JdbcType.INTEGER),
        @Result(column="ThoiGian", property="thoigian", jdbcType=JdbcType.DATE),
        @Result(column="Anh", property="anh", jdbcType=JdbcType.VARCHAR),
        @Result(column="NoiDung", property="noidung", jdbcType=JdbcType.LONGVARCHAR)
    })
    List<Tintuc> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.75+07:00", comments="Source Table: tintuc")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.75+07:00", comments="Source Table: tintuc")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, tintuc, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.75+07:00", comments="Source Table: tintuc")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, tintuc, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.75+07:00", comments="Source Table: tintuc")
    default int deleteByPrimaryKey(Integer pkTintucid_) {
        return delete(c -> 
            c.where(pkTintucid, isEqualTo(pkTintucid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.75+07:00", comments="Source Table: tintuc")
    default int insert(Tintuc record) {
        return MyBatis3Utils.insert(this::insert, record, tintuc, c ->
            c.map(pkTintucid).toProperty("pkTintucid")
            .map(tieude).toProperty("tieude")
            .map(fkUserid).toProperty("fkUserid")
            .map(thoigian).toProperty("thoigian")
            .map(anh).toProperty("anh")
            .map(noidung).toProperty("noidung")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.75+07:00", comments="Source Table: tintuc")
    default int insertMultiple(Collection<Tintuc> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, tintuc, c ->
            c.map(pkTintucid).toProperty("pkTintucid")
            .map(tieude).toProperty("tieude")
            .map(fkUserid).toProperty("fkUserid")
            .map(thoigian).toProperty("thoigian")
            .map(anh).toProperty("anh")
            .map(noidung).toProperty("noidung")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.75+07:00", comments="Source Table: tintuc")
    default int insertSelective(Tintuc record) {
        return MyBatis3Utils.insert(this::insert, record, tintuc, c ->
            c.map(pkTintucid).toPropertyWhenPresent("pkTintucid", record::getPkTintucid)
            .map(tieude).toPropertyWhenPresent("tieude", record::getTieude)
            .map(fkUserid).toPropertyWhenPresent("fkUserid", record::getFkUserid)
            .map(thoigian).toPropertyWhenPresent("thoigian", record::getThoigian)
            .map(anh).toPropertyWhenPresent("anh", record::getAnh)
            .map(noidung).toPropertyWhenPresent("noidung", record::getNoidung)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.751+07:00", comments="Source Table: tintuc")
    default Optional<Tintuc> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, tintuc, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.751+07:00", comments="Source Table: tintuc")
    default List<Tintuc> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, tintuc, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.751+07:00", comments="Source Table: tintuc")
    default List<Tintuc> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, tintuc, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.751+07:00", comments="Source Table: tintuc")
    default Optional<Tintuc> selectByPrimaryKey(Integer pkTintucid_) {
        return selectOne(c ->
            c.where(pkTintucid, isEqualTo(pkTintucid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.751+07:00", comments="Source Table: tintuc")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, tintuc, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.751+07:00", comments="Source Table: tintuc")
    static UpdateDSL<UpdateModel> updateAllColumns(Tintuc record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(pkTintucid).equalTo(record::getPkTintucid)
                .set(tieude).equalTo(record::getTieude)
                .set(fkUserid).equalTo(record::getFkUserid)
                .set(thoigian).equalTo(record::getThoigian)
                .set(anh).equalTo(record::getAnh)
                .set(noidung).equalTo(record::getNoidung);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.751+07:00", comments="Source Table: tintuc")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(Tintuc record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(pkTintucid).equalToWhenPresent(record::getPkTintucid)
                .set(tieude).equalToWhenPresent(record::getTieude)
                .set(fkUserid).equalToWhenPresent(record::getFkUserid)
                .set(thoigian).equalToWhenPresent(record::getThoigian)
                .set(anh).equalToWhenPresent(record::getAnh)
                .set(noidung).equalToWhenPresent(record::getNoidung);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.751+07:00", comments="Source Table: tintuc")
    default int updateByPrimaryKey(Tintuc record) {
        return update(c ->
            c.set(tieude).equalTo(record::getTieude)
            .set(fkUserid).equalTo(record::getFkUserid)
            .set(thoigian).equalTo(record::getThoigian)
            .set(anh).equalTo(record::getAnh)
            .set(noidung).equalTo(record::getNoidung)
            .where(pkTintucid, isEqualTo(record::getPkTintucid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.751+07:00", comments="Source Table: tintuc")
    default int updateByPrimaryKeySelective(Tintuc record) {
        return update(c ->
            c.set(tieude).equalToWhenPresent(record::getTieude)
            .set(fkUserid).equalToWhenPresent(record::getFkUserid)
            .set(thoigian).equalToWhenPresent(record::getThoigian)
            .set(anh).equalToWhenPresent(record::getAnh)
            .set(noidung).equalToWhenPresent(record::getNoidung)
            .where(pkTintucid, isEqualTo(record::getPkTintucid))
        );
    }
}