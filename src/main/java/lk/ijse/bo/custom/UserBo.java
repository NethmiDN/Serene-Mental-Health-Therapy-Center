package lk.ijse.bo.custom;

import lk.ijse.entity.User;
import lk.ijse.util.Role;

import java.sql.SQLException;
import java.util.ArrayList;

public interface UserBo {
    boolean registerUser(String username,String email, String password, Role role);

    ArrayList<String> getAllRoll();

    User findByRoll(String selectedRoll) throws SQLException, ClassNotFoundException;
}
