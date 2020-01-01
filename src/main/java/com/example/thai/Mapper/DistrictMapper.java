package com.example.thai.Mapper;

import static com.example.thai.Mapper.DistrictDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.example.thai.entity.District;
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
public interface DistrictMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.782+07:00", comments="Source Table: district")
    BasicColumn[] selectList = BasicColumn.columnList(pkDistrictid, ten, fkProvinceid);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.781+07:00", comments="Source Table: district")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.781+07:00", comments="Source Table: district")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.781+07:00", comments="Source Table: district")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<District> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.781+07:00", comments="Source Table: district")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<District> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.781+07:00", comments="Source Table: district")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("DistrictResult")
    Optional<District> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.781+07:00", comments="Source Table: district")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="DistrictResult", value = {
        @Result(column="PK_DistrictID", property="pkDistrictid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="Ten", property="ten", jdbcType=JdbcType.VARCHAR),
        @Result(column="FK_ProvinceID", property="fkProvinceid", jdbcType=JdbcType.INTEGER)
    })
    List<District> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.781+07:00", comments="Source Table: district")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.781+07:00", comments="Source Table: district")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, district, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.781+07:00", comments="Source Table: district")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, district, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.781+07:00", comments="Source Table: district")
    default int deleteByPrimaryKey(Integer pkDistrictid_) {
        return delete(c -> 
            c.where(pkDistrictid, isEqualTo(pkDistrictid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.781+07:00", comments="Source Table: district")
    default int insert(District record) {
        return MyBatis3Utils.insert(this::insert, record, district, c ->
            c.map(pkDistrictid).toProperty("pkDistrictid")
            .map(ten).toProperty("ten")
            .map(fkProvinceid).toProperty("fkProvinceid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.781+07:00", comments="Source Table: district")
    default int insertMultiple(Collection<District> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, district, c ->
            c.map(pkDistrictid).toProperty("pkDistrictid")
            .map(ten).toProperty("ten")
            .map(fkProvinceid).toProperty("fkProvinceid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.781+07:00", comments="Source Table: district")
    default int insertSelective(District record) {
        return MyBatis3Utils.insert(this::insert, record, district, c ->
            c.map(pkDistrictid).toPropertyWhenPresent("pkDistrictid", record::getPkDistrictid)
            .map(ten).toPropertyWhenPresent("ten", record::getTen)
            .map(fkProvinceid).toPropertyWhenPresent("fkProvinceid", record::getFkProvinceid)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.782+07:00", comments="Source Table: district")
    default Optional<District> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, district, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.782+07:00", comments="Source Table: district")
    default List<District> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, district, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.782+07:00", comments="Source Table: district")
    default List<District> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, district, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.782+07:00", comments="Source Table: district")
    default Optional<District> selectByPrimaryKey(Integer pkDistrictid_) {
        return selectOne(c ->
            c.where(pkDistrictid, isEqualTo(pkDistrictid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.782+07:00", comments="Source Table: district")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, district, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.782+07:00", comments="Source Table: district")
    static UpdateDSL<UpdateModel> updateAllColumns(District record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(pkDistrictid).equalTo(record::getPkDistrictid)
                .set(ten).equalTo(record::getTen)
                .set(fkProvinceid).equalTo(record::getFkProvinceid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.782+07:00", comments="Source Table: district")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(District record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(pkDistrictid).equalToWhenPresent(record::getPkDistrictid)
                .set(ten).equalToWhenPresent(record::getTen)
                .set(fkProvinceid).equalToWhenPresent(record::getFkProvinceid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.782+07:00", comments="Source Table: district")
    default int updateByPrimaryKey(District record) {
        return update(c ->
            c.set(ten).equalTo(record::getTen)
            .set(fkProvinceid).equalTo(record::getFkProvinceid)
            .where(pkDistrictid, isEqualTo(record::getPkDistrictid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.782+07:00", comments="Source Table: district")
    default int updateByPrimaryKeySelective(District record) {
        return update(c ->
            c.set(ten).equalToWhenPresent(record::getTen)
            .set(fkProvinceid).equalToWhenPresent(record::getFkProvinceid)
            .where(pkDistrictid, isEqualTo(record::getPkDistrictid))
        );
    }
}