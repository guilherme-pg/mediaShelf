package com.gvmmpg.mediashelf.domain.comic;

public record ComicRegister(String title,
                            String ilustrator,
                            String writer,
                            String gender,
                            Integer year,
                            Integer pages,
                            String consumption) {
}
