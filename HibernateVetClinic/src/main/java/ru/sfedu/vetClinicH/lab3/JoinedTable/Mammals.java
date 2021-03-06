package ru.sfedu.vetClinicH.lab3.JoinedTable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity(name = "Mammals")
@Table(schema = "joinedTable")
@PrimaryKeyJoinColumn(name = "animal_id")
public class Mammals extends Animal {

    @Column(name = "woolLength", nullable = false)
    private int woolLength;
    private String type;


    public Mammals(long id, String name, String breed, String gender, int age, int weight, boolean vac, int woolLength, String type) {
        super(id, name, breed, gender, age, weight, vac);
        this.woolLength = woolLength;
        this.type = type;
    }

    public Mammals(String name, String breed, String gender, int age, int weight, boolean vac, int woolLength, String type) {
        super(name, breed, gender, age, weight, vac);
        this.woolLength = woolLength;
        this.type = type;
    }

    public Mammals(){}

    public int getWoolLength() {
        return woolLength;
    }

    public void setWoolLength(int woolLength) {
        this.woolLength = woolLength;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Mammals{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", vac=" + vac +
                ", woolLength=" + woolLength +
                ", type=" + type +
                '}';
    }
}
