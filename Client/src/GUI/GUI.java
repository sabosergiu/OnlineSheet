package GUI;

import javafx.application.Application;
import javafx.stage.Screen;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class GUI extends Application {
	private static final double MAX_SIZE=Integer.MAX_VALUE;

	public static void main(String[] args){launch(args);}

	public void start(Stage primaryStage){
		TableRecord rec;
		TableView<TableRecord> mainTable=new TableView<>();
		mainTable.setPrefHeight(MAX_SIZE);
		mainTable.setPrefWidth(MAX_SIZE);

		TableColumn<TableRecord,String> col1=new TableColumn<>("Coloana 1");
		TableColumn<TableRecord,String> col2=new TableColumn<>("Coloana 2");
		TableColumn<TableRecord,String> col3=new TableColumn<>("Coloana 3");
		TableColumn<TableRecord,String> col4=new TableColumn<>("Coloana 4");
		TableColumn<TableRecord,String> col5=new TableColumn<>("Coloana 5");
		TableColumn<TableRecord,String> col6=new TableColumn<>("Coloana 6");
		TableColumn<TableRecord,String> col7=new TableColumn<>("Coloana 7");
		mainTable.getColumns().addAll(col1,col2,col3,col4,col5,col6,col7);
		GridPane grid=new GridPane();
		grid.add(mainTable,0,0);
		Scene scene=new Scene(grid,Screen.getPrimary().getVisualBounds().getWidth(),Screen.getPrimary().getVisualBounds().getHeight());
		primaryStage.setMaximized(true);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}