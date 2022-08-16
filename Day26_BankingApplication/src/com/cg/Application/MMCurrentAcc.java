package com.cg.Application;

import com.cg.Framework.CurrentAcc;

public class MMCurrentAcc extends CurrentAcc {

	public MMCurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		super(accNo, accNm, accBal, creditLimit);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return String.format("CurrentAcc [toString()=%s]", super.toString());
	}

}