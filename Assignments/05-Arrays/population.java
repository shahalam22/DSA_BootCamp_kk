package Assignment4;

public class population {

  public static void main(String[] args) {
    int[][] logs = {{2033,2034},{2039,2047},{1998,2042},{2047,2048},{2025,2029},{2005,2044},{1990,1992},{1952,1956},{1984,2014}};
    int minyr = 1950;
    int maxyr = 2050;
    
    /*for(int i=0; i<logs.length; i++){
      if(logs[i][0]<minyr) minyr = logs[i][0];
      if(logs[i][1]>maxyr) maxyr = logs[i][1];
    }*/
    
    //System.out.println(minyr+"  "+maxyr);
    
    int max = 0;
    int flagyr = minyr;
    int count;
    for(int i=minyr; i<=maxyr; i++){
      count = 0;
      for(int j=0; j<logs.length; j++){
        if(i>=logs[j][0] && i<logs[j][1]){
          count++;
        }
      }
      if(count>max){
        max = count;
        flagyr = i;
      }
    }
    
    System.out.println(max+"   "+flagyr);
    
  }

}
