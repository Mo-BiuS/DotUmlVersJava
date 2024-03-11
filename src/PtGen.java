import java.util.Locale;

import static java.lang.Math.max;

public class PtGen {
    private static final int
            PRIVATE=1, PUBLIC=2, PROTECTED=3,
            ASSOCIATION=0, IMPLEMENT=1,EXTENDS=2,COMPOSITION=3,AGREGATION=4;


    public static int valEnt;
    public static String ident;
    public static String classWrite;
    public static String varFuncType;
    public static String varFuncName;
    public static String varFuncVisibility;
    public static String funcArgs;
    public static String funcArgName;

    public static int associationType;
    public static String ass1, ass2, associationClass;
    public static int assArrayValue1,assArrayValue2;
    public static boolean ignore1, ignore2;

    public static void pt(int numGen) {
    	switch (numGen) {
            //====[INITIALISATION]====
            case 0:
                associationType = ASSOCIATION;
                varFuncType = "void";
                varFuncVisibility = "public";
                funcArgs = "";
                associationClass = "";
                assArrayValue1 = -1;
                assArrayValue2 = -1;
                ignore1 = false;
                ignore2 = false;
                break;
            //====[NOM]====
            case 1:
                ClassWriter.setFolderName(ident);
                break;
            case 2:
                ClassWriter.addFolderName(ident);
                break;
            //====[ClassInit]====
            case 10:
                classWrite = ident;
                ClassWriter.initInterface(ident);
                break;
            case 11:
                ClassWriter.initAbstractClass(ident);
                classWrite = ident;
                break;
            case 12:
                ClassWriter.initClass(ident);
                classWrite = ident;
                break;
            case 13:
                ClassWriter.initEnum(ident);
                classWrite = ident;
                break;
            case 14:
                classWrite = null;
                break;
            //====[enum var]====
            case 15:
                ClassWriter.writeAtLastVar(ident);
                break;
            //====[variable/function]====
            case 20:
                varFuncVisibility = "private";
                break;
            case 21:
                varFuncVisibility = "public";
                break;
            case 22:
                varFuncVisibility = "protected";
                break;
            case 23:
                varFuncType = ident;
                break;
            case 24:
                varFuncName = ident;
                break;
            case 25:
                funcArgName = ident;
                break;
            case 26:
                funcArgs+="("+ident+" "+funcArgName;
                break;
            case 27:
                funcArgs+=","+ident+" "+funcArgName;
                break;
            case 30:
                String rep = "";
                if(!(funcArgs == null) && !funcArgs.isEmpty())funcArgs+=")";

                rep += varFuncVisibility + " " + varFuncType + " " + varFuncName + funcArgs;

                if(!(funcArgs == null) && !funcArgs.isEmpty())
                    ClassWriter.writeAtLastFunc(rep);
                else ClassWriter.writeAtLastVar(rep);

                varFuncType = "void";
                varFuncVisibility = "public";
                funcArgs = "";
            //====[Associations]====
            case 40:
                associationType = IMPLEMENT;
                break;
            case 41:
                associationType = COMPOSITION;
                break;
            case 42:
                associationType = EXTENDS;
                //(extends)
                break;
            case 43:
                associationType = AGREGATION;
                break;
            case 44: ass1 = ident;break;
            case 45: ass2 = ident;break;
            case 46: ignore1 = true; break;
            case 47: ignore2 = true; break;
            case 50: assArrayValue1 = -1;break;
            case 51: assArrayValue1 = valEnt;break;
            case 52: assArrayValue2 = -1;break;
            case 53: assArrayValue2 = valEnt;break;
            case 54: associationClass = ident;break;
            case 60:
                switch (associationType){
                    case ASSOCIATION:
                        associe();
                        break;
                    case IMPLEMENT:
                        ClassWriter.addImplement(ass1,ass2);
                        break;
                    case EXTENDS:
                        ClassWriter.setExtends(ass1,ass2);
                        break;
                    case COMPOSITION:
                        ClassWriter.composition(ass1,ass2);
                        associe();
                        break;
                    case AGREGATION:
                        System.out.println("Agrégation non supportée");
                        break;
                }
                associationType = ASSOCIATION;
                assArrayValue1 = -1;
                assArrayValue2 = -1;
                associationClass = "";
                ignore1 = false;
                ignore2 = false;
                break;
            //====[END]====
            case 1000:
                System.out.println("Writing...");
                ClassWriter.write();
                break;
            //====[DEFAULT]====
    	    default :
                System.out.println("Point de generation non prevu dans votre liste : "+numGen);
                break;
    	}
    }
    public static void associe(){
        if(associationClass.isEmpty()) {
            if (!ignore1) {
                if (assArrayValue2 == -1)
                    ClassWriter.writeAtVar(ass1, "public List<" + ass2 + "> " + Character.toLowerCase(ass2.charAt(0)) + ass2.substring(1));
                else if (assArrayValue2 == 1)
                    ClassWriter.writeAtVar(ass1, "public " + ass2 + " " + Character.toLowerCase(ass2.charAt(0)) + ass2.substring(1));
                else if (assArrayValue2 > 1)
                    ClassWriter.writeAtVar(ass1, "public " + ass2 + "[] " + Character.toLowerCase(ass2.charAt(0)) + ass2.substring(1) + " = new " + ass2 + "[" + assArrayValue2 + "]");
            }
            if (!ignore2) {
                if (assArrayValue1 == -1)
                    ClassWriter.writeAtVar(ass2, "public List<" + ass1 + "> " + Character.toLowerCase(ass1.charAt(0)) + ass1.substring(1));
                else if (assArrayValue1 == 1)
                    ClassWriter.writeAtVar(ass2, "public " + ass1 + " " + Character.toLowerCase(ass1.charAt(0)) + ass1.substring(1));
                else if (assArrayValue1 > 1)
                    ClassWriter.writeAtVar(ass2, "public " + ass1 + "[] " + Character.toLowerCase(ass1.charAt(0)) + ass1.substring(1) + " = new " + ass1 + "[" + assArrayValue1 + "]");
            }
        }else{
            if (!ignore1) {
                if (assArrayValue2 == -1)
                    ClassWriter.writeAtVar(ass1, "public List<" + associationClass + "> " + Character.toLowerCase(associationClass.charAt(0)) + associationClass.substring(1));
                else if (assArrayValue2 == 1)
                    ClassWriter.writeAtVar(ass1, "public " + associationClass + " " + Character.toLowerCase(associationClass.charAt(0)) + associationClass.substring(1));
                else if (assArrayValue2 > 1)
                    ClassWriter.writeAtVar(ass1, "public " + associationClass + "[] " + Character.toLowerCase(associationClass.charAt(0)) + associationClass.substring(1) + " = new " + associationClass + "[" + assArrayValue2 + "]");
            }
            if (!ignore2) {
                if (assArrayValue1 == -1)
                    ClassWriter.writeAtVar(ass2, "public List<" + associationClass + "> " + Character.toLowerCase(associationClass.charAt(0)) + associationClass.substring(1));
                else if (assArrayValue1 == 1)
                    ClassWriter.writeAtVar(ass2, "public " + associationClass + " " + Character.toLowerCase(associationClass.charAt(0)) + associationClass.substring(1));
                else if (assArrayValue1 > 1)
                    ClassWriter.writeAtVar(ass2, "public " + associationClass + "[] " + Character.toLowerCase(associationClass.charAt(0)) + associationClass.substring(1) + " = new " + associationClass + "[" + assArrayValue1 + "]");
            }
            ClassWriter.writeAtVar(associationClass, "public " + ass1 + " " + Character.toLowerCase(ass1.charAt(0)) + ass1.substring(1));
            ClassWriter.writeAtVar(associationClass, "public " + ass2 + " " + Character.toLowerCase(ass2.charAt(0)) + ass2.substring(1));
        }
    }
}
 