package week6;

import acm.program.ConsoleProgram;

public class Main extends ConsoleProgram
{
	private static final long serialVersionUID = 1L;

	public void run()
	{
		ExpandableArray< String > ea = new ExpandableArray<>();
		ea.set( 5, "five" );
		println( ea.toString() );
		ea.set( 4, "four" );
		println( ea.toString() );
		ea.set( 10, "ten" );
		println( ea.toString() );
		println( "get( 3 ) =" + ea.get( 3 ) );
		println( "get( 5 ) =" + ea.get( 5 ) );
		println( "get( 10 ) =" + ea.get( 10 ) );
		println( "get( 1 ) =" + ea.get( 1 ) );
		println( "get( 0 ) =" + ea.get( 0 ) );
	}
}
