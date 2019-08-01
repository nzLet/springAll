package org.nz.springall_start_demo.service;

import org.nz.springall_start_demo.pojo.Syslog;

import java.util.List;

public interface SyslogService {
    List queryAllLogs();
    int saveSysLog(Syslog syslog);
}
