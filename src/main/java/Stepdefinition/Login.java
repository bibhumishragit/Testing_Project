package Stepdefinition;

import io.cucumber.java.en.Then;
import io.cucumber.datatable.DataTable;
import org.openqa.selenium.By;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Login {
    public static String username;
    public static String password;

    public static List<String> Username(DataTable table){
        List<String>usernamelist=new ArrayList<>();
        List<Map<String, String>> credentials = table.asMaps(String.class, String.class);
        for (Map<String, String> credential : credentials) {
            username = credential.get("Username");
            //System.out.println("Entered username::" + username);
            //password = credential.get("Password");
            //System.out.println("Entered password::" + password);
            usernamelist.add(username);
        }
        return usernamelist;
    }

    public static List<String> password(DataTable table){
        List<String>passwordlist=new ArrayList<>();
        List<Map<String, String>> credentials = table.asMaps(String.class, String.class);
        for (Map<String, String> credential : credentials) {
            password = credential.get("Password");
            //System.out.println("Entered password::" + password);
            passwordlist.add(password);
        }
        return passwordlist;
    }

    @Then("user enters correct username and password")
    public void user_enters_correct_username(DataTable table) {
        /*List<Map<String, String>> credentials = table.asMaps(String.class, String.class);
        for (Map<String, String> credential : credentials) {
            username = credential.get("Username");
            password = credential.get("Password");
            System.out.println("Entered username::" + username);
            System.out.println("Entered password::" + password);
        }*/
        System.out.println("Username Data:::"+Username(table));
        System.out.println("Password Data:::"+password(table));
    }

    @Then ("User clicks on submit and verifies home page {string} displayed")
    public static void  user_clicks_on_submit (String test) {
        System.out.println("The data passed from feature file::"+test);
    }

    @Then("user clicks on home icons {string} {string} {string}")
    public static void clickicons(String set1, String set2, String set3) {
        System.out.println("Icon1 Name::"+set1);
        System.out.println("Icon2 Name::"+set2);
        System.out.println("Icon3 Name::"+set3);
    }

    @Then("User clicks something")
    public static void user_clicks_something(DataTable dataset1) {
        List<Map<String,String>>datalist=dataset1.asMaps(String.class,String.class);
        for(Map<String,String>datas:datalist){
            String set1=datas.get("Dataset1");
            String set2=datas.get("Dataset2");
            System.out.println("Dataset1::"+set1);
            System.out.println("Dataset2::"+set2);
        }
    }

    @Then("User clicks to use vertical DT")
    public static void verticalmultirow(DataTable tab){
        List<Map<String,String>>listdata=tab.asMaps(String.class,String.class);
        listdata.forEach(verticallist->{
            String hostdata=verticallist.get("host");
            String portdata=verticallist.get("port");
            String dbdata=verticallist.get("db_name");
            System.out.println("Host::"+hostdata+"::"+portdata+"::"+dbdata);
        });
    }
}