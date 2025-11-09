module com.example.javafxdemofull {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;
    requires java.desktop;

    opens SwitchScenes to javafx.fxml;
    exports SwitchScenes;

    opens CommsBetweenControllers to javafx.fxml;
    exports CommsBetweenControllers;

    opens LogoutBtn to javafx.fxml;
    exports LogoutBtn;

    opens ImageView to javafx.fxml;
    exports ImageView;

    opens TextField to javafx.fxml;
    exports TextField;

    opens CheckBox to javafx.fxml;
    exports CheckBox;

    opens RadioButtons to javafx.fxml;
    exports RadioButtons;
}