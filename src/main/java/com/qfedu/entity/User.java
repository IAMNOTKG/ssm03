package com.qfedu.entity;

import lombok.Data;

/**
 * @author 李冠凯.
 * @Description
 * @date 2019/9/9.
 * @time 16:45
 */
@Data
public class User {

    private Integer id;
    private String userName;
    private Integer sex;
    private Integer age;
    private String card;
    private String address;

}
