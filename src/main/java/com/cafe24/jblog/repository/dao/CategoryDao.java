package com.cafe24.jblog.repository.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cafe24.jblog.vo.CategoryVo;

@Repository
public class CategoryDao {

	
	@Autowired
	private SqlSession session;
	
	public List<CategoryVo> selectCategoryList(String id) {

		return session.selectList("category.selectCategoryList", id);
	}

	public int insertCategory(CategoryVo categoryVo) {
		
		return session.insert("category.insert", categoryVo);
	}

	public int deleteCategory(Long categoryNo) {
		
		return session.delete("category.delete", categoryNo);
	}
}
