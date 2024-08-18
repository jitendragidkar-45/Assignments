package in.xenosis.BasicAssignment;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class EvenOrOdd {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Enter the number you wants to check Even or Odd : ");
            Integer number = Integer.parseInt(br.readLine());
            if(number%2==0){
                System.out.println("Number is even : "+number);
            }
            else{
                System.out.println("Number is odd : "+number);
            }
        }catch(Exception e){
            e.getMessage();
        }
    }
}
