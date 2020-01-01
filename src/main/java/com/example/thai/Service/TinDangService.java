package com.example.thai.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.thai.dao.AccountDAO;
import com.example.thai.dao.DistrictDAO;
import com.example.thai.dao.LoaibdsDAO;
import com.example.thai.dao.LoaigdDAO;
import com.example.thai.dao.ProvinceDAO;
import com.example.thai.dao.TinDangDAO;
import com.example.thai.dao.TinhtrangphaplyDAO;
import com.example.thai.entity.Loaibds;
import com.example.thai.entity.TinDang;

@Service
public class TinDangService {

	@Autowired
	private TinDangDAO tinDangDAO;
	@Autowired
	private AccountDAO accountDAO;
	@Autowired
	private DistrictDAO districtDAO;
	@Autowired
	private ProvinceDAO provinceDAO;
	@Autowired
	private LoaigdDAO loaigdDAO;
	@Autowired
	private LoaibdsDAO loaibdsDAO;
	@Autowired
	private TinhtrangphaplyDAO tinhtrangphaplyDAO;
	
	public List<Map<String,Object>> getDSTinDang()
	{
		List<TinDang> listtin= tinDangDAO.getDSTinDang();
		List<Map<String,Object>> listmap = new ArrayList<Map<String,Object>>();
		for (TinDang tin : listtin) {
			Map<String,Object> tinDangMap = new HashMap<String, Object>();
			tinDangMap.put("tindang", tin);
			tinDangMap.put("user", accountDAO.getUserById(tin.getFkUserid()) );
			tinDangMap.put("quan", districtDAO.getDistrictById(tin.getFkQuanid()));
			tinDangMap.put("loaigd", loaigdDAO.getLoaigdById(tin.getFkLoaigiaodichid()));
			tinDangMap.put("loaibds",loaibdsDAO.getLoaibdstById(tin.getFkLoaibatdongsanid()));
			tinDangMap.put("tinh", provinceDAO.getProvinceById(districtDAO.getDistrictById(tin.getFkQuanid()).getFkProvinceid()));
			tinDangMap.put("tinhtrangphaply", tinhtrangphaplyDAO.getPhapLygdById(tin.getFkTinhtrangphaplyid()));
			listmap.add(tinDangMap);
		}
		return listmap;
	}
}
