package FlyWeight.Chess;

import FlyWeight.Chess.Colour;

public class UserExtrinsicState {
    private Colour colour;
    private int currentGameStreak;
    private UserIntrinsicState user;

    public UserIntrinsicState getUser() {
        return user;
    }

    public Colour getColour() {
        return colour;
    }

    public void setColour(Colour colour) {
        this.colour = colour;
    }

    public int getCurrentGameStreak() {
        return currentGameStreak;
    }

    public void setCurrentGameStreak(int currentGameStreak) {
        this.currentGameStreak = currentGameStreak;
    }

    public UserExtrinsicState(Colour colour, int currentGameStreak,UserIntrinsicState user) {
        this.colour = colour;
        this.currentGameStreak = currentGameStreak;
        this.user = user;
    }
}
