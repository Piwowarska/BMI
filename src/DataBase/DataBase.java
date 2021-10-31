package DataBase;

import model.Bmi;

import java.util.*;

public class DataBase {
    private ArrayList<Integer> listKey = new ArrayList<>();
    private ArrayList<Bmi> listSaveBmi=new ArrayList<>();

    private Map<ArrayList,ArrayList> bmii = new HashMap<>();


    public DataBase() {
        this.bmii.put(listKey,listSaveBmi);
    }
     public void showMap(int idd) {
        System.out.println(this.listSaveBmi.get(idd));
     }

    public  Bmi addBmi(double height, double weight,int id, double bmi) {
        Bmi wskaznik=new Bmi(height,weight,id,bmi);
        this.listSaveBmi.add(wskaznik);
        return wskaznik;
    }

    public boolean contaisKey (int idd)  {
      return listKey.contains(idd);
    }

    public double calculateBmi(double weight, double height) {
        return weight / (height * height);

    }

    public void showQuantityKey(){
        System.out.println(listKey);
    }

    public int showSizeBmi(){
       return this.listSaveBmi.size();
    }
    public void addKeyListKey(int gg){
        this.listKey.add(gg);
    }
}

