package com.example.thai.dao;

import static com.example.thai.Mapper.DistrictDynamicSqlSupport.pkDistrictid;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.example.thai.Mapper.DistrictMapper;
import com.example.thai.Mapper.LoaigdMapper;
import com.example.thai.Utils.MyBatisUtil;
import com.example.thai.entity.District;
import com.example.thai.entity.Loaigd;
import static org.mybatis.dynamic.sql.SqlBuilder.*;
import static com.example.thai.Mapper.LoaigdDynamicSqlSupport.*;

@Repository
public class LoaigdDAO {
	public Loaigd getLoaigdById(Integer id)
	{
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		Loaigd loaigd = null;
				try {
					
					LoaigdMapper  loaigdMapper = session.getMapper(LoaigdMapper.class);
					 
					loaigd= loaigdMapper.select(c->c.where(pkLoaigiaodichid,isEqualTo(id))).get(0);
				} catch (Exception e) {
					throw e;
				}
				session.close();
		return loaigd;
	}
}
