package org.jugsummercamp.models.people

class Human(val name: String = "John Doe") extends Creature {

  def hello() = {
    println(s"Hello I'm $name")
  }

  def say(something: String) = {
    println(s"๐ค $something")
  }
}
/**
 * Companion object
 */
object Human {
  val message = "we are the ๐, we are the ๐จโ๐ฉโ๐งโ๐ฆ"
  
  def create(something: String) = new Human(something) 
  
}