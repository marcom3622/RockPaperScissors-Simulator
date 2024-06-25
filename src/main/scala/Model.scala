import Objects.{Paper, Rock, Scissors}

class Model {
  private var scissors = 0
  private var rocks = 0
  private var papers = 0
  private var rockArray : Array[Rock] = new Array[Rock](0)
  private var paperArray : Array[Paper] = new Array[Paper](0)
  private var scissorArray : Array[Scissors] = new Array[Scissors](0)

  def shouldContinue: Boolean = {
    val zeroCounts = List(scissors, rocks, papers).count(_ == 0)
    zeroCounts < 2
  }

  def setObjects(): Unit = {
    rockArray = new Array[Rock](rocks)
    paperArray = new Array[Paper](papers)
    scissorArray = new Array[Scissors](scissors)
  }

  def getScissors: Int = {
    scissors
  }

  def getRock: Int = {
    rocks
  }

  def getPaper: Int = {
    papers
  }

  def addScissors: Unit = {
    scissors+= 1
  }

  def addPaper: Unit = {
    papers += 1
  }

  def addRock: Unit = {
    rocks += 1
  }

  def removeScissors: Unit = {
    scissors -= 1
  }

  def removePaper: Unit = {
    papers -= 1
  }

  def removeRock: Unit = {
    rocks -= 1
  }
}
