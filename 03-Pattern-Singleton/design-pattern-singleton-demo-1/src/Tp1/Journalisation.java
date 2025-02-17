package Tp1;

import java.util.ArrayList;
import java.util.Collection;

public class Journalisation {
    private Collection<String>  logs = new ArrayList<String>();
    private static final Journalisation instance;

    private Journalisation (){

    }

    static {
        instance = new Journalisation();
    }

    public static Journalisation getInstance() {
        return instance;
    }
    public void ajouterLog(String log) {
        this.logs.add(log);
    }

   /* public String getLog() {
        for (String log : logs) {
            return log;

        }
        return "test";
    }*/


    public void getLog() {
        for (String log : logs) {
            System.out.println(log);

        }

    }
    }
