package com.neuedu.olms.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.neuedu.olms.po.Course;

public interface CourseMapper {
	/**
	 * ��ӿγ�
	 * @param course
	 */
	public void addCourse(Course course);
	
	/**
	 * ͳ��ҳ������
	 * @param keyword
	 * @return
	 */
	public int getCourseByKeywordCount(@Param("keyword") String keyword);
	
	/**
	 * ��ҳ��ѯ
	 * @param keyword
	 * @param begin
	 * @param pageSize
	 * @return
	 */
	public List<Course> getCourseByKeyword(@Param("keyword")String keyword,@Param("begin")int begin,@Param("pageSize")int pageSize);
}
