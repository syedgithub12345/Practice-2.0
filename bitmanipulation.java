//****************************************** */
//count the number of 1 in the binary conversion of decimal. bit manipulation
public class bitmanipulation {
    public static void main(String[] args) {
        int n = 23;
        n = n & (n - 1);
        int count = 1;
        while (n != 0) {
            count++;
            n = n & (n - 1);
        }
        System.out.println(count);
    }
}


// //********************* */
//bit set/not set
// public class bitmanipulation {
//     public static void main(String[] args) {
//         int n = 23;
//         int i = 4;
//         if ((n & (1 << i)) != 0) {
//             System.out.println("Yes, bit is set");
//         } else {
//             System.out.println("Bit is not set");
//         }
//     }
// }