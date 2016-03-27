public class rec{        
    public static void main(String[] Args){
      //  myRecursiveMethod(1000);
    }
    public int myRecursiveMethod (int aVariable)  
    {  
      System.out.println(aVariable);  
      aVariable--;  
      if (aVariable == 0)  
        return 0;  
      return myRecursiveMethod(aVariable);  
    }  
}