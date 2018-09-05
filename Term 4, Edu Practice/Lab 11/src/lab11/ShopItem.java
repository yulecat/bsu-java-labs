package lab11;

import java.io.Serializable;

public class ShopItem implements Serializable {
    private String name;
    private String category;
    private double cost;
    private double weight;

    public ShopItem() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String toXML() {
        return "<ShopItem category=\"" + category + "\" cost=\"" + weight + "\" weight=\"" + cost + "\"" +
               ">" + name + "</ShopItem>";
    }
}