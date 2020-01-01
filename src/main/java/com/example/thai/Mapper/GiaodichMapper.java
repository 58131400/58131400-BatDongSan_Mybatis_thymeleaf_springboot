package com.example.thai.Mapper;

import static com.example.thai.Mapper.GiaodichDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.example.thai.entity.Giaodich;
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
public interface GiaodichMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.776+07:00", comments="Source Table: giaodich")
    BasicColumn[] selectList = BasicColumn.columnList(pkGiaodichid, fkUserid, fkTindangid, ngayluutin, status);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.775+07:00", comments="Source Table: giaodich")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.775+07:00", comments="Source Table: giaodich")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.775+07:00", comments="Source Table: giaodich")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<Giaodich> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.775+07:00", comments="Source Table: giaodich")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<Giaodich> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.775+07:00", comments="Source Table: giaodich")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("GiaodichResult")
    Optional<Giaodich> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.775+07:00", comments="Source Table: giaodich")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="GiaodichResult", value = {
        @Result(column="PK_GiaoDichID", property="pkGiaodichid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="FK_UserID", property="fkUserid", jdbcType=JdbcType.INTEGER),
        @Result(column="FK_TinDangID", property="fkTindangid", jdbcType=JdbcType.INTEGER),
        @Result(column="NgayLuuTin", property="ngayluutin", jdbcType=JdbcType.DATE),
        @Result(column="Status", property="status", jdbcType=JdbcType.BIT)
    })
    List<Giaodich> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.776+07:00", comments="Source Table: giaodich")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.776+07:00", comments="Source Table: giaodich")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, giaodich, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.776+07:00", comments="Source Table: giaodich")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, giaodich, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.776+07:00", comments="Source Table: giaodich")
    default int deleteByPrimaryKey(Integer pkGiaodichid_) {
        return delete(c -> 
            c.where(pkGiaodichid, isEqualTo(pkGiaodichid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.776+07:00", comments="Source Table: giaodich")
    default int insert(Giaodich record) {
        return MyBatis3Utils.insert(this::insert, record, giaodich, c ->
            c.map(pkGiaodichid).toProperty("pkGiaodichid")
            .map(fkUserid).toProperty("fkUserid")
            .map(fkTindangid).toProperty("fkTindangid")
            .map(ngayluutin).toProperty("ngayluutin")
            .map(status).toProperty("status")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.776+07:00", comments="Source Table: giaodich")
    default int insertMultiple(Collection<Giaodich> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, giaodich, c ->
            c.map(pkGiaodichid).toProperty("pkGiaodichid")
            .map(fkUserid).toProperty("fkUserid")
            .map(fkTindangid).toProperty("fkTindangid")
            .map(ngayluutin).toProperty("ngayluutin")
            .map(status).toProperty("status")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.776+07:00", comments="Source Table: giaodich")
    default int insertSelective(Giaodich record) {
        return MyBatis3Utils.insert(this::insert, record, giaodich, c ->
            c.map(pkGiaodichid).toPropertyWhenPresent("pkGiaodichid", record::getPkGiaodichid)
            .map(fkUserid).toPropertyWhenPresent("fkUserid", record::getFkUserid)
            .map(fkTindangid).toPropertyWhenPresent("fkTindangid", record::getFkTindangid)
            .map(ngayluutin).toPropertyWhenPresent("ngayluutin", record::getNgayluutin)
            .map(status).toPropertyWhenPresent("status", record::getStatus)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.776+07:00", comments="Source Table: giaodich")
    default Optional<Giaodich> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, giaodich, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.776+07:00", comments="Source Table: giaodich")
    default List<Giaodich> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, giaodich, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.776+07:00", comments="Source Table: giaodich")
    default List<Giaodich> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, giaodich, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.776+07:00", comments="Source Table: giaodich")
    default Optional<Giaodich> selectByPrimaryKey(Integer pkGiaodichid_) {
        return selectOne(c ->
            c.where(pkGiaodichid, isEqualTo(pkGiaodichid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.776+07:00", comments="Source Table: giaodich")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, giaodich, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.776+07:00", comments="Source Table: giaodich")
    static UpdateDSL<UpdateModel> updateAllColumns(Giaodich record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(pkGiaodichid).equalTo(record::getPkGiaodichid)
                .set(fkUserid).equalTo(record::getFkUserid)
                .set(fkTindangid).equalTo(record::getFkTindangid)
                .set(ngayluutin).equalTo(record::getNgayluutin)
                .set(status).equalTo(record::getStatus);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.777+07:00", comments="Source Table: giaodich")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(Giaodich record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(pkGiaodichid).equalToWhenPresent(record::getPkGiaodichid)
                .set(fkUserid).equalToWhenPresent(record::getFkUserid)
                .set(fkTindangid).equalToWhenPresent(record::getFkTindangid)
                .set(ngayluutin).equalToWhenPresent(record::getNgayluutin)
                .set(status).equalToWhenPresent(record::getStatus);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.777+07:00", comments="Source Table: giaodich")
    default int updateByPrimaryKey(Giaodich record) {
        return update(c ->
            c.set(fkUserid).equalTo(record::getFkUserid)
            .set(fkTindangid).equalTo(record::getFkTindangid)
            .set(ngayluutin).equalTo(record::getNgayluutin)
            .set(status).equalTo(record::getStatus)
            .where(pkGiaodichid, isEqualTo(record::getPkGiaodichid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.777+07:00", comments="Source Table: giaodich")
    default int updateByPrimaryKeySelective(Giaodich record) {
        return update(c ->
            c.set(fkUserid).equalToWhenPresent(record::getFkUserid)
            .set(fkTindangid).equalToWhenPresent(record::getFkTindangid)
            .set(ngayluutin).equalToWhenPresent(record::getNgayluutin)
            .set(status).equalToWhenPresent(record::getStatus)
            .where(pkGiaodichid, isEqualTo(record::getPkGiaodichid))
        );
    }
}