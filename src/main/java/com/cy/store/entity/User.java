package com.cy.store.entity;

import lombok.*;

import java.io.Serializable;

/**
 * @author luffe
 * @date 2022/8/24
 */
/** 用户实体类
 * 实现接口的目的是：让类序列化，便于储存和数据传输
 * */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class User extends BaseEntity implements Serializable {
    private Integer uid;
    private String username;
    private String password;
    private String salt;
    private String phone;
    private String email;
    private Integer gender;
    private String avatar;
    private Integer isDelete;
}
