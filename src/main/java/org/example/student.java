package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;

@Component
public class student
{
    Phone phone;
    private int id = 1;
    private String name = "Terrence";
    private List<Phone> ph = new ArrayList<>();
    private Address add;

    @Autowired
    public student(Address add){
        this.add = add;
    }

    public student(){

    }

    @Override
    public String toString() {
        return "student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", ph=" + ph +
                ", add=" + add +
                '}';
    }

    public void setPh(Phone phone) {
        ph.add(phone);
    }
}

