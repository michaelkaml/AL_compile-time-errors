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
    //if no items in array, just add one
    if( size() == 0 ){
      _data.add(newVal);
      return;
    }

    int start = 0;
    int end = size()-1;

    //edge cases
    //if belongs in beginning
    if( get(start) >= newVal ){
      System.out.println("Inputted at Start");
      _data.add(start, newVal);
      return;
    }
    //if belongs in end
    if( get(end) <= newVal){
      System.out.println("Inputted at End");
      _data.add(newVal);
      return;
    }

    //if belongs somewhere in middle
    System.out.print("attempting to put in " + newVal);
    while( (end-start)>0){
      int middle = (end-start)/2;
      System.out.print(middle + " ");
      //check if newVal can be inputted in index middle without disrupting order
      if( newVal >= get(middle) && newVal <= get(middle+1) ){
        System.out.println("Inputted in the middle at index: " + middle);
        _data.add(middle+1, newVal);
        return;
      }
      //if to the left of middle
      if( newVal < get(middle) ){
        end = middle;
      }
      //if to the right of middle
      else{
        start = middle+1;
      }
      //System.out.println( start + ": " + get(start) + "\n" + end + ": " + get(end) + "\n" );
    }
    
  }
  	
  
  // main method solely for testing purposes
  public static void main( String[] args )
  {
    OrderedArrayList Franz = new OrderedArrayList();

    /* testing linear search
    for( int i = 0; i < 15; i++ )
      Franz.addLinear( (int)( 50 * Math.random() ) );
    System.out.println( Franz );
    */
    

    // testing binary search
    Franz = new OrderedArrayList();
    for( int i = 0; i < 15; i++ ){
      int randomNumber = (int)(50*Math.random());
      Franz.addBinary( randomNumber);
      System.out.println(Franz + " " + randomNumber);
    }
  System.out.println( Franz );

  }//end main()

}//end class OrderedArrayList


