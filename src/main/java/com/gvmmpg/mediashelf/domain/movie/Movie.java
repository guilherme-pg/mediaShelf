package com.gvmmpg.mediashelf.domain.movie;

import jakarta.persistence.*;

@Entity
@Table(name="movies")
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String director;
    private String screenplay;
    private String photography;
    private String gender;
    private Integer year;
    private Integer time;
    private String consumption;

    public Movie(MovieRegister data) {
        this.title = data.movie_title();
        this.director = data.movie_director();
        this.screenplay = data.movie_screenplay();
        this.photography = data.movie_photography();
        this.gender = data.movie_gender();
        this.year = data.movie_year();
        this.time = data.movie_time();
        this.consumption = data.movie_consumption();
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

    public Long getId() {
        return id;
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
