import java.util.*;
public class A_1899_GameWithIntegers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            System.out.println(((n-1)%3==0 || (n+1)%3==0)?"First":"Second");
        }
    }
}


