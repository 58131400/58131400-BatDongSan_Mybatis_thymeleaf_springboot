package com.example.thai.dao;


import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;
import static com.example.thai.Mapper.ProvinceDynamicSqlSupport.*;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.example.thai.Mapper.ProvinceMapper;
import com.example.thai.Utils.MyBatisUtil;
import com.example.thai.entity.Province;

@Repository
public class ProvinceDAO {
	public Province getProvinceById(Integer id)
	{
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		Province province = null;
				try {
					
					ProvinceMapper  provinceMapper = session.getMapper(ProvinceMapper.class);
					 
					province= provinceMapper.select(c->c.where(pkProvinceid,isEqualTo(id))).get(0);
				} catch (Exception e) {
					throw e;
				}
				session.close();
		return province;
	}
	
}
