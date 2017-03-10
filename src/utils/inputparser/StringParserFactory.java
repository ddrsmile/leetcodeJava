package utils.inputparser;

public class StringParserFactory extends AbstractParserFactory<String,String[]> {
    private IParser<String, String[]> stringParser;

    public IParser<String, String[]> create() {
        stringParser = new StringParser();
        return stringParser;
    }
    public IParser<String, String[]> create(String inputPath) {
        stringParser = new StringParser(inputPath);
        return stringParser;
    }
}