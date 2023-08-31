package com.ds.memento;

import java.time.LocalDate;

public class Save {

    private final String version;
    private final LocalDate date;

    public Save(String version) {
        this.version = version;
        this.date = LocalDate.now();
    }

    public String getVersion() {
        return version;
    }

    public LocalDate getDate() {
        return date;
    }
}
