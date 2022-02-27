private var board = Board(n:0)
private val player1 = "X"
private val player2 = "O"
private var currentPlayer = ""



fun main () {
    println("Please enter size of your board: ")
    val scanner = Scanner(System.`in`)
    val size = Integer.parseInt(scanner.nectLine())

    board = Board(size)
    board.printBoard()
    board.placePiece(x:0,y:0m move:"X" )
}

fun taketurns() {
    currentPlayer = if (player1 == currentPlayer) {
        player2
    }else {
        player1
    }
}