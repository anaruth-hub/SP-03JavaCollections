package level01C;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class CountryCapitalGameMain {
    private static final String COUNTRIES_FILE = "countries.txt";
    private static final  String SCORES_FILE = "classificacio.txt";
    private static final  int QUESTIONS = 10;

    public static void main(String[] args) {
        CountryCapitalGame game = new CountryCapitalGame(QUESTIONS);
        game.loadCountries(COUNTRIES_FILE);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, enter your name: ");
        String name = scanner.nextLine().trim();

        int score = game.play(scanner);

        System.out.println("Player: " + name);
        System.out.println("Score: " + "/" + QUESTIONS);

        saveScore(name, score);

        scanner.close();


    }

    private static void saveScore(String name, int score) {
        Path file = Paths.get(SCORES_FILE);

        try {
            if (!Files.exists(file)) {
                Files.createFile(file);

            }

            try (BufferedWriter writer = new BufferedWriter(new FileWriter(file.toFile(), true))) {
                writer.write(name + " - " + score + "/" + QUESTIONS);
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error writing score file: " + SCORES_FILE);

            }
        }
    }

