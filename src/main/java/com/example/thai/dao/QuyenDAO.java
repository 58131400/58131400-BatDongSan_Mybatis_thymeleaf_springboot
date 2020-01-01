package com.example.thai.dao;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.stereotype.Repository;

import com.example.thai.Mapper.QuyenMapper;
import com.example.thai.Utils.MyBatisUtil;

@Repository
public class QuyenDAO {

	
	public String getTenQuyen(Integer id)
	{
		String tenquyen = null;
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		try {
			QuyenMapper  quyenMapper = session.getMapper(QuyenMapper.class);
			tenquyen = quyenMapper.selectByPrimaryKey(id).get().getTen();
			System.out.println("tenquyen DAO:" +tenquyen);
		} catch (Exception e) {
			throw e;
		}
		session.close();
		return tenquyen;
	}
}
