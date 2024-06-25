import javafx.application.Application
import javafx.scene.Scene
import javafx.scene.control.Button
import javafx.scene.layout.StackPane
import javafx.stage.Stage

object Main {
  def main(args: Array[String]): Unit = {
    Application.launch(classOf[JavaFXApp], args: _*)
  }
}

class JavaFXApp extends Application {
  override def start(primaryStage: Stage): Unit = {
    val controller = new Controller(new View, new Model)
    controller.start()
    primaryStage.setTitle("Rock Paper Scissors Simulator")
    primaryStage.setScene(controller.getScene)
    primaryStage.show()
  }
}
