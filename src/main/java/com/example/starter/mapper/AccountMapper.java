package com.example.starter.mapper;

import com.example.starter.domain.internalmodels.AccountDto;
import com.example.starter.domain.yapilymodels.Account;
import com.example.starter.domain.yapilymodels.AccountName;
import com.example.starter.domain.yapilymodels.UsageType;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
@Slf4j
public class AccountMapper {

    public List<AccountDto> mapAccounts(List<Account> yapilyAccounts) {
        return yapilyAccounts.stream().map(this::mapAccount).toList();
    }

    public AccountDto mapAccount(Account yapilyAccount) {
        AccountDto accountDto = new AccountDto();
        accountDto.setAccountId(yapilyAccount.getId());
        accountDto.setName(yapilyAccount.getAccountNames().stream().map(AccountName::getName).collect(Collectors.joining(" , ")));
        accountDto.setAccountType(yapilyAccount.getType());
        accountDto.setAccountSubType(Optional.ofNullable(yapilyAccount.getUsageType()).map(UsageType::getValue).orElse(StringUtils.EMPTY));
        return accountDto;
    }

//    public AccountDto mapAccount(TruelayerAccount truelayerAccount) {
//        AccountDto accountDto = new AccountDto();
//        accountDto.setAccountId(truelayerAccount.getAccountId());
//        accountDto.setName(truelayerAccount.get);
//        accountDto.setAccountType(yapilyAccount.getType());
//        accountDto.setAccountSubType(Optional.ofNullable(yapilyAccount.getUsageType()).map(UsageType::getValue).orElse(StringUtils.EMPTY));
//
//    }
}
