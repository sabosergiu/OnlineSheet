import java.io.Serializable;

public class StringFieldModificationRequest implements Serializable, Request {
	private int row, column;
	private String info;
}
