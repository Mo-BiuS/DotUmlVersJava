import java.util.ArrayList;
import java.util.List;

public class ClassContainer {
    public String header="";
    public String extend="";
    public String implement="";
    public List<String> variables = new ArrayList<>();
    public List<ClassContainer> compositions = new ArrayList<>();
    public List<String> functions = new ArrayList<>();;
    public boolean isInterface = false;

    @Override
    public String toString() {
        String rep = "\n"+header;
        if(!extend.isEmpty())rep+=extend;

        rep+="{\n";

        for (String var : variables)
            rep+="\t"+var+";\n";

        for (ClassContainer var : compositions)
            rep += var.toString().replaceAll("\n", "\n\t") + "\n";

        if(!functions.isEmpty())rep+="\n";

        for (String func : functions)
            rep+="\t"+func;
            if(!isInterface)rep+="{\n\t\t//TODO\n\t}\n";
            else rep+=";\n";
        rep+="}";

        return rep;
    }
}
