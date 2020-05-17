package string_codes;
import java.util.StringTokenizer;

public class TokenStrings {
    public static void main (String[] args){

        String str = new String("Hello I am Satvik");
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(str);

        String strReverse;

        while(st.hasMoreTokens()){
            sb.insert(0, st.nextToken());

            if(st.hasMoreTokens()){
                sb.insert(0, " ");
            }
        }

        strReverse = sb.toString();
        System.out.println(strReverse);

        

    }
}