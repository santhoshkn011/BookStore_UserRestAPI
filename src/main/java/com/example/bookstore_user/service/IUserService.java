package com.example.bookstore_user.service;

import com.example.bookstore_user.dto.ChangePasswordDTO;
import com.example.bookstore_user.dto.ForgotPasswordDTO;
import com.example.bookstore_user.dto.LoginDTO;
import com.example.bookstore_user.dto.UserDTO;
import com.example.bookstore_user.model.UserDetails;

import java.util.List;

public interface IUserService {
    //    UserDetails addUserData(UserDTO userDto);
    String insertData(UserDTO userDTO);

    List<UserDetails> getAllUserData();

    UserDetails getUserDataById(Long id);
    UserDetails getUserDetailsById(Long id);

    UserDetails getUserDataByEmailAddress(String email);

    UserDetails updateDataByEmail(UserDTO userDTO, String email);

    UserDetails deleteData(Long id);

    UserDetails getUserDataByToken(String token);

    String loginUser(LoginDTO loginDTO);

    String changePassword(ChangePasswordDTO changePasswordDTO);

    String forgotPassword(String email);

    String resetPassword(ForgotPasswordDTO forgotPasswordDTO);

    UserDetails getUserDetailsByToken(String token);
}
