package com.example.thai.Mapper;

import static com.example.thai.Mapper.NhomquyenDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.example.thai.entity.Nhomquyen;
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
public interface NhomquyenMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.767+07:00", comments="Source Table: nhomquyen")
    BasicColumn[] selectList = BasicColumn.columnList(pkNhomquyenid, fkNhomnguoidungid, fkQuyenid);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.765+07:00", comments="Source Table: nhomquyen")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.765+07:00", comments="Source Table: nhomquyen")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.765+07:00", comments="Source Table: nhomquyen")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<Nhomquyen> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.765+07:00", comments="Source Table: nhomquyen")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<Nhomquyen> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.765+07:00", comments="Source Table: nhomquyen")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("NhomquyenResult")
    Optional<Nhomquyen> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.765+07:00", comments="Source Table: nhomquyen")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="NhomquyenResult", value = {
        @Result(column="PK_NhomQuyenID", property="pkNhomquyenid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="FK_NhomNguoiDungID", property="fkNhomnguoidungid", jdbcType=JdbcType.INTEGER),
        @Result(column="FK_QuyenID", property="fkQuyenid", jdbcType=JdbcType.INTEGER)
    })
    List<Nhomquyen> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.766+07:00", comments="Source Table: nhomquyen")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.766+07:00", comments="Source Table: nhomquyen")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, nhomquyen, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.766+07:00", comments="Source Table: nhomquyen")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, nhomquyen, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.766+07:00", comments="Source Table: nhomquyen")
    default int deleteByPrimaryKey(Integer pkNhomquyenid_) {
        return delete(c -> 
            c.where(pkNhomquyenid, isEqualTo(pkNhomquyenid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.766+07:00", comments="Source Table: nhomquyen")
    default int insert(Nhomquyen record) {
        return MyBatis3Utils.insert(this::insert, record, nhomquyen, c ->
            c.map(pkNhomquyenid).toProperty("pkNhomquyenid")
            .map(fkNhomnguoidungid).toProperty("fkNhomnguoidungid")
            .map(fkQuyenid).toProperty("fkQuyenid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.767+07:00", comments="Source Table: nhomquyen")
    default int insertMultiple(Collection<Nhomquyen> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, nhomquyen, c ->
            c.map(pkNhomquyenid).toProperty("pkNhomquyenid")
            .map(fkNhomnguoidungid).toProperty("fkNhomnguoidungid")
            .map(fkQuyenid).toProperty("fkQuyenid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.767+07:00", comments="Source Table: nhomquyen")
    default int insertSelective(Nhomquyen record) {
        return MyBatis3Utils.insert(this::insert, record, nhomquyen, c ->
            c.map(pkNhomquyenid).toPropertyWhenPresent("pkNhomquyenid", record::getPkNhomquyenid)
            .map(fkNhomnguoidungid).toPropertyWhenPresent("fkNhomnguoidungid", record::getFkNhomnguoidungid)
            .map(fkQuyenid).toPropertyWhenPresent("fkQuyenid", record::getFkQuyenid)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.767+07:00", comments="Source Table: nhomquyen")
    default Optional<Nhomquyen> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, nhomquyen, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.767+07:00", comments="Source Table: nhomquyen")
    default List<Nhomquyen> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, nhomquyen, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.767+07:00", comments="Source Table: nhomquyen")
    default List<Nhomquyen> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, nhomquyen, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.767+07:00", comments="Source Table: nhomquyen")
    default Optional<Nhomquyen> selectByPrimaryKey(Integer pkNhomquyenid_) {
        return selectOne(c ->
            c.where(pkNhomquyenid, isEqualTo(pkNhomquyenid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.767+07:00", comments="Source Table: nhomquyen")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, nhomquyen, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.767+07:00", comments="Source Table: nhomquyen")
    static UpdateDSL<UpdateModel> updateAllColumns(Nhomquyen record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(pkNhomquyenid).equalTo(record::getPkNhomquyenid)
                .set(fkNhomnguoidungid).equalTo(record::getFkNhomnguoidungid)
                .set(fkQuyenid).equalTo(record::getFkQuyenid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.767+07:00", comments="Source Table: nhomquyen")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(Nhomquyen record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(pkNhomquyenid).equalToWhenPresent(record::getPkNhomquyenid)
                .set(fkNhomnguoidungid).equalToWhenPresent(record::getFkNhomnguoidungid)
                .set(fkQuyenid).equalToWhenPresent(record::getFkQuyenid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.767+07:00", comments="Source Table: nhomquyen")
    default int updateByPrimaryKey(Nhomquyen record) {
        return update(c ->
            c.set(fkNhomnguoidungid).equalTo(record::getFkNhomnguoidungid)
            .set(fkQuyenid).equalTo(record::getFkQuyenid)
            .where(pkNhomquyenid, isEqualTo(record::getPkNhomquyenid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.767+07:00", comments="Source Table: nhomquyen")
    default int updateByPrimaryKeySelective(Nhomquyen record) {
        return update(c ->
            c.set(fkNhomnguoidungid).equalToWhenPresent(record::getFkNhomnguoidungid)
            .set(fkQuyenid).equalToWhenPresent(record::getFkQuyenid)
            .where(pkNhomquyenid, isEqualTo(record::getPkNhomquyenid))
        );
    }
}