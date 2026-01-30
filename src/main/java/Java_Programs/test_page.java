package Java_Programs;

import io.cucumber.datatable.DataTable;
import org.apache.poi.ss.formula.atp.Switch;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;

import java.io.*;
import java.io.IOException;
import java.sql.Array;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

import static com.google.common.graph.ElementOrder.sorted;

import static org.apache.poi.ss.usermodel.CellType.*;

public class test_page {

    public static void main(String[] args) throws IOException {
        //commonmethods();
        //Readfromfile();
        //writetonew();
        //findsecsmall();
        String input = "ABC";
        String prefix = "";
        //System.out.println("permutation of"+input+"::");
        //permu(prefix,input);
        //stream();
        //returnele();
        //rearrange();
        //removeduplicate();
        //subarray();
        //sortele();
        //sumofsubarr();
        //addsubarr();
        //findones();
        //customer();
        //firstrepeated();
        //groiupana();
        int[] arr = {2, 7, 11, 15};
        int target = 9;
        //add2nums(arr,target);
        int[] nums = {-1, 0, 1, 2, -1, -4};
        //threeSum();
        //subseq();
        //resortarr();
        //resort();
        //check2power();
        //maxsumsubarr();
        //sumofsub();
        //missingnum();
        //palindromecheck();
        //laststone();
        rotatearr();
    }

    public static void commonmethods() throws IOException {
        try {
            String filepath = "D:\\testdata.txt";
            FileWriter writer = new FileWriter(filepath, true);
            writer.append("\nThis is testing");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writetonew() throws IOException {
        try {
            String filepath = "D:\\testdata.txt";
            FileWriter writer = new FileWriter(filepath, false);
            writer.write("This is writing to new file");
            writer.close();
            System.out.println("Write completed");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void Readfromfile() {
        String filepath = "D:\\testdata.txt";
        try {
            FileReader reader = new FileReader(filepath);
            BufferedReader br = new BufferedReader(reader);
            //BufferedReader br1=new BufferedReader(new FileReader(filepath));
            String line = "";
            while ((line = br.readLine()) != null) {
                System.out.println("Reading from file:::" + line);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readfromdatatable(DataTable dt) {
        List<Map<String, String>> list = dt.asMaps(String.class, String.class);
        for (Map<String, String> listtomap : list) {
            String username = listtomap.get("Username");
            String password = listtomap.get("Password");
        }
    }

    public static void findsecsmall() {
        int[] arr = {10, 20, 4, 45, 99};
        Arrays.sort(arr);
        System.out.println(arr[1]);
    }

    public static void permu(String prefix, String input) {
        if (input.length() == 0) {
            System.out.println(prefix);
            return;
        }
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            String newprefix = prefix + c;
            String newinput = input.substring(0, i) + input.substring(i + 1);
            permu(newprefix, newinput);
        }
    }

    public static void stream() {
        String[] str = {"Bibhu", "Prasad", "Mishra", "Adyasha", "Suvashree", "Mishra", "Swayam", "Sai", "Mishra"};
        String result = Arrays.stream(str).sorted().collect(Collectors.toCollection(LinkedHashSet::new)).toString();
        System.out.println(result);

        String[][] str1 = {{"Bibhu prasad", "Prasad"}, {"Mishra"}, {"Adyasha"}, {"Suvashree"}, {"Mishra"}, {"Swayam", "Sai", "Mishra"}};
        String result1 = Arrays.stream(str1).flatMap(Arrays::stream).sorted().collect(Collectors.toList()).toString();
        System.out.println(result1);

        List<Integer> arr = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        List<Integer> result2 = arr.stream().filter(x -> x % 2 != 0).collect(Collectors.toList());
        int oddsum = result2.stream().reduce(0, Integer::sum);
        int oddsum1 = result2.stream().mapToInt(Integer::intValue).sum();
        System.out.println(result2);
        System.out.println(oddsum);
        System.out.println(oddsum1);


        List<String> sentences = List.of("hello world", "hello java", "java streams");
        List<String> uniqueWords = sentences.stream()
                .flatMap(s -> Arrays.stream(s.split("\\s+")))
                .map(String::toLowerCase)
                .distinct()
                .collect(Collectors.toList());
        System.out.println(uniqueWords);

        IntStream ints = IntStream.of(4, 5, 6, 7);
        int sum = ints.sum();              // 22
        OptionalInt min = IntStream.of(4, 5, 6, 7, 4, 5, 2, 1, 11).min();
        OptionalInt max = IntStream.of(4, 5, 6, 7, 4, 5, 2, 1, 11).max();
        OptionalDouble avg = IntStream.of(4, 5, 6, 7).average();
        long cnt = IntStream.of(4, 5, 6, 7, 8).count();
        System.out.println("sum::" + sum);
        System.out.println("min::" + min);
        System.out.println("max::" + max);
        System.out.println("Avg::" + avg);
        System.out.println(":::" + cnt);

        LongStream longStream = LongStream.of(4L, 5L, 6L, 7L);
        LongSummaryStatistics stats = longStream.summaryStatistics();
        System.out.println(".." + stats.getCount());
        System.out.println("+++" + stats.getMax());
        System.out.println("_____" + stats.getAverage());
        System.out.println("------" + stats.getMin());

        int sum2 = arr.stream().mapToInt(Integer::intValue).sum();
        Optional<String> firstname = Arrays.stream(str).findFirst();
    }

    public static void rearrange() {
        int[] arr = {2, 3, 5, -6, -18, -9, 15, -17};
        int[] result = new int[arr.length];
        int pos = 0, neg = 1;
        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] < 0) {
                result[neg] = arr[i];
                neg = neg + 2;
            } else {
                result[pos] = arr[i];
                pos = pos + 2;
            }
        }
        System.out.println(Arrays.toString(result));
    }

    public static void removeduplicate() {
        int[] input = {1, 1, 2, 3, 4, 5, 3, 5, 4, 6, 7, 6, 7, 8, 8, 9, 10};
        Arrays.sort(input);
        System.out.println("Sorted aarray::" + Arrays.toString(input));
        int k = 0;
        for (int i = 1; i < input.length; i++) {
            if (input[i] != input[k]) {
                k++;
                int temp = input[k];
                input[k] = input[i];
                input[i] = temp;
            }
        }
        System.out.println("K values::" + k);
        for (int i = 0; i <= k; i++) {
            System.out.print(input[i] + " ");
        }
    }

    /*public static void subarray(){
        int[] arr={1,20,3,10,5};
        int sum=0,req=23;
        for(int i=0;i<arr.length;i++) {
            int j=0;
            while(sum<req){
                sum+=arr[j];
                j++;
            }
            while(sum>req){
                sum-=arr[i];
            }
        }
        int[] result=Arrays.copyOfRange(arr,j,i);
        System.out.println(Arrays.toString(result));
    }*/

// Find the next smallest number present in the given array for each number present right to it.
// If it is last or highest number in the array add -1 in the output.
    //Ex:- Input:- int[] arr = {4, 5, 2, 10, 8};
    //     Output:-{5,8,8,-1,-1}

    public static void returnele() {
        int[] arr = {4, 5, 2, 10, 8};
        int[] result = new int[arr.length];
        for (int i = 0; i <= arr.length - 1; i++) {
            int max = Integer.MAX_VALUE;
            int ans = -1;
            for (int j = i + 1; j <= arr.length - 1; j++) {
                if (arr[j] > arr[i] && arr[j] - arr[i] < max) {
                    max = arr[j] - arr[i];
                    ans = arr[j];
                }
            }
            result[i] = ans;
        }
        System.out.println(Arrays.toString(result));
    }

    public static void sortele() {
        int[] arr = {1, 0, 2, 1, 0, 2};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                while (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void sumofsubarr() {
        int[] arr = {-1, 2, 3, 7, 5};
        int tar = 12;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if (sum == tar) {
                    System.out.println(Arrays.toString(Arrays.copyOfRange(arr, i, j + 1)));
                }
            }
        }
    }

    public static void addsubarr() {
        int[] arr = {-1, 2, 3, 7, 5};
        int tar = 12, start = 0;
        int sum = 0;
        for (int end = 0; end < arr.length; end++) {
            sum += arr[end];
            while (sum > tar && start <= end) {
                sum -= arr[start++];
            }
            if (sum == tar) {
                System.out.println(Arrays.toString(Arrays.copyOfRange(arr, start, end + 1)));
            }
        }
    }

    public static void findones() {
        int[] arr = {1, 1, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0, 0};
        int sum = Arrays.stream(arr).sum();
        System.out.println("Number of 1s present::" + sum);
    }

    public static void customer() {
        List<String[]> oderdetails = List.of(
                new String[]{"User1", "Iphone"},
                new String[]{"User2", "MacBook"},
                new String[]{"User1", "Iphone"},
                new String[]{"User1", "Iphone"},
                new String[]{"User3", "IPad"},
                new String[]{"User2", "Iphone"},
                new String[]{"User2", "Airpod"}
        );
        Map<String, List<String>> orderbyuser = new HashMap<>();
        Map<String, Integer> orderitemsbycount = new HashMap<>();
        for (String[] order : oderdetails) {
            String username = order[0];
            String orderitems = order[1];
            orderbyuser.computeIfAbsent(username, k -> new ArrayList<>()).add(orderitems);
            orderitemsbycount.merge(orderitems, 1, Integer::sum);
        }
        System.out.println("orders by user::" + orderbyuser);
        System.out.println("ordered items::" + orderitemsbycount);
    }

    public static void firstrepeated() {
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 0, 20, 30, 10, 10, 40, 50, 40, 50, 60, 70, 60, 70, 880, 90, 0};
        HashMap<Integer, Integer> numbers = new LinkedHashMap<>();
        for (int num : arr) {
            numbers.put(num, numbers.getOrDefault(num, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : numbers.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println("first repeated::" + entry.getKey());
                break;
            }
        }
        for (int i = arr.length - 1; i >= 0; i--) {
            if (numbers.get(arr[i]) > 1) {
                System.out.println("last repeated::" + arr[i]);
                break;
            }
        }
    }

    public static void groiupana() {
        String[] strs = {"eat", "ate", "tea", "tan", "nat", "bat", "tab"};
        Map<String, List<String>> map = new HashMap<>();
        for (String words : strs) {
            char[] wordarr = words.toCharArray();
            Arrays.sort(wordarr);
            String sortedword = new String(wordarr);
            map.computeIfAbsent(sortedword, k -> new ArrayList<>()).add(words);
        }
        for (List<String> group : map.values()) {
            System.out.println("Group::" + group);
        }
    }

    public static void countofwords() {
        String input = "Prasad is a engineer and Shyam is from XYZ";
        Map<String, Long> map = Arrays.stream(input.split("\\s+")).collect(Collectors.groupingBy(word -> word, Collectors.counting()));
        map.forEach((word, count) ->
                System.out.println(word + " -> " + count));
    }

    public static int[] add2nums(int[] nums, int target) {
        int i, j = 0;
        for (i = 0; i < nums.length; i++) {
            for (j = i + 1; j < nums.length; j++) {
                if (target == nums[i] + nums[j] && i != j) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }

    public static void threeSum() {
        String[] input = "java selenium java cucumber selenium java".split("\\s+");
        Map<String, Integer> map = new LinkedHashMap<>();
        for (String word : input) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        System.out.println("---------------");
        map.entrySet().stream().forEach(e -> System.out.println(e.getKey() + " Repeated " + e.getValue()+" times"));
        map.entrySet().stream().filter(en->en.getValue()>1).forEach(en->System.out.println("single occurrence word is::"+en.getKey()));
        List<String> list= Arrays.stream(input).distinct().toList();
        System.out.println(list);
        System.out.println("---------------");
    }

    public static void subseq() {
        String input = "adboce";
        String target = "abs";
        int i = 0, j = 0;
        while (i < input.length() && j < target.length()) {
            if (input.charAt(i) == target.charAt(j)) {
                j++;
            }
            i++;
        }
        if (j == target.length()) {
            System.out.println("Subsequence is found");
        } else {
            System.out.println("Subsequence not found");
        }
    }

    public static void resortarr() {
        int[] input = {0, 1, 2, 0, 4, 0, 6, 0, 2, 0};
        int j = 0;
        for (int i = 0; i < input.length; i++) {
            if (input[i] != 0) {
                int temp = input[j];
                input[j] = input[i];
                input[i] = temp;
                j++;
            }
        }
        System.out.println(Arrays.toString(input));
    }

    public static void resort() {
        int[] input = {1, 0, 2, 1, 0, 2};
        //Arrays.sort(input);
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input.length; j++) {
                while (input[i] < input[j]) {
                    int temp = input[i];
                    input[i] = input[j];
                    input[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(input));
    }

    public static boolean check2power() {
        int num = 8;
        if (num > 0 && (num & (num - 1)) == 0) {
            System.out.println("2's power number");
            return true;
        } else {
            System.out.println("Not 2's power number");
            return false;
        }
    }

    public static void maxsumsubarr() {
        int[] arr = {10, 20, 30, 5, 10, 50, 55};
        int maxsum = arr[0], currentsum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1]) {
                currentsum += arr[i];
            } else {
                currentsum = arr[i];
            }
            maxsum = Math.max(maxsum, currentsum);
        }
        System.out.println("max sum of subarray::" + maxsum);
    }

    public static void sumofsub() {
        int[] arr = {10, 20, 30, 5, 10, 50, 55};
        int n = arr.length;
        int result = 0;
        for (int i = 0; i < n; i++) {
            result += (arr[i] * (i + 1) * (n - i));
        }
        System.out.println("sum of subarray::" + result);
    }

    public static void missingnum() {
        int[] arr = {1, 2, 3, 4};
        int n = arr.length + 1;
        int xorfull = IntStream.rangeClosed(1, n).reduce(0, (a, b) -> a ^ b);
        int xorarr = Arrays.stream(arr).reduce(0, (a, b) -> a ^ b);
        int result1 = xorfull ^ xorarr;
        System.out.println("Result1::" + result1);
    }

    public static void palindromecheck() {
        String input = "noon";
        boolean ispalindrome = IntStream.range(0, input.length() / 2).allMatch(i -> input.charAt(i) == input.charAt(input.length() - i - 1));
        System.out.println("Ispalindrome::" + ispalindrome);
        String rev=new StringBuilder(input).reverse().toString();
        if(input.equals(rev)){
            System.out.println("String is palindrome");
        }
        else{
            System.out.println("String is not palindrome");
        }
    }

    public static void laststone(){
        int[] arr={2,7,4,1,8,1};
        int n=arr.length;
        while (true){
            if(arr[n-2]==0){
                System.out.println("Last stone is::"+arr[n-1]);
            }
            int secondheavy=arr[n-2];
            int firstheavy=arr[n-1];
            arr[n-1]=secondheavy-firstheavy;
            arr[n-2]=0;
        }
    }

    public static void reverse(int[] arr,int start, int end){
        while(start<=end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    public static void rotatearr(){
        int[] arr={1,2,3,4,5,6,7};
        System.out.println("Given array::" + Arrays.toString(arr));
        int k=3;
        int n=arr.length;
        //k=k%n;
        reverse(arr,0,n-1);
        reverse(arr,0,k-1);
        reverse(arr,k,n-1);
        System.out.println(Arrays.toString(arr));
    }
}