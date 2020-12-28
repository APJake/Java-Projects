import java.util.Scanner;

public class ConwayGame {

    static int sizeX=0;
    static int sizeY=0;
    static int[][] matrix;

    public static void main(String[] args) throws Exception {
        System.out.print("Enter size(x y): ");
        Scanner scan = new Scanner(System.in);
        String sizeArr[] = scan.nextLine().trim().split(" ");
        sizeX = Integer.parseInt(sizeArr[0]);
        sizeY = Integer.parseInt(sizeArr[1]);

        matrix=new int[sizeX][sizeY];
        for(int r=0; r<sizeX; r++){
            String rowArr[]=scan.nextLine().trim().split("");
            for(int c=0; c<sizeY; c++){
                matrix[r][c]=Integer.parseInt(rowArr[c]);
            }
        }

        // printMatrix(matrix);
        // next generation
        printMatrix(conway());
    }

    static int[][] conway(){
        int conwayMatrix[][]=new int[sizeX][sizeY];

        for(int r=0; r<sizeX; r++){
            for(int c=0; c<sizeY; c++){
                if(isAlive(r, c, matrix[r][c]==1)){
                    conwayMatrix[r][c]=1;
                }else{
                    conwayMatrix[r][c]=0;
                }
            }
        }

        return conwayMatrix;
    }

    static boolean isAlive(int r, int c, boolean alive){
        int counter=0;
        // top
        if(r>0 && matrix[r-1][c]==1){
            counter++;
        }
        // top left
        if(r>0 && c>0 && matrix[r-1][c-1]==1){
            counter++;
        }
        // top right
        if(r>0 && c<sizeY-1 && matrix[r-1][c+1]==1){
            counter++;
        }
        // bot
        if(r<sizeX-1 && matrix[r+1][c]==1){
            counter++;
        }
        // bot left
        if(r<sizeX-1 && c>0 && matrix[r+1][c-1]==1){
            counter++;
        }
        // bot right
        if(r<sizeX-1 & c<sizeY-1 && matrix[r+1][c+1]==1){
            counter++;
        }
        // left
        if(c>0 && matrix[r][c-1]==1){
            counter++;
        }
        // right
        if(c<sizeY-1 && matrix[r][c+1]==1){
            counter++;
        }

        if(!alive && counter==3) return true;
        if(alive && (counter==2 || counter==3)) return true;
        if(alive && counter>3) return false;
        if(alive && counter<2) return false;

        return false;
    }


    static void printMatrix(int[][] myMatrix){
        System.out.println();
        for(int r=0; r<sizeX; r++){
            for(int c=0; c<sizeY; c++)
                System.out.print(myMatrix[r][c]);
            System.out.println();
        }
        System.out.println();
    }
    
}
