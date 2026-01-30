package Java_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LeetCode implements gbt{
    private String fname;
    private String lname;
    private int age;

    public LeetCode(String firstname, String lastname, int ages) {
        this.fname=firstname;
        this.lname=lastname;
        this.age=ages;
    }
    LeetCode(){}
    public static void main(String[] args) throws IOException {
        LeetCode l1=new LeetCode("Bibhu","Mishra",2000);
        LeetCode l2=new LeetCode("Adyasha","Verma",1000);
        LeetCode l3=new LeetCode("Swayam","Sai",500);
        Map<String,Integer> map=new HashMap<>();
        map.put(l1.fname,l1.age);
        map.put(l2.fname,l2.age);
        map.put(l3.fname,l3.age);

        /*System.out.println("-------------------");
        map.entrySet().stream().forEach(en->System.out.println(en.getKey()+" "+en.getValue()));
        System.out.println("-------------------");
        String fname=map.entrySet().stream().max(Comparator.comparingInt(Map.Entry::getValue)).get().getKey();
        System.out.println(fname);
        System.out.println("-------------------");
        String leastage=map.entrySet().stream().min(Comparator.comparingInt(Map.Entry::getValue)).get().getKey();
        System.out.println(leastage);
        System.out.println("-------------------");
        OptionalDouble avgage= map.values().stream().mapToInt(i -> i).average();
        System.out.println(avgage.getAsDouble());
        System.out.println("-------------------");*/
        Map<String,String> map1=new HashMap<>();
        map1.put(l1.lname,l1.fname);
        map1.put(l2.lname,l2.fname);
        map1.put(l3.lname,l3.fname);
        List<String>list1=new ArrayList<>();
        list1.add("Sachin");
        list1.add("Saurav");
        list1.add("Ganguly");
        list1.add("Tendulkar");
        List<String>list2= Arrays.asList("Virat", "Kohli","Rohit","Ravindra");
        Set<String>set1=new HashSet<>();
        for(String word:list2){
            set1.add(word);
        }
        /*String lname1= String.valueOf(map1.entrySet().stream().allMatch(e->e.getKey().startsWith("M")));
        System.out.println(lname1);
        System.out.println("-------------------");*/
        System.out.println("-------Predicate-Map----");
        Predicate<Map.Entry<String,String>> namestwithB=en->en.getValue().startsWith("B");
        Predicate<Map.Entry<String,String>> lnamewithM=en->en.getKey().startsWith("M");
        map1.entrySet().stream().filter(namestwithB.and(lnamewithM)).forEach(System.out::println);
        System.out.println("-------Predicate-age filterMap----");
        Predicate<Map.Entry<String,Integer>>agefilter=en->en.getValue()>1000;
        map.entrySet().stream().filter(agefilter).forEach(System.out::println);
        System.out.println("-------Predicate-list----");
        Predicate<String> names=listname->listname.startsWith("S");
        Predicate<String>namelist2=list2names->list2names.startsWith("V");
        list1.stream().filter(names).forEach(System.out::println);
        System.out.println("-------Predicate-set----");
        set1.stream().filter(names.or(namelist2)).forEach(System.out::println);
        set1.stream().filter(names.negate()).forEach(System.out::println);

        System.out.println("------Function------");
        Function<String,Integer>f1= String::length;
                //f11.substring(0,2).toLowerCase().concat(f11.substring(2,f11.length()).toUpperCase());
        list1.stream().filter(names).map(f1).forEach(System.out::println);
        Function<Integer,Boolean>lengthgreater=f11->f11>6;
        Function<String,Boolean>combined=f1.andThen(lengthgreater);
        System.out.println("function check name length"+Arrays.toString(list1.stream().map(combined).toArray()));
        Function<String, Boolean>greatlen=lengthgreater.compose(f1);
        System.out.println("function check great length name"+Arrays.toString(list1.stream().map(greatlen).toArray()));
        Function<String,Boolean> f12=f121->f121.length()>5;
        list1.stream().map(f12).forEach(System.out::println);

        List<String> words = Arrays.asList("Bibhu Mishra", "Java Streams");
        words.stream()
                .flatMap(s -> Arrays.stream(s.split(" "))) // Function<String, Stream<String>>
                .forEach(System.out::println);

        System.out.println("------Consumer------");
        Consumer<String>con1=c11->System.out.println(c11.substring(0,2).toLowerCase().concat(c11.substring(2)).toUpperCase());
        list2.forEach(con1);
        //con1.accept(list2.getFirst());
        System.out.println(list2);

        Optional<String> name = Optional.ofNullable("Sachin");

        /*int maxage=Integer.MIN_VALUE;
        String firstname=null;
        for(Map.Entry<String,Integer> entry:map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
            if(entry.getValue()>maxage) {
                maxage=entry.getValue();
                firstname=entry.getKey();
            }
        }
        System.out.println(firstname+"::"+maxage);*/
    }

    public void test(){
        System.out.println("Print from test abstract method");
    }

    public static void main123(String[] args){
        LeetCode obj=new LeetCode();
        System.out.println(obj.add(10,20));
        obj.test();
        gbt.print();
    }
}
@FunctionalInterface
    interface gbt {
    void test();

    static void print() {
        System.out.println("print from static method in Interface");
    }

    default int add(int x, int y) {
        return x + y;
    }
}