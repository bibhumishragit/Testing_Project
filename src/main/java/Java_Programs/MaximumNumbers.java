package Java_Programs;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class MaximumNumbers{

    public void numbers(int[] array){
        int maxone=0;
        int maxtwo=0;
        for(int num : array){
            if(maxone<num){
                maxtwo=maxone;
                maxone=num;
            }
            else if(maxtwo<num){
                maxtwo=num;
            }
        }
        System.out.println("first max number"+ maxone);
        System.out.println("second max number"+ maxtwo);
    }

    public static void main(String[] args){

        int num[] = { 15, 24, 48, 21, 43, 11, 97, 10 };
        MaximumNumbers maxnumbers= new MaximumNumbers();
        maxnumbers.numbers(num);
    }
}