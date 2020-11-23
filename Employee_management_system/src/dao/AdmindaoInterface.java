package dao;

import model.Admin;

public interface AdmindaoInterface 
{
	int signUp(Admin admin);
	boolean loginUser(Admin admin); 
}
