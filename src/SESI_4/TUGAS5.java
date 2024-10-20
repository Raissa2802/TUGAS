public class TUGAS5 {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        int c = 0;
        int i = 1;
        while (c <= 610) {
            if ( c >= 0) {
            System.out.print(c + " ");
            }
            if (i == 1) {
                c = 1;
            } else {
                a = b;
                b = c;
                c = a + b;
            }
            i++;
        }
    }
}
