package utils.inputparser;
import java.util.ArrayList;
import java.io.BufferedReader;

public abstract class AbstractParser<E> implements IParser<E> {
    // variables
    protected String inputPath;
    protected BufferedReader br;
    
    // constructor
    protected AbstractParser() {}
    protected AbstractParser(String inputPath) {this.inputPath = inputPath;}

    // protected methods
    abstract protected E[] toList(String str);
    abstract protected ArrayList<E[]> toLists(String str);

    // public methods
    public void setInputPath(String inputPath) {this.inputPath = inputPath;}
}