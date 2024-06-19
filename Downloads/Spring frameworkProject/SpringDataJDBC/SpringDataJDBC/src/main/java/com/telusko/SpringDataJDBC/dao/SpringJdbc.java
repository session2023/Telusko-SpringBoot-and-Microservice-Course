package com.telusko.SpringDataJDBC.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class SpringJdbc 
{
//	private static final String SQL_QUERY = "INSERT INTO STUDENT(id, name, city) "
//			+ "values(1, 'Virat', 'Bengaluru')";

	private static final String SQL_QUERY_DELETE = "DELETE FROM COURSE WHERE cid=?";

	private static final String SQL_QUERY_Course ="INSERT INTO COURSE(cid, cname) "
			+ "values(?,?)";
	
	@Autowired
	private JdbcTemplate jdbc;
	
	
//	public void insert()
//	{
//		System.out.println("JdbcTemplate "+jdbc.getClass().getName());
//		System.out.println("Control is in insert");
//		jdbc.update(SQL_QUERY);
//	}
	
	public void insert(CourseDetails course)
	{
		System.out.println("Control is in insert with course");
//		Integer id = course.getCid();
//		String name = course.getCname();
//		jdbc.update(SQL_QUERY_Course, id, name);
		
		int row=jdbc.update(SQL_QUERY_Course, course.getCid(), course.getCname());
		System.out.println(row);
	}
	
	public void delete(Integer id)
	{
	
		System.out.println("Control is in delete");
		int rowAffected=jdbc.update(SQL_QUERY_DELETE, id);
		System.out.println("Rows deleted "+ rowAffected);
	}

}
