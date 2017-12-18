package com.technologyconversations.learning.kata.solutions.tennisgame;

// Implement a simple tennis game
//
// Scores from zero to three points are described as 
// "love", "fifteen", "thirty", and "forty" respectively.
//
// If at least three points have been scored by each side and a player has one more point 
// than his opponent, the score of the game is "advantage" for the player in the lead.
//
// If at least three points have been scored by each player, and the scores are equal, 
// the score is "deuce".
//
// A game is won by the first player to have won at least four points in total and at least 
// two points more than the opponent.
//
public class Game {

    private Player player1;
    private Player player2;

    public Game(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public String getScore() {
        return "";
    }

    public Player getLeadPlayer() {
        return player1;
    }

}
