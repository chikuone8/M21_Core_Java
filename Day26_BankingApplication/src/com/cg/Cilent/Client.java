package com.cg.Cilent;

import com.cg.Application.MMBankFactory;
import com.cg.Application.MMCurrentAcc;
import com.cg.Application.MMSavingAcc;
import com.cg.Framework.BankFactory;
import com.cg.Framework.CurrentAcc;
import com.cg.Framework.SavingAcc;

public class Client {

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		BankFactory b = new MMBankFactory();
		SavingAcc s = new MMSavingAcc(9009,"Vipul Lengare",39020,true);
		CurrentAcc c = new MMCurrentAcc(9900,"Snehal Shinde",62184,20000);
		s.withdraw(10000);
		c.withdraw(20000);
		System.out.println(s);
		System.out.println(c);
	}
}