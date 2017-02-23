package agent;


import dao.UserDao;

import java.sql.SQLException;

public class UserAgent {

    public Boolean selectPassword(String username,String password) throws SQLException {
        return new UserDao().selectPassword(username, password);
    }
}
