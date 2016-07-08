import java.io.Serializable;

public class ErrorResponse implements Response, Serializable {
	private String message;

	public ErrorResponse(String message){this.message=message;}

	public String getMessage(){return message;}
}
