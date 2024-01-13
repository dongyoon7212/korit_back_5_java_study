package com.study.ch19;

import lombok.ToString;

@ToString
public class MacBook {
    private String cpu;
    private String ram;

    public MacBook(String cpu, String ram) {
        this.cpu = cpu;
        this.ram = ram;
    }

    public static macBookBuilder builder() {
        return new macBookBuilder();
    }

    public static class macBookBuilder {
        private String cpu;
        private String ram;

        public macBookBuilder cpu(String cpu) {
            this.cpu = cpu;
            return this;
        }

        public macBookBuilder ram(String ram) {
            this.ram = ram;
            return this;
        }

        public MacBook build() {
            return new MacBook(cpu, ram);
        }

    }
}
