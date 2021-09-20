public class MyList {

   String[] myList =new String[5];
   private int itemIndex = 0;

   public void add(String somStr) {
       if (itemIndex < myList.length) {
           myList[itemIndex] = somStr;
           itemIndex++;
            }
        }
       public boolean conteyns(String srtConteyns){
            boolean result = false;
            for (String val : myList)
                if (val.equals(srtConteyns)){
                    result = true;
                }
           return result;
       }
       public int indexOf(String strIndexOf){
        for(String val:myList){
            if(val.equals(strIndexOf)){
                return 1;
            }
        }return -1;
       }


}
