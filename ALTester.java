import java.util.ArrayList;

public class ALTester{
  public static void main(String[] args) {

    //Normal Array List
    ArrayList<Integer> arrTheFuchs = new ArrayList<Integer>();

    //Ordered Array List
    OrderedArrayList michaelKaml = new OrderedArrayList();

    //Add the same randomly generated numbers
    for(int i = 0; i < 23; i++){
      int randomNum = (int) (Math.random() * 100);
      arrTheFuchs.add(randomNum);
      michaelKaml.addLinear(randomNum);
    }


    //Check if ArrayList is Sorted
    boolean isSorted = false;
    for( int i = 1; i < arrTheFuchs.size(); i++){
      isSorted = arrTheFuchs.get(i) >= arrTheFuchs.get(i-1);
      if(!isSorted) break;
    }

    System.out.println( "ArrayList:\n" + arrTheFuchs + "\nSorted = " + isSorted); 

    //Check if OrderedArrayList is Sorted
    isSorted = false;
    for( int i = 1; i < michaelKaml.size(); i++){
      isSorted = michaelKaml.get(i) >= michaelKaml.get(i-1);
      if(!isSorted) break;
    }

    System.out.println( "\nOrderedArrayList:\n" + michaelKaml + "\nSorted = " + isSorted); 


  }

}
