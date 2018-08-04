package com.example.doubleidea.Controller;/*
 * Created by ZHANG on 2018/7/30
 */

import com.example.doubleidea.Person.Person;
import com.example.doubleidea.Person.User;
import com.example.doubleidea.one.mapper.PersonMapper;
import com.example.doubleidea.two.mapper.UserMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.Map;

@Controller
public class personcontroller {
    final static Logger logger = LoggerFactory.getLogger(personcontroller.class);

    @Autowired
    UserMapper userMapper;

    @Autowired
    PersonMapper personMapper;

    @ResponseBody
    @RequestMapping("/hello")
    public String hello(){
         Person person = personMapper.seleteperson(6);
         User user = userMapper.seleteperson(1);

         logger.info(person+"....."+user);
        System.out.println("person id:"+person.getId()+".... person name:"+person.getName());
        System.out.println("user id:"+user.getId()+".... user name:"+user.getUsername()+"...password:"+user.getPassword());
         return null;
         //return person.getId()+"..."+person.getName();
    }
}
