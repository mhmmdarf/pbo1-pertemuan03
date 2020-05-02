package percabangan;

public class Switch1 {
    public static void main(String[] args) {
        int jalanJalan = 3;
        switch (jalanJalan) {
            case 1:
                System.out.println("Uang Harian");
                break;
            case 2:
                System.out.println("Uang Bulanan");
                break;
            case 3:
                System.out.println("Uang Bensin");
                break;
            case 4:
                System.out.println("Uang Makan");
                break;
            default:
                System.out.println("Uang Haram");
                break;
        }
    }
}
