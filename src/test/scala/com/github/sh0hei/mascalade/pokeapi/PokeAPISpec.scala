package com.github.sh0hei.mascalade.pokeapi

import org.specs2.mutable.Specification

class PokeAPISpec extends Specification{

  "mascalade-pokeapi" should {

    "calls Pokedex API" in {
      val pokedex = PokeAPI.getPokedex
      println(pokedex.take(3))
      pokedex.size must be_>(0)
    }

    "calls Games API" in {
      val games = PokeAPI.getGames
      println(games.take(3))
      games.size must be_>(0)
    }

    "calls Abilities API" in {
      val abilities = PokeAPI.getAbilities
      println(abilities.take(3))
      abilities.size must be_>(0)
    }

    "calls Moves API" in {
      val moves = PokeAPI.getMoves
      println(moves.take(3))
      moves.size must be_>(0)
    }

    "calls Types API" in {
      val types = PokeAPI.getTypes
      println(types.take(3))
      types.size must be_>(0)
    }

    /*
    "calls Sprites API" in {
      val sprites = PokeAPI.getSprites
      println(sprites.take(3))
      sprites.size must be_>(0)
    }
    */
  }
}
