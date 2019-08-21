package org.nz.springall_start_demo.common;

import java.util.List;

public interface MyService<T> {
    List<T> selectAll();

    T selectByKey(Object key);

    int save(T object);

    int deleteByKey(Object key);

    int updateAll(T object);

    int updateNotNull(T object);

    List<T> selectByExample(Object example);
}
