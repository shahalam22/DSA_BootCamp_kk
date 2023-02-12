package Assignment4;

import java.util.ArrayList;
import java.util.List;


public class ItemMatching {

  public static void main(String[] args) {
    
    ArrayList<ArrayList<String>> listoflist = new ArrayList<ArrayList<String>>();
    
    ArrayList<String> list1 = new ArrayList<String>();
    
    list1.add("phone");
    list1.add("blue");
    list1.add("pixel");
    
    ArrayList<String> list2 = new ArrayList<String>();
    
    list2.add("computer");
    list2.add("silver");
    list2.add("lenovo");
    
    ArrayList<String> list3 = new ArrayList<String>();
    
    list3.add("phone");
    list3.add("gold");
    list3.add("iphone");
    
    listoflist.add(list1);
    listoflist.add(list2);
    listoflist.add(list3);
    
    String ruleKey = "color";
    String ruleValue = "silver";
    
    int i=0, j=0, count=0;
    
    if(ruleKey == "type") i=0;
    else if(ruleKey == "color") i=1;
    else if(ruleKey == "name") i=2;
    
    while(j<listoflist.size()){
      if(ruleValue.equals(listoflist.get(j).get(i))) count++;
      j++;
    }
    
    System.out.println(count);
  }

}
