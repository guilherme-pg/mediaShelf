package com.gvmmpg.mediashelf.domain.game;

public record GameRegister(String game_title,
                           String game_studio,
                           String game_gender,
                           Integer game_year,
                           String game_consumption) {
}
