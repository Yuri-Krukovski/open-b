package com.example.starter.service;

import com.example.starter.client.YapilyClient;
import com.github.javafaker.Faker;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class CommandRunner implements CommandLineRunner {

    @Value("${yapily.consent}")
    private String yapilyConsent;

    @Autowired
    private YapilyClient yapilyClient;

    private final Faker faker;

    public CommandRunner(Faker faker) {
        this.faker = faker;
    }

    @Override
    public void run(String... args) {
//        AccountApiListResponse accounts = yapilyClient.getAccounts(yapilyConsent);
//        List<Account> data = accounts.getData();
//
//        data.forEach(account -> {
//
//            account.getAccountNames().forEach(accountName -> log.info("Name of account holder -- {}", accountName));
//            account.getAccountBalances().forEach(accountBalance -> log.info("Account balance -- {}", accountBalance));
//        });
    }
}
