package com.example.thai.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.thai.dao.AccountDAO;
import com.example.thai.dao.NhomQuyenDAO;
import com.example.thai.dao.QuyenDAO;
import com.example.thai.entity.Nhomquyen;
import com.example.thai.entity.User;

@Service
public class UserDetailServiceImpl implements UserDetailsService {

	@Autowired
	private AccountDAO accountDAO;
	@Autowired
	private NhomQuyenDAO nhomQuyenDAO;
	@Autowired
	private QuyenDAO quyenDAO;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		User user = accountDAO.findAccount(username);
		System.out.println("User: " + user);
		if (user == null) {
			throw new UsernameNotFoundException("Không tìm thấy User");
		}
		// lay ds quyen cho user
		System.out.println("User detail impl: ");

		List<Nhomquyen> nhomQuyen = nhomQuyenDAO.findNhomQuyenByNhomNguoiDung(user.getFkNhomnguoidungid());

		List<GrantedAuthority> grantList = new ArrayList<GrantedAuthority>();
		for (Nhomquyen nq : nhomQuyen) {
			GrantedAuthority authority = new SimpleGrantedAuthority(quyenDAO.getTenQuyen(nq.getFkQuyenid()));
			grantList.add(authority);
		}
		boolean enabled = user.getUserstatus();
		boolean accountNonExpired = true;
		boolean credentialsNonExpired = true;
		boolean accountNonLocked = true;

		UserDetails userDetails = new org.springframework.security.core.userdetails.User(user.getUseremail(),
				user.getUserpassword(), enabled, accountNonExpired, credentialsNonExpired, accountNonLocked, grantList);
		System.out.println(userDetails);
		return userDetails;

	}
	

}
