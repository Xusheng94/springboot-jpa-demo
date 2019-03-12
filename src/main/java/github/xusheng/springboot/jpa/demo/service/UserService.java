package github.xusheng.springboot.jpa.demo.service;

import github.xusheng.springboot.jpa.demo.entity.User;

import java.util.Iterator;

/**
 * @Description
 * @Author xusheng
 * @Create 2019-03-12 13:55
 * @Version 1.0
 **/
public interface UserService {

    public void delete(int id);
    /** 增加*/
    public void insert(User user);
    /** 更新*/
    public int update(User user);
    /** 查询单个*/
    public User selectById(int id);
    /** 查询全部列表*/
    public Iterator<User> selectAll(int pageNum, int pageSize);

}
