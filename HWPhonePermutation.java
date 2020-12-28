import java.util.ArrayList;
import java.util.Scanner;

class Permute{
    char[] digits;
    String[] arrDigitToChars = {"0","1","ABC","DEF","GHI","JKL","MNO","PRS","TUV","WXY"};
    public Permute(String digitStr){
        digits=digitStr.toCharArray();
    }
    ArrayList<String> permute(){
        ArrayList<String> perms=new ArrayList<String>();
        String[] digitChars = new String[4];
        for(int i=0; i<digitChars.length; i++){
            digitChars[i]=digitToChar(Integer.parseInt(digits[i]+""));
        }
        
        for(int i1=0; i1<digitChars[0].length(); i1++){
            for(int i2=0; i2<digitChars[1].length(); i2++){
                for(int i3=0; i3<digitChars[2].length(); i3++){
                    for(int i4=0; i4<digitChars[3].length(); i4++){
                        String tmp=""+digitChars[0].charAt(i1)
                            +digitChars[1].charAt(i2)
                            +digitChars[2].charAt(i3)
                            +digitChars[3].charAt(i4);
                        perms.add(tmp);
                    }
                }
            }
        }
        return perms;
    }
    String digitToChar(int d){
        return arrDigitToChars[d];
    }
}

public class HWPhonePermutation {

    public static void main(String[] args) throws Exception{
        Scanner scan = new Scanner(System.in);
        String phonenumber[] = scan.nextLine().trim().split("-");
        Permute pm = new Permute(phonenumber[1]);
        ArrayList<String> permutes=pm.permute();
        System.out.println(permutes.size());
        for (String str : permutes) {
            System.out.print(str+" ");
        }
        System.out.println();
        scan.close();
    }
    
}
