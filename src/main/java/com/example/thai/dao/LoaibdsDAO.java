package com.example.thai.dao;

import org.springframework.stereotype.Repository;


import com.example.thai.Mapper.LoaibdsMapper;
import com.example.thai.Utils.MyBatisUtil;
import com.example.thai.entity.Loaibds;

import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import org.apache.ibatis.session.SqlSession;
import static com.example.thai.Mapper.LoaibdsDynamicSqlSupport.*;
@Repository
public class LoaibdsDAO {

	public Loaibds getLoaibdstById(Integer id)
	{
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		Loaibds loaibds= null;
				try {
					
					LoaibdsMapper  loaibdsMapper = session.getMapper(LoaibdsMapper.class);
					 
					loaibds = loaibdsMapper.select(c->c.where(pkLoaibdsId,isEqualTo(id))).get(0);
				} catch (Exception e) {
					throw e;
				}
				session.close();
		return loaibds;
	}
	
}
