public class Main {
    public static void main(String[] args) {
        int[][] arr = {{1, 3,5}, {9, 5,4}};
        int[][] arrT = new int[arr[0].length][arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arrT[j][i] = arr[i][j];
            }
        }
        System.out.println("Matris : ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + "    ");
            }
            System.out.println();
        }
        System.out.println("Matris transpozu : ");
        for (int i = 0; i < arrT.length; i++) {
            for (int j = 0; j < arrT[0].length; j++) {
                System.out.print(arrT[i][j] + "    ");
            }
            System.out.println();
        }
    }
}
