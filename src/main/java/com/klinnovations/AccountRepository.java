package com.klinnovations;

import org.springframework.data.jpa.repository.JpaRepository;

import com.klinnovations.entinty.Account;
import com.klinnovations.entinty.AccountPK;

public interface AccountRepository extends JpaRepository<Account, AccountPK> {

}
