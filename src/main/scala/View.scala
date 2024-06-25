import javafx.scene.Scene
import javafx.scene.control.Button
import javafx.scene.layout.StackPane

class View {
  private var scene : Scene= null

  def setupScene(
                  onStartSimulation: () => Unit,
                  onAddRock: () => Unit,
                  onAddPaper: () => Unit,
                  onAddScissors: () => Unit,
                  onRemoveRock: () => Unit,
                  onRemovePaper: () => Unit,
                  onRemoveScissors: () => Unit
                ): Unit = {
    val root = new StackPane()

    // Main simulation button
    val btn = new Button("Start Simulation")
    btn.setOnAction(_ => onStartSimulation())

    // Buttons for adding objects
    val rockAdd = new Button("+ Rock")
    rockAdd.setOnAction(_ => onAddRock())
    val paperAdd = new Button("+ Paper")
    paperAdd.setOnAction(_ => onAddPaper())
    val scissorsAdd = new Button("+ Scissors")
    scissorsAdd.setOnAction(_ => onAddScissors())

    // Buttons for removing objects
    val rockRemove = new Button("- Rock")
    rockRemove.setOnAction(_ => onRemoveRock())
    val paperRemove = new Button("- Paper")
    paperRemove.setOnAction(_ => onRemovePaper())
    val scissorsRemove = new Button("- Scissors")
    scissorsRemove.setOnAction(_ => onRemoveScissors())

    // Adding all controls to the root pane
    root.getChildren.addAll(
      btn,
      rockAdd, rockRemove,
      paperAdd, paperRemove,
      scissorsAdd, scissorsRemove
    )
    scene = new Scene(root, 600, 300)
  }

  def getScene: Scene = {
    scene
  }

  def setSimulationScene(model: Model): Unit = {

  }

  def refresh(): Unit = {

  }
}
