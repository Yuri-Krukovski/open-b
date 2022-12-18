package com.example.starter.dataagregator;

import com.example.starter.domain.internalmodels.DataProviderType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

@Component
public class DataAggregatorFactory {
    private final Map<DataProviderType, DataAggregator> viewerMap;

    @Autowired
    private DataAggregatorFactory(List<DataAggregator> dataAggregators) {
        viewerMap = dataAggregators.stream()
                .collect(Collectors.toUnmodifiableMap(DataAggregator::getDataProviderType, Function.identity()));
    }

    public DataAggregator getDataAggregator(DataProviderType dataProviderType) {
        return Optional.ofNullable(viewerMap.get(dataProviderType)).orElseThrow(IllegalArgumentException::new);
    }
}