package ChainResponsibility_Pattern;

public class ErrorLogProcessor extends LogProcessor{
    public ErrorLogProcessor(LogProcessor logprocessor)
    {
        super(logprocessor);
    }
    public void log(int loglevel,String message){
        if(loglevel==LogProcessor.ERROR){
            System.out.println(message);
        }else{
            super.log(loglevel,message);
        }
    }
}
