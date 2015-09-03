package dao;

public class DaoFactory {
	private UserDao userDao = null;
	private RoleDao roleDao = null;
	
	private static DaoFactory instance = null;
	
	private DaoFactory() {
		userDao = new UserDao();
		roleDao = new RoleDao();
	}
	
	public static synchronized DaoFactory getInstance() {
		if(instance == null) {
			instance = new DaoFactory();
		}
		return instance;
	}
	
	public UserDao getUserDao() {
		return userDao;
	}
	
	public RoleDao getRoleDao() {
		return roleDao;
	}
}
