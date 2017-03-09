package utils.inputparser;
import java.util.ArrayList;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;

class IntegerParser extends AbstractParser<Integer> implements IParser<Integer> {
    public IntegerParser() {
        super();
    }
    public IntegerParser(String inputPath) {
        super(inputPath);
    }

    // protected methods
    @Override
    protected Integer[] toList(String str) {
        Integer[] output;
        if (str.charAt(0) != '[' && str.charAt(str.length() - 1) != ']') {
            output = new Integer[]{Integer.getInteger(str)};
        }
        str = str.substring(1, str.length() - 1);
        if (str.length() == 0) return new Integer[0];
        String[] input_contents = str.split(",");
        output = new Integer[input_contents.length];
        for (int i = 0; i < input_contents.length; i++) {
            output[i] = Integer.getInteger(input_contents[i]);
        }
        return output;
    }

    @Override
    protected ArrayList<Integer[]> toLists(String str) {
        ArrayList<Integer[]> output = new ArrayList<Integer[]>();
        if (str.charAt(0) != '[' && str.charAt(str.length() - 1) != ']') {
            Integer[] tmp = {Integer.getInteger(str)};
            output.add(tmp);
            return output;
        }
        str = str.substring(1, str.length() - 1);
        if (str.length() == 0) return output;
        str = str.replace("],[", "], [");
        String[] input_contents = str.split(", ");
        for (int i = 0; i < input_contents.length; i++) {
            output.add(toList(input_contents[i]));
        }
        return output;
    }
  
    @Override
    public ArrayList<Integer> parseDataAsNumber() {
        ArrayList<Integer> output = new ArrayList<Integer>();
        if (inputPath == null || inputPath.length() == 0) {
            return output;
        }
        try {
            br = new BufferedReader(new FileReader(inputPath));
            String input_contents = null;
            while ((input_contents = br.readLine()) != null) {
                output.add(Integer.parseInt(input_contents));
            }
        } catch (IOException ex) {
            System.out.print(ex);
        }
        return output;
    }

    @Override
    public ArrayList<Integer[]> parseDataAsList() {
        ArrayList<Integer[]> output = new ArrayList<Integer[]>();
        if (inputPath == null || inputPath.length() == 0) {
            return output;
        }
        try {
            br = new BufferedReader(new FileReader(inputPath));
            String input_contents = null;
            while((input_contents = br.readLine()) != null) {
                output.add(toList(input_contents));
            }
        } catch (IOException ex) {
            System.out.print(ex);
        }
        return output;
    }

    @Override
    public ArrayList<ArrayList<Integer[]>> parseDataAsLists() {
        ArrayList<ArrayList<Integer[]>> output = new ArrayList<ArrayList<Integer[]>>();
        if (inputPath == null || inputPath.length() == 0) {
            return output;
        }
        try {
            br = new BufferedReader(new FileReader(inputPath));
            String input_contents = null;
            while((input_contents = br.readLine()) != null) {
                output.add(toLists(input_contents));
            }
        } catch (IOException ex) {
            System.out.print(ex);
        }
        return output;
    }
}