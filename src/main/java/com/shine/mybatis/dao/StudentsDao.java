package com.shine.mybatis.dao;

import com.shine.mybatis.entity.Students;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (Students)表数据库访问层
 *
 * @author 陈奕廷
 * @since 2019-04-10 15:34:05
 */
public interface StudentsDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Students queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Students> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param students 实例对象
     * @return 对象列表
     */
    List<Students> queryAll(Students students);

    /**
     * 新增数据
     *
     * @param students 实例对象
     * @return 影响行数
     */
    int insert(Students students);

    /**
     * 修改数据
     *
     * @param students 实例对象
     * @return 影响行数
     */
    int update(Students students);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}