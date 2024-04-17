package sportTracker.domain.Model;

public class Complement {
    private Integer id;
    private String name;
    private String saveur;

    // Constructeur par défaut
    public Complement() {
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

    public String getSaveur() {
        return saveur;
    }

    public void setSaveur(String saveur) {
        this.saveur = saveur;
    }
}
