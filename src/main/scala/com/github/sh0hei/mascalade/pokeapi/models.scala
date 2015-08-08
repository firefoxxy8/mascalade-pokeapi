package com.github.sh0hei.mascalade.pokeapi

case class Pokedex(name: String, resourceUri: String)

case class Game(id: Long, name: String, releaseYear: Int, generation: Int)

case class Sprite(id: Long, name: String, image: String, pokemon: Pokemon)

case class Pokemon(name: String)

case class Ability(id: Long, name: String, description: String)

case class Move(id: Long, name: String, description: String, power: Int, accuracy: Int, category: String, pp: Int)

case class Type(id: Long, name: String)