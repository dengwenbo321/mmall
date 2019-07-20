package com.mmall.service;

import com.mmall.common.ServerResponse;
import com.mmall.pojo.User;

/**
 * @author: Deng
 * @date: 2019/7/20 9:21
 */
public interface IUserService {

    ServerResponse<User> login(String username,String password);
}
