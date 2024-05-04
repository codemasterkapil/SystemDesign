package Proxy_pattern;

public class RealImage implements Image{

    private String filename;
    public RealImage(String file)
    {
       this.filename=file;
       loadFile(file);
    }
    private void loadFile(String file)
    {
        System.out.println("loading the file : "+file+" ...");
    }
    public void display(){
        System.out.println("displaying image: "+filename);
    }
}
