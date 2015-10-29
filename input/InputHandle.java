import java.util.*;
import java.io.*;
public class InputHandle {
  public static void main(String[] args) throws IOException {
    if (args.length == 0) return;
    ArrayList<String> ins = new ArrayList<String>();
    BufferedReader br = new BufferedReader(new FileReader(args[0]));
    String in = null;
    while ((in = br.readLine()) != null) {
      ins.add(in);
    }
    for (String s:ins) {
      System.out.println(s);
    }
  }
}
