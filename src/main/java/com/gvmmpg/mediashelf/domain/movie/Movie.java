package com.gvmmpg.mediashelf.domain.movie;

public class Movie {
    private String title;
    private String director;
    private String screenplay;
    private String photography;
    private String gender;
    private Integer year;
    private Integer time;
    private String consumption;

    public Movie(MovieRegister data) {
        this.title = data.title();
        this.director = data.director();
        this.screenplay = data.screenplay();
        this.photography = data.photography();
        this.gender = data.gender();
        this.year = data.year();
        this.time = data.time();
        this.consumption = data.consumption();
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", director='" + director + '\'' +
                ", screenplay='" + screenplay + '\'' +
                ", photography='" + photography + '\'' +
                ", gender='" + gender + '\'' +
                ", year=" + year +
                ", time=" + time +
                ", consumption=" + consumption +
                '}';
    }

    public String getTitle() {
        return title;
    }
    public String getDirector() {
        return director;
    }
    public String getScreenplay() {
        return screenplay;
    }
    public String getPhotography() {
        return photography;
    }
    public String getGender() {
        return gender;
    }
    public Integer getYear() {
        return year;
    }
    public Integer getTime() {
        return time;
    }
    public String getConsumption() {return consumption;}
}
