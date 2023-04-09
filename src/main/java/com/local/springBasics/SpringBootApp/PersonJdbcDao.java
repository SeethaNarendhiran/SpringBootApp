package com.local.springBasics.SpringBootApp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class PersonJdbcDao {

	@Autowired
	JdbcTemplate jdbctemp;

	public List<Person> findAll() {
		return jdbctemp.query("select * from person", new BeanPropertyRowMapper<Person>(Person.class));
	}
	
	public Person findById(int id) {
		return jdbctemp.queryForObject("select * from person where id=?", new Object[]{id},new BeanPropertyRowMapper<Person>(Person.class));
	}
	
	public List<Person> findByName(String name){
		return jdbctemp.query("select * from person where name=?", new Object[]{name}, new BeanPropertyRowMapper<Person>(Person.class));
		
	}
	
	

}
