package ScalaTaxi


import akka.actor.{Props, Actor, ActorLogging, ActorSystem}
import scala.concurrent.duration._

/**
 * Created by k.beliaev on 31.03.2017.
 */

case object FreeCar
case object ReservedCar

case class Order (startPoint: String, endPoint: String, needBabySeat: Boolean, needSmoking: Boolean){
  val needBabySeatOpt = Option{
    if (needBabySeat == None) needBabySeat = false
    else needBabySeat
  }
  val needSmokingOpt = Option{
    if (needSmoking == None) needSmoking = false
    else needSmoking
  }
}

object ScalaTaxi extends App with ActorLogging {

  val system = ActorSystem("scalataxi")

  def receive = {
    case Order => log.info(s"received ${loc} from ${sender.path.name}")
  }

  while (true) {
    val con = Console.readLine()
    val conS = con.split("|")
    conS.length match {
      case 2 =>
      case 4 =>
      case other =>
        println("Неверный формат заявки.")
    }
  }

}

class Car extends Actor {
  val carMark: String
  val carDriver: String
  val carDriverPhone: String
  val babySeat: Boolean
  val smoking: Boolean
  var carStatus: String

  val taxi = context.actorOf(Props(classOf[Car], self, 0 milliseconds, 50 milliseconds), s"scheduler-for-${self.path.name}")

  override def preStart() = {
    case FreeCar =>
  }

  def receive = {

  }

}