package com.amitsuneja;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Bankaccount admitsBankcard = new Bankaccount();
        admitsBankcard.setAccNumber("1000000000001");
        admitsBankcard.setCustomerName("Amit Sumeja");
        admitsBankcard.setCustomerEmailAddress("amit@gmail.com");
        admitsBankcard.setCustomerPhoneNumber("9717123330");
        admitsBankcard.deposit(10000);
        admitsBankcard.withdrawal(5000);
        admitsBankcard.withdrawal(10000000);

        System.out.println("******************************************************************");

        Bankaccount BobBankcard = new Bankaccount("111111", 10000, "bob brown",
                "bob@gmail.com", "666 853 9098" );
        BobBankcard.deposit(100);

        System.out.println("******************************************************************");

        Bankaccount userDefaultEmptyConstructorsNow = new Bankaccount();
        System.out.println(userDefaultEmptyConstructorsNow.getAccNumber());
        System.out.println(userDefaultEmptyConstructorsNow.getBalance());
        System.out.println(userDefaultEmptyConstructorsNow.getCustomerName());
        System.out.println(userDefaultEmptyConstructorsNow.getCustomerEmailAddress());
        System.out.println(userDefaultEmptyConstructorsNow.getCustomerPhoneNumber());
        System.out.println(userDefaultEmptyConstructorsNow.getClass());

        System.out.println("******************************************************************");
        Bankaccount amitsunejaAccount = new Bankaccount("AmitSuneja", "amit@amit.com",
                "9717123330");
        amitsunejaAccount.deposit(10000000);


    }
}
