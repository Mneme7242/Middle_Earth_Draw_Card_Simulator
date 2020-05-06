/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package middleearthdrawcardsimulator;


import javafx.scene.control.Label;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.stage.Stage;

/**
 *
 * @author jlchenran
 */
public class NewFXMain extends Application {
    
    // 构造函数
    
        // 多行文本框会根据情况自己调节大小
        
       
        
        
        // 布局管理
        // this.setLayout(new GridLayout(1, 1));
        // 添加
    
    @Override
    public void start(Stage primaryStage) {
        
        // 设置窗体属性,z这里很厉害!!
       Label jcl=new Label("卡池选择");
       Label jcl2=new Label("抽卡结果");
       TextArea jta = new TextArea();// 多行文本框
       jta.setEditable(false);
       ScrollPane jsp = new ScrollPane();
       jsp = new ScrollPane(jta);
       ComboBox jcb = new ComboBox();// 下拉框组件
       ObservableList<String> options = 
    FXCollections.observableArrayList(
         "友情池" ,"高星池"
    );
       jcb.setValue("友情池");
       Button jb1 = new Button();
       Button jb2 = new Button();
       jcb.setItems(options);
        
        jb1.setText("抽一次");
        jb1.setOnAction((ActionEvent event) -> {
            if("友情池".equals(jcb.getValue().toString()))
            {
                jta.setText(DrawCard.FPullOnce());
            }
            else{
                jta.setText(DrawCard.SPullOnce());
            }
       });
        jb2.setText("抽十次");
        jb2.setOnAction((ActionEvent event) -> {
            if("友情池".equals(jcb.getValue().toString()))
            {
                jta.setText(DrawCard.FPullTenTimes());
            }
            else{
                jta.setText(DrawCard.SPullTenTimes());
            }
        });
        
    BorderPane root = new BorderPane();
    Scene scene = new Scene(root, 500, 200);
    GridPane gridpane = new GridPane();
    gridpane.setHgap(10);
    gridpane.setVgap(5);
    gridpane.setPadding(new Insets(10));
    
    ColumnConstraints column1 = new ColumnConstraints(100);
    ColumnConstraints column2 = new ColumnConstraints(50, 150, 400);
    column2.setHgrow(Priority.ALWAYS);
    gridpane.getColumnConstraints().addAll(column1, column2);
    
    GridPane.setHalignment(jcl, HPos.CENTER);
    gridpane.add(jcl, 0, 0);

    // Last name label
    GridPane.setHalignment(jcb, HPos.CENTER);
    gridpane.add(jcb, 0, 1);

    // First name field
    GridPane.setHalignment(jcl2, HPos.LEFT);
    gridpane.add(jcl2, 1, 0);

    // Last name field
    GridPane.setHalignment(jta, HPos.RIGHT);
    gridpane.add(jta, 1, 1);

    // Save button
    GridPane.setHalignment(jb1, HPos.LEFT);
    gridpane.add(jb1, 1, 2);
    GridPane.setHalignment(jb2, HPos.RIGHT);
    gridpane.add(jb2, 1, 2);
    
    
        

        root.setCenter(gridpane);
        primaryStage.setTitle("MiddleEarthDrawCardSimulator");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * The main() method is ignored in correctly deployed JavaFX application.
     * main() serves only as fallback in case the application can not be
     * launched through deployment artifacts, e.g., in IDEs with limited FX
     * support. NetBeans ignores main().
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
