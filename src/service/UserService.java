package service;

import dao.UserDao;

import entity.User;

public class UserService {
	UserDao dao = new UserDao();
	//判断用户是否存在
	public boolean isExistByName(String userName) {
		return dao.isExistByName(userName);
	}
	//添加用户
	public boolean addUser(User user) {
		return dao.addUser(user);
	}
	//根据用户名查询用户名与密码
	public User queryUserByNameAndPassWord(String userName) {

		return dao.queryUserByName(userName);
	}
	//根据用户名更新用户信息
	public boolean UpdateUserByName(User user){
		return dao.UpdateUserByName(user);
	}
}
