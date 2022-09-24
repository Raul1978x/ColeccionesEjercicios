package ejemploarraylist;

import java.util.ArrayList;

public class Prueba {

    public static void main(String[] args) {

        String[] nombresArray = new String[5];
        for (int i = 0; i < nombresArray.length; i++) {
            nombresArray[i] = "Chiquito" + (i + 1);
        }
        for (String var : nombresArray) {
            System.out.println(var);
        }
//        Collections
        ArrayList<String> nombresArrayList = new ArrayList();
        nombresArrayList.add("Chiquito");
        nombresArrayList.add("Chiquito");
        nombresArrayList.add("Chiquito");

        System.out.println(nombresArrayList);
        System.out.println(nombresArrayList.size());

        nombresArrayList.remove("Chiquito");

        System.out.println(nombresArrayList);
        System.out.println(nombresArrayList.size());

    }

}
