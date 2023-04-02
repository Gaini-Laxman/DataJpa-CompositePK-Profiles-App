package com.klinnovations.entinty;

import java.io.Serializable;

import javax.persistence.Embeddable;

import lombok.Data;

@Data
@Embeddable
public class AccountPK  implements Serializable{
	
	private Integer accountNumber;
	private String accountType;

}
