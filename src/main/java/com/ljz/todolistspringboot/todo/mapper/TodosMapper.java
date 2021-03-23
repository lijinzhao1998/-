package com.ljz.todolistspringboot.todo.mapper;

import com.ljz.todolistspringboot.todo.model.Todos;
import com.ljz.todolistspringboot.todo.model.TodosExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface TodosMapper {
    long countByExample(TodosExample example);

    int deleteByExample(TodosExample example);

    int deleteByPrimaryKey(String itemId);

    int insert(Todos record);

    int insertSelective(Todos record);

    List<Todos> selectByExample(TodosExample example);

    Todos selectByPrimaryKey(String itemId);

    int updateByExampleSelective(@Param("record") Todos record, @Param("example") TodosExample example);

    int updateByExample(@Param("record") Todos record, @Param("example") TodosExample example);

    int updateByPrimaryKeySelective(Todos record);

    int updateByPrimaryKey(Todos record);
}