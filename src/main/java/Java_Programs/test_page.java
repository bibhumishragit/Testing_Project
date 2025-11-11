package Java_Programs;

import org.apache.poi.ss.formula.atp.Switch;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.tools.ant.filters.StringInputStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.apache.poi.ss.usermodel.CellType.*;

public class test_page {
    public static void main(String[] args) throws IOException {
        String input="Bana";commonmethods("",input);}
    public static void commonmethods(String prefix,String input) throws IOException {
        input=input.toLowerCase();
        if(input.isEmpty()){
            System.out.println(prefix);
            return;
        }
        for(int i=0;i<input.length();i++){
            char c=input.charAt(i);
            String newprefix=prefix+c;
            String newinput=input.substring(0,i)+input.substring(i+1);
            commonmethods(newprefix,newinput);
        }
    }
}