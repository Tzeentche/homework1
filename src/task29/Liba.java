package task29;

//      Имеется текст. Следует составить для него частотный словарь.

import java.text.*;
import java.util.*;
import java.util.regex.Pattern;

public class Liba {

    static HashMap<String, Integer> vocabulary = new HashMap<String, Integer>();
    static Scanner sc = new Scanner(System.in);

    public static boolean isEngLetter(char c){
        return 'a' <= c && c <= 'z' || 'A' <= c && c <= 'Z';
    }

    public static boolean isWord(String s){
        for(int i = 0; i < s.length(); i++){
            if(!(isEngLetter(s.charAt(i)) ||
                    Character.isDigit(s.charAt(i)) ||
                    Pattern.matches("\\p{Punct}", s))) {
                return false;
            }
        }
        return true;
    }

    public static String toAlpha(String s){
        return s.replaceAll("[^a-zA-Z]","");
    }

    public static void main(String[] args) throws java.lang.Exception {
            while(sc.hasNext()){
                String s = sc.next();
                if(isWord(s)){
                    s = toAlpha(s);
                    if(!s.isEmpty()){
                        vocabulary.put(s, vocabulary.containsKey(s) ? vocabulary.get(s) + 1 : 1);
                    }
                }
            }
            int sum = 0;
            for(int value : vocabulary.values()){
                sum += value;
            }
            NumberFormat formatter = new DecimalFormat("#0.0000");

            for(String s : vocabulary.keySet()){
                System.out.println(s + " " + formatter.format((double)vocabulary.get(s)/sum));
            }
    }
}