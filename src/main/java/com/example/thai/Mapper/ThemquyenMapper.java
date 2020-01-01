package com.example.thai.Mapper;

import static com.example.thai.Mapper.ThemquyenDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.example.thai.entity.Themquyen;
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
public interface ThemquyenMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.756+07:00", comments="Source Table: themquyen")
    BasicColumn[] selectList = BasicColumn.columnList(pkThemquyenid, fkUserid, quyenid);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.754+07:00", comments="Source Table: themquyen")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.754+07:00", comments="Source Table: themquyen")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.755+07:00", comments="Source Table: themquyen")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<Themquyen> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.755+07:00", comments="Source Table: themquyen")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<Themquyen> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.755+07:00", comments="Source Table: themquyen")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("ThemquyenResult")
    Optional<Themquyen> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.755+07:00", comments="Source Table: themquyen")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="ThemquyenResult", value = {
        @Result(column="PK_ThemQuyenID", property="pkThemquyenid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="FK_UserID", property="fkUserid", jdbcType=JdbcType.INTEGER),
        @Result(column="QuyenID", property="quyenid", jdbcType=JdbcType.INTEGER)
    })
    List<Themquyen> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.755+07:00", comments="Source Table: themquyen")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.755+07:00", comments="Source Table: themquyen")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, themquyen, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.755+07:00", comments="Source Table: themquyen")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, themquyen, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.755+07:00", comments="Source Table: themquyen")
    default int deleteByPrimaryKey(Integer pkThemquyenid_) {
        return delete(c -> 
            c.where(pkThemquyenid, isEqualTo(pkThemquyenid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.755+07:00", comments="Source Table: themquyen")
    default int insert(Themquyen record) {
        return MyBatis3Utils.insert(this::insert, record, themquyen, c ->
            c.map(pkThemquyenid).toProperty("pkThemquyenid")
            .map(fkUserid).toProperty("fkUserid")
            .map(quyenid).toProperty("quyenid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.755+07:00", comments="Source Table: themquyen")
    default int insertMultiple(Collection<Themquyen> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, themquyen, c ->
            c.map(pkThemquyenid).toProperty("pkThemquyenid")
            .map(fkUserid).toProperty("fkUserid")
            .map(quyenid).toProperty("quyenid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.755+07:00", comments="Source Table: themquyen")
    default int insertSelective(Themquyen record) {
        return MyBatis3Utils.insert(this::insert, record, themquyen, c ->
            c.map(pkThemquyenid).toPropertyWhenPresent("pkThemquyenid", record::getPkThemquyenid)
            .map(fkUserid).toPropertyWhenPresent("fkUserid", record::getFkUserid)
            .map(quyenid).toPropertyWhenPresent("quyenid", record::getQuyenid)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.756+07:00", comments="Source Table: themquyen")
    default Optional<Themquyen> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, themquyen, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.756+07:00", comments="Source Table: themquyen")
    default List<Themquyen> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, themquyen, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.756+07:00", comments="Source Table: themquyen")
    default List<Themquyen> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, themquyen, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.756+07:00", comments="Source Table: themquyen")
    default Optional<Themquyen> selectByPrimaryKey(Integer pkThemquyenid_) {
        return selectOne(c ->
            c.where(pkThemquyenid, isEqualTo(pkThemquyenid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.756+07:00", comments="Source Table: themquyen")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, themquyen, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.756+07:00", comments="Source Table: themquyen")
    static UpdateDSL<UpdateModel> updateAllColumns(Themquyen record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(pkThemquyenid).equalTo(record::getPkThemquyenid)
                .set(fkUserid).equalTo(record::getFkUserid)
                .set(quyenid).equalTo(record::getQuyenid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.756+07:00", comments="Source Table: themquyen")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(Themquyen record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(pkThemquyenid).equalToWhenPresent(record::getPkThemquyenid)
                .set(fkUserid).equalToWhenPresent(record::getFkUserid)
                .set(quyenid).equalToWhenPresent(record::getQuyenid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.756+07:00", comments="Source Table: themquyen")
    default int updateByPrimaryKey(Themquyen record) {
        return update(c ->
            c.set(fkUserid).equalTo(record::getFkUserid)
            .set(quyenid).equalTo(record::getQuyenid)
            .where(pkThemquyenid, isEqualTo(record::getPkThemquyenid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.756+07:00", comments="Source Table: themquyen")
    default int updateByPrimaryKeySelective(Themquyen record) {
        return update(c ->
            c.set(fkUserid).equalToWhenPresent(record::getFkUserid)
            .set(quyenid).equalToWhenPresent(record::getQuyenid)
            .where(pkThemquyenid, isEqualTo(record::getPkThemquyenid))
        );
    }
}