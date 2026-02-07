public class Promotion {
    private String code;
    private double pourcentageRemise;

    public Promotion(String code, double pourcentageRemise) {
        this.code = code;
        this.pourcentageRemise = pourcentageRemise;
    }

    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }

    public double getPourcentageRemise() {
        return pourcentageRemise;
    }
    public void setPourcentageRemise(double pourcentageRemise) {
        this.pourcentageRemise = pourcentageRemise;
    }
}
