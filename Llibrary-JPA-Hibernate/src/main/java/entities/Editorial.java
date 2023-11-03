package entities;

import jakarta.persistence.*;

@Entity
@Table(name = "editorials")
public class Editorial {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private boolean status;

    public Editorial() {
    }

    public Editorial(String name, boolean status) {
        this.name = name;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Editorial{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", high=" + status +
                '}';
    }
}
