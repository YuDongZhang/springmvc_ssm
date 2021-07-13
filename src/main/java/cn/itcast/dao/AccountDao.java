package cn.itcast.dao;

import cn.itcast.domain.Account;

import java.util.List;

/**
 * 账户dao接口
 */
public interface AccountDao {

    //查询所有账户
    public List<Account> findAll();

    //保存账户信息
    public void saveAccount(Account account);
}