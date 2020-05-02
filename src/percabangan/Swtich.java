package percabangan;

public class Swtich {
    public static void main(String[] args) {
        char nilai='D';
        switch(nilai){
            case 'A':
                System.out.println("Staf    : \"Terimakasih Bos\"");
                System.out.println("Boss    : \"Samasama\"");
                break;
            case 'B':
                System.out.println("Staf    : \"Kenapa saya dikeluarkan Bos?\"");
                System.out.println("Boss    : \"Kamu ceroboh\"");
                break;
            case 'C':
                System.out.println("Staf    : \"Kenapa belum gajihan Bos?\"");
                System.out.println("Boss    : \"Kerja yang rajin dulu baru minta gajih\"");
                System.out.println("Boss    : \"Siap Bos\"");
                break;
            default:
                System.out.println("Staf    : \"Assalamualaikum\"");
                System.out.println("Boss    : \"Walaiukumsalam\"");
                System.out.println("Boss    : \"Gimana Kerja mu hari ini?\"");
                System.out.println("Boss    : \"Sudah selesai?\"");
                System.out.println("Staf    : \"Siap sudah Bos\"");
                break;
        }
    }
}
