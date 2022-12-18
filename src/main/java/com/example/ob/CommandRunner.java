package com.example.ob;

import com.example.ob.dataaggregator.DataAggregator;
import com.example.ob.dataaggregator.DataAggregatorFactory;
import com.example.ob.dataaggregator.AggregatorType;
import com.example.ob.record.BankDataParams;
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

    @Value("${truelayer.consent}")
    private String truelayerConsent;

    @Autowired
    private DataAggregatorFactory dataAggregatorFactory;


    @Override
    public void run(String... args) {
        DataAggregator dataAggregator = dataAggregatorFactory.getDataAggregator(AggregatorType.YAPILY);
        dataAggregator.processBankData(BankDataParams.create(yapilyConsent));
    }
}
