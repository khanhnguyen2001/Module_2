package _8_CleanCode_and_Refactoring.EXC_1_Refactoring;

//public class TennisGame {
//
//    public static String getScore(String player1Name, String player2Name, int m_score1, int m_score2) {
//        String score = "";
//        int tempScore=0;
//        if (m_score1==m_score2)
//        {
//            switch (m_score1)
//            {
//                case 0:
//                    score = "Love-All";
//                    break;
//                case 1:
//                    score = "Fifteen-All";
//                    break;
//                case 2:
//                    score = "Thirty-All";
//                    break;
//                case 3:
//                    score = "Forty-All";
//                    break;
//                default:
//                    score = "Deuce";
//                    break;
//
//            }
//        }
//        else if (m_score1>=4 || m_score2>=4)
//        {
//            int minusResult = m_score1-m_score2;
//            if (minusResult==1) score ="Advantage player1";
//            else if (minusResult ==-1) score ="Advantage player2";
//            else if (minusResult>=2) score = "Win for player1";
//            else score ="Win for player2";
//        }
//        else
//        {
//            for (int i=1; i<3; i++)
//            {
//                if (i==1) tempScore = m_score1;
//                else { score+="-"; tempScore = m_score2;}
//                switch(tempScore)
//                {
//                    case 0:
//                        score+="Love";
//                        break;
//                    case 1:
//                        score+="Fifteen";
//                        break;
//                    case 2:
//                        score+="Thirty";
//                        break;
//                    case 3:
//                        score+="Forty";
//                        break;
//                }
//            }
//        }
//        return score;
//    }
//}

public class TennisGame {

    public static final int LOVE = 0;
    public static final int FIFTEEN = 1;
    public static final int THIRTY = 2;
    public static final int FORTY = 3;

    public static String getScore(String player1Name, String player2Name, int scorePlayer1, int scorePlayer2) {
        String score = "";

        if (scorePlayer1 == scorePlayer2) {
            score = getEqualScore(scorePlayer1);
        } else if (scorePlayer1 >= 4 || scorePlayer2 >= 4) {
            score = getAdvantageOrWinScore(scorePlayer1, scorePlayer2);
        } else {
            score = getNormalScore(scorePlayer1, scorePlayer2);
        }

        return score;
    }

    private static String getEqualScore(int score) {
        switch (score) {
            case LOVE:
                return "Love-All";
            case FIFTEEN:
                return "Fifteen-All";
            case THIRTY:
                return "Thirty-All";
            case FORTY:
                return "Forty-All";
            default:
                return "Deuce";
        }
    }

    private static String getAdvantageOrWinScore(int scorePlayer1, int scorePlayer2) {
        int scoreDifference = scorePlayer1 - scorePlayer2;

        if (scoreDifference == 1)
            return "Advantage player1";
        else if (scoreDifference == -1)
            return "Advantage player2";
        else if (scoreDifference >= 2)
            return "Win for player1";
        else
            return "Win for player2";
    }

    private static String getNormalScore(int scorePlayer1, int scorePlayer2) {
        StringBuilder score = new StringBuilder();

        for (int i = 1; i < 3; i++) {
            int currentScore = (i == 1) ? scorePlayer1 : scorePlayer2;
            switch (currentScore) {
                case LOVE:
                    score.append("Love");
                    break;
                case FIFTEEN:
                    score.append("Fifteen");
                    break;
                case THIRTY:
                    score.append("Thirty");
                    break;
                case FORTY:
                    score.append("Forty");
                    break;
            }
            if (i == 1) {
                score.append("-");
            }
        }

        return score.toString();
    }
}

