package com.example.thai.Mapper;

import static com.example.thai.Mapper.LoaigdDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.example.thai.entity.Loaigd;
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
public interface LoaigdMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.772+07:00", comments="Source Table: loaigd")
    BasicColumn[] selectList = BasicColumn.columnList(pkLoaigiaodichid, ten);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.771+07:00", comments="Source Table: loaigd")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.771+07:00", comments="Source Table: loaigd")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.771+07:00", comments="Source Table: loaigd")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<Loaigd> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.771+07:00", comments="Source Table: loaigd")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<Loaigd> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.771+07:00", comments="Source Table: loaigd")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("LoaigdResult")
    Optional<Loaigd> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.771+07:00", comments="Source Table: loaigd")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="LoaigdResult", value = {
        @Result(column="PK_LoaiGiaoDichID", property="pkLoaigiaodichid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="Ten", property="ten", jdbcType=JdbcType.VARCHAR)
    })
    List<Loaigd> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.771+07:00", comments="Source Table: loaigd")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.771+07:00", comments="Source Table: loaigd")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, loaigd, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.771+07:00", comments="Source Table: loaigd")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, loaigd, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.771+07:00", comments="Source Table: loaigd")
    default int deleteByPrimaryKey(Integer pkLoaigiaodichid_) {
        return delete(c -> 
            c.where(pkLoaigiaodichid, isEqualTo(pkLoaigiaodichid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.771+07:00", comments="Source Table: loaigd")
    default int insert(Loaigd record) {
        return MyBatis3Utils.insert(this::insert, record, loaigd, c ->
            c.map(pkLoaigiaodichid).toProperty("pkLoaigiaodichid")
            .map(ten).toProperty("ten")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.771+07:00", comments="Source Table: loaigd")
    default int insertMultiple(Collection<Loaigd> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, loaigd, c ->
            c.map(pkLoaigiaodichid).toProperty("pkLoaigiaodichid")
            .map(ten).toProperty("ten")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.771+07:00", comments="Source Table: loaigd")
    default int insertSelective(Loaigd record) {
        return MyBatis3Utils.insert(this::insert, record, loaigd, c ->
            c.map(pkLoaigiaodichid).toPropertyWhenPresent("pkLoaigiaodichid", record::getPkLoaigiaodichid)
            .map(ten).toPropertyWhenPresent("ten", record::getTen)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.772+07:00", comments="Source Table: loaigd")
    default Optional<Loaigd> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, loaigd, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.772+07:00", comments="Source Table: loaigd")
    default List<Loaigd> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, loaigd, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.772+07:00", comments="Source Table: loaigd")
    default List<Loaigd> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, loaigd, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.772+07:00", comments="Source Table: loaigd")
    default Optional<Loaigd> selectByPrimaryKey(Integer pkLoaigiaodichid_) {
        return selectOne(c ->
            c.where(pkLoaigiaodichid, isEqualTo(pkLoaigiaodichid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.772+07:00", comments="Source Table: loaigd")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, loaigd, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.772+07:00", comments="Source Table: loaigd")
    static UpdateDSL<UpdateModel> updateAllColumns(Loaigd record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(pkLoaigiaodichid).equalTo(record::getPkLoaigiaodichid)
                .set(ten).equalTo(record::getTen);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.772+07:00", comments="Source Table: loaigd")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(Loaigd record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(pkLoaigiaodichid).equalToWhenPresent(record::getPkLoaigiaodichid)
                .set(ten).equalToWhenPresent(record::getTen);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.772+07:00", comments="Source Table: loaigd")
    default int updateByPrimaryKey(Loaigd record) {
        return update(c ->
            c.set(ten).equalTo(record::getTen)
            .where(pkLoaigiaodichid, isEqualTo(record::getPkLoaigiaodichid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.772+07:00", comments="Source Table: loaigd")
    default int updateByPrimaryKeySelective(Loaigd record) {
        return update(c ->
            c.set(ten).equalToWhenPresent(record::getTen)
            .where(pkLoaigiaodichid, isEqualTo(record::getPkLoaigiaodichid))
        );
    }
}