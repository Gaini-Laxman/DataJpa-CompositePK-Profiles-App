package com.klinnovations;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.klinnovations.entinty.Account;
import com.klinnovations.entinty.AccountPK;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext ctxt =
		SpringApplication.run(Application.class, args);
		
		AccountRepository repo = ctxt.getBean(AccountRepository.class);
		
		AccountPK pk = new AccountPK();
		pk.setAccountNumber(1010223505);
		pk.setAccountType("Savings");
		
		Account acc = new Account();
		acc.setAccountHolderName("Dhuda Anitha");
		acc.setBranchName("KPHB");
		acc.setIfsc("HDFC00112");
		acc.setAccountPK(pk);
		
		repo.save(acc);
		
		System.out.println("Record Saved.....");
		
	}

}
