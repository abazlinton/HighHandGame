public class HighCardScorer implements IScorer {

    public int getScore(Player player){
        int score = 0;
        for(Card card : player.getHand()){
            score += card.getRank().ordinal() + 1;
        }
        return score;
    }
}
