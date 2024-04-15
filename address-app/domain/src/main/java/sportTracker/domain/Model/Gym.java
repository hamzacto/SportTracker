package SportTracker.domain.Model;

public class Gym {
    private Integer id;
    private String name;
    private String address;
    private Float pricing;

    // Constructeur par défaut
    public Gym() {
    }

    // Getters et Setters pour chaque propriété
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Float getPricing() {
        return pricing;
    }

    public void setPricing(Float pricing) {
        this.pricing = pricing;
    }
}