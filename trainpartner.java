
//********************************************************* */
//anktrain codechef train partner
import java.util.*;

public class trainpartner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            findBerthPartner(n);
        }
    }

    public static void findBerthPartner(int n) {
        int partnerSeat;
        String berthType;

        switch (n % 8) {
            case 1:
                partnerSeat = n + 3;
                berthType = "LB";
                break;
            case 2:
                partnerSeat = n + 3;
                berthType = "MB";
                break;
            case 3:
                partnerSeat = n + 3;
                berthType = "UB";
                break;
            case 4:
                partnerSeat = n - 3;
                berthType = "LB";
                break;
            case 5:
                partnerSeat = n - 3;
                berthType = "MB";
                break;
            case 6:
                partnerSeat = n - 3;
                berthType = "UB";
                break;
            case 7:
                partnerSeat = n + 1;
                berthType = "SL";
                break;
            case 0:
                partnerSeat = n - 1;
                berthType = "SU";
                break;
            default:
                throw new IllegalArgumentException("Unexpected value: " + (n % 8));
        }

        System.out.println(partnerSeat + berthType);
    }
}