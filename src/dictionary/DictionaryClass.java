/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import java.util.HashMap;

/**
 *
 * @author Rdv
 */
public class DictionaryClass {
    
    
static  HashMap<String,String> liste = new HashMap<>();

    public static int size() {
        return liste.size();
    }

    public static String get(Object o) {
        return o + " " + liste.get(o);
    }

    public static String put(String k, String v) {
        return liste.put(k, v);
    }

    public static String remove(Object o) {
        return liste.remove(o);
    }

    public static String getAl(){
    
        String str =" ";
        for (String object : liste.keySet()) {
            str += object + " " + liste.get(object) + "\n";
        }
        return str;
    }
    
}
