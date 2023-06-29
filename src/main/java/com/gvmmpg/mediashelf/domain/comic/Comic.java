package com.gvmmpg.mediashelf.domain.comic;

public class Comic {

    private String title;
    private String writer;
    private String illustrator;
    private String gender;
    private Integer year;
    private Integer pages;
    private String consumption;

    public Comic(ComicRegister data) {
        this.title = data.title();
        this.illustrator = data.ilustrator();
        this.writer = data.writer();
        this.gender = data.gender();;
        this.year = data.year();
        this.pages = data.pages();
        this.consumption = data.consumption();
    }

    @Override
    public String toString() {
        return "Comic{" +
                "title='" + title + '\'' +
                ", writer='" + writer + '\'' +
                ", illustrator='" + illustrator + '\'' +
                ", gender='" + gender + '\'' +
                ", year=" + year + '\'' +
                ", pages=" + pages + '\'' +
                ", consumption=" + consumption +
                '}';
    }

    public String getTitle() {
        return title;
    }
    public String getWriter() {
        return writer;
    }
    public String getIllustrator() {
        return illustrator;
    }
    public String getGender() {
        return gender;
    }
    public Integer getYear() {
        return year;
    }
    public Integer getPages() {
        return pages;
    }
    public String getConsumption() {return consumption;}
}
