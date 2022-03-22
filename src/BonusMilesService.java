public class BonusMilesService {
    public int calculate(int ticketPrice, int bonusAmount) {

        int mile = (ticketPrice >= bonusAmount) ? 1 : 0;
        int bonusMile = ticketPrice / bonusAmount * mile;
        return bonusMile;
    }
}
