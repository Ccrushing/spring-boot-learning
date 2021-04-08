package top.crush.boot.jpa.response;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import top.crush.boot.jpa.entity.Book;

public interface BookRepository extends JpaRepository<Book,Integer>, JpaSpecificationExecutor<Book> {
}
