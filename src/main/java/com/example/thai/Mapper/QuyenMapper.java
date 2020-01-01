package com.example.thai.Mapper;

import static com.example.thai.Mapper.QuyenDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.example.thai.entity.Quyen;
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
public interface QuyenMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.758+07:00", comments="Source Table: quyen")
    BasicColumn[] selectList = BasicColumn.columnList(pkQuyenid, ten);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.757+07:00", comments="Source Table: quyen")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.757+07:00", comments="Source Table: quyen")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.758+07:00", comments="Source Table: quyen")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<Quyen> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.758+07:00", comments="Source Table: quyen")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<Quyen> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.758+07:00", comments="Source Table: quyen")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("QuyenResult")
    Optional<Quyen> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.758+07:00", comments="Source Table: quyen")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="QuyenResult", value = {
        @Result(column="PK_QuyenID", property="pkQuyenid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="Ten", property="ten", jdbcType=JdbcType.VARCHAR)
    })
    List<Quyen> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.758+07:00", comments="Source Table: quyen")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.758+07:00", comments="Source Table: quyen")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, quyen, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.758+07:00", comments="Source Table: quyen")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, quyen, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.758+07:00", comments="Source Table: quyen")
    default int deleteByPrimaryKey(Integer pkQuyenid_) {
        return delete(c -> 
            c.where(pkQuyenid, isEqualTo(pkQuyenid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.758+07:00", comments="Source Table: quyen")
    default int insert(Quyen record) {
        return MyBatis3Utils.insert(this::insert, record, quyen, c ->
            c.map(pkQuyenid).toProperty("pkQuyenid")
            .map(ten).toProperty("ten")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.758+07:00", comments="Source Table: quyen")
    default int insertMultiple(Collection<Quyen> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, quyen, c ->
            c.map(pkQuyenid).toProperty("pkQuyenid")
            .map(ten).toProperty("ten")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.758+07:00", comments="Source Table: quyen")
    default int insertSelective(Quyen record) {
        return MyBatis3Utils.insert(this::insert, record, quyen, c ->
            c.map(pkQuyenid).toPropertyWhenPresent("pkQuyenid", record::getPkQuyenid)
            .map(ten).toPropertyWhenPresent("ten", record::getTen)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.758+07:00", comments="Source Table: quyen")
    default Optional<Quyen> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, quyen, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.758+07:00", comments="Source Table: quyen")
    default List<Quyen> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, quyen, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.758+07:00", comments="Source Table: quyen")
    default List<Quyen> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, quyen, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.758+07:00", comments="Source Table: quyen")
    default Optional<Quyen> selectByPrimaryKey(Integer pkQuyenid_) {
        return selectOne(c ->
            c.where(pkQuyenid, isEqualTo(pkQuyenid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.759+07:00", comments="Source Table: quyen")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, quyen, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.759+07:00", comments="Source Table: quyen")
    static UpdateDSL<UpdateModel> updateAllColumns(Quyen record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(pkQuyenid).equalTo(record::getPkQuyenid)
                .set(ten).equalTo(record::getTen);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.759+07:00", comments="Source Table: quyen")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(Quyen record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(pkQuyenid).equalToWhenPresent(record::getPkQuyenid)
                .set(ten).equalToWhenPresent(record::getTen);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.759+07:00", comments="Source Table: quyen")
    default int updateByPrimaryKey(Quyen record) {
        return update(c ->
            c.set(ten).equalTo(record::getTen)
            .where(pkQuyenid, isEqualTo(record::getPkQuyenid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.759+07:00", comments="Source Table: quyen")
    default int updateByPrimaryKeySelective(Quyen record) {
        return update(c ->
            c.set(ten).equalToWhenPresent(record::getTen)
            .where(pkQuyenid, isEqualTo(record::getPkQuyenid))
        );
    }
}