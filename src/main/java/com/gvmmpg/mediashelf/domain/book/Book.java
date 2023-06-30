package com.gvmmpg.mediashelf.domain.book;

import jakarta.persistence.*;

@Entity
@Table(name="books")
public class Book {

    // Attributes
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String book_title;
    private String book_authors;
    private String book_genderFields;
    private String book_publishers;
    private Integer book_year;
    private Integer book_pages;
    private String book_consumption;

    public Book(BookRegister data) {
        this.book_title = data.book_title();
        this.book_authors = data.book_authors();
        this.book_genderFields = data.book_genderFields();
        this.book_publishers = data.book_publishers();
        this.book_year = data.book_year();
        this.book_pages = data.book_pages();
        this.book_consumption = data.book_consumption();
    }

    // To String
    @Override
    public String toString() {
        return "Book{" +
                "book_title='" + book_title + '\'' +
                ", book_authors='" + book_authors + '\'' +
                ", book_genderFields='" + book_genderFields + '\'' +
                ", book_publishers='" + book_publishers + '\'' +
                ", book_year=" + book_year +
                ", book_pages=" + book_pages +
                ", book_consumption='" + book_consumption + '\'' +
                '}';
    }

    // Getters
    public Long getId() {
        return id;
    }
    public String getTitle() {
        return book_title;
    }
    public String getAuthors() {
        return book_authors;
    }
    public String getGenderFields() {
        return book_genderFields;
    }
    public String getPublishers() {
        return book_publishers;
    }
    public Integer getYear() {
        return book_year;
    }
    public Integer getPages() {
        return book_pages;
    }
    public String getConsumption() {return book_consumption;}
}
