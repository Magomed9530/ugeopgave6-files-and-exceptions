public class Drink {

    // FIELD

    private double price;


    // CONSTRUCTOR

    public Drink(double price) {
        setPrice(price);
    }


    // SET PRICE METHOD

    public void setPrice(double price) {

        // Tjekker om prisen er negativ
        if (price < 0) {
            throw new IllegalArgumentException("Pris må ikke være negativ: " + price);
        }

        // Gemmer prisen, hvis den er gyldig
        this.price = price;
    }


    // GET PRICE METHOD

    public double getPrice() {
        return price;
    }
}