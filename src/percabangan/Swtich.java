package percabangan;

public class Swtich {
    public static void main(String[] args) {
        int JalanJalan=3;
        switch(JalanJalan){
            case 1:
                System.out.println("Uang Bensin");
            case 2:
                System.out.println("Uang Makan");
            case 3:
                System.out.println("Uang Harian");
            case 4:
                System.out.println("Uang Bulanan");
            default:
                System.out.println("Uang Haram");
                break;
        }
    }
}
