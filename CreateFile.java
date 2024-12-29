import java.io.*;
class CreateFile{
    public static void main(String[] args){
        File f=new File("C:\\Users\\Latitude 5410\\JAVA\\LC.txt");
        try{
            if(f.createNewFile()){
                System.out.println("File is successfully created");
                FileOutputStream fos=new FileOutputStream(f);
                String str="Hello this is my first Program to create a file and write into the file";
                fos.write(str.getBytes());
                fos.close();
                System.out.println("Content is suscess fully writen....");

            }
            else{
                System.out.println("File is already exist");
            }
        }
        catch(IOException e){
            System.out.println("file not created"+e.getMessage());
        }
        
    }
}