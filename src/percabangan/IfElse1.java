package percabangan;

public class IfElse1 {

    public static void main(String[] args) {
        double totalBelanja = 50000;
        double uangDiDompet = 25000;

        if (uangDiDompet < totalBelanja) {
            System.out.println("Uang anda kurang, silahkan kembali");
        } else {
            System.out.println("Uang anda cukup, silahkan menikmati");
        }
    }
}
