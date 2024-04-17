package sportTracker.domain.Model;

public class Nutriment {
    private Integer id;
    private String name;
    private Float calorie;
    private Float protein;
    private Float fat;
    private Float carbohydrate;

    // Constructeur par défaut
    public Nutriment() {
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

    public Float getCalorie() {
        return calorie;
    }

    public void setCalorie(Float calorie) {
        this.calorie = calorie;
    }

    public Float getProtein() {
        return protein;
    }

    public void setProtein(Float protein) {
        this.protein = protein;
    }

    public Float getFat() {
        return fat;
    }

    public void setFat(Float fat) {
        this.fat = fat;
    }

    public Float getCarbohydrate() {
        return carbohydrate;
    }

    public void setCarbohydrate(Float carbohydrate) {
        this.carbohydrate = carbohydrate;
    }

    public static final class NutrimentBuilder {
        private Integer id;
        private String name;
        private Float calorie;
        private Float protein;
        private Float fat;
        private Float carbohydrate;

        private NutrimentBuilder() {
        }

        public static NutrimentBuilder aNutriment() {
            return new NutrimentBuilder();
        }

        public NutrimentBuilder withId(Integer id) {
            this.id = id;
            return this;
        }

        public NutrimentBuilder withName(String name) {
            this.name = name;
            return this;
        }

        public NutrimentBuilder withCalorie(Float calorie) {
            this.calorie = calorie;
            return this;
        }

        public NutrimentBuilder withProtein(Float protein) {
            this.protein = protein;
            return this;
        }

        public NutrimentBuilder withFat(Float fat) {
            this.fat = fat;
            return this;
        }

        public NutrimentBuilder withCarbohydrate(Float carbohydrate) {
            this.carbohydrate = carbohydrate;
            return this;
        }

        public Nutriment build() {
            Nutriment nutriment = new Nutriment();
            nutriment.setId(id);
            nutriment.setName(name);
            nutriment.setCalorie(calorie);
            nutriment.setProtein(protein);
            nutriment.setFat(fat);
            nutriment.setCarbohydrate(carbohydrate);
            return nutriment;
        }
    }
}
