package utils;
import java.util.ArrayList;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;

public class InputHandler {
  String inputPath;
  ArrayList<int[]> inn;
  ArrayList<String> ins;
  BufferedReader br;

  public InputHandler(String inputPath) {
    this.inputPath = inputPath;
    inn = null;
    ins = null;
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

  private String getString(String str) {
    str = str.replace("\"","").replace("[","").replace("]","");
    return str;
  }

  public ArrayList<int[]> getDataAsNum() throws IOException {
    if (inputPath == null || inputPath.length() == 0) return inn;
    inn = new ArrayList<int[]>();
    br = new BufferedReader(new FileReader(inputPath));
    String in = null;
    while ((in = br.readLine()) != null) {
      inn.add(getNumList(in));
    }
    return inn;
  }

  public ArrayList<String> getDataAsString() throws IOException {
    if (inputPath == null || inputPath.length() == 0) return ins;
    ins = new ArrayList<String>();
    br = new BufferedReader(new FileReader(inputPath));
    String in = null;
    while ((in = br.readLine()) != null) {
      ins.add(getString(in));
    }
    return ins;
  }
}
