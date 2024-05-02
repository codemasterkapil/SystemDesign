package ChainResponsibility_Pattern;

public class InfoLogProcessor extends LogProcessor{

    public InfoLogProcessor(LogProcessor logprocessor)
    {
       super(logprocessor);
    }
    public void log(int loglevel,String message){
        if(loglevel==LogProcessor.INFO){
            System.out.println(message);
        }else{
            super.log(loglevel,message);
        }
    }

}
