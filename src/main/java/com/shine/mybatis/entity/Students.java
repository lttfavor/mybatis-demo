package com.shine.mybatis.entity;

import com.shine.mybatis.annotation.CreateTime;
import com.shine.mybatis.annotation.UpdateTime;

import java.util.Date;
import java.io.Serializable;

/**
 * (Students)实体类
 *
 * @author 陈奕廷
 * @since 2019-04-10 15:34:04
 */
public class Students implements Serializable {
    private static final long serialVersionUID = -42262347093698334L;
    
    private Integer id;
    
    private String name;
    
    private Integer age;
    @CreateTime
    private Date createtime;
    @UpdateTime
    private Date updatetime;
    
    private Double scores;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public Double getScores() {
        return scores;
    }

    public void setScores(Double scores) {
        this.scores = scores;
    }

}