package utils;
import java.util.ArrayList;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;

public class InputHandler {
  String inputPath;
  ArrayList<Integer> inn;
  ArrayList<int[]> innL;
  ArrayList<String> ins;
  ArrayList<String[]> insL;
  BufferedReader br;

  public InputHandler(String inputPath) {
    this.inputPath = inputPath;
    inn = null;
    ins = null;
  }

  private int getNum(String str) {
    str = str.replaceAll("[^0-9]","");
    try {
      return Integer.parseInt(str);
    } catch (Exception ex) {
      System.out.println("The input was not Integer, Please check the input file!!!");
      return 0;
    }
  }

  private int[] getNumList(String str) {
    str = str.replace(" ", "").replace("[","").replace("]","");
    if (str.length() == 0) return new int[0];
    String[] nums = str.split(",");
    int[] out = new int[nums.length];
    for (int i = 0; i < nums.length; i++) {
      out[i] = Integer.parseInt(nums[i]);
    }
    return out;
  }

  private String getStr(String str) {
    str = str.replace("\"","").replace("[","").replace("]","");
    return str;
  }
  
  private String[] getStrList(String str) {
    str = str.replace("[","").replace("]","");
    String[] strs = str.split(",");
    String[] out = new String[strs.length];
    for (int i = 0; i < strs.length; i++) {
      out[i] = strs[i].trim();
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
