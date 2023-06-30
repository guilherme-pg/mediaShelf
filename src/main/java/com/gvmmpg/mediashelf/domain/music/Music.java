package com.gvmmpg.mediashelf.domain.music;

import jakarta.persistence.*;

@Entity
@Table(name="musics")
public class Music {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String composer;
    private String interpreter;
    private String gender;
    private Integer time;
    private String consumption;

    public Music(MusicRegister data) {
        this.title = data.music_title();
        this.composer = data.music_composer();
        this.interpreter = data.music_interpreter();
        this.gender = data.music_gender();
        this.time = data.music_time();
        this.consumption = data.music_consumption();
    }

    @Override
    public String toString() {
        return "Music{" +
                "title='" + title + '\'' +
                ", composer='" + composer + '\'' +
                ", interpreter='" + interpreter + '\'' +
                ", gender='" + gender + '\'' +
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
    public String getComposer() {
        return composer;
    }
    public String getInterpreter() {
        return interpreter;
    }
    public String getGender() {
        return gender;
    }
    public Integer getTime() {
        return time;
    }
    public String getConsumption() {return consumption;}
}
