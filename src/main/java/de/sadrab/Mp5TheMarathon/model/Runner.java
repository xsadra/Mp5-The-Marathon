package de.sadrab.Mp5TheMarathon.model;

import java.time.Duration;

public class Runner {
    private String name;
    private Duration time;

    public Runner(String name, Duration time) {
        this.name = name;
        this.time = time;
    }

    public Runner() {
    }

    public Runner(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Duration getTime() {
        return time;
    }

    public void setTime(Duration time) {
        this.time = time;
    }
}
