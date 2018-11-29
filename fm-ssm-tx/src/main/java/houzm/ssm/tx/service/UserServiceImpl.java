package houzm.ssm.tx.service;

import houzm.ssm.common.JsonUtil;
import houzm.ssm.tx.dao.TUserMapper;
import houzm.ssm.tx.model.TUser;
import houzm.ssm.tx.model.TUserExample;
import java.util.List;
import org.apache.commons.collections.CollectionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * Package: houzm.ssm.tx.service
 * Author: houzm
 * Date: Created in 2018/10/17 15:59
 * Copyright: Copyright (c) 2018
 * Version: 0.0.1
 * Modified By:
 * Description：
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    private Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);
    @Autowired
    private TUserMapper userMapper;
    @Override
    public TUser queryById(Integer id) {
        TUserExample userExample = new TUserExample();
        userExample.createCriteria().andIdEqualTo(id);
        List<TUser> tUsers = userMapper.selectByExample(userExample);
        return CollectionUtils.isNotEmpty(tUsers)?tUsers.get(0):null;
    }

    @Override
    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
    public void updateUser(TUser user) {
        logger.debug("userservice updateUser {} ", JsonUtil.objectToJson(user));
        TUserExample userExample = new TUserExample();
        userMapper.updateByExample(user, userExample);
    }
}
