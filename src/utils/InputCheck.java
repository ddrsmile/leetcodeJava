package utils;

public class InputCheck{
  
  public InputCheck() {}
  
  public boolean isNum(String s) {
    return s.matches("-?\\d+(\\.\\d+)?");
  }

  public boolean isNumList(String s) {
    s = s.trim();
    if (s.charAt(0) != '[' || s.charAt(s.length() - 1) != ']') return false;
    s = s.replace("[", "").replace("]", "");
    s = s.trim();
    if (s.length() == 0) return true;
    String[] ss = s.split(",");
    for (String str:ss) {
      if (!isNum(str.trim())) return false;
    }
    return true;
  }
}
