package com.lagou.edu.service;

import com.lagou.edu.pojo.Resume;

import java.util.List;

/**
 * @program: jpa
 * @description:
 * @author: Created by zxd
 * @create: 2020-05-22 14:22
 **/
public interface ResumeService {

    //查询所有
    public List<Resume> queryAll();
    //添加或者修改
    public Resume saveResume(Resume r);
    //删除
    public void deleteResume(long id);
}
