package com.springboot.mapper;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.springboot.Entity.Person;
@Mapper
public interface PersonMapper {
	public void insertPerson(Person person);
    public int updatePerson(String userName, String password);
    public void deletePersonByUserName(String userName);
    public List<Person> loadUserByUsername(String userName);
    public List<Person> selectAllPerson();
}