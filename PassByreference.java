public class PassByreference {
    public static void main() {
        number n1 = new number();
        n1.number = 99;
        Addone(n1);
        IO.println(n1.number);

    }
    static void Addone(number n ){
        n.number++;
    }
}
