package top.crush.boot.jpa.service;

import org.springframework.data.domain.Page;
import top.crush.boot.jpa.entity.Book;

public interface BookService {
    /**
     * 不带条件查询书
     * @param page
     * @param size
     * @return Page<Book>
     */

    Page<Book> findBookNoCriteria(Integer page, Integer size);

    /**
     * 带条件查询书
     * @param page
     * @param size
     * @return Page<Book>
     */

    Page<Book> findBookCriteria(Integer page,Integer size,Book book);
}
