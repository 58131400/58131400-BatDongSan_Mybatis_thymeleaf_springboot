package com.example.thai.Mapper;

import static com.example.thai.Mapper.TinhtrangphaplyDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.example.thai.entity.Tinhtrangphaply;
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
public interface TinhtrangphaplyMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.753+07:00", comments="Source Table: tinhtrangphaply")
    BasicColumn[] selectList = BasicColumn.columnList(pkTinhtrangphaplyId, ten);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.752+07:00", comments="Source Table: tinhtrangphaply")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.752+07:00", comments="Source Table: tinhtrangphaply")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.752+07:00", comments="Source Table: tinhtrangphaply")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<Tinhtrangphaply> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.752+07:00", comments="Source Table: tinhtrangphaply")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<Tinhtrangphaply> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.752+07:00", comments="Source Table: tinhtrangphaply")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("TinhtrangphaplyResult")
    Optional<Tinhtrangphaply> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.752+07:00", comments="Source Table: tinhtrangphaply")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="TinhtrangphaplyResult", value = {
        @Result(column="PK_TinhTrangPhapLy_ID", property="pkTinhtrangphaplyId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="Ten", property="ten", jdbcType=JdbcType.VARCHAR)
    })
    List<Tinhtrangphaply> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.752+07:00", comments="Source Table: tinhtrangphaply")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.753+07:00", comments="Source Table: tinhtrangphaply")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, tinhtrangphaply, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.753+07:00", comments="Source Table: tinhtrangphaply")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, tinhtrangphaply, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.753+07:00", comments="Source Table: tinhtrangphaply")
    default int deleteByPrimaryKey(Integer pkTinhtrangphaplyId_) {
        return delete(c -> 
            c.where(pkTinhtrangphaplyId, isEqualTo(pkTinhtrangphaplyId_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.753+07:00", comments="Source Table: tinhtrangphaply")
    default int insert(Tinhtrangphaply record) {
        return MyBatis3Utils.insert(this::insert, record, tinhtrangphaply, c ->
            c.map(pkTinhtrangphaplyId).toProperty("pkTinhtrangphaplyId")
            .map(ten).toProperty("ten")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.753+07:00", comments="Source Table: tinhtrangphaply")
    default int insertMultiple(Collection<Tinhtrangphaply> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, tinhtrangphaply, c ->
            c.map(pkTinhtrangphaplyId).toProperty("pkTinhtrangphaplyId")
            .map(ten).toProperty("ten")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.753+07:00", comments="Source Table: tinhtrangphaply")
    default int insertSelective(Tinhtrangphaply record) {
        return MyBatis3Utils.insert(this::insert, record, tinhtrangphaply, c ->
            c.map(pkTinhtrangphaplyId).toPropertyWhenPresent("pkTinhtrangphaplyId", record::getPkTinhtrangphaplyId)
            .map(ten).toPropertyWhenPresent("ten", record::getTen)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.753+07:00", comments="Source Table: tinhtrangphaply")
    default Optional<Tinhtrangphaply> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, tinhtrangphaply, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.753+07:00", comments="Source Table: tinhtrangphaply")
    default List<Tinhtrangphaply> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, tinhtrangphaply, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.753+07:00", comments="Source Table: tinhtrangphaply")
    default List<Tinhtrangphaply> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, tinhtrangphaply, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.753+07:00", comments="Source Table: tinhtrangphaply")
    default Optional<Tinhtrangphaply> selectByPrimaryKey(Integer pkTinhtrangphaplyId_) {
        return selectOne(c ->
            c.where(pkTinhtrangphaplyId, isEqualTo(pkTinhtrangphaplyId_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.753+07:00", comments="Source Table: tinhtrangphaply")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, tinhtrangphaply, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.753+07:00", comments="Source Table: tinhtrangphaply")
    static UpdateDSL<UpdateModel> updateAllColumns(Tinhtrangphaply record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(pkTinhtrangphaplyId).equalTo(record::getPkTinhtrangphaplyId)
                .set(ten).equalTo(record::getTen);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.753+07:00", comments="Source Table: tinhtrangphaply")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(Tinhtrangphaply record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(pkTinhtrangphaplyId).equalToWhenPresent(record::getPkTinhtrangphaplyId)
                .set(ten).equalToWhenPresent(record::getTen);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.753+07:00", comments="Source Table: tinhtrangphaply")
    default int updateByPrimaryKey(Tinhtrangphaply record) {
        return update(c ->
            c.set(ten).equalTo(record::getTen)
            .where(pkTinhtrangphaplyId, isEqualTo(record::getPkTinhtrangphaplyId))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.753+07:00", comments="Source Table: tinhtrangphaply")
    default int updateByPrimaryKeySelective(Tinhtrangphaply record) {
        return update(c ->
            c.set(ten).equalToWhenPresent(record::getTen)
            .where(pkTinhtrangphaplyId, isEqualTo(record::getPkTinhtrangphaplyId))
        );
    }
}