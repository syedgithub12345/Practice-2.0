//********************************************** */
//index position of substring in a string
import java.util.*;

public class indexpos {
    public static void idxsubstring(String s, String pattern) {
        int index = s.indexOf(pattern);
        System.out.println(index);
    }

    public static void main(String[] args) {
        String s = "Hello world , world is beautiful";
        String pattern = "world";
        idxsubstring(s, pattern);
    }
}

// //or
// import java.util.*;
// public class indexpos{
// public static int idxsubstring(String s,String pattern){
// for(int i=0;i<s.length();i++){
// int temp=i;
// int j=0;
// for(j=0;j<pattern.length();j++){
// if(s.charAt(temp)!=pattern.charAt(j)){
// break;
// }
// temp++;
// }
// if(j==pattern.length()){
// return i;
// }
// }
// return -1;
// }
// public static void main(String[] args) {
// String s="Hello:";
// String pattern="llo:";
// System.out.println(idxsubstring(s,pattern));
// }
// }