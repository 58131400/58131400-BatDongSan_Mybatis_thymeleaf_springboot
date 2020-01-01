package com.example.thai.Mapper;

import static com.example.thai.Mapper.TinDangDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.example.thai.entity.TinDang;
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
public interface TinDangMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.746+07:00", comments="Source Table: tin_dang")
    BasicColumn[] selectList = BasicColumn.columnList(pkTindangid, fkUserid, ngaydangtin, songaydang, totalview, tieudetin, fkQuanid, street, fkLoaigiaodichid, fkLoaibatdongsanid, gia, dientich, fkTinhtrangphaplyid, sophongngu, sophongtam, sotang, tongsophong, anhmattien, motathem);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.745+07:00", comments="Source Table: tin_dang")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.745+07:00", comments="Source Table: tin_dang")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.745+07:00", comments="Source Table: tin_dang")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<TinDang> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.745+07:00", comments="Source Table: tin_dang")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<TinDang> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.745+07:00", comments="Source Table: tin_dang")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("TinDangResult")
    Optional<TinDang> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.745+07:00", comments="Source Table: tin_dang")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="TinDangResult", value = {
        @Result(column="PK_tindangID", property="pkTindangid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="FK_userID", property="fkUserid", jdbcType=JdbcType.INTEGER),
        @Result(column="Ngaydangtin", property="ngaydangtin", jdbcType=JdbcType.DATE),
        @Result(column="Songaydang", property="songaydang", jdbcType=JdbcType.INTEGER),
        @Result(column="Totalview", property="totalview", jdbcType=JdbcType.INTEGER),
        @Result(column="Tieudetin", property="tieudetin", jdbcType=JdbcType.VARCHAR),
        @Result(column="FK_quanID", property="fkQuanid", jdbcType=JdbcType.INTEGER),
        @Result(column="Street", property="street", jdbcType=JdbcType.VARCHAR),
        @Result(column="FK_loaigiaodichID", property="fkLoaigiaodichid", jdbcType=JdbcType.INTEGER),
        @Result(column="FK_loaibatdongsanID", property="fkLoaibatdongsanid", jdbcType=JdbcType.INTEGER),
        @Result(column="Gia", property="gia", jdbcType=JdbcType.DOUBLE),
        @Result(column="Dientich", property="dientich", jdbcType=JdbcType.INTEGER),
        @Result(column="FK_tinhtrangphaplyID", property="fkTinhtrangphaplyid", jdbcType=JdbcType.INTEGER),
        @Result(column="Sophongngu", property="sophongngu", jdbcType=JdbcType.INTEGER),
        @Result(column="Sophongtam", property="sophongtam", jdbcType=JdbcType.INTEGER),
        @Result(column="Sotang", property="sotang", jdbcType=JdbcType.INTEGER),
        @Result(column="Tongsophong", property="tongsophong", jdbcType=JdbcType.INTEGER),
        @Result(column="Anhmattien", property="anhmattien", jdbcType=JdbcType.VARCHAR),
        @Result(column="Motathem", property="motathem", jdbcType=JdbcType.VARCHAR)
    })
    List<TinDang> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.746+07:00", comments="Source Table: tin_dang")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.746+07:00", comments="Source Table: tin_dang")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, tinDang, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.746+07:00", comments="Source Table: tin_dang")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, tinDang, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.746+07:00", comments="Source Table: tin_dang")
    default int deleteByPrimaryKey(Integer pkTindangid_) {
        return delete(c -> 
            c.where(pkTindangid, isEqualTo(pkTindangid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.746+07:00", comments="Source Table: tin_dang")
    default int insert(TinDang record) {
        return MyBatis3Utils.insert(this::insert, record, tinDang, c ->
            c.map(pkTindangid).toProperty("pkTindangid")
            .map(fkUserid).toProperty("fkUserid")
            .map(ngaydangtin).toProperty("ngaydangtin")
            .map(songaydang).toProperty("songaydang")
            .map(totalview).toProperty("totalview")
            .map(tieudetin).toProperty("tieudetin")
            .map(fkQuanid).toProperty("fkQuanid")
            .map(street).toProperty("street")
            .map(fkLoaigiaodichid).toProperty("fkLoaigiaodichid")
            .map(fkLoaibatdongsanid).toProperty("fkLoaibatdongsanid")
            .map(gia).toProperty("gia")
            .map(dientich).toProperty("dientich")
            .map(fkTinhtrangphaplyid).toProperty("fkTinhtrangphaplyid")
            .map(sophongngu).toProperty("sophongngu")
            .map(sophongtam).toProperty("sophongtam")
            .map(sotang).toProperty("sotang")
            .map(tongsophong).toProperty("tongsophong")
            .map(anhmattien).toProperty("anhmattien")
            .map(motathem).toProperty("motathem")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.746+07:00", comments="Source Table: tin_dang")
    default int insertMultiple(Collection<TinDang> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, tinDang, c ->
            c.map(pkTindangid).toProperty("pkTindangid")
            .map(fkUserid).toProperty("fkUserid")
            .map(ngaydangtin).toProperty("ngaydangtin")
            .map(songaydang).toProperty("songaydang")
            .map(totalview).toProperty("totalview")
            .map(tieudetin).toProperty("tieudetin")
            .map(fkQuanid).toProperty("fkQuanid")
            .map(street).toProperty("street")
            .map(fkLoaigiaodichid).toProperty("fkLoaigiaodichid")
            .map(fkLoaibatdongsanid).toProperty("fkLoaibatdongsanid")
            .map(gia).toProperty("gia")
            .map(dientich).toProperty("dientich")
            .map(fkTinhtrangphaplyid).toProperty("fkTinhtrangphaplyid")
            .map(sophongngu).toProperty("sophongngu")
            .map(sophongtam).toProperty("sophongtam")
            .map(sotang).toProperty("sotang")
            .map(tongsophong).toProperty("tongsophong")
            .map(anhmattien).toProperty("anhmattien")
            .map(motathem).toProperty("motathem")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.746+07:00", comments="Source Table: tin_dang")
    default int insertSelective(TinDang record) {
        return MyBatis3Utils.insert(this::insert, record, tinDang, c ->
            c.map(pkTindangid).toPropertyWhenPresent("pkTindangid", record::getPkTindangid)
            .map(fkUserid).toPropertyWhenPresent("fkUserid", record::getFkUserid)
            .map(ngaydangtin).toPropertyWhenPresent("ngaydangtin", record::getNgaydangtin)
            .map(songaydang).toPropertyWhenPresent("songaydang", record::getSongaydang)
            .map(totalview).toPropertyWhenPresent("totalview", record::getTotalview)
            .map(tieudetin).toPropertyWhenPresent("tieudetin", record::getTieudetin)
            .map(fkQuanid).toPropertyWhenPresent("fkQuanid", record::getFkQuanid)
            .map(street).toPropertyWhenPresent("street", record::getStreet)
            .map(fkLoaigiaodichid).toPropertyWhenPresent("fkLoaigiaodichid", record::getFkLoaigiaodichid)
            .map(fkLoaibatdongsanid).toPropertyWhenPresent("fkLoaibatdongsanid", record::getFkLoaibatdongsanid)
            .map(gia).toPropertyWhenPresent("gia", record::getGia)
            .map(dientich).toPropertyWhenPresent("dientich", record::getDientich)
            .map(fkTinhtrangphaplyid).toPropertyWhenPresent("fkTinhtrangphaplyid", record::getFkTinhtrangphaplyid)
            .map(sophongngu).toPropertyWhenPresent("sophongngu", record::getSophongngu)
            .map(sophongtam).toPropertyWhenPresent("sophongtam", record::getSophongtam)
            .map(sotang).toPropertyWhenPresent("sotang", record::getSotang)
            .map(tongsophong).toPropertyWhenPresent("tongsophong", record::getTongsophong)
            .map(anhmattien).toPropertyWhenPresent("anhmattien", record::getAnhmattien)
            .map(motathem).toPropertyWhenPresent("motathem", record::getMotathem)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.747+07:00", comments="Source Table: tin_dang")
    default Optional<TinDang> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, tinDang, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.747+07:00", comments="Source Table: tin_dang")
    default List<TinDang> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, tinDang, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.747+07:00", comments="Source Table: tin_dang")
    default List<TinDang> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, tinDang, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.747+07:00", comments="Source Table: tin_dang")
    default Optional<TinDang> selectByPrimaryKey(Integer pkTindangid_) {
        return selectOne(c ->
            c.where(pkTindangid, isEqualTo(pkTindangid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.747+07:00", comments="Source Table: tin_dang")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, tinDang, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.747+07:00", comments="Source Table: tin_dang")
    static UpdateDSL<UpdateModel> updateAllColumns(TinDang record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(pkTindangid).equalTo(record::getPkTindangid)
                .set(fkUserid).equalTo(record::getFkUserid)
                .set(ngaydangtin).equalTo(record::getNgaydangtin)
                .set(songaydang).equalTo(record::getSongaydang)
                .set(totalview).equalTo(record::getTotalview)
                .set(tieudetin).equalTo(record::getTieudetin)
                .set(fkQuanid).equalTo(record::getFkQuanid)
                .set(street).equalTo(record::getStreet)
                .set(fkLoaigiaodichid).equalTo(record::getFkLoaigiaodichid)
                .set(fkLoaibatdongsanid).equalTo(record::getFkLoaibatdongsanid)
                .set(gia).equalTo(record::getGia)
                .set(dientich).equalTo(record::getDientich)
                .set(fkTinhtrangphaplyid).equalTo(record::getFkTinhtrangphaplyid)
                .set(sophongngu).equalTo(record::getSophongngu)
                .set(sophongtam).equalTo(record::getSophongtam)
                .set(sotang).equalTo(record::getSotang)
                .set(tongsophong).equalTo(record::getTongsophong)
                .set(anhmattien).equalTo(record::getAnhmattien)
                .set(motathem).equalTo(record::getMotathem);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.747+07:00", comments="Source Table: tin_dang")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(TinDang record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(pkTindangid).equalToWhenPresent(record::getPkTindangid)
                .set(fkUserid).equalToWhenPresent(record::getFkUserid)
                .set(ngaydangtin).equalToWhenPresent(record::getNgaydangtin)
                .set(songaydang).equalToWhenPresent(record::getSongaydang)
                .set(totalview).equalToWhenPresent(record::getTotalview)
                .set(tieudetin).equalToWhenPresent(record::getTieudetin)
                .set(fkQuanid).equalToWhenPresent(record::getFkQuanid)
                .set(street).equalToWhenPresent(record::getStreet)
                .set(fkLoaigiaodichid).equalToWhenPresent(record::getFkLoaigiaodichid)
                .set(fkLoaibatdongsanid).equalToWhenPresent(record::getFkLoaibatdongsanid)
                .set(gia).equalToWhenPresent(record::getGia)
                .set(dientich).equalToWhenPresent(record::getDientich)
                .set(fkTinhtrangphaplyid).equalToWhenPresent(record::getFkTinhtrangphaplyid)
                .set(sophongngu).equalToWhenPresent(record::getSophongngu)
                .set(sophongtam).equalToWhenPresent(record::getSophongtam)
                .set(sotang).equalToWhenPresent(record::getSotang)
                .set(tongsophong).equalToWhenPresent(record::getTongsophong)
                .set(anhmattien).equalToWhenPresent(record::getAnhmattien)
                .set(motathem).equalToWhenPresent(record::getMotathem);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.747+07:00", comments="Source Table: tin_dang")
    default int updateByPrimaryKey(TinDang record) {
        return update(c ->
            c.set(fkUserid).equalTo(record::getFkUserid)
            .set(ngaydangtin).equalTo(record::getNgaydangtin)
            .set(songaydang).equalTo(record::getSongaydang)
            .set(totalview).equalTo(record::getTotalview)
            .set(tieudetin).equalTo(record::getTieudetin)
            .set(fkQuanid).equalTo(record::getFkQuanid)
            .set(street).equalTo(record::getStreet)
            .set(fkLoaigiaodichid).equalTo(record::getFkLoaigiaodichid)
            .set(fkLoaibatdongsanid).equalTo(record::getFkLoaibatdongsanid)
            .set(gia).equalTo(record::getGia)
            .set(dientich).equalTo(record::getDientich)
            .set(fkTinhtrangphaplyid).equalTo(record::getFkTinhtrangphaplyid)
            .set(sophongngu).equalTo(record::getSophongngu)
            .set(sophongtam).equalTo(record::getSophongtam)
            .set(sotang).equalTo(record::getSotang)
            .set(tongsophong).equalTo(record::getTongsophong)
            .set(anhmattien).equalTo(record::getAnhmattien)
            .set(motathem).equalTo(record::getMotathem)
            .where(pkTindangid, isEqualTo(record::getPkTindangid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-25T14:56:04.747+07:00", comments="Source Table: tin_dang")
    default int updateByPrimaryKeySelective(TinDang record) {
        return update(c ->
            c.set(fkUserid).equalToWhenPresent(record::getFkUserid)
            .set(ngaydangtin).equalToWhenPresent(record::getNgaydangtin)
            .set(songaydang).equalToWhenPresent(record::getSongaydang)
            .set(totalview).equalToWhenPresent(record::getTotalview)
            .set(tieudetin).equalToWhenPresent(record::getTieudetin)
            .set(fkQuanid).equalToWhenPresent(record::getFkQuanid)
            .set(street).equalToWhenPresent(record::getStreet)
            .set(fkLoaigiaodichid).equalToWhenPresent(record::getFkLoaigiaodichid)
            .set(fkLoaibatdongsanid).equalToWhenPresent(record::getFkLoaibatdongsanid)
            .set(gia).equalToWhenPresent(record::getGia)
            .set(dientich).equalToWhenPresent(record::getDientich)
            .set(fkTinhtrangphaplyid).equalToWhenPresent(record::getFkTinhtrangphaplyid)
            .set(sophongngu).equalToWhenPresent(record::getSophongngu)
            .set(sophongtam).equalToWhenPresent(record::getSophongtam)
            .set(sotang).equalToWhenPresent(record::getSotang)
            .set(tongsophong).equalToWhenPresent(record::getTongsophong)
            .set(anhmattien).equalToWhenPresent(record::getAnhmattien)
            .set(motathem).equalToWhenPresent(record::getMotathem)
            .where(pkTindangid, isEqualTo(record::getPkTindangid))
        );
    }
}