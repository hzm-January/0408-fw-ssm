package houzm.ssm.tx.service;

import houzm.ssm.tx.model.TUser;

/**
 * Package: houzm.ssm.tx.service
 * Author: houzm
 * Date: Created in 2018/10/17 15:58
 * Copyright: Copyright (c) 2018
 * Version: 0.0.1
 * Modified By:
 * Description： user service
 */
public interface UserService {
    TUser queryById(Integer id);
    void updateUser(TUser user);
}
