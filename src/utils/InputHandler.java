package utils;
import java.util.ArrayList;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import utils.InputCheck;

public class InputHandler {
  String inputPath;
  ArrayList<Integer> inn;
  ArrayList<int[]> innL;
  ArrayList<ArrayList<int[]>> innLs;
  ArrayList<String> ins;
  ArrayList<String[]> insL;
  BufferedReader br;
  
  // check whether input string is numeric or not
  InputCheck IC;

  public InputHandler(String inputPath) {
    this.inputPath = inputPath;
    inn = null;
    ins = null;
    IC = new InputCheck();
  }

  private int getNum(String str) {
    str = str.replaceAll("[^0-9]","");
    if (IC.isNum(str)) {
      return Integer.parseInt(str);
    } else {
      System.out.println("The input was not Integer, Please check the input file!!!");
      return 0;
    }
  }

  private int[] getNumList(String str) {
    str = str.trim();
    str = IC.isNum(str)?str:str.substring(1, str.length()-1).replace(" ", "");
    if (str.length() == 0) return new int[0];
    String[] nums = str.split(",");
    int[] out = new int[nums.length];
    for (int i = 0; i < nums.length; i++) {
      out[i] = Integer.parseInt(nums[i]);
    }
    return out;
  }
  
  private ArrayList<int[]> getListOfNumList(String str) {
    str = str.trim();
    str = str.length() == 1?str:str.substring(1, str.length()-1).replace(" ", "");
    if (str.length() == 0) return new ArrayList<int[]>();
    String[] numLists = str.split("],");
    
    for (int i = 0; i < numLists.length - 1; i++) {
      numLists[i] = numLists[i] + "]";
    }

    ArrayList<int[]> innL = new ArrayList<int[]>();
    for (int i = 0; i < numLists.length; i++) {
      innL.add(getNumList(numLists[i]));
    }
    return innL;
  }

  private String getStr(String str) {
    str = str.replace("\"","");
    return str;
  }
  
  private String[] getStrList(String str) {
    str = str.trim();
    str = str.substring(1, str.length() - 1);
    String[] strs = str.split(",");
    String[] out = new String[strs.length];
    for (int i = 0; i < strs.length; i++) {
      out[i] = strs[i].trim().replace("\"", "");
    }
    return out;
  }
  
  public ArrayList<Integer> getDataAsNum() throws IOException {
    if (inputPath == null || inputPath.length() == 0) return inn;
    inn = new ArrayList<Integer>();
    br = new BufferedReader(new FileReader(inputPath));
    String in = null;
    while ((in = br.readLine()) != null) {
      inn.add(getNum(in));
    }
    return inn;
  }

  public ArrayList<int[]> getDataAsNumList() throws IOException {
    if (inputPath == null || inputPath.length() == 0) return innL;
    innL = new ArrayList<int[]>();
    br = new BufferedReader(new FileReader(inputPath));
    String in = null;
    while ((in = br.readLine()) != null) {
      innL.add(getNumList(in));
    }
    return innL;
  }

  public ArrayList<ArrayList<int[]>> getDataAsListNumList() throws IOException {
    if (inputPath == null || inputPath.length() == 0) return innLs;
    innLs = new ArrayList<ArrayList<int[]>>();
    br = new BufferedReader(new FileReader(inputPath));
    String in = null;
    while ((in = br.readLine()) != null) {
      innLs.add(getListOfNumList(in));
    }
    return innLs;
  }

  public ArrayList<String> getDataAsStr() throws IOException {
    if (inputPath == null || inputPath.length() == 0) return ins;
    ins = new ArrayList<String>();
    br = new BufferedReader(new FileReader(inputPath));
    String in = null;
    while ((in = br.readLine()) != null) {
      ins.add(getStr(in));
    }
    return ins;
  }

  public ArrayList<String[]> getDataAsStrList() throws IOException {
    if (inputPath == null || inputPath.length() == 0) return insL;
    insL = new ArrayList<String[]>();
    br = new BufferedReader(new FileReader(inputPath));
    String in = null;
    while ((in = br.readLine()) != null) {
      insL.add(getStrList(in));
    }
    return insL;
  }
}
