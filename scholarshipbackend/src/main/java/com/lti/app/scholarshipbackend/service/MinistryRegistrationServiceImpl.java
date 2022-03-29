package com.lti.app.scholarshipbackend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.app.scholarshipbackend.beans.Ministry;
import com.lti.app.scholarshipbackend.beans.MinistryRegistration;
import com.lti.app.scholarshipbackend.dao.MinistryDao;
import com.lti.app.scholarshipbackend.dao.MinistryRegistrationDao;
@Service("minService")
public class MinistryRegistrationServiceImpl implements MinistryRegistrationService {
        
               @Autowired
               MinistryRegistrationDao dao;
			  
			
			public MinistryRegistrationDao getDao() {
				return dao;
			}


			public void setDao(MinistryRegistrationDao dao) {
				this.dao = dao;
			}


			@Override
			public int addMinistryRegistration(MinistryRegistration e) {
				// TODO Auto-generated method stub
				return dao.addMinistryRegistration(e);
			}
	


		


	
}
