package org.nz.springall_start_demo.service.impl;

import org.nz.springall_start_demo.mapper.SyslogMapper;
import org.nz.springall_start_demo.pojo.Syslog;
import org.nz.springall_start_demo.service.SyslogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service(value = "syslogService")
public class SyslogServiceImpl implements SyslogService {
    @Autowired
    private SyslogMapper syslogMapper;
    @Override
    public List queryAllLogs() {
        return syslogMapper.queryAllLogs();
    }

    @Override
    public int saveSysLog(Syslog syslog) {
        System.out.println("==============service================"+syslog);

        return syslogMapper.saveSysLog(syslog);
    }
}
