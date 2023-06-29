package com.gvmmpg.mediashelf.domain.book;

public record BookRegister(String book_title,
                           String book_authors,
                           String book_genderFields,
                           String book_publishers,
                           Integer book_year,
                           Integer book_pages,
                           String book_consumption) {
}
