package com.example.springboot.basics.springbootin10step;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Music {
    long id;
    String name;
    String band;

    public Music(long id, String name, String band) {
        this.id = id;
        this.name = name;
        this.band = band;
    }
}
