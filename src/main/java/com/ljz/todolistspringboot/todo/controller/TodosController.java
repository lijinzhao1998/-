package com.ljz.todolistspringboot.todo.controller;

import com.ljz.todolistspringboot.todo.model.Todos;
import com.ljz.todolistspringboot.todo.model.TodosExample;
import com.ljz.todolistspringboot.todo.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Random;

@RestController
@CrossOrigin
/**
 * @program: todolist-springboot
 * @description: 这是todo表的一个控制器，相当于serverlet
 * @author: li jinzhao
 * @create: 2020-06-23 14:28
 */

public class TodosController {
    @Autowired
    TodoService todoService;
    @GetMapping("/todos")
    public List<Todos> todosList(@RequestParam String userId, @RequestParam String currentStatus){
        TodosExample example = new TodosExample();
        TodosExample.Criteria criteria = example.createCriteria();
        if(null != userId && !"".equalsIgnoreCase(userId)){
            criteria.andUserIdEqualTo(userId);
        }
        if(null !=currentStatus && !"".equalsIgnoreCase(currentStatus)){
            criteria.andCurrentStatusEqualTo(currentStatus);
        }
       List<Todos> list = todoService.selectByExample(example);
       return  list;
    }
    @PostMapping("/todos")
    public Todos todoadd(@RequestBody Todos todos){
        Integer id = (int)(new Random().nextDouble()*10000000);
        todos.setItemId(id.toString());
        Date date = new Date(System.currentTimeMillis());
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.HOUR, 0);// 24小时制
        date = cal.getTime();
        todos.setCreatedTime(date);
        todos.setLastUpdateTime(date);
        todoService.insert(todos);
        return  todos;

    }
    @PutMapping("/todos")
    public Todos todoupdate(@RequestBody Todos todos){
        Date date = new Date(System.currentTimeMillis());
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.HOUR, 0);// 24小时制
        date = cal.getTime();
        todos.setLastUpdateTime(date);
        todoService.updateByPrimaryKeySelective(todos);
        return  todos;

    }
    @DeleteMapping("/todos/{id}")
    public  String tododeletes(@PathVariable String id){
        todoService.deleteByPrimaryKey(id);
        return  "200";
    }

}
