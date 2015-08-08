package com.github.sh0hei.mascalade.pokeapi

import org.json4s.DefaultFormats
import org.json4s.native.JsonMethods

import scala.io.Source

object PokeAPI {

  val API_BASE_URL = "http://pokeapi.co/api/v1"

  def pokedexApiEndpoint(): String = s"${API_BASE_URL}/pokedex/1/"

  def gameApiEndPointGhost(): String = s"${API_BASE_URL}/game"
  def gameApiEndPoint(limit: Int): String = s"${API_BASE_URL}/game/?limit=${limit}&offset=0"

  def spriteApiEndpointGhost(): String = s"${API_BASE_URL}/sprite"
  def spriteApiEndpoint(limit: Int): String = s"${API_BASE_URL}/sprite/?limit=${limit}&offset=0"

  def abilityApiEndpointGhost(): String = s"${API_BASE_URL}/ability"
  def abilityApiEndpoint(limit: Int): String = s"${API_BASE_URL}/ability/?limit=${limit}&offset=0"

  def moveApiEndpointGhost(): String = s"${API_BASE_URL}/move"
  def moveApiEndpoint(limit: Int): String = s"${API_BASE_URL}/move/?limit=${limit}&offset=0"

  def typeApiEndpointGhost(): String = s"${API_BASE_URL}/type"
  def typeApiEndpoint(limit: Int): String = s"${API_BASE_URL}/type/?limit=${limit}&offset=0"

  def getPokedex(): List[Pokedex] = {
    implicit val formats = DefaultFormats
    val jsonResponse = Source.fromURL(pokedexApiEndpoint(), "utf-8").mkString
    val parsedJson = JsonMethods.parse(jsonResponse).map(v => v.camelizeKeys)
    val pokedex = (parsedJson \ "pokemon").extract[List[Pokedex]]
    pokedex
  }

  def getGames(): List[Game] = {
    implicit val formats = DefaultFormats
    val ghost = Source.fromURL(gameApiEndPointGhost(), "utf-8").mkString
    val totalCount = (JsonMethods.parse(ghost) \ "meta" \ "total_count").extract[Int]
    val jsonResponse = Source.fromURL(gameApiEndPoint(totalCount), "utf-8").mkString
    val parsedJson = JsonMethods.parse(jsonResponse).map(v => v.camelizeKeys)
    val games = (parsedJson \ "objects").extract[List[Game]]
    games
  }

  def getAbilities(): List[Ability] = {
    implicit val formats = DefaultFormats
    val ghost = Source.fromURL(abilityApiEndpointGhost(), "utf-8").mkString
    val totalCount = (JsonMethods.parse(ghost) \ "meta" \ "total_count").extract[Int]
    val jsonResponse = Source.fromURL(abilityApiEndpoint(totalCount), "utf-8").mkString
    val parsedJson = JsonMethods.parse(jsonResponse).map(v => v.camelizeKeys)
    val abilities = (parsedJson \ "objects").extract[List[Ability]]
    abilities
  }

  def getMoves(): List[Move] = {
    implicit val formats = DefaultFormats
    val ghost = Source.fromURL(moveApiEndpointGhost(), "utf-8").mkString
    val totalCount = (JsonMethods.parse(ghost) \ "meta" \ "total_count").extract[Int]
    val jsonResponse = Source.fromURL(moveApiEndpoint(totalCount), "utf-8").mkString
    val parsedJson = JsonMethods.parse(jsonResponse).map(v => v.camelizeKeys)
    val moves = (parsedJson \ "objects").extract[List[Move]]
    moves
  }

  def getTypes(): List[Type] = {
    implicit val formats = DefaultFormats
    val ghost = Source.fromURL(typeApiEndpointGhost(), "utf-8").mkString
    val totalCount = (JsonMethods.parse(ghost) \ "meta" \ "total_count").extract[Int]
    val jsonResponse = Source.fromURL(typeApiEndpoint(totalCount), "utf-8").mkString
    val parsedJson = JsonMethods.parse(jsonResponse).map(v => v.camelizeKeys)
    val types = (parsedJson \ "objects").extract[List[Type]]
    types
  }

  /*
  def getSprites(): List[Sprite] = {
    implicit val formats = DefaultFormats
    val ghost = Source.fromURL(spriteApiEndpointGhost(), "utf-8").mkString
    val totalCount = (JsonMethods.parse(ghost) \ "meta" \ "total_count").extract[Int]
    val jsonResponse = Source.fromURL(spriteApiEndpoint(totalCount), "utf-8").mkString
    val parsedJson = JsonMethods.parse(jsonResponse).map(v => v.camelizeKeys)
    val sprites = (parsedJson \ "objects").extract[List[Sprite]]
    sprites
  }
  */
}
