package objmodel;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

public class CarModel {

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    private String owner;
    private String company;
    private String model;
    private String color;
    private String power;


    public CarModel() {
    }

    public CarModel(String owner, String company, String model, String color, String power) {
        this.owner = owner;
        this.company = company;
        this.model = model;
        this.color = color;
        this.power = power;

    }


    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }
}
