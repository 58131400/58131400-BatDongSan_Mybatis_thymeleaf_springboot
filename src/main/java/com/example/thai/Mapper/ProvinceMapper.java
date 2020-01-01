package com.example.thai.Mapper;

import static com.example.thai.Mapper.ProvinceDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.example.thai.entity.Province;
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
public interface ProvinceMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.763+07:00", comments="Source Table: province")
    BasicColumn[] selectList = BasicColumn.columnList(pkProvinceid, ten);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.762+07:00", comments="Source Table: province")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.762+07:00", comments="Source Table: province")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.762+07:00", comments="Source Table: province")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<Province> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.762+07:00", comments="Source Table: province")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<Province> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.762+07:00", comments="Source Table: province")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("ProvinceResult")
    Optional<Province> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.763+07:00", comments="Source Table: province")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="ProvinceResult", value = {
        @Result(column="PK_ProvinceID", property="pkProvinceid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="Ten", property="ten", jdbcType=JdbcType.VARCHAR)
    })
    List<Province> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.763+07:00", comments="Source Table: province")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.763+07:00", comments="Source Table: province")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, province, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.763+07:00", comments="Source Table: province")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, province, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.763+07:00", comments="Source Table: province")
    default int deleteByPrimaryKey(Integer pkProvinceid_) {
        return delete(c -> 
            c.where(pkProvinceid, isEqualTo(pkProvinceid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.763+07:00", comments="Source Table: province")
    default int insert(Province record) {
        return MyBatis3Utils.insert(this::insert, record, province, c ->
            c.map(pkProvinceid).toProperty("pkProvinceid")
            .map(ten).toProperty("ten")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.763+07:00", comments="Source Table: province")
    default int insertMultiple(Collection<Province> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, province, c ->
            c.map(pkProvinceid).toProperty("pkProvinceid")
            .map(ten).toProperty("ten")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.763+07:00", comments="Source Table: province")
    default int insertSelective(Province record) {
        return MyBatis3Utils.insert(this::insert, record, province, c ->
            c.map(pkProvinceid).toPropertyWhenPresent("pkProvinceid", record::getPkProvinceid)
            .map(ten).toPropertyWhenPresent("ten", record::getTen)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.763+07:00", comments="Source Table: province")
    default Optional<Province> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, province, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.763+07:00", comments="Source Table: province")
    default List<Province> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, province, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.763+07:00", comments="Source Table: province")
    default List<Province> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, province, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.763+07:00", comments="Source Table: province")
    default Optional<Province> selectByPrimaryKey(Integer pkProvinceid_) {
        return selectOne(c ->
            c.where(pkProvinceid, isEqualTo(pkProvinceid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.763+07:00", comments="Source Table: province")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, province, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.763+07:00", comments="Source Table: province")
    static UpdateDSL<UpdateModel> updateAllColumns(Province record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(pkProvinceid).equalTo(record::getPkProvinceid)
                .set(ten).equalTo(record::getTen);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.763+07:00", comments="Source Table: province")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(Province record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(pkProvinceid).equalToWhenPresent(record::getPkProvinceid)
                .set(ten).equalToWhenPresent(record::getTen);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.763+07:00", comments="Source Table: province")
    default int updateByPrimaryKey(Province record) {
        return update(c ->
            c.set(ten).equalTo(record::getTen)
            .where(pkProvinceid, isEqualTo(record::getPkProvinceid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.764+07:00", comments="Source Table: province")
    default int updateByPrimaryKeySelective(Province record) {
        return update(c ->
            c.set(ten).equalToWhenPresent(record::getTen)
            .where(pkProvinceid, isEqualTo(record::getPkProvinceid))
        );
    }
}