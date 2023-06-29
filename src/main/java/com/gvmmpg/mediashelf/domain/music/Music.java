package com.gvmmpg.mediashelf.domain.music;

public class Music {
    private String title;
    private String composer;
    private String interpreter;
    private String gender;
    private Integer time;
    private String consumption;

    public Music(MusicRegister data) {
        this.title = data.title();
        this.composer = data.composer();
        this.interpreter = data.interpreter();
        this.gender = data.gender();
        this.time = data.time();
        this.consumption = data.consumption();
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
