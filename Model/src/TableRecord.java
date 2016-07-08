import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class TableRecord {
	private SimpleStringProperty predicator, studiu, predica, text, tematica, subiect, format, youTube, embedYouTube, vimeo, embedVimeo;
	private SimpleIntegerProperty incarcatServer;

	public int getIncarcatServer() {
		return incarcatServer.get();
	}

	public SimpleIntegerProperty incarcatServerProperty() {
		return incarcatServer;
	}

	public void setIncarcatServer(int incarcatServer) {
		this.incarcatServer.set(incarcatServer);
	}

	public String getPredicator() {
		return predicator.get();
	}

	public SimpleStringProperty predicatorProperty() {
		return studiu;
	}

	public void setPredicator(String predicator) {
		this.predicator.set(predicator);
	}

	public String getStudiu() {
		return studiu.get();
	}

	public SimpleStringProperty studiuProperty() {
		return studiu;
	}

	public void setStudiu(String studiu) {
		this.studiu.set(studiu);
	}

	public String getPredica() {
		return predica.get();
	}

	public SimpleStringProperty predicaProperty() {
		return predica;
	}

	public void setPredica(String predica) {
		this.predica.set(predica);
	}

	public String getText() {
		return text.get();
	}

	public SimpleStringProperty textProperty() {
		return text;
	}

	public void setText(String text) {
		this.text.set(text);
	}

	public String getTematica() {
		return tematica.get();
	}

	public SimpleStringProperty tematicaProperty() {
		return tematica;
	}

	public void setTematica(String tematica) {
		this.tematica.set(tematica);
	}

	public String getSubiect() {
		return subiect.get();
	}

	public SimpleStringProperty subiectProperty() {
		return subiect;
	}

	public void setSubiect(String subiect) {
		this.subiect.set(subiect);
	}

	public String getFormat() {
		return format.get();
	}

	public SimpleStringProperty formatProperty() {
		return format;
	}

	public void setFormat(String format) {
		this.format.set(format);
	}

	public String getYouTube() {
		return youTube.get();
	}

	public SimpleStringProperty youTubeProperty() {
		return youTube;
	}

	public void setYouTube(String youTube) {
		this.youTube.set(youTube);
	}

	public String getEmbedYouTube() {
		return embedYouTube.get();
	}

	public SimpleStringProperty embedYouTubeProperty() {
		return embedYouTube;
	}

	public void setEmbedYouTube(String embedYouTube) {
		this.embedYouTube.set(embedYouTube);
	}

	public String getVimeo() {
		return vimeo.get();
	}

	public SimpleStringProperty vimeoProperty() {
		return vimeo;
	}

	public void setVimeo(String vimeo) {
		this.vimeo.set(vimeo);
	}

	public String getEmbedVimeo() {
		return embedVimeo.get();
	}

	public SimpleStringProperty embedVimeoProperty() {
		return embedVimeo;
	}

	public void setEmbedVimeo(String embedVimeo) {
		this.embedVimeo.set(embedVimeo);
	}
}
