package lk.ijse.bo.custom;

import lk.ijse.util.Role;

public interface UserBo {
    boolean registerUser(String username,String email, String password, Role role);
}
