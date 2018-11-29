package houzm.ssm.tx.service;

import houzm.ssm.tx.dao.TUserMapper;
import houzm.ssm.tx.model.TUser;
import houzm.ssm.tx.model.TUserExample;
import java.util.List;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Package: houzm.ssm.tx.service
 * Author: houzm
 * Date: Created in 2018/10/17 16:02
 * Copyright: Copyright (c) 2018
 * Version: 0.0.1
 * Modified By:
 * Description：
 */
@Service("userOtherService")
public class UserOtherServiceImpl implements UserOtherService {

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
    public void updateById(TUser user) {
        TUserExample userExample = new TUserExample();
        userMapper.updateByExample(user, userExample);
    }

    @Override
    @Transactional(readOnly = false)
    public List<TUser> queryAll() {
        TUserExample userExample = new TUserExample();
        return userMapper.selectByExample(userExample);
    }
}
