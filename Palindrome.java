import java.io.DataInputStream;

public class Palindrome {
    public static void main(String[] args) throws Exception{
        DataInputStream data = new DataInputStream(System.in);
        String input=data.readLine();
        int ip_len=input.length();
        String reverse="";
        for(int i=ip_len-1; i>=0; i--){
            reverse+=input.charAt(i);
        }
        if(input.equals(reverse)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
    }
}
