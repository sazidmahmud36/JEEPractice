package q5_fileRead;
import java.io.File;


public class CreateFolderFile {
    public static void main(String[] args) {
        File file = new File("/Users/macbookpro/Desktop/MyFile");
        file.mkdir();
        
        try{
            File file1 = new File("/Users/macbookpro/Desktop/MyFile/demo.txt");
            file1.createNewFile();
            if(file1.exists()){
                System.out.println("File Created!");
            }else{
                System.out.println("File not Exists");
            }
            
        }catch(Exception e){
            System.out.println(e);
        }
        
        
        
    }
}
