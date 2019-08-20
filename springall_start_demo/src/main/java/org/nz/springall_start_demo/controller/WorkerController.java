package org.nz.springall_start_demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("worker")
public class WorkerController {

    @GetMapping("/{id:\\d+}")
    public void get(@PathVariable String id){
        System.out.println(id);
        throw new RuntimeException("worker is not exit");
    }
}
