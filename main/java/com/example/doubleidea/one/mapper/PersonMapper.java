package com.example.doubleidea.one.mapper;/*
 * Created by ZHANG on 2018/7/23
 */
import java.util.List;
import java.util.Map;
import com.example.doubleidea.Person.Person;

public interface PersonMapper {
//数据库操作放这里
    //public Map seletemap(Integer id);
    public Person seleteperson(Integer id);
    public Person saveUser(Integer id, Integer name);
    public Person modify(Integer id, Integer name);
    public Person dele(Integer id) ;
}
