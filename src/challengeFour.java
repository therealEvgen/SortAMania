public class Challenges {

    public static int challengeFour(int[][]arr);
    {
        int values[][] = new int[1000][1000];
        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values[i].length; j++) {
                values[i][j] = ((int) (Math.random() * 10));
                System.out.print(values[i][j]);
            }
            System.out.println();
        }
    }
}
