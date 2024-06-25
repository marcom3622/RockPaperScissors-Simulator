import Objects.BaseObject
import Objects.Rock
import javafx.scene.Scene
import javafx.stage.Stage

import scala.language.postfixOps

class Controller(view: View, model: Model) {
  var stage: Stage = null;

  def setStage(primaryStage: Stage): Unit = {
    stage = primaryStage
  }


  def start():Unit = {
      view.setupScene(
        startSimulation _, // Pass the function reference
        addRock _, // Pass the function reference
        addPaper _, // Pass the function reference
        addScissors _, // Pass the function reference
        removeRock _, // Pass the function reference
        removePaper _, // Pass the function reference
        removeScissors _ // Pass the function reference
      )
    }


  def getScene: Scene = {
    view.getScene
  }

  def addRock(): Unit = model.addRock

  def addPaper(): Unit = model.addPaper

  def addScissors(): Unit = model.addScissors

  def removeRock(): Unit = model.removeRock

  def removePaper(): Unit = model.removePaper

  def removeScissors(): Unit = model.removeScissors

  private def startSimulation(): Unit = {
    model.setObjects()
    view.setSimulationScene(model)
    stage.setScene(view.getScene)

    while(model.shouldContinue) {

    }
  }
}
