package day3.simplerpg;

public class SimpleRpg {

    public void printMap(int[][] map){
        for(int i = 0; i<map.length * map[0].length; i++){
            int row = i / map[0].length;
            int column = i % map[0].length;
            System.out.print(map[row][column]+" ");

            if(column == map[0].length - 1){
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
        int[][] map = new int[5][5];

        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++){
                map[i][j] = 0;
            }
        }
        SimpleRpg sr = new SimpleRpg();
        sr.printMap(map);

    }
}
