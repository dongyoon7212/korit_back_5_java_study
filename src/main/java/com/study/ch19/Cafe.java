package com.study.ch19;

import lombok.ToString;

@ToString
public class Cafe {
    private String cafeName;
    private String location;
    private int menuCount;

    public Cafe(String cafeName, String location, int menuCount) {
        this.cafeName = cafeName;
        this.location = location;
        this.menuCount = menuCount;
    }

    public static CafeBuilder builder() {
        return new CafeBuilder();
    }

    public static class CafeBuilder {
        private String cafeName;
        private String location;
        private int menuCount;

        public CafeBuilder cafeName(String cafeName) {
            this.cafeName = cafeName;
            return this;
        }

        public CafeBuilder location(String location) {
            this.location = location;
            return this;
        }

        public CafeBuilder menuCount(int menuCount) {
            this.menuCount = menuCount;
            return this;
        }

        public Cafe build() {
            return new Cafe(cafeName, location, menuCount);
        }
    }

}
