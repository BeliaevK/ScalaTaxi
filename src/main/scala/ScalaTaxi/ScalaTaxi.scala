package ScalaTaxi


import akka.actor.{Actor, ActorLogging, ActorSystem}

/**
 * Created by k.beliaev on 31.03.2017.
 */
case class Order (startPoint: String, endPoint: String, needBabySeat: Boolean, needSmoking: Boolean)

object ScalaTaxi extends App with ActorLogging {

  val system = ActorSystem("scalataxi")

  def receive = {
    case Order => log.info(s"received ${loc} from ${sender.path.name}")
  }

}

class Car extends Actor {
  val carMark: String
  val carDriver: String
  val carDriverPhone: String
  val babySeat: Boolean
  val smoking: Boolean
  var carStatus: String

  def receive = {

  }

}