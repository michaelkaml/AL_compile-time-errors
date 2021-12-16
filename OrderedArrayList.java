// CTE = Salaj Rijal, Michael Kamela, Ariel Fuchs
// APCS pd 7
// Lab02
// 2021-12-13

/**********************************************
 * class OrderedArrayList
 * wrapper class for ArrayList
 * maintains invariant that elements are ordered (ascending)
 * (SKELETON)
 **********************************************/

import java.util.ArrayList;

public class OrderedArrayList
{

  // instance of class ArrayList, holding objects of type Integer
  // (i.e., objects of a class that implements interface Integer)
  private ArrayList<Integer> _data;

  // default constructor
  // initializes instance variables
  public OrderedArrayList()
  {
  	_data = new ArrayList<Integer>();
  }

  // smaller methods
  public String toString()
  {
    return _data.toString();
  }

  public Integer remove( int i )
  {
    Integer value = _data.get(i);
    _data.remove(i);
    return value;
  }

  public int size()
  {
    return _data.size();
  }

  public Integer get( int i )
  {
    return _data.get(i);
  }

  // big boi methods

  // inserts newVal at the appropriate index
  // maintains ascending order of elements
  // uses a linear search to find appropriate index
  public void addLinear(Integer newVal)
  {
    //check if there are any elements in data
    if(size() == 0){
    	_data.add(newVal);
      return;
    }
    //loop through data until current val (val at index i) is greater than or equal to newVal
    for(int i = 0; i < size(); i++){
      if(get(i)>= newVal){
    	  _data.add(i,newVal);
    	  return;
    	}
    }
    //add to the end of the array if no spot found in the middle of the array
    _data.add(newVal);
  }

  // inserts newVal at the appropriate index
  // maintains ascending order of elements
  // uses a binary search to find appropriate index
  public void addBinary(Integer newVal)
  {
    if( size() == 0){
      _data.add(newVal);
      return;
    }
    if( get(0) >= newVal){
      _data.add(0, newVal);
      return;
    }
    
    if( get( size()-1 ) <= newVal ){
      _data.add(newVal);
      return;
    }

    int hi = size()-1;
    int lo = 0;
    int mid = 0;

    int iterations =  1 + (int) (Math.log(hi)/Math.log(2));

    for( int i = 0; i < iterations ; i++){
      mid = lo + (hi-lo)/2;

      if( get(mid) <= newVal && get(mid+1) >= newVal){
        _data.add(mid+1, newVal);
        return;
      }

      if( newVal < get(mid) ){
        hi = mid;
      }

      else{
        lo = mid;
      }

    }
  }
  	
  
  // main method solely for testing purposes
  public static void main( String[] args )
  {
    //Linear
    OrderedArrayList Ferd = new OrderedArrayList();
    //Binary
    OrderedArrayList Franz = new OrderedArrayList();
        
    // testing binary search
    Franz = new OrderedArrayList();
    for( int i = 0; i < 15; i++ ){
      int randomNumber = (int)(50*Math.random());
      Franz.addBinary( randomNumber);
      Ferd.addBinary( randomNumber);
    }

    System.out.println( Franz );
    System.out.println( Ferd );

  }//end main()

}//end class OrderedArrayList


