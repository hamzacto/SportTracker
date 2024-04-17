package sportTracker.domain.Model;

public class Athlete {
    private Integer id;
    private Float weight;
    private Integer age;
    private Float height;
    private String firstName;
    private String lastName;
    private Integer sportLevel;
    private Float heartbeat;
    private Float bloodPressure;

    // Constructeur par défaut
    public Athlete() {
    }

    // Getters et Setters pour chaque propriété
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Float getWeight() {
        return weight;
    }

    public void setWeight(Float weight) {
        this.weight = weight;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Float getHeight() {
        return height;
    }

    public void setHeight(Float height) {
        this.height = height;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getSportLevel() {
        return sportLevel;
    }

    public void setSportLevel(Integer sportLevel) {
        this.sportLevel = sportLevel;
    }

    public Float getHeartbeat() {
        return heartbeat;
    }

    public void setHeartbeat(Float heartbeat) {
        this.heartbeat = heartbeat;
    }

    public Float getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(Float bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public static final class AthleteBuilder {
        private Integer id;
        private Float weight;
        private Integer age;
        private Float height;
        private String firstName;
        private String lastName;
        private Integer sportLevel;
        private Float heartbeat;
        private Float bloodPressure;

        private AthleteBuilder() {
        }

        public static AthleteBuilder anAthlete() {
            return new AthleteBuilder();
        }

        public AthleteBuilder withId(Integer id) {
            this.id = id;
            return this;
        }

        public AthleteBuilder withWeight(Float weight) {
            this.weight = weight;
            return this;
        }

        public AthleteBuilder withAge(Integer age) {
            this.age = age;
            return this;
        }

        public AthleteBuilder withHeight(Float height) {
            this.height = height;
            return this;
        }

        public AthleteBuilder withFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public AthleteBuilder withLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public AthleteBuilder withSportLevel(Integer sportLevel) {
            this.sportLevel = sportLevel;
            return this;
        }

        public AthleteBuilder withHeartbeat(Float heartbeat) {
            this.heartbeat = heartbeat;
            return this;
        }

        public AthleteBuilder withBloodPressure(Float bloodPressure) {
            this.bloodPressure = bloodPressure;
            return this;
        }

        public Athlete build() {
            Athlete athlete = new Athlete();
            athlete.setId(id);
            athlete.setWeight(weight);
            athlete.setAge(age);
            athlete.setHeight(height);
            athlete.setFirstName(firstName);
            athlete.setLastName(lastName);
            athlete.setSportLevel(sportLevel);
            athlete.setHeartbeat(heartbeat);
            athlete.setBloodPressure(bloodPressure);
            return athlete;
        }
    }
}
