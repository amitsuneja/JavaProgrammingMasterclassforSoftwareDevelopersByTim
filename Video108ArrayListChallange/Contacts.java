package com.amitsuneja;

public class Contacts {

    private String cName;
    private String cellNumber;



    public Contacts(String cName, String cellNumber) {
        this.cName = cName;
        this.cellNumber = cellNumber;
    }


    public String getcName() {
        return cName;
    }

    public String getCellNumber() {
        return cellNumber;
    }

}
