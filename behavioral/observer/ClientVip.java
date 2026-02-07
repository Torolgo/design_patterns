public class ClientVip {
    private String name;

    public ClientVip(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void recevoirNotification(String codePromotion, double pourcentageRemise) {
        System.out.println("Le client VIP " + name + " a reçu une notification de promotion pour une remise de "+
                pourcentageRemise + "%. "+ "Le code est : " + codePromotion);
    }
}
