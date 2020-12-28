import java.util.Scanner;

class Rover{

    // static int grid[][];
    int x, y;
    char face;

    public Rover(int x, int y, char face){
        this.x=x;
        this.y=y;
        this.face=face;
    }

    public void showCurrent(){
        System.out.println(x + " " + y + " " + face);
    }

    public void doM(){
        // this.showCurrent();
        switch(face){
            case 'N': {
                y+=1;
            } break;
            case 'E': {
                x+=1;
            } break;
            case 'S': {
                y-=1;
            } break;
            case 'W': {
                x-=1;
            } break;
        }
    }

    public void doL(){
        switch(face){
            case 'N': face='W'; break;
            case 'E': face='N'; break;
            case 'S': face='E'; break;
            case 'W': face='S'; break;
        }
    }

    public void doR(){
        switch(face){
            case 'N': face='E'; break;
            case 'E': face='S'; break;
            case 'S': face='W'; break;
            case 'W': face='N'; break;
        }
    }

}

public class RoversProgram {
    public static void main(String[] args) throws Exception{
        
        Scanner scan = new Scanner(System.in);
        String grid_size[]=scan.nextLine().trim().split(" ");

        // First rover
        String arr[]=scan.nextLine().trim().split(" ");
        Rover r1 = new Rover(Integer.parseInt(arr[0]),Integer.parseInt(arr[1]),arr[2].charAt(0));
        char instructions[] = scan.nextLine().trim().toCharArray();
        r1 = doJob(r1, instructions);
        r1.showCurrent();

        // Second rover
        arr=scan.nextLine().trim().split(" ");
        Rover r2 = new Rover(Integer.parseInt(arr[0]),Integer.parseInt(arr[1]),arr[2].charAt(0));
        instructions = scan.nextLine().trim().toCharArray();
        r2 = doJob(r2, instructions);
        r2.showCurrent();

    }

    public static Rover doJob(Rover rover, char instructions[]){
        int insLen = instructions.length;
        for(int i = 0; i< insLen; i++){
            char c = instructions[i];
            if(c=='L'){
                rover.doL();;
            }else if(c=='R'){
                rover.doR();
            }else if(c=='M'){
                // System.out.println("I here");
                rover.doM();
            }
        }
        return rover;
    }
}
