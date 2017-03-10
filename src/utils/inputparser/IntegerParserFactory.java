package utils.inputparser;

public class IntegerParserFactory extends AbstractParserFactory<Integer,int[]> {
    private IParser<Integer, int[]> integerParser;

    public IParser<Integer, int[]> create() {
        integerParser = new IntegerParser();
        return integerParser;
    }
    public IParser<Integer, int[]> create(String inputPath) {
        integerParser = new IntegerParser(inputPath);
        return integerParser;
    }
}