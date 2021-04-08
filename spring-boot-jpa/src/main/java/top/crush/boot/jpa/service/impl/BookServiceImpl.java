package top.crush.boot.jpa.service.impl;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import top.crush.boot.jpa.entity.Book;
import top.crush.boot.jpa.response.BookRepository;
import top.crush.boot.jpa.service.BookService;

import javax.annotation.Resource;

/**
 * @author Crush
 * @date 2021/4/1
 * @dercsiption BookServiceImpl
 */
@Service
@Transactional(rollbackFor = {RuntimeException.class})
public class BookServiceImpl implements BookService {
    @Resource
    BookRepository bookRepository;

    @Override
    public Page<Book> findBookNoCriteria(Integer page, Integer size) {
        Pageable pageable = PageRequest.of(page,size);
        return bookRepository.findAll(pageable);
    }

    @Override
    public Page<Book> findBookCriteria(Integer page, Integer size, Book book) {
        return null;
    }
}
