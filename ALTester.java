import java.util.ArrayList;

public class ALTester{
  public static void main(String[] args) {

    //Normal Array List
    ArrayList<Integer> arrTheFuchs = new ArrayList<Integer>();

    //Ordered Array List (For Binary)
    OrderedArrayList michaelKaml = new OrderedArrayList();

    //Ordered Array List (For Linear)
    OrderedArrayList srijal30 = new OrderedArrayList();


    //Add the same randomly generated numbers
    for(int i = 0; i < 23; i++){
      int randomNum = (int) (Math.random() * 100);
      arrTheFuchs.add(randomNum);
      michaelKaml.addLinear(randomNum);
      srijal30.addBinary(randomNum);
    }


    //Check if ArrayList is Sorted
    boolean isSorted = true;
    for( int i = 1; i < arrTheFuchs.size(); i++){
      isSorted = arrTheFuchs.get(i) >= arrTheFuchs.get(i-1);
      if(!isSorted) break;
    }

    System.out.println( "ArrayList:\n" + arrTheFuchs + "\nSorted = " + isSorted); 

    //Check if OrderedArrayList is Sorted
    isSorted = true;
    boolean isSorted2 = true;

    for( int i = 1; i < michaelKaml.size(); i++){
      isSorted = isSorted && michaelKaml.get(i) >= michaelKaml.get(i-1);
      isSorted2 = isSorted2 && srijal30.get(i) >= srijal30.get(i-1);
      if(!isSorted) break;
    }
    
    System.out.println( "\nOrderedArrayList (BIN):\n" + michaelKaml + "\nSorted = " + isSorted); 
    System.out.println( "\nOrderedArrayList (LIN):\n" + srijal30 + "\nSorted = " + isSorted2); 


  }

}
