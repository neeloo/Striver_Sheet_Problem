package org.example.Strings;

public class ReverseStringWord {
    public static void main(String[] args) {
        String s = "the sky is blue";
        System.out.println(s);

    }
    public  static String reversestring(String s){
        String st[] = s.split("//s+");
        StringBuilder sb = new StringBuilder();
        for( int i =  st.length;i>=0;i--){
            sb.append(st[i]);
            if(i != 0){
                sb.append(" ");
            }

        }
        return sb.toString().trim();


    }
}
