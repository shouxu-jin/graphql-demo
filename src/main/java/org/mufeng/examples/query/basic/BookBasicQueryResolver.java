package org.mufeng.examples.query.basic;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.mufeng.examples.dto.Book;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by JiaZaibo on 2019/1/11
 */
@Component
public class BookBasicQueryResolver implements GraphQLQueryResolver {


    public List<Book> findBooks() {
        Book b = Book.builder()
                .id(1)
                .name("scala编程第三版")
                .publisher("电子工业出版社")
                .build();
        List<Book> bookList = new ArrayList<>();
        bookList.add(b);
        return bookList;
    }


}
