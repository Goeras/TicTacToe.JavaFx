package application;
	
import java.util.concurrent.atomic.AtomicInteger;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;


public class Main extends Application {
	
	Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btnX,btnO,btnReset;
	String choice;
	Label label;
	AtomicInteger countSquares = new AtomicInteger();
	AtomicInteger countTurns = new AtomicInteger();
	
	@Override
	public void start(Stage primaryStage) {
		
		try {
			
			primaryStage.setTitle("Tic Tac Toe");
			btn1 = new Button();
			btn2 = new Button();
			btn3 = new Button();
			btn4 = new Button();
			btn5 = new Button();
			btn6 = new Button();
			btn7 = new Button();
			btn8 = new Button();
			btn9 = new Button();
			//btnX = new Button("X");
			//btnO = new Button("O");
			btnReset = new Button("Nytt Spel");
			label = new Label();
			label.setFont(Font.font("Arial",FontWeight.BOLD, 17));
			choice = "";
			
			btn1.setMinSize(50, 50);
			btn2.setMinSize(50, 50);
			btn3.setMinSize(50, 50);
			btn4.setMinSize(50, 50);
			btn5.setMinSize(50, 50);
			btn6.setMinSize(50, 50);
			btn7.setMinSize(50, 50);
			btn8.setMinSize(50, 50);
			btn9.setMinSize(50, 50);
			
			btn1.setFont(Font.font("Arial",FontWeight.BOLD, 17));
			btn2.setFont(Font.font("Arial",FontWeight.BOLD, 17));
			btn3.setFont(Font.font("Arial",FontWeight.BOLD, 17));
			btn4.setFont(Font.font("Arial",FontWeight.BOLD, 17));
			btn5.setFont(Font.font("Arial",FontWeight.BOLD, 17));
			btn6.setFont(Font.font("Arial",FontWeight.BOLD, 17));
			btn7.setFont(Font.font("Arial",FontWeight.BOLD, 17));
			btn8.setFont(Font.font("Arial",FontWeight.BOLD, 17));
			btn9.setFont(Font.font("Arial",FontWeight.BOLD, 17));
			
			btn1.setStyle("-fx-background-color: #FF00FF;");
			btn2.setStyle("-fx-background-color: #FF00FF;");
			btn3.setStyle("-fx-background-color: #FF00FF;");
			btn4.setStyle("-fx-background-color: #FF00FF;");
			btn5.setStyle("-fx-background-color: #FF00FF;");
			btn6.setStyle("-fx-background-color: #FF00FF;");
			btn7.setStyle("-fx-background-color: #FF00FF;");
			btn8.setStyle("-fx-background-color: #FF00FF;");
			btn9.setStyle("-fx-background-color: #FF00FF;");
			
			btnReset.setFont(Font.font("Arial",FontWeight.BOLD, 14));
			btnReset.setStyle("-fx-background-color: #FF00FF;");
			//btnO.setOnAction( e -> choice = "O");
			//btnX.setOnAction( e -> choice = "X");
			btnReset.setOnAction( e -> newGame());
			
			choice = "X";
			
			btn1.setOnAction( e -> {
				btn1.setText(choice);
				countSquares.getAndIncrement();
				whosTurn();
				checkX(countSquares.get());
				checkO(countSquares.get());
			});
			btn2.setOnAction( e -> {
				btn2.setText(choice);
				countSquares.getAndIncrement();
				whosTurn();
				checkX(countSquares.get());
				checkO(countSquares.get());
			});
			btn3.setOnAction( e -> {
				btn3.setText(choice);
				countSquares.getAndIncrement();
				whosTurn();
				checkX(countSquares.get());
				checkO(countSquares.get());
			});
			btn4.setOnAction( e -> {
				btn4.setText(choice);
				countSquares.getAndIncrement();
				whosTurn();
				checkX(countSquares.get());
				checkO(countSquares.get());
			});
			btn5.setOnAction( e -> {
				btn5.setText(choice);
				countSquares.getAndIncrement();
				whosTurn();
				checkX(countSquares.get());
				checkO(countSquares.get());
			});
			btn6.setOnAction( e -> {
				btn6.setText(choice);
				countSquares.getAndIncrement();
				whosTurn();
				checkX(countSquares.get());
				checkO(countSquares.get());
			});
			btn7.setOnAction( e -> {
				btn7.setText(choice);
				countSquares.getAndIncrement();
				whosTurn();
				checkX(countSquares.get());
				checkO(countSquares.get());
			});
			btn8.setOnAction( e -> {
				btn8.setText(choice);
				countSquares.getAndIncrement();
				whosTurn();
				checkX(countSquares.get());
				checkO(countSquares.get());
			});
			btn9.setOnAction( e -> {
				btn9.setText(choice);
				countSquares.getAndIncrement();
				whosTurn();
				checkX(countSquares.get());
				checkO(countSquares.get());
			});
		
			HBox hBoxTop = new HBox();
			HBox hBoxBottom = new HBox();
			HBox hBox1 = new HBox();
			HBox hBox2 = new HBox();
			HBox hBox3 = new HBox();
			
			hBoxTop.getChildren().addAll(btnReset);
			hBoxTop.alignmentProperty().set(Pos.CENTER);
			hBoxTop.setSpacing(30);
			hBoxTop.setPadding(new Insets(20));
			hBoxTop.setStyle("-fx-background-color: #9702b0;");
			
			hBox1.setPadding(new Insets(2));
			hBox2.setPadding(new Insets(2));
			hBox3.setPadding(new Insets(2));
			
			hBox1.setSpacing(2);
			hBox2.setSpacing(2);
			hBox3.setSpacing(2);
			
			hBox1.alignmentProperty().set(Pos.CENTER);
			hBox2.alignmentProperty().set(Pos.CENTER);
			hBox3.alignmentProperty().set(Pos.CENTER);
			
			hBox1.getChildren().addAll(btn1,btn2,btn3);
			hBox2.getChildren().addAll(btn4,btn5,btn6);
			hBox3.getChildren().addAll(btn7,btn8,btn9);
			
			hBoxBottom.getChildren().addAll(label);
			hBoxBottom.alignmentProperty().set(Pos.CENTER);
			hBoxBottom.setSpacing(30);
			hBoxBottom.setPadding(new Insets(20));
			hBoxBottom.setStyle("-fx-background-color: #9702b0;");
			
			VBox vBox = new VBox();
			vBox.setPadding(new Insets(30));
			vBox.setStyle("-fx-background-color: #383930;");
			vBox.getChildren().addAll(hBox1,hBox2,hBox3);
			
			BorderPane borderPane = new BorderPane();
			borderPane.setCenter(vBox);
			borderPane.setTop(hBoxTop);
			borderPane.setBottom(hBoxBottom);
			
			Scene scene = new Scene(borderPane, 250, 350);
			primaryStage.setScene(scene);
			primaryStage.show();
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
			
	}
	
	public void whosTurn()
	{
		if(countTurns.getAndIncrement() % 2 == 0)
		{
			choice="O";
		}
		else
		{
			choice = "X";
		}
	}
	
	public void newGame()
	{
		btn1.setText("");
		btn1.setStyle("-fx-background-color: #FF00FF;");
		btn2.setText("");
		btn2.setStyle("-fx-background-color: #FF00FF;");
		btn3.setText("");
		btn3.setStyle("-fx-background-color: #FF00FF;");
		btn4.setText("");
		btn4.setStyle("-fx-background-color: #FF00FF;");
		btn5.setText("");
		btn5.setStyle("-fx-background-color: #FF00FF;");
		btn6.setText("");
		btn6.setStyle("-fx-background-color: #FF00FF;");
		btn7.setText("");
		btn7.setStyle("-fx-background-color: #FF00FF;");
		btn8.setText("");
		btn8.setStyle("-fx-background-color: #FF00FF;");
		btn9.setText("");
		btn9.setStyle("-fx-background-color: #FF00FF;");
		countSquares.set(0);
		label.setText("");
	}
	
	public void checkX(int counter)
	{
		if(btn1.getText().equals("X") && btn2.getText().equals("X") && btn3.getText().equals("X"))
		{
			btn1.setStyle("-fx-background-color: #9702b0;");
			btn2.setStyle("-fx-background-color: #9702b0;");
			btn3.setStyle("-fx-background-color: #9702b0;");
			label.setText("Vinnare är X");
		}
		else if(btn4.getText().equals("X") && btn5.getText().equals("X") && btn6.getText().equals("X"))
		{
			btn4.setStyle("-fx-background-color: #9702b0;");
			btn5.setStyle("-fx-background-color: #9702b0;");
			btn6.setStyle("-fx-background-color: #9702b0;");
			label.setText("Vinnare är X");
		}
		else if(btn7.getText().equals("X") && btn8.getText().equals("X") && btn9.getText().equals("X"))
		{
			btn7.setStyle("-fx-background-color: #9702b0;");
			btn8.setStyle("-fx-background-color: #9702b0;");
			btn9.setStyle("-fx-background-color: #9702b0;");
			label.setText("Vinnare är X");
		}
		else if(btn1.getText().equals("X") && btn4.getText().equals("X") && btn7.getText().equals("X"))
		{
			btn1.setStyle("-fx-background-color: #9702b0;");
			btn4.setStyle("-fx-background-color: #9702b0;");
			btn7.setStyle("-fx-background-color: #9702b0;");
			label.setText("Vinnare är X");
		}
		else if(btn2.getText().equals("X") && btn5.getText().equals("X") && btn8.getText().equals("X"))
		{
			btn2.setStyle("-fx-background-color: #9702b0;");
			btn5.setStyle("-fx-background-color: #9702b0;");
			btn8.setStyle("-fx-background-color: #9702b0;");
			label.setText("Vinnare är X");
		}
		else if(btn3.getText().equals("X") && btn6.getText().equals("X") && btn9.getText().equals("X"))
		{
			btn3.setStyle("-fx-background-color: #9702b0;");
			btn6.setStyle("-fx-background-color: #9702b0;");
			btn9.setStyle("-fx-background-color: #9702b0;");
			label.setText("Vinnare är X");
		}
		else if(btn1.getText().equals("X") && btn5.getText().equals("X") && btn9.getText().equals("X"))
		{
			btn1.setStyle("-fx-background-color: #9702b0;");
			btn5.setStyle("-fx-background-color: #9702b0;");
			btn9.setStyle("-fx-background-color: #9702b0;");
			label.setText("Vinnare är X");
		}
		else if(btn7.getText().equals("X") && btn5.getText().equals("X") && btn3.getText().equals("X"))
		{
			btn7.setStyle("-fx-background-color: #9702b0;");
			btn5.setStyle("-fx-background-color: #9702b0;");
			btn3.setStyle("-fx-background-color: #9702b0;");
			label.setText("Vinnare är X");
		}
		else if(counter >= 9)
		{
			label.setText("Ingen vinnare..");
		}
	}
	
	public void checkO(int counter)
	{
		if(btn1.getText().equals("O") && btn2.getText().equals("O") && btn3.getText().equals("O"))
		{
			btn1.setStyle("-fx-background-color: #9702b0;");
			btn2.setStyle("-fx-background-color: #9702b0;");
			btn3.setStyle("-fx-background-color: #9702b0;");
			label.setText("Vinnare är O");
		}
		else if(btn4.getText().equals("O") && btn5.getText().equals("O") && btn6.getText().equals("O"))
		{
			btn4.setStyle("-fx-background-color: #9702b0;");
			btn5.setStyle("-fx-background-color: #9702b0;");
			btn6.setStyle("-fx-background-color: #9702b0;");
			label.setText("Vinnare är O");
		}
		else if(btn7.getText().equals("O") && btn8.getText().equals("O") && btn9.getText().equals("O"))
		{
			btn7.setStyle("-fx-background-color: #9702b0;");
			btn8.setStyle("-fx-background-color: #9702b0;");
			btn9.setStyle("-fx-background-color: #9702b0;");
			label.setText("Vinnare är O");
		}
		else if(btn1.getText().equals("O") && btn4.getText().equals("O") && btn7.getText().equals("O"))
		{
			btn1.setStyle("-fx-background-color: #9702b0;");
			btn4.setStyle("-fx-background-color: #9702b0;");
			btn7.setStyle("-fx-background-color: #9702b0;");
			label.setText("Vinnare är O");
		}
		else if(btn2.getText().equals("O") && btn5.getText().equals("O") && btn8.getText().equals("O"))
		{
			btn2.setStyle("-fx-background-color: #9702b0;");
			btn5.setStyle("-fx-background-color: #9702b0;");
			btn8.setStyle("-fx-background-color: #9702b0;");
			label.setText("Vinnare är O");
		}
		else if(btn3.getText().equals("O") && btn6.getText().equals("O") && btn9.getText().equals("O"))
		{
			btn3.setStyle("-fx-background-color: #9702b0;");
			btn6.setStyle("-fx-background-color: #9702b0;");
			btn9.setStyle("-fx-background-color: #9702b0;");
			label.setText("Vinnare är O");
		}
		else if(btn1.getText().equals("O") && btn5.getText().equals("O") && btn9.getText().equals("O"))
		{
			btn1.setStyle("-fx-background-color: #9702b0;");
			btn5.setStyle("-fx-background-color: #9702b0;");
			btn9.setStyle("-fx-background-color: #9702b0;");
			label.setText("Vinnare är O");
		}
		else if(btn7.getText().equals("O") && btn5.getText().equals("O") && btn3.getText().equals("O"))
		{
			btn7.setStyle("-fx-background-color: #9702b0;");
			btn5.setStyle("-fx-background-color: #9702b0;");
			btn3.setStyle("-fx-background-color: #9702b0;");
			label.setText("Vinnare är O");
		}
		else if(counter > 9)
		{
			label.setText("Ingen vinnare..");
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
