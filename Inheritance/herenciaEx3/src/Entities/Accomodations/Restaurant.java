package Entities.Accomodations;

public class Restaurant {

    private Integer capacity;
    private String name;
    private Integer price;

    public Restaurant() {
    }

    public Restaurant(Integer capacity, String name) {
        this.capacity = capacity;
        this.name = name;
        price = calculatePrice();
    }

    private int calculatePrice() {
        if (capacity < 30) {
            return 10;
        }

        if (capacity < 50) {
            return 30;
        }

        return 50;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "capacity=" + capacity +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
