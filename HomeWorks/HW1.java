public class HW1 {
    public static void main(String[] args) {
        for(int i=1; i<=5; i++){
            for(int sp=1; sp<=5-i; sp++){
                System.out.print(" ");
            }
            for(int st=1; st<=i; st++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
}
