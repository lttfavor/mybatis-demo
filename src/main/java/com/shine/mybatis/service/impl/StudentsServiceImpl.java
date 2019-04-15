package com.shine.mybatis.service.impl;

import com.shine.mybatis.entity.Students;
import com.shine.mybatis.dao.StudentsDao;
import com.shine.mybatis.service.StudentsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Students)表服务实现类
 *
 * @author 陈奕廷
 * @since 2019-04-10 15:34:06
 */
@Service("studentsService")
public class StudentsServiceImpl implements StudentsService {
    @Resource
    private StudentsDao studentsDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Students queryById(Integer id) {
        return this.studentsDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Students> queryAllByLimit(int offset, int limit) {
        return this.studentsDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param students 实例对象
     * @return 实例对象
     */
    @Override
    public Students insert(Students students) {
        this.studentsDao.insert(students);
        return students;
    }

    /**
     * 修改数据
     *
     * @param students 实例对象
     * @return 实例对象
     */
    @Override
    public Students update(Students students) {
        this.studentsDao.update(students);
        return this.queryById(students.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.studentsDao.deleteById(id) > 0;
    }
}