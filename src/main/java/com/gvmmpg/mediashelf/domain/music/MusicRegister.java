package com.gvmmpg.mediashelf.domain.music;

public record MusicRegister(String music_title,
                            String music_composer,
                            String music_interpreter,
                            String music_gender,
                            Integer music_time,
                            String music_consumption) {
}
