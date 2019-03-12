package github.xusheng.springboot.jpa.demo.controller;

import github.xusheng.springboot.jpa.demo.entity.User;
import github.xusheng.springboot.jpa.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Description
 * @Author xusheng
 * @Create 2019-03-12 13:57
 * @Version 1.0
 **/


@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(method = RequestMethod.GET,value = "/delete/{id}")
    public void delete(@PathVariable("id")int id){
        userService.delete(id);
    }

    @RequestMapping(method = RequestMethod.POST,value = "/insert")
    public void insert(User user){
        userService.insert(user);
    }
    @RequestMapping(method = RequestMethod.POST,value = "/update/{id}")
    public void update(@RequestParam User user){
        userService.update(user);
    }

    @RequestMapping(method = RequestMethod.GET,value = "/select/{id}")
    public User select(@PathVariable("id")int id){
        return userService.selectById(id);
    }

    @RequestMapping(method = RequestMethod.GET,value = "/selectAll/{pageNum}/{pageSize}")
    public List<User> selectAll(@PathVariable("pageNum") int pageNum, @PathVariable("pageSize") int pageSize){
        Iterator<User> userIterator = userService.selectAll(pageNum, pageSize);
        List<User> list = new ArrayList<>();
        while(userIterator.hasNext()){
            list.add(userIterator.next());
        }
        return list;
    }

    @RequestMapping(method = RequestMethod.GET,value = "/findUser")
    public List<User> findUser(@RequestParam("userName")String userName){
        return  userService.findUser(userName);
    }

}

