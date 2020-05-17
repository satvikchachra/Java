package string_codes;

public class SplitString {

    public static void main(String[] args){
        String str = "Hello I am Satvik";
        String strReverse;

        StringBuilder sb = new StringBuilder();

        // Returns an array of strings
        String[] strTokens = str.split(" ");

        for(int i = 0 ; i < strTokens.length; i++){
            sb.insert(0, strTokens[i]);

            if(i < strTokens.length-1){
                sb.insert(0, " ");
            }
        }

        strReverse = sb.toString();

        System.out.println(strReverse);
    } 
}
