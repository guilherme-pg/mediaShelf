package com.gvmmpg.mediashelf.domain.comics;

import jakarta.persistence.*;

@Entity
@Table(name="comics")
public class Comics {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String comics_title;
    private String comics_writer;
    private String comics_illustrator;
    private String comics_gender;
    private Integer comics_year;
    private Integer comics_pages;
    private String comics_consumption;

    public Comics(ComicsRegister data) {
        this.comics_title = data.comics_title();
        this.comics_illustrator = data.comics_illustrator();
        this.comics_writer = data.comics_writer();
        this.comics_gender = data.comics_gender();;
        this.comics_year = data.comics_year();
        this.comics_pages = data.comics_pages();
        this.comics_consumption = data.comics_consumption();
    }

    @Override
    public String toString() {
        return "Comic{" +
                "title='" + comics_title + '\'' +
                ", writer='" + comics_writer + '\'' +
                ", illustrator='" + comics_illustrator + '\'' +
                ", gender='" + comics_gender + '\'' +
                ", year=" + comics_year + '\'' +
                ", pages=" + comics_pages + '\'' +
                ", consumption=" + comics_consumption +
                '}';
    }

    public Long getId() {
        return id;
    }
    public String getTitle() {
        return comics_title;
    }
    public String getWriter() {
        return comics_writer;
    }
    public String getIllustrator() {
        return comics_illustrator;
    }
    public String getGender() {
        return comics_gender;
    }
    public Integer getYear() {
        return comics_year;
    }
    public Integer getPages() {
        return comics_pages;
    }
    public String getConsumption() {return comics_consumption;}
}
