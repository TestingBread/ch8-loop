public class foris {
    public static void main(String[] args) {
        double[] scores = {70.5,55.2,88.9,98.9};
        for (int i = 0; i < scores.length; i++) {IO.println(scores[i]);}
            IO.println("-----------------------------------");
        for (double score : scores) {IO.println(score);}
    }
}
