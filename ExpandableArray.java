package week6;

import java.util.Arrays;

import acm.program.ConsoleProgram;

public class ExpandableArray< T >extends ConsoleProgram
{ // Expandable Array (ea):
	private Object[] ea;

	private static final long serialVersionUID = 1L;

	public String toString()
	{
		return Arrays.deepToString( ea );
	}

	/**
	 * Creates a new expandable array with no elements.
	 */
	public ExpandableArray()
	{
	}

	/**
	 * Sets the element at the given index position to the specified. value. If the
	 * internal array is not large enough to contain that element, the
	 * implementation expands the array to make room.
	 */
	public void set(
			int index,
			T value
	)
	{
		if( index > 0 )
			if( this.ea == null )
			{
				this.ea = new Object[ index ];
				allocateElementAndAssign( value, index );
			}
			else
			{
				if( ea.length <= index )
				{ // resize:
					ea = enlarge( index );
					allocateElementAndAssign( value, index );
				}
				else
					allocateElementAndAssign( value, index );
			}
	}

	private Object[] enlarge(
			int newSize
	)
	{ // New Array of Objects (nao):
		Object[] nao = new Object[ newSize ];
		for( int b = 0; b < this.ea.length; b++ )
			nao[ b ] = this.ea[ b ];

		return nao;
	}

	private void allocateElementAndAssign(
			T o,
			int index
	)
	{
		if( this.ea[ index - 1 ] == null )
			this.ea[ index - 1 ] = new Object();

		this.ea[ index - 1 ] = o;
	}

	/**
	 * Returns the element at the specified index position, or null if no such
	 * element exists. Note that this method never throws an out-of-bounds
	 * exception; if the index is outside the bounds of the array, the return value
	 * is simply null.
	 */
	public T get(
			int index
	)
	{
		if( index > 0 )
			if( this.ea.length >= index && this.ea[ index - 1 ] != null )
			{
				@SuppressWarnings( "unchecked" ) T t = (T)ea[ index - 1 ];
				return t;
			}

		return null;
	}
}
