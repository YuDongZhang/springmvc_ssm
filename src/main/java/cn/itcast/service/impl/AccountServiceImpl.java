package cn.itcast.service.impl;

import cn.itcast.domain.Account;
import cn.itcast.service.AccountService;

import java.util.List;

public class AccountServiceImpl implements AccountService {
    @Override
    public List<Account> findAll() {
        System.out.println("业务层查询所有账户信息...");
        return null;
    }

    @Override
    public void saveAccount(Account account) {
        System.out.println("业务层保存账户...");
    }
}
