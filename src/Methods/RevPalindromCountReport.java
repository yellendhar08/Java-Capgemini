package Methods;

public class RevPalindromCountReport {
    public static int reverseNumber(int n){
        int rev =0;
        while(n!=0){
            int digit = n%10;
            rev = rev*10+digit;
            n=n/10;
        }
        return rev;
    }

    public static boolean isPalindrome(int num){
        int temp = num;
        int rev=0;
        while(num!=0){
            int digit = num%10;
            rev = rev*10+digit;
            num=num/10;
        }
        if(rev==temp) return true;
        return false;
    }

    public static boolean isStrongNumber(int num){
        int sum =0;
        int product =1;
        int temp =num;
        while(num!=0){
            int digit = num%10;
            for(int i=1; i<=digit; i++){
                product*=i;
            }
            sum+=product;
            num=num/10;
        }
        if(sum==temp) return true;
        return false;
    }

    public static int countPrimeDigits(int num) {
        int count=0;
        while (num != 0) {
            int digit = num % 10;
            if (digit == 2 || digit == 3 || digit == 5 || digit == 7) {
                count++;
            }
            num=num/10;
        }
        return count;
    }
    public static void callFunc(){
        System.out.println(reverseNumber(10));
        System.out.println(isPalindrome(121));
        System.out.println(isStrongNumber(45));
        System.out.println(countPrimeDigits(25878));

    }

    public static void main(String[] args){
        callFunc();
    }
}
