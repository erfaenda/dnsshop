package ru.alex.dnsshop.study.objects.banking;

/**
 * Created by alex on 11.09.2016.
 */
public class Bankir {
    private String name;
    private int stagejob;
    private String sberBank;


    public Bankir(String name, int stagejob, String sberBank) {
        this.name = name;
        this.stagejob = stagejob;
        this.sberBank = sberBank;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStagejob() {
        return stagejob;
    }

    public void setStagejob(int stagejob) {
        this.stagejob = stagejob;
    }

    public String getSberBank() {
        return sberBank;
    }

    public void setSberBank(String sberBank) {
        this.sberBank = sberBank;
    }

    public void Sendzapros();

}
