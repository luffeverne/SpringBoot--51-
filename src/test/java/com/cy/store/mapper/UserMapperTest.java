package com.cy.store.mapper;

import com.cy.store.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author luffe
 * @date 2022/8/24
 */
// @SpringBootTest 表示当前的类是测试类，不会随项目一块打包
@SpringBootTest
public class UserMapperTest {
    // IDEA 有检测功能，接口是不能直接创建 Bean 的（动态代理技术来解决）
    @Autowired
    private UserMapper userMapper;
    /**
     * 1. 必须被 @Test 注解修饰
     * 2. 返回值类型必须是 void
     * 3. 方法的参数列表不指定任何类型
     * 4. 方法的访问修饰符必须是 public
     */
    @Test
    public void insert() {
        User user = new User();
        user.setUsername("tim");
        user.setPassword("123");
        Integer rows = userMapper.insert(user);
        System.out.println(rows);
    }

    @Test
    public void findByUsername() {
        String username = "tim";
        User result = userMapper.findByUsername(username);
        System.out.println(result);
    }

}
