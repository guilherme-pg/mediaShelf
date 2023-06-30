package com.gvmmpg.mediashelf.domain.movie;

public record MovieRegister(String movie_title,
                            String movie_director,
                            String movie_screenplay,
                            String movie_photography,
                            Integer movie_year,
                            String movie_gender,
                            Integer movie_time,
                            String movie_consumption) {
}
