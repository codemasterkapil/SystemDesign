package Composite_Design_Pattern.FileSystem;


public class Main {

    public static void main(String[] args) {
        Directory directory=new Directory("desktop");
        File file1 =new File("kapil image");
        File file2=new File("takseel image");
        File file3=new File("vansh image");
        File file4=new File("sishtum");
        Directory images=new Directory("Images");
        images.add(file1);
        images.add(file2);
        images.add(file3);
        directory.add(images);
        directory.add(file4);
        directory.ls();
    }



}
