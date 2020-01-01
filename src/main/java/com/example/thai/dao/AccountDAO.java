package com.example.thai.dao;






import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.example.thai.Mapper.TintucMapper;
import com.example.thai.Mapper.UserMapper;
import com.example.thai.Utils.MyBatisUtil;
import com.example.thai.entity.Tintuc;
import com.example.thai.entity.User;


import static com.example.thai.Mapper.UserDynamicSqlSupport.*;

import static org.mybatis.dynamic.sql.SqlBuilder.*; //import cho mybatis dynamic sql where support
@Repository
public class AccountDAO {

	
	public User findAccount(String email) {
		User user = null;
		
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		
		try {
			
			UserMapper userMapper = session.getMapper(UserMapper.class);
			 //user = userMapper.selectByUserEmail(email);
			user = userMapper.select(c-> c.where(useremail, isEqualTo(email))).get(0);
			
		} catch (Exception e) {
			throw e;
		}
		session.close();
		return  user;

	}

	public User getUserById(Integer id)
	{
		User user = null;
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		try {
			
			UserMapper userMapper = session.getMapper(UserMapper.class);
			user = userMapper.select(c->c.where(pkUserid, isEqualTo(id))).get(0);
		}catch (Exception e) {
			throw e;
		}
		session.close();
		return user;
	}
}
