package com.gvmmpg.mediashelf.domain.serie;

import jakarta.persistence.*;

@Entity
@Table(name="series")
public class Serie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private Integer season;
    private Integer year;
    private String gender;
    private String consumption;

    public Serie(SerieRegister data) {
        this.title = data.series_title();
        this.season = data.series_season();
        this.gender = data.series_gender();
        this.year = data.series_year();
        this.consumption = data.series_consumption();
    }

    @Override
    public String toString() {
        return "Serie{" +
                "title='" + title + '\'' +
                ", season=" + season +
                ", year=" + year +
                ", gender='" + gender + '\'' +
                ", consumption=" + consumption +
                '}';
    }

    public Long getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }
    public Integer getSeason() {
        return season;
    }
    public Integer getYear() {
        return year;
    }
    public String getGender() {
        return gender;
    }
    public String getConsumption() {return consumption;}
}
