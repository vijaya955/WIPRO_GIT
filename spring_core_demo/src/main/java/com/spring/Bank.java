package com.spring;

public class Bank {
    private int bank_id;
    private String bank_name;
    private Adress address;

    public Bank() {}

    public Bank(int bank_id, String bank_name, Adress address) {
        this.bank_id = bank_id;
        this.bank_name = bank_name;
        this.address = address;
    }

    public int getBank_id() {
        return bank_id;
    }

    public void setBank_id(int bank_id) {
        this.bank_id = bank_id;
    }

    public String getBank_name() {
        return bank_name;
    }

    public void setBank_name(String bank_name) {
        this.bank_name = bank_name;
    }

    public Adress getAddress() {
        return address;
    }

    public void setAddress(Adress address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Bank [bank_id=" + bank_id + ", bank_name=" + bank_name + ", address=" + address + "]";
    }
}
