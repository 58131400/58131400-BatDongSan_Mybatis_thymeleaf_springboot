package com.example.thai.Mapper;

import static com.example.thai.Mapper.LoaibdsDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.example.thai.entity.Loaibds;
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
public interface LoaibdsMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.774+07:00", comments="Source Table: loaibds")
    BasicColumn[] selectList = BasicColumn.columnList(pkLoaibdsId, ten);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.773+07:00", comments="Source Table: loaibds")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.773+07:00", comments="Source Table: loaibds")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.773+07:00", comments="Source Table: loaibds")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<Loaibds> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.773+07:00", comments="Source Table: loaibds")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<Loaibds> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.773+07:00", comments="Source Table: loaibds")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("LoaibdsResult")
    Optional<Loaibds> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.773+07:00", comments="Source Table: loaibds")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="LoaibdsResult", value = {
        @Result(column="PK_LoaiBDS_ID", property="pkLoaibdsId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="Ten", property="ten", jdbcType=JdbcType.VARCHAR)
    })
    List<Loaibds> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.773+07:00", comments="Source Table: loaibds")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.773+07:00", comments="Source Table: loaibds")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, loaibds, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.773+07:00", comments="Source Table: loaibds")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, loaibds, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.773+07:00", comments="Source Table: loaibds")
    default int deleteByPrimaryKey(Integer pkLoaibdsId_) {
        return delete(c -> 
            c.where(pkLoaibdsId, isEqualTo(pkLoaibdsId_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.773+07:00", comments="Source Table: loaibds")
    default int insert(Loaibds record) {
        return MyBatis3Utils.insert(this::insert, record, loaibds, c ->
            c.map(pkLoaibdsId).toProperty("pkLoaibdsId")
            .map(ten).toProperty("ten")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.773+07:00", comments="Source Table: loaibds")
    default int insertMultiple(Collection<Loaibds> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, loaibds, c ->
            c.map(pkLoaibdsId).toProperty("pkLoaibdsId")
            .map(ten).toProperty("ten")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.773+07:00", comments="Source Table: loaibds")
    default int insertSelective(Loaibds record) {
        return MyBatis3Utils.insert(this::insert, record, loaibds, c ->
            c.map(pkLoaibdsId).toPropertyWhenPresent("pkLoaibdsId", record::getPkLoaibdsId)
            .map(ten).toPropertyWhenPresent("ten", record::getTen)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.774+07:00", comments="Source Table: loaibds")
    default Optional<Loaibds> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, loaibds, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.774+07:00", comments="Source Table: loaibds")
    default List<Loaibds> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, loaibds, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.774+07:00", comments="Source Table: loaibds")
    default List<Loaibds> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, loaibds, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.774+07:00", comments="Source Table: loaibds")
    default Optional<Loaibds> selectByPrimaryKey(Integer pkLoaibdsId_) {
        return selectOne(c ->
            c.where(pkLoaibdsId, isEqualTo(pkLoaibdsId_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.774+07:00", comments="Source Table: loaibds")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, loaibds, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.774+07:00", comments="Source Table: loaibds")
    static UpdateDSL<UpdateModel> updateAllColumns(Loaibds record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(pkLoaibdsId).equalTo(record::getPkLoaibdsId)
                .set(ten).equalTo(record::getTen);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.774+07:00", comments="Source Table: loaibds")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(Loaibds record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(pkLoaibdsId).equalToWhenPresent(record::getPkLoaibdsId)
                .set(ten).equalToWhenPresent(record::getTen);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.774+07:00", comments="Source Table: loaibds")
    default int updateByPrimaryKey(Loaibds record) {
        return update(c ->
            c.set(ten).equalTo(record::getTen)
            .where(pkLoaibdsId, isEqualTo(record::getPkLoaibdsId))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.774+07:00", comments="Source Table: loaibds")
    default int updateByPrimaryKeySelective(Loaibds record) {
        return update(c ->
            c.set(ten).equalToWhenPresent(record::getTen)
            .where(pkLoaibdsId, isEqualTo(record::getPkLoaibdsId))
        );
    }
}