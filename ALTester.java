import java.util.ArrayList;
import java.util.Arrays;

public class ALTester{

  public static void main(String[] args) {

    ArrayList<Integer> arrTheFuchs = new ArrayList<Integer>();

    arrTheFuchs.add(1);
    arrTheFuchs.add(2);
    arrTheFuchs.add(3);
    arrTheFuchs.add(4);
    arrTheFuchs.add(5);
    arrTheFuchs.add(6);
    arrTheFuchs.add(7);
    arrTheFuchs.add(8);
    arrTheFuchs.add(9);
    arrTheFuchs.add(10);
    arrTheFuchs.add(11);
    arrTheFuchs.add(12);
    arrTheFuchs.add(13);
    arrTheFuchs.add(14);
    arrTheFuchs.add(15);
    arrTheFuchs.add(16);
    arrTheFuchs.add(17);
    arrTheFuchs.add(18);
    arrTheFuchs.add(19);
    arrTheFuchs.add(20);
    arrTheFuchs.add(21);
    arrTheFuchs.add(22);
    arrTheFuchs.add(23);

    System.out.println( arrTheFuchs );
    System.out.println(isSorted(arrTheFuchs));


  }

  public static boolean isSorted(ArrayList<Integer> toBeSorted){
    for (int i=1;i<toBeSorted.size();i++){
      if(toBeSorted.get(i)<toBeSorted.get(i-1)) {
        return false;
      }
    }
    return true;
  }



}
