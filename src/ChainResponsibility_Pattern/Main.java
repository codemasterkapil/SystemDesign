package ChainResponsibility_Pattern;

public class Main {

    public static void main(String[] args) {

        LogProcessor logprocessor=new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));
        logprocessor.log(LogProcessor.ERROR,"error is shooted");
        logprocessor.log(LogProcessor.INFO,"info is shooted");
        logprocessor.log(LogProcessor.DEBUG,"debug is shooted");

    }

}