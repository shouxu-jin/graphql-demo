package org.mufeng.examples.dto;

import lombok.Builder;
import lombok.Data;

/**
 * Created by JiaZaibo on 2019/1/11
 *
 * @Author: JiaZaibo
 */
@Builder
@Data
public class Book {
    private Integer id;
    private String name;
    private Author author;
    private String publisher;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
}
