package Java_Programs;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Javaprgms {
    static String name = "Racecar";
    static int number = 10;

    public Javaprgms() throws IOException {
    }

    public static void main(String[] args) throws IOException {
        Javaprgms jv = new Javaprgms();
        //int number=readnum();
        //oddcheck(number);
        //primecheck(number);
        //fibseries(number);
        //swapnumber();
        //factorial(number);
        //revnumber(number);
        //revnumasstring(number);
        //armstrng(number);
        //armstronglist();
        //sizeofdigits(number);
        //reversesentencewdoutspace();
        //reverseSentenceAndWords();
        //jv.reverseSentence();
        //jv.localvar();
        //jv.mtdblock();
        //smallestpalindromesubstring(name);
        //longestpalindromesubscript(name);
        //reverseeachcharacter();
        //printfirstchar();
        //removespecial();
        //reverselastchar();
        //countwords();
        //anagram();
        //nonrepeatedchar();
        //countvowel();
        //nonrepeatedchar();
        //System.out.println(longsubstring());
        //removeduplicate();
        //count();
        //wordgroup();
        //minmax();
        //readExccel();
        //writeexccel();
        //findnumbers();
        //sumnumbers();
        //add2arrays();
        returnmatch();
    }

    public static int readnum() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number::");
        int num = scanner.nextInt();
        return num;
    }

    public static void oddcheck(int num) {
        if (num % 2 == 0) {
            System.out.println("Number is Even");
        } else {
            System.out.println("Number is Odd");
        }
    }

    public static boolean primecheck(int num) {
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                System.out.println("The " + num + " isn't a prime number");
                return false;
            }
        }
        System.out.println("The " + num + " is a prime number");
        return true;
    }

    public static void fibseries(int num) {
        int first = 0, second = 1, next;
        System.out.println("The fibanonanci series numbers are:");
        for (int i = 0; i < num; i++) {
            System.out.print(first + " ");
            next = first + second;
            first = second;
            second = next;
        }
    }

    public static void swapnumber() {
        int first = 5, second = 8;
        System.out.println("Initial values given to First:" + first + " Initial value of Second::" + second);
        first = first - second;
        second = first + second;
        first = first - second;
        if (first < 0) {
            first = Math.abs(first);
        }
        System.out.println("First number is::" + first);
        System.out.println("Second number is::" + second);
    }

    public static void factorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        System.out.println("\nFactorial of the given number::" + fact);
    }

    public static void revnumber(int num) {
        int rev = 0;
        //num=1230456789;
        while (num > 0) {
            int rno = num % 10;
            rev = rev * 10 + rno;
            num = num / 10;
        }
        System.out.println("Reverse of the given number::" + rev);
    }

    public static void revnumasstring(int num) {
        String str = Integer.toString(num);
        String rev = new StringBuilder(str).reverse().toString();
        int revnum = Integer.parseInt(rev);
        System.out.println("Reverse number is::" + revnum);
    }

    public static void armstrng(int num) {
        int armstrng = 0, digits = String.valueOf(num).length(), number = num;
        while (num > 0) {
            int lastdigit = num % 10;
            //armstrng=armstrng+lastdigit*lastdigit*lastdigit;
            armstrng += Math.pow(lastdigit, digits);
            num /= 10;
        }
        if (armstrng == number) {
            System.out.println("The number " + number + " is an Armstrong Number");
        } else {
            System.out.println("The number " + number + " isn't an Armstrong Number");
        }
    }

    public static void armstronglist() {
        int start = 1, end = 999;
        List<Integer> armstrngnumlist = new ArrayList<>();
        for (int i = start; i <= end; i++) {
            int armstrng = 0, digits = String.valueOf(i).length(), num = i;
            while (num > 0) {
                int lastdigit = num % 10;
                armstrng += Math.pow(lastdigit, digits);
                num /= 10;
            }
            if (armstrng == i) {
                armstrngnumlist.add(i);
            }
        }
        System.out.println("The list of Armstrong numbers in the given range are::" + armstrngnumlist);
    }

    public static void sizeofdigits(int num) {
        if (num < 0) {
            num = num * -1;
        }
        int digits = String.valueOf(num).length();
        System.out.println("The count of digits are::" + digits);
    }

    public static void reversesentencewdoutspace() {
        String input = "  This is java program   ";
        String inputwdoutspace = input.replace("\\s", "");
        StringBuilder sb = new StringBuilder(inputwdoutspace).reverse();
        System.out.println("=====This is reversing each word in sentence using reverse method=====");
        System.out.println("Reversed String is::" + sb.toString().trim());

        //SubString method usage
        String substring = input.trim().substring(0, 4);
        System.out.println("Substring::" + substring);

        //find vowel and add a random number<10 after it and print no. of vowel and consonant
        char[] words = input.toLowerCase().trim().toCharArray();
        StringBuilder addno = new StringBuilder();
        Random random = new Random();
        int randomnum = random.nextInt(10);
        ;
        int vowel = 0, consonant = 0;
        List<String> getvowels = new ArrayList<String>();
        for (char c : words) {
            //for(char c:input.toCharArray())
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                StringBuilder vowels = new StringBuilder();
                getvowels.add(vowels.append(c).toString());
                addno.append(randomnum);
                vowel++;
            } else {
                addno.append(c);
                consonant++;
            }
        }
        System.out.println("The Vowels found in the given string::" + getvowels);
        System.out.println("Count of Vowels is::" + vowel + "\n Count of Consonants is::" + consonant);
        System.out.println("Adding a random number after the char if it's a vowel::" + addno);
    }

    public static void reverseSentenceAndWords() {
        String input = "Bibhu Prasad Mishra";
        //if (input == null || input.isEmpty()) return input;
        String[] words = input.split("\\s+");
        StringBuilder result = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            StringBuilder sb = new StringBuilder(words[i]).reverse();
            result.append(sb).append(" ");
        }
        System.out.println("====This is reversing each word in sentence using for loop=====");
        System.out.print("Reversed String is::" + result.toString().trim());
    }

    public void reverseSentence() {
        this.name = "Adyasha Suvashree Mishra";
        String[] inoutWords = name.split(" ");
        StringBuilder reversed = new StringBuilder();
        for (int i = inoutWords.length - 1; i >= 0; i--) {
            reversed.append(inoutWords[i]).append(" ");
        }
        //String output = reversed.toString().trim();
        System.out.println("\n===== Reversed words in the Sentence====" + "\n" + reversed);
    }

    /*public void localvar(){
    int x;
    if(true){
        x=10;
        System.out.println("The value of X:::"+x);
    }
    else {
        x=5;
        System.out.println("Else value of X::"+x);
    }

    }
    public Javaprgms() {
        System.out.println(":Constructor block:");
    }
    //Instance block
    {
        System.out.println(":Instance block:");
    }
    public static void mtdblock(){
        System.out.println(":static Method block:");
    }
    //Static block
    static {
        System.out.println(":static block:");
    }*/
    public static String smallestpalindromesubstring(String input) {
        int len = input.length();
        for (int i = 2; i <= len; i++) {
            for (int j = 0; j <= len - i; j++) {
                String sub = input.substring(j, j + i);
                if (ispalindrome(sub)) {
                    System.out.println("There is palindrome substring::" + sub);
                    return sub;
                }
            }
        }
        return null;
    }

    public static boolean ispalindrome(String sub) {
        String rev = new StringBuilder(sub).reverse().toString();
        if (sub.equals(rev)) {
            return true;
        }
        return false;
    }
        /*int left = 0, right = sub.length() - 1;
        while (left < right) {
            if (sub.charAt(left) != sub.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }*/

    public static String longestpalindromesubscript(String input) {
        input = input.replaceAll(" ", "").toLowerCase();
        if (input == null || input.length() < 2) return input;

        int start = 0, end = 1;
        for (int i = 0; i < input.length(); i++) {
            int len1 = expandFromCenter(input, i, i);     // Odd-length
            int len2 = expandFromCenter(input, i, i + 1); // Even-length
            int len = Math.max(len1, len2);
            if (len > end) {
                start = i - (len - 1) / 2;
                end = len;
            }
        }
        String result = input.substring(start, start + end);
        System.out.println("Result is :::" + result);
        return result;
    }

    private static int expandFromCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }

    public static void reverseeachcharacter() {
        String[] input = "Hello world".split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= input.length - 1; i++) {
            String word = input[i];
            String revword = new StringBuilder(word).reverse().toString();
            sb = sb.append(revword).append(" ");
        }
        System.out.println("The reversed sentence::" + sb);
    }

    public static void printfirstchar() {
        String[] input = "Bibhu Prasad Mishra".split(" ");
        for (String str : input) {
            if (!str.isEmpty()) {
                System.out.print(str.charAt(0));
            }
        }
    }

    public static void removespecial() {
        String input = "Bi!bhu Prasa@d M#$ish^&ra".replaceAll("[^a-zA-Z0-9\\s]", "");
        System.out.println("The required result is::" + input);
    }

    public static void reverselastchar() {
        String[] input = "Bibhu Prasad Mishra".toLowerCase().split("\\s+");
        StringBuilder outcome = new StringBuilder();
        for (String words : input) {
            char lastchar = words.charAt(words.length() - 1);
            String result = lastchar + words.substring(0, words.length() - 1);
            outcome.append(result).append(" ");
        }
        System.out.println(outcome);
    }

    public static void countwords() {
        String[] str = "Big black bug bit a big black dog on his big black nose".toLowerCase().split("\\s+");
        Map<String, Integer> counter = new HashMap<>();
        for (String words : str) {
            counter.put(words, counter.getOrDefault(words, 0) + 1);
        }
        List<Map.Entry<String, Integer>> sortedlist = new ArrayList<>(counter.entrySet());
        List<Integer> list1 = new ArrayList<>();
        sortedlist.sort((a, b) -> b.getValue().compareTo(a.getValue()));
        for (int i = 0; i < Math.min(2, sortedlist.size()); i++) {
            Map.Entry<String, Integer> outcounter = sortedlist.get(i);
            System.out.println("The word::" + outcounter.getKey() + "=>Appeared::" + outcounter.getValue() + " times");
        }
        System.out.println(sortedlist);
    }

    public static void anagram() {
        char[] input1 = "listen".toCharArray();
        char[] input2 = "silent".toCharArray();
        Arrays.sort(input1);
        Arrays.sort(input2);
        if (Arrays.equals(input1, input2)) {
            System.out.println("The given strings are anagram");
        } else {
            System.out.println("The given strings aren't anagram");
        }
    }

    public static void countvowel() {
        String input = "Bibhu Prasad Mishra".toLowerCase();
        int count = 0;
        for (char c : input.toCharArray()) {
            if ("aeiu".indexOf(c) != -1) {
                count++;
            }
        }
        System.out.println(count);
    }

    public static void nonrepeatedchar() {
        String[] input = "Bibhu Prasad Mishra".toLowerCase().split(" ");
        Character firstUnique = firstchar(input);
        if (firstUnique != null) {
            System.out.println("First non-repeated character: " + firstUnique);
        } else {
            System.out.println("No unique character found.");
        }
    }

    public static Character firstchar(String[] input) {
        Map<Character, Integer> charmap = new LinkedHashMap<>();
        for (String words : input) {
            for (char c : words.toCharArray()) {
                charmap.put(c, charmap.getOrDefault(c, 0) + 1);
            }
        }
        for (Map.Entry<Character, Integer> entry : charmap.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return null;
    }

    public static void removeduplicate() {
        List<Integer> numbers = Arrays.asList(1, 1, 2, 3, 3, 4, 5, 5);
        List<Integer> uniques = numbers.stream().distinct().collect(Collectors.toList());
        System.out.println("The unique numbers list::" + uniques);

        String[] names = {"Alice", "Bob", "Alice", "John"};
        List<String> uniqueNames = Arrays.stream(names).distinct().collect(Collectors.toList());
        System.out.println("The unique numbers list::" + uniqueNames);
    }

    public static void count() {
        //List<Character> input =Arrays.asList('a', 'b', 'a', 'c', 'b');
        char[] input = {'a', 'b', 'a', 'c', 'b'};
        Map<Character, Integer> map1 = new HashMap<>();
        for (char c : input) {
            map1.put(c, map1.getOrDefault(c, 0) + 1);
        }
        for (Map.Entry<Character, Integer> entry : map1.entrySet()) {
            System.out.println(entry.getKey() + "::" + entry.getValue());
        }
    }

    public static void wordgroup() {
        String[] words = {"apple", "banana", "apricot", "blueberry"};
        Map<Character, List<String>> grouped = new HashMap<>();
        int count = 0;
        for (String word : words) {
            char firstChar = Character.toLowerCase(word.charAt(0));
            char fi = word.toLowerCase().charAt(0);
            grouped.putIfAbsent(firstChar, new ArrayList<>());
            grouped.get(firstChar).add(word);
            count++;
        }
        System.out.println(count);
        System.out.println(grouped);
    }

    public static void minmax() {
        int[] numbers = {12, 5, 8, 19, 3, 25};
        int min = numbers[0], max = numbers[0];
        for (int num : numbers) {
            if (num >= max) max = num;
            if (num < min) min = num;
        }
        System.out.println(min + "::" + max);
    }
    public static void readExccel() throws IOException {
        String filepath="D:\\Eclipse-Workspace\\Test Data.xlsx";
        FileInputStream fis = new FileInputStream(filepath);
        Workbook workbook=new XSSFWorkbook(fis);
        int sheetcount=workbook.getNumberOfSheets();
        for(int i=0;i<sheetcount;i++) {
            String sheetname=workbook.getSheetName(i);
            String reqsheet="Test data sheet";
            if(sheetname.equals(reqsheet)){
                for (Row row : workbook.getSheet(sheetname)) {
                    for (Cell cell : row) {
                        switch (cell.getCellType()) {
                            case STRING:
                                System.out.print(cell.getStringCellValue() + "\t");
                                break;
                            case NUMERIC:
                                System.out.print(cell.getNumericCellValue() + "\t");
                                break;
                            case BOOLEAN:
                                System.out.print(cell.getBooleanCellValue() + "\t");
                                break;
                            default:
                                System.out.print(" \t");
                        }
                    }
                    System.out.println();
                }
            }
        }
        workbook.close();
        fis.close();
    }

    public static void writeexccel() throws IOException {
        String filePath = "D:\\Eclipse-Workspace\\";
        Workbook workbook = new XSSFWorkbook();
        Sheet sheet = workbook.createSheet("TestData");
        Row headerRow = sheet.createRow(0);
        headerRow.createCell(0).setCellValue("Name");
        headerRow.createCell(1).setCellValue("Score");
        Row row1 = sheet.createRow(1);
        row1.createCell(0).setCellValue("Bibhu");
        row1.createCell(1).setCellValue(95);
        Row row2 = sheet.createRow(2);
        row2.createCell(0).setCellValue("Automation");
        row2.createCell(1).setCellValue(100);
        sheet.autoSizeColumn(0);
        sheet.autoSizeColumn(1);
        try {
            File file = new File(filePath);
            file.getParentFile().mkdirs();
            FileOutputStream fos = new FileOutputStream(file);
            workbook.write(fos);
            fos.close();
            workbook.close();
            System.out.println("Excel file created successfully at: " + filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void findnumbers() {
        String sentence="In 2023, only 007 engineers completed the 048-hour challenge, while 123456 users viewed the results on platform version 9.".toLowerCase();
        String[] input=sentence.split("\\d+");
        for(String words:input){
            if(!words.isEmpty()){
                System.out.println("The words found::"+words);
            }
        }
        List<String> numbers=new ArrayList<>();
        Matcher match=Pattern.compile("\\d+").matcher(sentence);
        while(match.find()){
            numbers.add(match.group());
        }
        System.out.println("The numbers found::"+numbers);
        for(int i=0;i<numbers.size();i++){
            int len=numbers.get(i).length();
            while(len==6){
                System.out.println("The six digit number is::"+numbers.get(i));
                break;
            }
        }
    }

    public static void sumnumbers(){
        String input="B12i23b34h45u5";
        Matcher match=Pattern.compile("\\d+").matcher(input);
        int sumeven=0;
        int sumodd=0;
        while(match.find()){
            int num=Integer.parseInt(match.group());
            if(num %2==0){
                sumeven+=num;
            }
            else{
                sumodd+=num;
            }
        }
        System.out.println("The sum of the even numbers in the string::"+sumeven);
        System.out.println("The sum of the odd numbers in the string::"+sumodd);
    }
    public static void add2arrays(){
        int[] arr1={1,2,3,2,5,4,6,9,7};
        int[] arr2={3,6,1,5,2,2,4};
        int[] merged = IntStream.concat(Arrays.stream(arr1), Arrays.stream(arr2)).toArray();
        System.out.println("The merged array::"+Arrays.toString(merged));
    }
    public static void returnmatch(){
        String input="B12i12b12h23u34gh23";
        Matcher match=Pattern.compile("\\d+").matcher(input);
        List<String> numbers = new ArrayList<>();
        Map<String,Integer> map=new LinkedHashMap<>();
        while(match.find()) {
            numbers.add(match.group());
            }
        System.out.println("The numbers in the list::"+numbers);
        for(String num:numbers) {
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(Map.Entry<String,Integer> en:map.entrySet()){
            System.out.println("The number::"+en.getKey()+" Appeared::"+en.getValue()+" times");
        }
    }
}