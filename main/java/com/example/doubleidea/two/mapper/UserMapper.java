package com.example.doubleidea.two.mapper;/*
 * Created by ZHANG on 2018/7/23
 */

import com.example.doubleidea.Person.Person;
import com.example.doubleidea.Person.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
//数据库操作放这里
    //public Map seleteAll() throws Exception;
    public User seleteperson(Integer id);
    public User saveUser(Integer id, Integer name);
    public User modify(Integer id, Integer name);
    public User dele(Integer id) ;
}
