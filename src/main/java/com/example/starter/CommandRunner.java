package com.example.starter;

import com.example.starter.dataagregator.DataAggregatorFactory;
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
    private DataAggregatorFactory dataAggregatorFactory;


    @Override
    public void run(String... args) {
//        DataAggregator dataAggregator = dataAggregatorFactory.getDataAggregator(DataProviderType.YAPILY);
//        dataAggregator.processBankData(BankDataParams.create(yapilyConsent));
    }
}
