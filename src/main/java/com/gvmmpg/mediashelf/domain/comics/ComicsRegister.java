package com.gvmmpg.mediashelf.domain.comics;

public record ComicsRegister(String comics_title,
                             String comics_illustrator,
                             String comics_writer,
                             String comics_gender,
                             Integer comics_year,
                             Integer comics_pages,
                             String comics_consumption) {
}
