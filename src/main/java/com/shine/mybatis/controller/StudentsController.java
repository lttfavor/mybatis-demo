package com.shine.mybatis.controller;

import com.shine.mybatis.entity.Students;
import com.shine.mybatis.service.StudentsService;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Students)表控制层
 *
 * @author 陈奕廷
 * @since 2019-04-10 15:34:06
 */
@RestController
@RequestMapping("students")
public class StudentsController {
    /**
     * 服务对象
     */
    @Resource
    private StudentsService studentsService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Students selectOne(Integer id) {
        return this.studentsService.queryById(id);
    }

    @GetMapping("tc")
    @Transactional(rollbackFor=Exception.class)
    public void tc() throws Exception {
        Students student1 = new Students();
        Students student2 = new Students();
        student1.setName("222");
        student1.setAge(2);
        student2 = studentsService.insert(student1);
        if(false){
            throw new Exception();
        }
        studentsService.insert(student1);
    }

}