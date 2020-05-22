package com.lagou.edu.controller;

import com.lagou.edu.pojo.Resume;
import com.lagou.edu.service.ResumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
/**
 * @program: jpa
 * @description:
 * @author: Created by zxd
 * @create: 2020-05-22 14:22
 **/
@Controller
@RequestMapping("/resume")
public class ResumeController {
    @Autowired
    private ResumeService resumeService;

    @RequestMapping("/queryAll")
    public @ResponseBody List<Resume> queryAll() {
        List<Resume> list = resumeService.queryAll();
        return list;
    }

    @RequestMapping("/save")
    public @ResponseBody Boolean saveResume(@RequestBody Resume r) {
        if(resumeService.saveResume(r)==null){
            return false;
        }
        return true;
    }

    @RequestMapping("/delete")
    public @ResponseBody Boolean deleteResume(@RequestBody Resume r) {
        resumeService.deleteResume(r.getId());
        return true;
    }
}
