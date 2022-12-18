package com.example.ob.dataaggregator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

@Component
public class DataAggregatorFactory {
    private final Map<AggregatorType, DataAggregator> dataAggregatorMap;

    @Autowired
    private DataAggregatorFactory(List<DataAggregator> dataAggregators) {
        dataAggregatorMap = dataAggregators.stream()
                .collect(Collectors.toUnmodifiableMap(DataAggregator::getDataProviderType, Function.identity()));
    }

    public DataAggregator getDataAggregator(AggregatorType aggregatorType) {
        return Optional.ofNullable(dataAggregatorMap.get(aggregatorType)).orElseThrow(IllegalArgumentException::new);
    }
}