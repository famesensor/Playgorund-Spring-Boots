package com.example.springboot.basics.springbootin10step;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class MusicController {

    @GetMapping("/musics")
    public List<Music> getMusics() {
        return Arrays.asList(new Music(1234l, "Enter sandman", "metaliga"));
    }

}
