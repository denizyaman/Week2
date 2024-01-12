public class Main {
    public static void main(String[] args) {
        int [] lists = {35,55,67,44,200,55,84};
        double sum = 0;
        double result=0;
        for (int i = 0; i < lists.length; i++) {
            sum+= (double) 1 / lists[i];
        }
        result=lists.length/sum;
       System.out.println(result);
    }
}
