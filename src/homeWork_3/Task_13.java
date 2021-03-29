package homeWork_3;

public class Task_13 {
    public static void main(String[] args) {
        String[][] array = new String[8][8];

        array[0][0] = "W";
        array[0][1] = "B";
        array[0][2] = "W";
        array[0][3] = "B";
        array[0][4] = "W";
        array[0][5] = "B";
        array[0][6] = "W";
        array[0][7] = "B";

        array[1][0] = "B";
        array[1][1] = "W";
        array[1][2] = "B";
        array[1][3] = "W";
        array[1][4] = "B";
        array[1][5] = "W";
        array[1][6] = "B";
        array[1][7] = "W";

        array[2][0] = "W";
        array[2][1] = "B";
        array[2][2] = "W";
        array[2][3] = "B";
        array[2][4] = "W";
        array[2][5] = "B";
        array[2][6] = "W";
        array[2][7] = "B";

        array[3][0] = "B";
        array[3][1] = "W";
        array[3][2] = "B";
        array[3][3] = "W";
        array[3][4] = "B";
        array[3][5] = "W";
        array[3][6] = "B";
        array[3][7] = "W";

        array[4][0] = "W";
        array[4][1] = "B";
        array[4][2] = "W";
        array[4][3] = "B";
        array[4][4] = "W";
        array[4][5] = "B";
        array[4][6] = "W";
        array[4][7] = "B";

        array[5][0] = "B";
        array[5][1] = "W";
        array[5][2] = "B";
        array[5][3] = "W";
        array[5][4] = "B";
        array[5][5] = "W";
        array[5][6] = "B";
        array[5][7] = "W";

        array[6][0] = "W";
        array[6][1] = "B";
        array[6][2] = "W";
        array[6][3] = "B";
        array[6][4] = "W";
        array[6][5] = "B";
        array[6][6] = "W";
        array[6][7] = "B";

        array[7][0] = "B";
        array[7][1] = "W";
        array[7][2] = "B";
        array[7][3] = "W";
        array[7][4] = "B";
        array[7][5] = "W";
        array[7][6] = "B";
        array[7][7] = "W";



        for (int i = 0; i < 8; i++){
            for (int j = 0; j < 8; j++){
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }


    }

}
