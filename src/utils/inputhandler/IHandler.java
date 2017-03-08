package utils.inputhandler;
import java.util.ArrayList;

public interface IHandler<T> {
    public T[] GetDataAsSingleValue();
    public ArrayList<T[]> GetDataAsSingleList();
    public ArrayList<ArrayList<T[]>> GetDataAsLists();
    public ArrayList<ArrayList<T[][]>> GetDataAsSingleMatrix();
}