package com.study.ch19;

import lombok.ToString;

@ToString
public class Music {
    private String musicTitle;
    private String type;

    public Music(String musicTitle, String type) {
        this.musicTitle = musicTitle;
        this.type = type;
    }

    public static MusicBuilder builder() {
        return new MusicBuilder();
    }

    public static class MusicBuilder {
        private String musicTitle;
        private String type;

        public MusicBuilder musicTitle(String musicTitle) {
            this.musicTitle = musicTitle;
            return this;
        }

        public MusicBuilder type(String type) {
            this.type = type;
            return this;
        }

        public Music build() {
            return new Music(musicTitle, type);
        }
    }
}
