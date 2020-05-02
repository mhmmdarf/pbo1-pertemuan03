package percabangan;

public class IfElse3 {
        public static void main(String[] args) {
            double totalBelanja = 25000;
            double uangDiDompet = 50000;

            if(uangDiDompet<totalBelanja) {
                System.out.println("Uang anda kurang, silahkan kembali");
            }else if (uangDiDompet>totalBelanja) {
                double kembali = uangDiDompet - totalBelanja;
                System.out.println("Uang anda lebih, selamat menikmati : " + kembali);
            }else{
                System.out.println("Uang anda cukup, alhamdulillah");
            }
        }
}
