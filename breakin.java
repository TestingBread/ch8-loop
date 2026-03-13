public class breakin {
    public static void main(String[] args) {
        for(int i = 0; i<100; i++) {
            if (i==55) {
                System.out.println("55 is found");
                break;
            }
            IO.println("in searching for Number now at : " +i);
        }
    }
}
