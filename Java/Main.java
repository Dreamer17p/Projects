class Main {
    public static void main (String[] args) {
        UberX uberX = new UberX("AMQ123", new Account("Pablo Escobar", "MSM213"), "chevrolet", "sonic");
        uberX.setPassenger(4);
        uberX.printDataCar();

        UberVan uberVan = new UberVan("KLK123", new 
        Account("Pablito escobarcito", "MSM213"));
        uberVan.setPassenger(6);
        uberVan.printDataCar();
        
        /* UberBlack uberBlack = new UberBlack() */
    }
}