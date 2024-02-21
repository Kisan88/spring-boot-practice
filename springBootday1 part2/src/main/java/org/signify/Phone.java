package org.signify;



public class Phone {



    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    private String countryCode;
    private String number;

    public String toString(){

        return "Phone{" +
                "countryCode='"+ countryCode+'\''+
                ", number='"+number+'\''+
                "}";
    }

    public Phone(String countryCode, String number){
        this.countryCode = countryCode;
        this.number = number;
    }

}
