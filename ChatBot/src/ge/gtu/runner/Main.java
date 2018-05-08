package ge.gtu.runner;

import ge.gtu.model.enums.EmotionEnum;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import static java.lang.Thread.sleep;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.event.EventType;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        VBox vBox = new VBox(10);

        TextField yourName = new TextField();
        yourName.setPromptText("შენი კლიჩკა");
        yourName.setMaxWidth(100);
        yourName.setFont(new Font("sylfaen", 13));

        TextField chatBot = new TextField();
        chatBot.setPromptText("Say: /გამარჯობა/ ");
        chatBot.setMaxWidth(200);
        chatBot.setFont(new Font("sylfaen", 13));

        Button chat = new Button("გაგზავნა");
        chat.setFont(new Font("sylfaen", 13));

        Menu menu = new Menu("Other");

        MenuItem itemHelp = new MenuItem("Help");
        MenuItem itemGamirbixar = new MenuItem("Exit");
        itemHelp.setOnAction((event) -> {

            VBox stack = new VBox(10);
            stack.setPadding(new Insets(15, 15, 15, 15));
            Label l = new Label("რა ვერ გაიგე ნომერი დაწერე და ახსენი");
            l.setFont(Font.font("sylfaen", FontWeight.BOLD, 20));
            l.setTextFill(Color.web("#DF0101"));
            ImageView img = new ImageView("download.jpg");
            TextField num = new TextField();
            Button add = new Button("გაგზავნა");
            add.setFont(new Font("sylfaen", 13));

            if (num.getText().length() > 9) {

                Alert a = new Alert(Alert.AlertType.WARNING);
                a.setContentText("ანგარიშზე არ მაქ გადმორეკე");
                a.showAndWait();
            }

            num.setMaxWidth(150);

            stack.setAlignment(Pos.CENTER);
            stack.getChildren().addAll(img, num, l);
            Scene s = new Scene(stack, 400, 300);

            Stage stage = new Stage();
            stage.setTitle("Help");
            stage.setScene(s);
            stage.show();

        });
        VBox v = new VBox(10);
        Label ask = new Label("თემიდან გარბიხარ ბრაატ?!!!");
        ask.setFont(new Font("sylfaen", 13));
        Button yes = new Button("კი ძმა");
        yes.setFont(new Font("sylfaen", 10));

        ImageView imgEx = new ImageView("guw7n.jpg");

        Button no = new Button("არა ბრატუხა");
        no.setFont(new Font("sylfaen", 10));
        v.setAlignment(Pos.CENTER);
        v.getChildren().addAll(imgEx, ask, yes, no);

        Scene c = new Scene(v, 500, 500);

        Stage s = new Stage();
        s.setTitle("სად გარბიხარ ძმა?!");
        yes.setOnAction((event) -> {

            s.close();
            primaryStage.close();

        });
        no.setOnAction((event) -> {

            s.close();

        });

        s.setScene(c);
        itemGamirbixar.setOnAction((event) -> {

            s.show();
        });

        TableView table = new TableView();

        TableColumn<User, String> NickName = new TableColumn<>("კლიჩკა");
        NickName.setStyle("-fx-font-family:sylfaen; -fx-font-size:14;");
        NickName.setMinWidth(100);
        NickName.setCellValueFactory(new PropertyValueFactory<>("user"));
        TableColumn<User, String> Message = new TableColumn<>("ბაზარი");
        Message.setMinWidth(800);
        Message.setStyle("-fx-font-family:sylfaen; -fx-font-size:14;");
        Message.setCellValueFactory(new PropertyValueFactory<>("Message"));
        table.getColumns().addAll(NickName, Message);

        Random nick = new Random();
        ArrayList<String> Nickname = new ArrayList<>();
        Nickname.add("დათკაიე");
        Nickname.add("ელიზბარა");
        Nickname.add("წურო");
        Nickname.add("ჩორნა");
        Nickname.add("ნარკუშა");
        Nickname.add("კრისტალა");
        Nickname.add("წრიპა");
        Nickname.add("შრამა");
        Nickname.add("მუჟიკა");
        Nickname.add("კასპერა");
        Nickname.add("კობრა");
        int x = nick.nextInt(Nickname.size());
        String Nick = Nickname.get(x);

        Random bro = new Random();
        ArrayList<String> broo = new ArrayList<>();
        broo.add("ძმა");
        broo.add("ბრატ");
        broo.add("ბრატუხა");
        int x1 = bro.nextInt(broo.size());
        String br = broo.get(x1);

        String Nik = Nick;
        String Br = br;

        chat.setOnAction((event) -> {

            String name = yourName.getText();
            String message = chatBot.getText();
            User u = new User(name, message, null);
            table.getItems().add(u);

            yourName.setEditable(false);

            if (chatBot.getText().contains("გამარჯობა") || chatBot.getText().contains("ზდ")) {
                Random Welcome = new Random();
                ArrayList<String> welcome = new ArrayList<>();
                welcome.add("ზდ რას შვრები?");
                welcome.add("გაუმარჯოს რას შვრები?");
                int x2 = Welcome.nextInt(welcome.size());
                String welc = welcome.get(x2);
                String mes = welc + " " + Br;

                User Bot = new User(Nick, mes, null);
                table.getItems().add(Bot);

            }

            if (chatBot.getText().contains("როგორ") || chatBot.getText().contains("ხარ")) {

                String su = "კარგად" + " " + Br;

                User t = new User(Nick, su, null);
                table.getItems().add(t);
                t.setEmotion(EmotionEnum.Great);

                if (chatBot.getText().contains("კი") || chatBot.getText().contains("დიახ") || chatBot.getText().contains("რაზეა ბაზარი")) {
                    String mess = "ცოტაც გაისარჯე და კაცობას გასწავლი";
                    User ci = new User(Nick, mess, null);
                    table.getItems().add(ci);
                    ci.setEmotion(EmotionEnum.Great);

                }
                if (chatBot.getText().contains("არა") || chatBot.getText().contains("ვერა")) {

                    String messs = "რატომ ჟოშკავ" + Br;
                    User cii = new User(Nick, messs, null);
                    table.getItems().add(cii);
                    cii.setEmotion(EmotionEnum.Angry);

                }

            }

            if (chatBot.getText().contains("ძმა") || chatBot.getText().contains("უბან")) {
                String q = "შენ რა თავი კაცი ხომ არ გგონია " + " " + br;
                User Bot = new User(Nick, q, null);
                table.getItems().add(Bot);
                Bot.setEmotion(EmotionEnum.Angry);

                if (Bot.getEmotion() == EmotionEnum.Angry || chatBot.getText().contains("!")) {

                    try {
                        String content = new String(Files.readAllBytes(Paths.get("Bad.txt")));
                        String[] tokens = content.split("\\! ");

                        Random ra = new Random();
                        int len = ra.nextInt(tokens.length);

                        String welc = tokens[len].toString();
                        String mes = welc;

                        User qot = new User(Nick, mes, null);
                        table.getItems().add(qot);

                    } catch (IOException ex) {
                        Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }

            if (chatBot.getText().contains(":)") || chatBot.getText().contains(")") || chatBot.getText().contains(":D") || chatBot.getText().contains("DD")) {
                try {
                    String content = new String(Files.readAllBytes(Paths.get("Good.txt")));
                    String[] tokens = content.split("\\:)");

                    Random ra = new Random();
                    int len = ra.nextInt(tokens.length);

                    String welc = tokens[len].toString();
                    String mes = welc;

                    User qot = new User(Nick, mes, null);
                    table.getItems().add(qot);

                } catch (IOException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            if (chatBot.getText().contains("?")) {
                Random askK = new Random();
                ArrayList<String> k = new ArrayList<>();
                k.add("მე რას მეკითხები წადი მამაშენს კითხე");
                k.add("კი ეგრეა");
                k.add("მერე");
                k.add("მაგით რისი თქმა გინდა");
                k.add("უბანში გამო ხშირად და გასწავლი");
                k.add("შენ რა თავი კაცი ხომ არ გგონია");

                int x4 = askK.nextInt(k.size());
                String ak = k.get(x4);
                String messag = ak;
                User b = new User(Nick, messag, null);
                table.getItems().add(b);
                if (chatBot.getText().contains("ღერი")) {
                    String g = "მე საიდან";
                    User bq = new User(Nick, g, null);
                    table.getItems().add(bq);
                    bq.setEmotion(EmotionEnum.Angry);

                }

                try {
                    FileWriter fstream = new FileWriter("Answer.txt", true);
                    fstream.write(chatBot.getText());
                    fstream.close();

                } catch (IOException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }

            }

            String content;

            try {
                content = new String(Files.readAllBytes(Paths.get("Answer.txt")));
                String tokens[] = content.split("\\?");

                Random r = new Random();
                System.out.println(tokens.toString());
                int len = r.nextInt(tokens.length);
                String ak = tokens[len].toString();
                String messag = ak + "?";
                User bOA = new User(Nick, messag, null);
                table.getItems().add(bOA);
                System.out.println(tokens.toString() + " Tokens");

            } catch (IOException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }

            if (chatBot.getText().contains("!")) {

                String m = "რატო მეძაბები ნომერი დაწერე!";
                User bot = new User(Nick, m, null);
                table.getItems().add(bot);
                bot.setEmotion(EmotionEnum.Angry);

            }

            //       String mes = "ერთი ღერი ხომ არ გაქ ჩემი ძმა";
            //       counter++;
            //       User bot = new User(Nick, mes);
            //       table.getItems().add(bot);
            chatBot.setText("");

        });

        menu.getItems().addAll(itemHelp, itemGamirbixar);
        MenuBar menuBar = new MenuBar();
        menuBar.getMenus().add(menu);

        BorderPane pane = new BorderPane();
        pane.setTop(menuBar);
        pane.setCenter(vBox);
        vBox.setSpacing(25);
        vBox.setPadding(new Insets(25, 25, 25, 25));
        vBox.getChildren().addAll(table, yourName, chatBot, chat);

        Scene scene = new Scene(pane, 1000, 500);
        primaryStage.setTitle("KaiBot");
        primaryStage.getIcons().add(new Image("/thief.png"));
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }

}
