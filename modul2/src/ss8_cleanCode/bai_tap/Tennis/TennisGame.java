package ss8_cleanCode.bai_tap.Tennis;

public class TennisGame {
    public static final int ADVANTAGE_1 = 1;
    public static final int ADVANTAGE_2 = -1;
    public static final int WIN_1 = 2;

    public static String getScore(String player1Name, String player2Name, int firstScore, int secondScore) {
        String score = "";
        int tempScore=0;
        if (firstScore==secondScore)
        {
            switch (firstScore)
            {
                case 0:
                    score = "Love-All";
                    break;
                case 1:
                    score = "Fifteen-All";
                    break;
                case 2:
                    score = "Thirty-All";
                    break;
                case 3:
                    score = "Forty-All";
                    break;
                default:
                    score = "Deuce";
                    break;

            }
        }
        else if (firstScore>=4 || secondScore>=4)
        {
            int minusResult = firstScore-secondScore;
            if (minusResult== ADVANTAGE_1) score ="Advantage player1";
            else if (minusResult == ADVANTAGE_2) score ="Advantage player2";
            else if (minusResult>= WIN_1) score = "Win for player1";
            else score ="Win for player2";
        }
        else
        {
            for (int i=1; i<3; i++)
            {
                if (i==1) tempScore = firstScore;
                else { score+="-"; tempScore = secondScore;}
                switch(tempScore)
                {
                    case 0:
                        score+="Love";
                        break;
                    case 1:
                        score+="Fifteen";
                        break;
                    case 2:
                        score+="Thirty";
                        break;
                    case 3:
                        score+="Forty";
                        break;
                }
            }
        }
        return score;
    }
}