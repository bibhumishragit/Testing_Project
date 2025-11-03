package Java_Programs;

import com.google.common.io.Files;
import com.google.inject.matcher.Matchers;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.nio.file.Files.readString;
import static javax.management.openmbean.SimpleType.STRING;
import static org.apache.poi.ss.usermodel.CellType.NUMERIC;

public class All_Test_Programs {
    static String input="This is a wonderful world";
    static String mixedstring="Bibhu12 90Prasad24 Mis234hra 9870";
    static int number=14;
    static int[] numberarray={12,12,12,12,13,13,14,15,16,17,18,19,13,14};
    public static void main(String[] args) throws IOException {
        //reverse_words();
        //reverseeachcharandword();
        //reversenumber();
        //toptwooccurednumbers();
        //conswquitivesum();
        //charcount();
        //Read_File();
        //Readfile_file();
        //config_Read();
        //numbermatch();
        //printrightangle();
        //toprightangle();
        //primenumber();
        mapcheck();
        find2ndnonrepeatednumber();
    }
    public static void reverse_words(){
        String[] words=input.split("\\s");
        StringBuilder sb=new StringBuilder();
        for(int i= words.length-1; i>=0; i--){
            sb.append(words[i]).append(" ");
        }
        System.out.println("The reversed words in the sentence is::"+sb);
    }
    public static void reverseeachcharandword(){
       String inputwithoutspaces=input.trim().replace("\\s","");
       StringBuilder sb=new StringBuilder(inputwithoutspaces).reverse();
       System.out.println("the reversed char words and sentence is::"+sb);//.toString().trim());
    }
    public static void reversenumber(){
       int reverse=0;
       while(number>0) {
           reverse = reverse * 10 + number % 10;
           number = number / 10;
       }
        System.out.println("The reversed number is::"+reverse);
    }
    public static void toptwooccurednumbers(){
        Map<Integer,Integer> numbers=new HashMap<>();
        for(int num:numberarray){
            numbers.put(num,numbers.getOrDefault(num,0)+1);
        }
        List<Map.Entry<Integer,Integer>> sortedlist=new ArrayList<>(numbers.entrySet());
        sortedlist.sort((a, b)-> b.getValue().compareTo(a.getValue()));
        for(int i=0;i<=Math.min(2,sortedlist.size());i++) {
            Map.Entry<Integer, Integer> en = sortedlist.get(i);
            System.out.println("The top numbers::"+en.getKey()+"Appeared: "+en.getValue()+" times");
        }
    }
    public static void conswquitivesum(){
        int start=0, target=25;
        boolean sum=false;
        while(start<numberarray.length-1) {
            int addition = numberarray[start] + numberarray[start + 1];
            if (addition == target) {
                System.out.println("The consecutive numbers who addition matches target::" + numberarray[start] +"::"+ numberarray[start + 1]);
                sum = true;
                break;
            }
            start++;
        }
            if (!sum) {
                System.out.println("There are no consecutive numbers sum as target");
            }
        }
    public static void charcount(){
        char[] chararray=input.replace(" ","").toLowerCase().toCharArray();
        Map<Character,Integer> charactermap=new HashMap<>();
        for(char c:chararray){
            charactermap.put(c,charactermap.getOrDefault(c,0)+1);
        }
        for(Map.Entry<Character,Integer> en:charactermap.entrySet()){
            System.out.println("The character::"+en.getKey()+" appeared in the given string::"+en.getValue()+" times");
        }
    }
    public static void Read_File() throws IOException {
        String filepath="D:\\Study\\full set of questions for SDET.pdf";
        try{
            FileInputStream fis=new FileInputStream(filepath);
            int content;
            while((content=fis.read())!=-1) {
                System.out.println("File content:::" +(char)(content));
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
    public static void Readfile_file() throws IOException{
        String filepath="D:\\Study\\PlayWright\\PlayWright in detail Learning path.txt";
        try{
            BufferedReader BR=new BufferedReader(new FileReader(filepath));
            String lines;
            while((lines=BR.readLine())!=null){
                if((lines=BR.readLine())!="\\s+") {
                    System.out.println("File content::" + lines);
                }
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
    public static void config_Read() throws IOException {
        String filepath= "D:\\Study\\config.properties";
        //String filepath1="D:\\Study\\config1.properties";
        //Read the config.properties file and print the content
        BufferedReader BR=new BufferedReader(new FileReader(filepath));
        String lines;
        while((lines=BR.readLine())!=null){
            System.out.println(lines);
        }
        //Read Config file and put that into a map
        Properties prop=new Properties();
        prop.load(new FileReader(filepath));
        Map<String,String> configread=new HashMap<>();
        for (String key : prop.stringPropertyNames()) {
            configread.put(key, prop.getProperty(key));
        }
        List<Map.Entry<String,String>>listfrommap=new ArrayList<>(configread.entrySet());
        listfrommap.sort((s1,s2)->s2.getValue().compareTo(s1.getValue()));
        for(Map.Entry<String,String>en:listfrommap){
            System.out.println("For::"+en.getKey()+"=>Value is::=="+en.getValue());
        }
        System.out.println(configread);
        //Copy and paste the same file with different name and location
       try {
           Files.copy(new File(filepath),new File("D:\\Study\\config1.properties"));
       }
       catch (IOException e){
           e.printStackTrace();
       }
       //write to existing file
       FileWriter fw=new FileWriter(filepath,true);
       BufferedReader br=new BufferedReader(new FileReader(filepath));
       String content;
       while((content= br.readLine())!=null){
           System.out.println("Content value::"+content);
           boolean istestdisplayed=content.contains("Prasad");
           System.out.println("boolean value of test display::"+istestdisplayed);
           if(istestdisplayed){
               content.replace("Prasad","Mishra");
           }
       }
       fw.append("\nPrasad");
       fw.close();
    }
    public static void numbermatch(){
        String[] splitmixednumber = mixedstring.split("\\d+");
            for (String eachsplitonnum : splitmixednumber) {
                if (!eachsplitonnum.isBlank()) {
                    System.out.println("The split words based on appearance of number:::" + eachsplitonnum);
                }
            }
        List<Integer> numbers = new ArrayList<>();
        Matcher match = Pattern.compile("\\d+").matcher(mixedstring);
            while (match.find()) {
                numbers.add(Integer.valueOf(match.group()));
                }
              System.out.println("The numbers found::" + numbers);
              for(int i=0;i<numbers.size();i++) {
                  String numberstring=numbers.get(i).toString();
                  int k=numberstring.length();
                  while (k==2) {
                      System.out.println("This is a two digit number::"+numbers.get(i));
                      break;
                  }
              }
    }
    public static void printrightangle(){
        int num=5;
        for(int i=1;i<=num;i++){
            for (int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void toprightangle(){
        int num=5;
        for(int i=num;i>=1;i--){
            for (int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void primenumber() {
        boolean isprime=false;
        for(int i=2;i<=number;i++) {
            if (number % i == 0) {
                //isprime=false;
                System.out.println("This isn't a prime number");
            } else {
                //isprime = true;
                System.out.println("This is a prime number");
            }
        }
        //return isprime;
    }

    public static void mapcheck(){
        Map<String,Integer> mapprint=new HashMap<>();
        mapprint.put("null",123);
        mapprint.put("null",1231);
        mapprint.put("Bibhu",234);
        mapprint.put("null",234);
        System.out.println("The map values::"+mapprint);

    }
    
    public static void find2ndnonrepeatednumber(){
        int[] arr={1,2,3,2,4,5};
        int k=0;
        Map<Integer,Integer> maptest=new LinkedHashMap<>();
        for(int num:arr){
            maptest.put(num,maptest.getOrDefault(num,0)+1);
        }
        for(Map.Entry<Integer,Integer>en:maptest.entrySet()){
             if(en.getValue()==1){
                 k++;
                 if(k==1){
                     System.out.println("The 2nd non repeated number is::"+en.getKey());
                 }
             }
        }
    }
}

