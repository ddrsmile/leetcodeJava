package utils.inputparser;

public class DoubleParserFactory extends AbstractParserFactory<Double,double[]> {
    private IParser<Double, double[]> doubleParser;

    public IParser<Double, double[]> create() {
        doubleParser = new DoubleParser();
        return doubleParser;
    }
    public IParser<Double, double[]> create(String inputPath) {
        doubleParser = new DoubleParser(inputPath);
        return doubleParser;
    }
}