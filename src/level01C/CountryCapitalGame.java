package level01C;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class CountryCapitalGame {

    private final Map<String, String> countryCapitalMap = new HashMap<>();
    private final int questionsCount;

    public CountryCapitalGame(int questionsCount) {
        this.questionsCount = questionsCount;
    }


    public void loadCountries(String fileName) {
        Path filePath = Paths.get(fileName);

        if (!Files.exists(filePath)) {
            System.out.println("Error: file " + fileName + "not found");
            return;

        }

        try(BufferedReader reader = new BufferedReader(new FileReader(filePath.toFile()))) {
            String line;

            while ((line = reader.readLine()) != null)  {
                String trimmedLine = line.trim();
                if (trimmedLine.isEmpty()) {
                    continue;

                }

                String[] parts = trimmedLine.split("\\s+");
                if (parts.length != 2) {
                    continue;

                }

                String country = parts[0].trim().replace('_', ' ');
                String capital = parts[1].trim().replace('_', ' ');

                if (!country.isEmpty() && !capital.isEmpty()) {
                    countryCapitalMap.put(country, capital);


                }

            }

            System.out.println("Countries loaded: " + countryCapitalMap.size());
        } catch (IOException e) {
            System.out.println("Error reading file: " + fileName);
        }
    }

    public int play(Scanner scanner) {
    int score = 0;

        List<String> countries = new ArrayList<>(countryCapitalMap.keySet());

        if (countries.size() < questionsCount){
            System.out.println("countries are missing from the load");
            return 0;
        }

        Collections.shuffle(countries);
        List<String> selected = countries.subList(0, questionsCount);

        for (int i = 0; i < selected.size(); i++) {
            String country = selected.get(i);
            String correctCapital = countryCapitalMap.get(country);

            System.out.println("Question " + (i + 1) + ": Please tell me, what is the capital of " + country + "?");
            System.out.println("What is your answer?: ");
            String participantAnswer = scanner.nextLine().trim();

            if (participantAnswer.equalsIgnoreCase(correctCapital)) {
                score++;
                System.out.println("Correct answer!");
            } else {
                System.out.println("Incorrect answer" + correctCapital);
            }

            System.out.println();

        }

        return score;

        }
    }

