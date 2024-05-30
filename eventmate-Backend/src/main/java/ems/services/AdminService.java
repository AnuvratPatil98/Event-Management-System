package ems.services;

import ems.entities.Admin;

public interface AdminService {
	Admin validate(String userid,String pwd);
	void updateAdmin(Admin amin);
}
