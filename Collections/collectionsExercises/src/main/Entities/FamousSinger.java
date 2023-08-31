package main.Entities;

public class FamousSinger {

    private String name;
    private Integer bestSellingDisc;

    public FamousSinger() {
    }

    public FamousSinger(String name, Integer bestSellingDisc) {
        this.name = name;
        this.bestSellingDisc = bestSellingDisc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getBestSellingDisc() {
        return bestSellingDisc;
    }

    @Override
    public String toString() {
        return "FamousSinger{" +
                "name='" + name + '\'' +
                ", bestSellingDisc=" + bestSellingDisc +
                '}';
    }

    public void setBestSellingDisc(Integer bestSellingDisc) {
        this.bestSellingDisc = bestSellingDisc;
    }
}
