package utils.inputparser;
import java.util.ArrayList;

public interface IParser<S, T> {
    public ArrayList<S> parseDataAsNumber();
    public ArrayList<T> parseDataAsList();
    public ArrayList<ArrayList<T>> parseDataAsLists();
    //public ArrayList<ArrayList<E[][]>> parseDataAsMatrix();
}