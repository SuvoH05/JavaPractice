import java.util.Scanner;

class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[5];

        // nums[0] = 10;
        // nums[1] = 20;
        // nums[2] = 30;
        // nums[3] = 40;
        // nums[4] = 50;

        for (int i =0; i < nums.length; i++){
            System.out.print("Enter your number "+i+": ");
            int num = sc.nextInt();
            nums[i]=num;
            
        }

        
        for (int i = 0; i < nums.length; i++){
            System.out.println("Your Number at index "+i+" is: "+nums[i]);
        }
        sc.close();
    }
}