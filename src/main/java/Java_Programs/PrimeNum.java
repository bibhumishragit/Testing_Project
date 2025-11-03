package Java_Programs;

public class PrimeNum {

    public static void main(String[] args){
        int startno=1;
        int endno=100;
        for(int number=startno;number<=endno;number++){
            if(isPrime(number)){
               System.out.print(number+" ");
            }
        }
    }
    public static boolean isPrime(int number){
        if(number<=1){ 
            return false;
        }
        for(int i=2;i<=Math.sqrt(number);i++){
            if(number % i==0){
               return false;
            }
        }
        return true;
    }
}
