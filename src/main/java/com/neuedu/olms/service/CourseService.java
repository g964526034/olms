package com.neuedu.olms.service;

import com.neuedu.olms.po.Course;
import com.neuedu.olms.web.PageData;

public interface CourseService {
	/**
	 * ��ӿγ�
	 * @param course
	 */
	public void addCoursse(Course course);
	
	/**
	 * ��ҳ��ʾ�γ���Ϣ
	 * @param keyword
	 * @param curPage
	 * @param pageSize
	 * @return
	 */
	public PageData<Course> list(String keyword,int curPage,int pageSize);
}
