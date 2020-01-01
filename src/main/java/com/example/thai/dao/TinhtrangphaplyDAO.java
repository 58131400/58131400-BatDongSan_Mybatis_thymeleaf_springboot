package com.example.thai.dao;

import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.example.thai.Mapper.TinhtrangphaplyMapper;
import com.example.thai.Utils.MyBatisUtil;
import com.example.thai.entity.Tinhtrangphaply;
import static com.example.thai.Mapper.TinhtrangphaplyDynamicSqlSupport.*;

@Repository
public class TinhtrangphaplyDAO {
	public Tinhtrangphaply getPhapLygdById(Integer id)
	{
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		Tinhtrangphaply tinhtrangphaply = null;
				try {
					
					TinhtrangphaplyMapper  tinhtrangphaplyMapper = session.getMapper(TinhtrangphaplyMapper.class);
					 
					tinhtrangphaply= tinhtrangphaplyMapper.select(c->c.where(pkTinhtrangphaplyId,isEqualTo(id))).get(0);
				} catch (Exception e) {
					throw e;
				}
				session.close();
		return tinhtrangphaply;
	}
}
