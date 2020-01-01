package com.example.thai.Mapper;

import static com.example.thai.Mapper.CamquyenDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.example.thai.entity.Camquyen;
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
public interface CamquyenMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.761+07:00", comments="Source Table: camquyen")
    BasicColumn[] selectList = BasicColumn.columnList(pkCamquyenid, fkUserid, quyenid);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.76+07:00", comments="Source Table: camquyen")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.76+07:00", comments="Source Table: camquyen")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.76+07:00", comments="Source Table: camquyen")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<Camquyen> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.76+07:00", comments="Source Table: camquyen")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<Camquyen> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.76+07:00", comments="Source Table: camquyen")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("CamquyenResult")
    Optional<Camquyen> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.76+07:00", comments="Source Table: camquyen")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="CamquyenResult", value = {
        @Result(column="PK_CamQuyenID", property="pkCamquyenid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="FK_UserID", property="fkUserid", jdbcType=JdbcType.INTEGER),
        @Result(column="QuyenID", property="quyenid", jdbcType=JdbcType.INTEGER)
    })
    List<Camquyen> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.76+07:00", comments="Source Table: camquyen")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.76+07:00", comments="Source Table: camquyen")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, camquyen, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.76+07:00", comments="Source Table: camquyen")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, camquyen, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.76+07:00", comments="Source Table: camquyen")
    default int deleteByPrimaryKey(Integer pkCamquyenid_) {
        return delete(c -> 
            c.where(pkCamquyenid, isEqualTo(pkCamquyenid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.761+07:00", comments="Source Table: camquyen")
    default int insert(Camquyen record) {
        return MyBatis3Utils.insert(this::insert, record, camquyen, c ->
            c.map(pkCamquyenid).toProperty("pkCamquyenid")
            .map(fkUserid).toProperty("fkUserid")
            .map(quyenid).toProperty("quyenid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.761+07:00", comments="Source Table: camquyen")
    default int insertMultiple(Collection<Camquyen> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, camquyen, c ->
            c.map(pkCamquyenid).toProperty("pkCamquyenid")
            .map(fkUserid).toProperty("fkUserid")
            .map(quyenid).toProperty("quyenid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.761+07:00", comments="Source Table: camquyen")
    default int insertSelective(Camquyen record) {
        return MyBatis3Utils.insert(this::insert, record, camquyen, c ->
            c.map(pkCamquyenid).toPropertyWhenPresent("pkCamquyenid", record::getPkCamquyenid)
            .map(fkUserid).toPropertyWhenPresent("fkUserid", record::getFkUserid)
            .map(quyenid).toPropertyWhenPresent("quyenid", record::getQuyenid)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.761+07:00", comments="Source Table: camquyen")
    default Optional<Camquyen> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, camquyen, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.761+07:00", comments="Source Table: camquyen")
    default List<Camquyen> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, camquyen, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.761+07:00", comments="Source Table: camquyen")
    default List<Camquyen> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, camquyen, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.761+07:00", comments="Source Table: camquyen")
    default Optional<Camquyen> selectByPrimaryKey(Integer pkCamquyenid_) {
        return selectOne(c ->
            c.where(pkCamquyenid, isEqualTo(pkCamquyenid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.761+07:00", comments="Source Table: camquyen")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, camquyen, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.761+07:00", comments="Source Table: camquyen")
    static UpdateDSL<UpdateModel> updateAllColumns(Camquyen record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(pkCamquyenid).equalTo(record::getPkCamquyenid)
                .set(fkUserid).equalTo(record::getFkUserid)
                .set(quyenid).equalTo(record::getQuyenid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.761+07:00", comments="Source Table: camquyen")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(Camquyen record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(pkCamquyenid).equalToWhenPresent(record::getPkCamquyenid)
                .set(fkUserid).equalToWhenPresent(record::getFkUserid)
                .set(quyenid).equalToWhenPresent(record::getQuyenid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.761+07:00", comments="Source Table: camquyen")
    default int updateByPrimaryKey(Camquyen record) {
        return update(c ->
            c.set(fkUserid).equalTo(record::getFkUserid)
            .set(quyenid).equalTo(record::getQuyenid)
            .where(pkCamquyenid, isEqualTo(record::getPkCamquyenid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.762+07:00", comments="Source Table: camquyen")
    default int updateByPrimaryKeySelective(Camquyen record) {
        return update(c ->
            c.set(fkUserid).equalToWhenPresent(record::getFkUserid)
            .set(quyenid).equalToWhenPresent(record::getQuyenid)
            .where(pkCamquyenid, isEqualTo(record::getPkCamquyenid))
        );
    }
}