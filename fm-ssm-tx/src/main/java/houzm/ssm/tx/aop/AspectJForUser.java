package houzm.ssm.tx.aop;

import houzm.ssm.common.JsonUtil;
import houzm.ssm.tx.model.TUser;
import houzm.ssm.tx.service.UserOtherService;
import java.util.Arrays;
import java.util.List;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Package: houzm.ssm.tx.aop
 * Author: houzm
 * Date: Created in 2018/10/17 16:20
 * Copyright: Copyright (c) 2018
 * Version: 0.0.1
 * Modified By:
 * Description： aspectj for user
 */
@Aspect
@Component
public class AspectJForUser {

    @Autowired
    private UserOtherService userOtherService;
    private Logger logger = LoggerFactory.getLogger(AspectJForUser.class);

    @Pointcut(value = "execution(public * houzm.ssm.tx.service.UserService.update*(..))")
    public void pointCut(){};

    @After(value = "pointCut()")
    public void operation(){
        logger.debug("=============================后置通知===============================");
        List<TUser> users = userOtherService.queryAll();
        logger.debug("{}", JsonUtil.objectToJson(users));
    }
}
