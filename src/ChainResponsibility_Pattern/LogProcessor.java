package ChainResponsibility_Pattern;

public class LogProcessor{

    public static int ERROR=1;
    public static int INFO=1;
    public static int DEBUG=1;

    LogProcessor nextlogprocessor;
    public LogProcessor(LogProcessor logProcessor){
        this.nextlogprocessor=logProcessor;
    }

    public void log(int loglevel,String message){
        nextlogprocessor.log(loglevel,message);
    }

}
