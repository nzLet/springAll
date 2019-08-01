package org.nz.springall_start_demo.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.nz.springall_start_demo.pojo.Syslog;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface SyslogMapper {
    int saveSysLog(Syslog syslog);

    List queryAllLogs();
}
