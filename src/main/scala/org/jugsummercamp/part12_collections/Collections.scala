package org.jugsummercamp.part12_collections

object Collections extends App  {
  // one year ago π
  
  val aliments = List(
      "π"
    , "π"
    , "π"
    , "π"
    , "π"
    , "π­" // π‘ pas d'emoji oignons    
  )

  println(aliments)  // 1οΈβ£

  // === action recette ===
  def decouper(aliment: String): String = s"morceaux de $aliment"

  // === choix aliments ===
  def sansFrite(aliment: String): Boolean = aliment != "π"
  def sansOignon(aliment: String): Boolean = aliment != "π­"

  // === filtrer, puis dΓ©couper ===
  val ingredients = 
    aliments
      .filter(sansFrite)
      .filter(sansOignon)
      .map(decouper)  // List is a Functor ... even a Monad (and a container)

  println(ingredients) // 2οΈβ£

  // === assembler ==== aka reduce
  val kebab = 
    ingredients
      .fold("π₯ avec: ") { (tmp, ingredient) => tmp + ingredient + " "}

  println(kebab) // 3οΈβ£

  println(
    aliments
      .filter(sansFrite)
      .map(decouper)
      .fold("π₯ avec: ") { (tmp, ingredient) => tmp + ingredient + " "}
  ) // 4οΈβ£


} 