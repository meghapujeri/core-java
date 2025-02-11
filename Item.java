public class Item{

   public static void main (String args[]) {
    String itemNames[]={"Pen","Bottel","Book","Fan"};
	System.out.println("List of Item 1:"+itemNames[0]);
	for(int index=0;index<itemNames.length;index++) {
		 System.out.println(itemNames[index]);
}
 //reverse array element
 System.out.println("reverse array element");
 for (int index= itemNames.length-1;index>=0; index--) {
	 System.out.println("element is:"+itemNames[index]);
 }
   }
}
   