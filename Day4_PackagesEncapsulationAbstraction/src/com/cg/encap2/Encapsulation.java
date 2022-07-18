package com.cg.encap2;
import com.cg.encap.HDFC_BANK;
public class Encapsulation {
	public static void main(String[] args) {
		HDFC_BANK h = new HDFC_BANK();
		h.setATM_PIN(9009);
		System.out.println("The ATM Pin is :" + h.getATM_PIN());
	}
}
