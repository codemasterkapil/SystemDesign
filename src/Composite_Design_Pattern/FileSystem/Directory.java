package Composite_Design_Pattern.FileSystem;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem{
    List<FileSystem> fileSystemName;
    String directoryName;
    public Directory(String directoryName){
        this.directoryName=directoryName;
        fileSystemName=new ArrayList<>();
    }
    public void add(FileSystem file){
        fileSystemName.add(file);
    }
    @Override
    public void ls() {
        System.out.println("DirectoryName is ::" + directoryName);
        for(FileSystem file:fileSystemName){
            file.ls();
        }
    }
}
