package com.gvmmpg.mediashelf.domain.serie;

public class Serie {
    private String title;
    private Integer season;
    private Integer year;
    private String gender;
    private String consumption;

    public Serie(SerieRegister data) {
        this.title = data.title();
        this.season = data.season();
        this.gender = data.gender();
        this.year = data.year();
        this.consumption = data.consumption();
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
