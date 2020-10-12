# Chess

We’ll focus on the following set of requirements while designing the game of chess:

1) The system should support two online players to play a game of chess.

2) All rules of international chess will be followed.

3) Each player will be randomly assigned a side, black or white.

4) Both players will play their moves one after the other. The white side plays the first move.

5) Players can’t cancel or roll back their moves.

6) The system should maintain a log of all moves by both players.

7) Each side will start with 8 pawns, 2 rooks, 2 bishops, 2 knights, 1 queen, and 1 king.

8) The game can finish either in a checkmate from one side, forfeit or stalemate (a draw), or resignation.

Use case diagram

We have two actors in our system:

Player: A registered account in the system, who will play the game. The player will play chess moves.

Admin: To ban/modify players.

Here are the top use cases for chess:

1) Player moves a piece: To make a valid move of any chess piece.
2) Resign or forfeit a game: A player resigns from/forfeits the game.
3) Register new account/Cancel membership: To add a new member or cancel an existing member.
4) Update game log: To add a move to the game log.
