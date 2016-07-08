import java.io.Serializable;

/**
 * Created by Sergiu on 08-Jul-16.
 */
public class StringFieldModifiedResponse implements Response, Serializable {
	private int row,column;
	private String info;
}
