package com.example.thai.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.example.thai.Mapper.TinDangMapper;
import com.example.thai.Mapper.UserMapper;
import com.example.thai.Utils.MyBatisUtil;
import com.example.thai.entity.TinDang;

import static com.example.thai.Mapper.UserDynamicSqlSupport.*;

import static org.mybatis.dynamic.sql.SqlBuilder.*; //import cho mybatis dynamic sql where support

import java.util.List;

@Repository
public class TinDangDAO {
	
	public List<TinDang> getDSTinDang()
	{
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		
		List<TinDang>  list =null;
				try {
					
					TinDangMapper tinDangMapper = session.getMapper(TinDangMapper.class);			
					 //user = userMapper.selectByUserEmail(email);
					list= tinDangMapper.select(c-> c);
					
					 
					
				} catch (Exception e) {
					throw e;
				}
				session.close();
		return list;
	}
	
}
