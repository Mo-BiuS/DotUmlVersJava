import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class ClassWriter{

    public static String folderName = "Default";
    public static HashMap<String,ClassContainer> fileToWrite = new HashMap<String,ClassContainer>();
    public static List<String> fileToExclude = new ArrayList<>();
    public static String last;

    public static void setFolderName(String name){
        folderName = name;
    }
    public static void addFolderName(String name){
        folderName += " " + name;
    }

    public static void write(){
        try {
            Path path = Paths.get(folderName);
            Files.createDirectories(path);
        } catch (IOException e) {
            System.err.println("Failed to create directory!" + e.getMessage());
        }
        for (Map.Entry<String, ClassContainer> entry : fileToWrite.entrySet()) {
            if(!fileToExclude.contains(entry.getKey())) {
                try (BufferedWriter writer = new BufferedWriter(new FileWriter(new File(folderName + "\\" + entry.getKey() + ".java")))) {
                    writer.write(entry.getValue().toString());
                } catch (IOException e) {
                    System.err.println("Une erreur s'est produite lors de la création du fichier : " + e.getMessage());
                }
            }
        }
    }

    public static void initInterface(String ident) {
        last = ident;
        ClassContainer cw = new ClassContainer();
        cw.header = "interface "+ident;
        fileToWrite.put(ident, cw);
    }
    public static void initAbstractClass(String ident) {
        last = ident;
        ClassContainer cw = new ClassContainer();
        cw.header = "abstract class "+ident;
        fileToWrite.put(ident,cw );
    }
    public static void initClass(String ident) {
        last = ident;
        ClassContainer cw = new ClassContainer();
        cw.header = "class "+ident;
        fileToWrite.put(ident, cw);
    }
    public static void initEnum(String ident) {
        last = ident;
        ClassContainer cw = new ClassContainer();
        cw.header = "enum "+ident;
        fileToWrite.put(ident, cw);
    }

    public static void writeAtLastVar(String text) {
        fileToWrite.get(last).variables.add(text);
    }
    public static void writeAtLastFunc(String text) {
        fileToWrite.get(last).functions.add(text);
    }
    public static void writeAtVar(String c, String text) {
        fileToWrite.get(c).variables.add(text);
    }


    public static void addImplement(String ass1, String ass2) {
        if(fileToWrite.get(ass1).implement.isEmpty())
            fileToWrite.get(ass1).implement = " implements "+ass2;
        else
            fileToWrite.get(ass1).implement += ", " + ass2;
    }

    public static void setExtends(String ass1, String ass2) {
        fileToWrite.get(ass1).extend = " extends "+ass2;
    }

    public static void composition(String ass1, String ass2) {
        fileToWrite.get(ass2).compositions.add(fileToWrite.get(ass1));
        fileToExclude.add(ass1);
    }
}
