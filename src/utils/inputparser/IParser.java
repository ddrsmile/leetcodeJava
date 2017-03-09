package utils.inputparser;
import java.util.ArrayList;

public interface IParser<E> {
    public ArrayList<E> parseDataAsNumber();
    public ArrayList<E[]> parseDataAsList();
    public ArrayList<ArrayList<E[]>> parseDataAsLists();
    //public ArrayList<ArrayList<E[][]>> parseDataAsMatrix();
}