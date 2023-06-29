package com.gvmmpg.mediashelf.domain.music;

public record MusicRegister(String title,
                            String composer,
                            String interpreter,
                            String gender,
                            Integer time,
                            String consumption) {
}
