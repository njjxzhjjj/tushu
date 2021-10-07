package com.xiexin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.xiexin.bean.BookExample;
import com.xiexin.bean.Book;
import com.xiexin.dao.BookDAO;
@Service("bookService")
public class BookServiceImpl implements BookService{
	@Autowired(required = false)
	private BookDAO bookDAO;
	public long countByExample(BookExample example){
    	return bookDAO.countByExample(example);
    }

	public int deleteByExample(BookExample example){
    	return bookDAO.deleteByExample(example);
    }

	public int deleteByPrimaryKey(Integer id){
    	return bookDAO.deleteByPrimaryKey(id);
    }

	public int insert(Book record){
    	return bookDAO.insert(record);
    }

	public int insertSelective(Book record){
    	return bookDAO.insertSelective(record);
    }

	public List<Book> selectByExample(BookExample example){
    	return bookDAO.selectByExample(example);
    }

	public Book selectByPrimaryKey(Integer id){
    	return bookDAO.selectByPrimaryKey(id);
    }
  
	public int updateByExampleSelective(Book record, BookExample example){
    	return bookDAO.updateByExampleSelective(record, example);
    }

	public int updateByExample(Book record, BookExample example){
    	return bookDAO.updateByExample(record, example);
    }

	public int updateByPrimaryKeySelective(Book record){
    	return bookDAO.updateByPrimaryKeySelective(record);
    }

	public int updateByPrimaryKey(Book record){
    	return bookDAO.updateByPrimaryKey(record);
    }


}
