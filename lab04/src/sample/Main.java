package sample;
import java.lang.String;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.layout.BorderPane;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;
import javafx.scene.control.DatePicker;
import javafx.scene.layout.GridPane;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        GridPane p = new GridPane();

        //new TextField("Password:"),

        p=getFields(p);

        Scene s = new Scene(p,640,380);
        primaryStage.setScene(s);
        primaryStage.setTitle("Lab04");

        primaryStage.show();
    }
    private HBox getH(){
        return null;
    }
    private GridPane getFields(GridPane roots ){


        roots.setPadding(new Insets(14,20, 10, 10));
        TextField[] ts ={ new TextField("Username"),
                new TextField("Full Name"),
                new TextField("E-Mail"),
                new TextField("Phone #"
                )};

        PasswordField password = new PasswordField();
        DatePicker Birth = new DatePicker();
        roots.add(ts[0],1,0);
        roots.add(password,1,1);
        roots.add(ts[1],1,2);
        roots.add(ts[2],1,3);
        roots.add(ts[3],1,4);
        roots.add(Birth,1,5);


        Label[] courses = {new Label("Username:"), new Label("Password:"),
                new Label("Full name:"), new Label("Email:"),
                new Label("Phone #:"),new Label("Date of Birth:")};
        for(int x = 0; x<6;x++){
            roots.add(courses[x],0,x);
        }
        Button reg = new Button("Register");
        reg.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent actionEvent) {
                System.out.println("UserName:"+ts[0].getText());
                System.out.println("Password:"+password.getText());
                System.out.println("Full Name:"+ts[1].getText());
                System.out.println("Email:"+ts[2].getText());
                System.out.println("Date of Birth: "+ts[3].getText());

            }
        });
        roots.add(reg,1,6);


        return roots;
    }

    public static void main(String[] args) {
        launch(args);
    }
}
