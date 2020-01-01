package com.example.thai.Mapper;

import static com.example.thai.Mapper.NhomnguoidungDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.example.thai.entity.Nhomnguoidung;
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
public interface NhomnguoidungMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.769+07:00", comments="Source Table: nhomnguoidung")
    BasicColumn[] selectList = BasicColumn.columnList(pkNhomnguoidungid, ten);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.768+07:00", comments="Source Table: nhomnguoidung")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.768+07:00", comments="Source Table: nhomnguoidung")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.768+07:00", comments="Source Table: nhomnguoidung")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<Nhomnguoidung> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.768+07:00", comments="Source Table: nhomnguoidung")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<Nhomnguoidung> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.768+07:00", comments="Source Table: nhomnguoidung")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("NhomnguoidungResult")
    Optional<Nhomnguoidung> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.769+07:00", comments="Source Table: nhomnguoidung")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="NhomnguoidungResult", value = {
        @Result(column="PK_NhomNguoiDungID", property="pkNhomnguoidungid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="Ten", property="ten", jdbcType=JdbcType.VARCHAR)
    })
    List<Nhomnguoidung> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.769+07:00", comments="Source Table: nhomnguoidung")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.769+07:00", comments="Source Table: nhomnguoidung")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, nhomnguoidung, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.769+07:00", comments="Source Table: nhomnguoidung")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, nhomnguoidung, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.769+07:00", comments="Source Table: nhomnguoidung")
    default int deleteByPrimaryKey(Integer pkNhomnguoidungid_) {
        return delete(c -> 
            c.where(pkNhomnguoidungid, isEqualTo(pkNhomnguoidungid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.769+07:00", comments="Source Table: nhomnguoidung")
    default int insert(Nhomnguoidung record) {
        return MyBatis3Utils.insert(this::insert, record, nhomnguoidung, c ->
            c.map(pkNhomnguoidungid).toProperty("pkNhomnguoidungid")
            .map(ten).toProperty("ten")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.769+07:00", comments="Source Table: nhomnguoidung")
    default int insertMultiple(Collection<Nhomnguoidung> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, nhomnguoidung, c ->
            c.map(pkNhomnguoidungid).toProperty("pkNhomnguoidungid")
            .map(ten).toProperty("ten")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.769+07:00", comments="Source Table: nhomnguoidung")
    default int insertSelective(Nhomnguoidung record) {
        return MyBatis3Utils.insert(this::insert, record, nhomnguoidung, c ->
            c.map(pkNhomnguoidungid).toPropertyWhenPresent("pkNhomnguoidungid", record::getPkNhomnguoidungid)
            .map(ten).toPropertyWhenPresent("ten", record::getTen)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.769+07:00", comments="Source Table: nhomnguoidung")
    default Optional<Nhomnguoidung> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, nhomnguoidung, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.769+07:00", comments="Source Table: nhomnguoidung")
    default List<Nhomnguoidung> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, nhomnguoidung, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.769+07:00", comments="Source Table: nhomnguoidung")
    default List<Nhomnguoidung> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, nhomnguoidung, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.77+07:00", comments="Source Table: nhomnguoidung")
    default Optional<Nhomnguoidung> selectByPrimaryKey(Integer pkNhomnguoidungid_) {
        return selectOne(c ->
            c.where(pkNhomnguoidungid, isEqualTo(pkNhomnguoidungid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.77+07:00", comments="Source Table: nhomnguoidung")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, nhomnguoidung, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.77+07:00", comments="Source Table: nhomnguoidung")
    static UpdateDSL<UpdateModel> updateAllColumns(Nhomnguoidung record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(pkNhomnguoidungid).equalTo(record::getPkNhomnguoidungid)
                .set(ten).equalTo(record::getTen);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.77+07:00", comments="Source Table: nhomnguoidung")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(Nhomnguoidung record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(pkNhomnguoidungid).equalToWhenPresent(record::getPkNhomnguoidungid)
                .set(ten).equalToWhenPresent(record::getTen);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.77+07:00", comments="Source Table: nhomnguoidung")
    default int updateByPrimaryKey(Nhomnguoidung record) {
        return update(c ->
            c.set(ten).equalTo(record::getTen)
            .where(pkNhomnguoidungid, isEqualTo(record::getPkNhomnguoidungid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.77+07:00", comments="Source Table: nhomnguoidung")
    default int updateByPrimaryKeySelective(Nhomnguoidung record) {
        return update(c ->
            c.set(ten).equalToWhenPresent(record::getTen)
            .where(pkNhomnguoidungid, isEqualTo(record::getPkNhomnguoidungid))
        );
    }
}