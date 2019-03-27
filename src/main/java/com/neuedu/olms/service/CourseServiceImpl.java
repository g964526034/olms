package com.neuedu.olms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neuedu.olms.mapper.CourseMapper;
import com.neuedu.olms.po.Course;
import com.neuedu.olms.web.PageData;

@Service
public class CourseServiceImpl implements CourseService{
	@Autowired
	private CourseMapper courseMapper;
	
	public void addCoursse(Course course) {
		// TODO Auto-generated method stub
		courseMapper.addCourse(course);
	}

	public PageData<Course> list(String keyword, int curPage, int pageSize) {
		int begin = (curPage - 1) * pageSize;
		int totalRecord = courseMapper.getCourseByKeywordCount(keyword);
		List<Course> data = courseMapper.getCourseByKeyword(keyword,begin,pageSize);
		PageData<Course> pages = new PageData<Course>(pageSize,curPage);
		pages.setTotalRecord(totalRecord);
		pages.setData(data);
		return pages;
	}

}
