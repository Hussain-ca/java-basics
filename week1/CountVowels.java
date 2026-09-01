package week1;

import java.util.Locale;

public class CountVowels {

    public static int countVowels(String s){
        String lower =s.toLowerCase();
        int count=0;
        for(int i=0;i<lower.length();i++){
            char c=lower.charAt(i);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                count+=1;
            }
        }
        return count;
    }

    public static void main(String[] args){
        System.out.println(countVowels("APPLE"));           // expect 2
        System.out.println(countVowels("Hello My name is Claude"));  // expect 8
        System.out.println(countVowels(""));                 // expect 0
    }
}
