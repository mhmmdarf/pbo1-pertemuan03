package operator;

public class OperatorUnary {
    public static void main(String[] args) {
        int i = 0;
        i++;                     //i tadinya 0 ditambahkan 1 sehingga i = 1
        System.out.println(i);  //betulkan i nilai 1
        i++;                    //karena i tadinya sudah bernilai 1 maka sekarang ditambahkan lagi menjadi 2
        System.out.println(i);  //tuh betulkan i nilainya 2
        i=i+1;                  //bisa dilihat i++ sama dengan i = i+1
        System.out.println(i);   //i tadi 2 sekarang jadi 3
    }
}
