/*
package problems.strings;

public class RunLengthEncoding {
    public static void main(String[] args) {
        RunLengthEncoding run = new RunLengthEncoding();
        run.runLengthEncodingString("AAAAAAAAAAAAAAABBBBCCD");
        
    }

    private void runLengthEncodingString(String s) {
        char chararray[] = new char[0];
         int length =1;
         int j=0;

        for (int i = 1; i < s.length()-1 ; i++) {

            if(s.charAt(i) ==  s.charAt(i-1)){
                length++;

            }
            else
            {
                chararray[j++] = length;
                chararray[j++] = s.charAt(i);
                length=1;
            }

        }
    }
}
*/
