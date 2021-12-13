// Clyde "Thluffy" Sinclair
// APCS pd00
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

  // inserts newVal at the appropriate index
  // maintains ascending order of elements
  // uses a linear search to find appropriate index
  public void addLinear(Integer newVal)
  {
  if(size() == 0){
  	_data.add(newVal);
  }
    for(int i=0;i<size();i++){
    	if(get(i)>= newVal){
    	_data.add(i,newVal);
    	return;
    	}
    	
    	
    
    }
    _data.add(newVal);
  }

  // inserts newVal at the appropriate index
  // maintains ascending order of elements
  // uses a binary search to find appropriate index
  public void addBinary(Integer newVal)
  {
	int lower = 0;
	int upper = size() - 1;
	int mid, a;

	if (size() == 0) {
		_data.add(newVal);
		return;
	}

	while (upper >= lower) {
		mid = (upper + lower) / 2;
		a = newVal - _data.get(mid);
		
		if (a < 0) {
			upper = mid - 1;
		} else if (a > 0) {
			lower = mid + 1;
		} else {
			_data.add(mid, newVal);
			return;
		}
	}
	_data.add(lower, newVal);
	return;
  }
  	
  

  // main method solely for testing purposes
  public static void main( String[] args )
  {
    OrderedArrayList Franz = new OrderedArrayList();

    // testing linear search
    
    for( int i = 0; i < 15; i++ )
      Franz.addLinear( (int)( 50 * Math.random() ) );
    System.out.println( Franz );
    

    // testing binary search
    Franz = new OrderedArrayList();
    for( int i = 0; i < 15; i++ ){
      Franz.addBinary( (int)( 50 * Math.random() ) );
    }
  System.out.println( Franz );

  }//end main()

}//end class OrderedArrayList


