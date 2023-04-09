class HondaCity {
    int a, b;
    static double price = 10;

    static void onRoadPrice(String city) {
        switch (city) {
            case ("Delhi"):
                price = price + 0.1 * price;
                break;
            case ("Mumbai"):
                price = price + 0.2 * price;
                break;
        }
    }
}

class StaticDemo2 {

    public static void main(String[] args) {
        HondaCity h1 = new HondaCity();
        HondaCity h2 = new HondaCity();
        //// Accessing Static variable
        // System.out.println(h1.price);
        // // System.out.println(HondaCity.price); //valid
        // h1.price = 20;
        // System.out.println(h2.price);

        HondaCity.onRoadPrice("Delhi");
        System.out.println(HondaCity.price);

    }
}