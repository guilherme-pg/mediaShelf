package com.gvmmpg.mediashelf.domain.game;

import jakarta.persistence.*;

@Entity
@Table(name="games")
public class Game {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String studio;
    private String gender;
    private Integer year;
    private String consumption;

    public Game(GameRegister data) {
        this.title = data.game_title();
        this.studio = data.game_studio();
        this.gender = data.game_gender();
        this.year = data.game_year();
        this.consumption = data.game_consumption();
    }

    @Override
    public String toString() {
        return "Game{" +
                "title='" + title + '\'' +
                ", studio='" + studio + '\'' +
                ", gender='" + gender + '\'' +
                ", year=" + year +
                ", consumption=" + consumption + '\'' +
                '}';
    }

    public Long getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }
    public String getStudio() {
        return studio;
    }
    public String getGender() {
        return gender;
    }
    public Integer getYear() {
        return year;
    }
    public String getConsumption() {return consumption;}
}
