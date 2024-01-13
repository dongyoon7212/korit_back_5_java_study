package com.study.ch19;

import lombok.ToString;

@ToString
public class Phone {
    private String companyName;
    private String modelName;

    public Phone(String companyName, String modelName) {
        this.companyName = companyName;
        this.modelName = modelName;
    }

    public static PhoneBuilder builder() {
        return new PhoneBuilder();
    }

    public static class PhoneBuilder {
        private String companyName;
        private String modelName;

        public PhoneBuilder companyName(String companyName) {
            this.companyName = companyName;
            return this;
        }

        public PhoneBuilder modelName(String modelName) {
            this.modelName = modelName;
            return this;
        }

        public Phone build() {
            return new Phone(companyName, modelName);
        }
    }
}
