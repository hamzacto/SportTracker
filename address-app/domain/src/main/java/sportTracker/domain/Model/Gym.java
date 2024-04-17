package sportTracker.domain.Model;

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

    public static final class GymBuilder {
        private Integer id;
        private String name;
        private String address;
        private Float pricing;

        private GymBuilder() {
        }

        public static GymBuilder aGym() {
            return new GymBuilder();
        }

        public GymBuilder withId(Integer id) {
            this.id = id;
            return this;
        }

        public GymBuilder withName(String name) {
            this.name = name;
            return this;
        }

        public GymBuilder withAddress(String address) {
            this.address = address;
            return this;
        }

        public GymBuilder withPricing(Float pricing) {
            this.pricing = pricing;
            return this;
        }

        public Gym build() {
            Gym gym = new Gym();
            gym.setId(id);
            gym.setName(name);
            gym.setAddress(address);
            gym.setPricing(pricing);
            return gym;
        }
    }
}
