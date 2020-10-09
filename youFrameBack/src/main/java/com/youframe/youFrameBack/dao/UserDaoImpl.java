package com.youframe.youFrameBack.dao;
import com.youframe.youFrameBack.pojos.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserDaoImpl implements IUserDao {
   @Autowired
	private UserRepository rp;

public User AddNewImages(User u) {
		System.out.println("dao's method");
			//return rp.save(u);	
			
			User u1 = rp.save(u);
			return u1;
	
	}

@Override
public List<User> getAllImages() {
	//String jpql = "select p from Packages p";
	//return sf.getCurrentSession().createQuery(jpql,User.class).getResultList();		

	return rp.findAll(Sort.by(Sort.Direction.DESC,"Imgid"));


}
	
	
	
}
