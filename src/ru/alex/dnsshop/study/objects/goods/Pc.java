package ru.alex.dnsshop.study.objects.goods;

/**
 * Created by alex on 11.09.2016.
 */
public class Pc {
    private String name;
    private int ram;
    private String nameOtd;

    public Pc(String name, int ram, String nameOtd) {
        this.setName(name);
        this.setRam(ram);
        this.setNameOtd(nameOtd);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getNameOtd() {
        return nameOtd;
    }

    public void setNameOtd(String nameOtd) {
        this.nameOtd = nameOtd;
    }

    public void on() {

    }

    public void off() {

    }
    public void loadOs() {

    }
}
