package com.gvmmpg.mediashelf.domain.movie;

public record MovieRegister(String title,
                            String director,
                            String screenplay,
                            String photography,
                            Integer year,
                            String gender,
                            Integer time,
                            String consumption) {
}
