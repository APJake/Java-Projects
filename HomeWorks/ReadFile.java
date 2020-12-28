import java.util.Scanner;
import java.io.File;

public class ReadFile {

    static boolean isSingleComment(String line, int strLen){
        return strLen>1 && line.substring(0,2).equals("//");
    }
    static boolean isMultiCommentOpen(String line, int strLen){
        return strLen>1 && line.substring(0,2).equals("/*");
    }
    static boolean isMultiCommentClose(String line, int strLen){
        return strLen>1 && line.substring(strLen-2).equals("*/");
    }

    public static void main(String[] args) throws Exception {
        String filename = "Test.java";

        File file = new File(filename);
        Scanner scan = new Scanner(file);

        int lineCounter = 0;
        int blankCounter = 0;
        int singleComment = 0;
        int multiComment = 0;

        boolean isInComment = false;

        while(scan.hasNextLine()){
            lineCounter++;
            String line = scan.nextLine().trim();
            int strLen = line.length();

            if(line.equals("")){
                blankCounter++;
            }
            if(isSingleComment(line, strLen)){
                singleComment++;
            }
            if(isInComment){
                if(isMultiCommentClose(line, strLen)){
                    isInComment=false;
                }
                multiComment++;
            }
            else{
                if(isMultiCommentOpen(line, strLen)){
                    isInComment=true;
                    multiComment++;
                }
            }
        }
        System.out.println("The number of lines: "+lineCounter);
        System.out.println("Excluding blank line: "+(lineCounter-blankCounter));
        System.out.println("Excluding single line comments: "+(lineCounter-singleComment));
        System.out.println("Excluding multiline comments: "+(lineCounter-multiComment));
    }
    
}
