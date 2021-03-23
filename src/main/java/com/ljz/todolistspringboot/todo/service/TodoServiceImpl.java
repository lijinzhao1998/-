package com.ljz.todolistspringboot.todo.service;

import com.ljz.todolistspringboot.todo.mapper.TodosMapper;
import com.ljz.todolistspringboot.todo.model.Todos;
import com.ljz.todolistspringboot.todo.model.TodosExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: todolist-springboot
 * @description: 这是一个实现任务表数据库连接的实体类
 * @author: li jinzhao
 * @create: 2020-06-23 14:23
 */
@Service
public class TodoServiceImpl implements TodoService {
    @Autowired
    TodosMapper mapper;
    @Override
    public long countByExample(TodosExample example) {
        return mapper.countByExample(example);
    }

    @Override
    public int deleteByExample(TodosExample example) {
        return mapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(String itemId) {
        return mapper.deleteByPrimaryKey(itemId);
    }

    @Override
    public int insert(Todos record) {
        return mapper.insert(record);
    }

    @Override
    public int insertSelective(Todos record) {
        return mapper.insertSelective(record);
    }

    @Override
    public List<Todos> selectByExample(TodosExample example) {
        return mapper.selectByExample(example);
    }

    @Override
    public Todos selectByPrimaryKey(String itemId) {
        return mapper.selectByPrimaryKey(itemId);
    }

    @Override
    public int updateByExampleSelective(Todos record, TodosExample example) {
        return mapper.updateByExampleSelective(record,example);
    }

    @Override
    public int updateByExample(Todos record, TodosExample example) {
        return mapper.updateByExample(record,example);
    }

    @Override
    public int updateByPrimaryKeySelective(Todos record) {
        return mapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Todos record) {
        return mapper.updateByPrimaryKey(record);
    }
}
