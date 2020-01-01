package com.example.thai.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.example.thai.Mapper.DistrictMapper;
import com.example.thai.Mapper.TinDangMapper;
import com.example.thai.Utils.MyBatisUtil;
import com.example.thai.entity.District;
import com.example.thai.entity.TinDang;

import static com.example.thai.Mapper.DistrictDynamicSqlSupport.*;

import static org.mybatis.dynamic.sql.SqlBuilder.*; //import cho mybatis dynamic sql where support
@Repository
public class DistrictDAO {

	public District getDistrictById(Integer id)
	{
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		District district = null;
				try {
					
					DistrictMapper  districtMapper = session.getMapper(DistrictMapper.class);
					 
					district= districtMapper.select(c->c.where(pkDistrictid,isEqualTo(id))).get(0);
				} catch (Exception e) {
					throw e;
				}
				session.close();
		return district;
	}
}
