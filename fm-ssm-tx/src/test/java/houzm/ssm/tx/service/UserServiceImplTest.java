package houzm.ssm.tx.service;

import houzm.ssm.tx.model.TUser;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * UserServiceImpl Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>10/17/2018</pre>
 */
@RunWith(value = SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath*:application-context.xml")
public class UserServiceImplTest {

    @Autowired
    private UserService userService;

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: queryById(Integer id)
     */
    @Test
    public void testQueryById() throws Exception {
    }

    /**
     * Method: updateUser(TUser user)
     */
    @Test
    public void testUpdateUser() throws Exception {
        TUser user = new TUser();
        user.setId(1);
        user.setName("jermy");
        user.setAge(11);
        userService.updateUser(user);
    }


} 
