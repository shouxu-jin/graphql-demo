package org.mufeng.examples.query.cascade;

import com.coxautodev.graphql.tools.GraphQLResolver;
import org.mufeng.examples.dto.Author;
import org.mufeng.examples.dto.Book;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

/**
 * Created by JiaZaibo on 2019/1/11
 */
@Component
public class BookCascadeQueryResolver implements GraphQLResolver<Book> {


    public Author author(Book book) {
        Author author = Author.builder()
                .id(120)
                .name("XXX")
                .age(40)
                .build();
        return author;
    }

    public List<Author> authors(Book book) {
        Author author = Author.builder()
                .id(999)
                .name("XXX")
                .age(40)
                .build();
        return Arrays.asList(author);
    }

    public Book parent(Book book) {
        if (book.getId() > 4000) {
            return null;
        }
        Book b = Book.builder()
                .id(1)
                .name("scala编程第三版X")
                .publisher("电子工业出版社X")
                .build();
        b.setId(book.getId() + 1999);
        b.setName(b.getName() + b.getId());
        b.setPublisher(b.getPublisher() + b.getId());
        System.out.println("SBbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb");
        return b;
    }

}
