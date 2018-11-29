package houzm.ssm.tx.service;

import houzm.ssm.tx.model.TUser;
import java.util.List;

/**
 * Package: houzm.ssm.tx.service
 * Author: houzm
 * Date: Created in 2018/10/17 16:02
 * Copyright: Copyright (c) 2018
 * Version: 0.0.1
 * Modified By:
 * Description：
 */
public interface UserOtherService {
    TUser queryById(Integer id);
    void updateById(TUser user);
    List<TUser> queryAll();
}
