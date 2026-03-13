public class ConTinue {
    public static void main(String[] args) {
        for (int i = 1 ;i <= 100; i++) {
            if (i%2==0) {
            IO.println("nuh uh");
            continue;
        }
        IO.println(i);
    }
    }
}
