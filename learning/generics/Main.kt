fun main() {
    // Generics
    val footballPlayer = FootballPlayer("Football player 1")
    val footballPlayer2 = FootballPlayer("Football player 2")

    val baseballPlayer = BaseballPlayer("Baseball player 1")
    val baseballPlayer2 = BaseballPlayer("Baseball player 2")

    val footballTeam = Team<FootballPlayer>("Football team", mutableListOf(footballPlayer))
    footballTeam.addPlayers(footballPlayer2)

    val baseballTeam = Team("Baseball Team", mutableListOf(baseballPlayer))
    baseballTeam.addPlayers(baseballPlayer2)

    val gamesTeam = Team<GamesPlayer>("Games Team", mutableListOf())
}

class Team<T: Player>(val name: String, val players: MutableList<T>) {
    fun addPlayers(player: T) {
        if (players.contains(player)) {
            println("Player: ${player.name} is already in the team")
        } else {
            players.add(player)
            println("Player: ${player.name} was added in the team")
        }
    }
}

open class Player(val name: String)

class FootballPlayer(name: String): Player(name)

class BaseballPlayer(name: String): Player(name)

class GamesPlayer(name: String): Player(name)
