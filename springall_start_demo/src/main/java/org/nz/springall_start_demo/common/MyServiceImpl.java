package org.nz.springall_start_demo.common;

import org.springframework.beans.factory.annotation.Autowired;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public abstract class MyServiceImpl<T> implements MyService<T>{

    @Autowired
    private Mapper<T> mapper;
    @Autowired

    public Mapper<T> getMapper(){
        return mapper;
    }

    @Override
    public List<T> selectAll() {
        //查所有
        return mapper.selectAll();

    }

    @Override
    public T selectByKey(Object key) {
        //根据主键查数据
        return mapper.selectByPrimaryKey(key);
    }

    @Override
    public int save(T object) {
        //保存数据,null也会保存，不会使用数据库默认值
        return mapper.insert(object);
    }

    @Override
    public int deleteByKey(Object key) {
        //根据主键删除

        return mapper.deleteByPrimaryKey(key);
    }

    @Override
    public int updateAll(T object) {
        //根据主键更新全部字段，null值也更新
        return mapper.updateByPrimaryKey(object);
    }

    @Override
    public int updateNotNull(T object) {
        //根据主键更新属性不为空的字段
        return mapper.updateByPrimaryKeySelective(object);
    }

    @Override
    public List<T> selectByExample(Object example) {
        //根据example条件进行查询

        return mapper.selectByExample(example);
    }
}
