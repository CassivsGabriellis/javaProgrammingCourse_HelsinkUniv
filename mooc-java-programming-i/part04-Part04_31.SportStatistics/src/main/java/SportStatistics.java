
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("File: ");
        String file = scanner.nextLine();

        ArrayList<Game> games = readGamesFromFile(file);

        System.out.print("Team: ");
        String team = scanner.nextLine();

        int gamesPlayed = getGamesPlayed(games, team);
        int wins = getWins(games, team);
        int losses = getLosses(games, team);

        System.out.println("Games: " + gamesPlayed);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
    }

    public static ArrayList<Game> readGamesFromFile(String file) {
        ArrayList<Game> games = new ArrayList<>();

        try (Scanner fileScanner = new Scanner(Paths.get(file))) {
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                String[] parts = line.split(",");
                String homeTeam = parts[0].trim();
                String visitingTeam = parts[1].trim();
                int homePoints = Integer.parseInt(parts[2].trim());
                int visitingPoints = Integer.parseInt(parts[3].trim());

                Game game = new Game(homeTeam, visitingTeam, homePoints, visitingPoints);
                games.add(game);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        return games;
    }

    public static int getGamesPlayed(ArrayList<Game> games, String team) {
        int gamesPlayed = 0;

        for (Game game : games) {
            if (game.involvesTeam(team)) {
                gamesPlayed++;
            }
        }

        return gamesPlayed;
    }

    public static int getWins(ArrayList<Game> games, String team) {
        int wins = 0;

        for (Game game : games) {
            if (game.involvesTeam(team) && game.isWinner(team)) {
                wins++;
            }
        }

        return wins;
    }

    public static int getLosses(ArrayList<Game> games, String team) {
        int losses = 0;

        for (Game game : games) {
            if (game.involvesTeam(team) && !game.isWinner(team)) {
                losses++;
            }
        }

        return losses;
    }
}
