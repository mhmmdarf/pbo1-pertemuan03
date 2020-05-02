package percabangan;

public class IfElse2 {
    public static void main(String[] args) {
        double totalBelanja = 25000;
        double uangDiDompet = 50000;

        if (uangDiDompet < totalBelanja) {
            System.out.println("Uang anda kurang, silahkan kembali");
        } else {
            System.out.println("Uang anda cukup, silahkan menikmati");
        }
    }
}
