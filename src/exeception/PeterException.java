package exeception;


/**
 * @author Franci 
 * @version 1.0
 * @since November 6, 2013
**/
public class PeterException extends RuntimeException {

	private static final long serialVersionUID = -2423799594635526084L;

	public PeterException( String message ) {
		super( message );
	}

	public PeterException( String message, Throwable cause ) {
		super( message, cause );
	}

	public PeterException( Throwable cause ) {
		super(cause);
	}
}
