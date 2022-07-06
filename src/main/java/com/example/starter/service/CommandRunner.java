package com.example.starter.service;

import com.github.javafaker.Faker;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class CommandRunner implements CommandLineRunner {

    private final Faker faker;

    public CommandRunner(Faker faker) {
        this.faker = faker;
    }

    @Override
    public void run(String... args) {
    }

}
