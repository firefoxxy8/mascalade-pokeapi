# mascalade-pokeapi
[Pokéapi](http://pokeapi.co/) Scala wrapper library.

## Usage

#### Get Pokedex

```Scala
val pokedex = PokeAPI.getPokedex
```
```Scala
List(
  Pokedex(rattata,api/v1/pokemon/19/),
  Pokedex(charmander,api/v1/pokemon/4/),
  Pokedex(charmeleon,api/v1/pokemon/5/)
)
```

#### Get Game

```Scala
val games = PokeAPI.getGames
```
```Scala
List(
  Game(1,Red(jpn),1996,1),
  Game(2,Green(jpn),1996,1),
  Game(3,Blue(jpn),1996,1)
)
```

#### Get Ability

```Scala
val abilities = PokeAPI.getAbilities
```
```Scala
List(
  Ability(1,Stench,),
  Ability(2,Drizzle,),
  Ability(3,Speed-boost,)
)
```

#### Get Move

```Scala
val moves = PokeAPI.getMoves
```
```Scala
List(
  Move(5,Mega-punch,Inflicts regular damage.,80,85,,20),
  Move(6,Pay-day,Inflicts regular damage.  After the battle ends, the winner receives five times the user's level in extra money for each time this move was used.,40,100,,20),
  Move(8,Ice-punch,Inflicts regular damage.  Has a 10% chance to freeze the target.,75,100,,15)
)
```

## License

```
Copyright (c) 2015 sh0hei
Released under the MIT license
http://opensource.org/licenses/mit-license.php
```
