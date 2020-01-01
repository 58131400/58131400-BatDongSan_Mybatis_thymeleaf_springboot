package com.example.thai.dao;

import java.util.List;
import java.util.Set;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.example.thai.Mapper.NhomquyenMapper;
import com.example.thai.Utils.MyBatisUtil;

import static com.example.thai.Mapper.NhomquyenDynamicSqlSupport.*;
import com.example.thai.entity.Nhomquyen;
import static org.mybatis.dynamic.sql.SqlBuilder.*; //import cho mybatis dynamic sql where support
@Repository
public class NhomQuyenDAO {

	
	
	public List<Nhomquyen> findNhomQuyenByNhomNguoiDung(Integer id)
	{
		
		List<Nhomquyen> nhomquyen = null;
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		try{
			NhomquyenMapper  nhomquyenMapper = session.getMapper(NhomquyenMapper.class);
			 nhomquyen =  nhomquyenMapper.select(c-> c.where(fkNhomnguoidungid,isEqualTo(id)));
			 session.close();
		} catch (Exception e) {
			throw e;
		}
		session.close();
		return nhomquyen;
	}
}
