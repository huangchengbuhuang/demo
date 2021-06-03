package com.graduate.design.graduatedesign.pojo;

import javax.annotation.Generated;

/**GRADUATE-DESIGIN
 * @author 荒城
 * @title: User
 * @projectName graduatedesign
 * @description: TODO
 * @date 2021/4/2422:09
 */
public class User {

   /* @TableId(value = "id", type = IdType.AUTO)	//指定主键生成策略*/
    private int id;
    private String name;
    private String phone;
    private String email;
    private String Password;
    private Long gmtCreate;
    private Long gmtModified;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public Long getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Long gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Long getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Long gmtModified) {
        this.gmtModified = gmtModified;
    }
}
