package ChainResponsibility_Pattern;

public class DebugLogProcessor extends LogProcessor{
    public DebugLogProcessor(LogProcessor logprocessor)
    {
        super(logprocessor);
    }
    public void log(int loglevel,String message){
        if(loglevel==LogProcessor.DEBUG){
            System.out.println(message);
        }else{
            super.log(loglevel,message);
        }
    }
}
