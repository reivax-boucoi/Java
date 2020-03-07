/*
    To compile and execute, run : 
    javac Exercice6.java && java Exercice6
    To save output :
    rm Exercice6.out && javac Exercice6.java && java Exercice6 >> Exercice6.out && cat Exercice6.out 
*/
import java.io.*;
import com.itextpdf.text.*;


class Exercice6{
    public static void main(String[] argv) throws IOException {
    
    //TestIO
    
        try{
            FileWriter myFile = new FileWriter("a_ecrire1.txt");
            
            myFile.write("Premiere ligne");
            
            myFile.close();
        }catch (IOException e){
            e.printStackTrace();
        }
        
    //TestIO2
    
        System.out.print("Veuillez saisir votre nom : ");
        String InputLine=" ";
        
        try{
        
            BufferedReader is=new BufferedReader(new InputStreamReader(System.in));
            InputLine=is.readLine();
            is.close();
            
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        if(InputLine!=null)System.out.println("Votre nom est " + InputLine);
        
    //TestIO3
        
        FileReader in;
        FileWriter out;
        try{
        
            in=new FileReader("a_ecrire1.txt");
            out=new FileWriter("a_ecrire2.txt");
            int c;
            while((c=in.read())!=-1)out.write(c);
            in.close();
            out.close();
        
        }catch (IOException e){
            e.printStackTrace();
        }
        
    //Exercice62
    
        Document document = new Document();
        document.addAuthor("moi");
        document.addCreationDate();
        document.addTitle("premier document");
        
        
    }
}
