package com.clouway.task1.com.clouway.task1;

/**
 * Created by clouway on 14-9-10.
 */
public class Address {

    private String town;
    private String address;
    private String municipality;


    public  String getTown() {
        return town;
    }

    public String getAddress() {
        return address;
    }

    public String getMunicipality() {
        return municipality;
    }

    public Address(String town, String address, String municipality) {
        this.town = town;
        this.address = address;
        this.municipality = municipality;


    }

    public static void main(String[] args) {
        Address town = new Address( "Tarnovo","str.Denu Chokanov", "Tarnovo");
        System.out.printf(town.getTown() + " " + town.getAddress() + " " + town.getMunicipality());
    }
}
