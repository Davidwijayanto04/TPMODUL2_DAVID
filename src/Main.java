public class Main {
    public static void main(String[] args) {
        Perangkat perangkat = new Perangkat("Samsung",4,2.4f);
        perangkat.informasi();

        System.out.println("");

        Laptop laptop = new Laptop("Barracuda",8,3.5f,true);
        laptop.informasi();
        laptop.bukaGame("makan angin");
        laptop.kirimEmail("sapujagad@gmail.com");
        laptop.kirimEmail("makanangin@gmail.com", "saepudinjunaedi@yahoo.com");

        System.out.println("");

        Handphone handphone = new Handphone("Sandisk",2,2.2f, false);
        handphone.informasi();
        handphone.telfon(628122122);
        handphone.kirimSMS(62852112);
        handphone.kirimSMS(628121626, 9999009);

    }