package com.klinnovations.entinty;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "account_details")
public class Account {
	
	
	private String accountHolderName;
	private String branchName;
	private String ifsc;
	
	@EmbeddedId
	private AccountPK accountPK;
	
}
