package recipe_calc_assignment;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.Scanner;
import java.util.stream.Stream;

public class RecipeCalcApp {

    /**
     * Declare global variables that can be used anywhere here. 
     */
    public static Recipe[] recipes = new Recipe[20];

    public static void main(String[] args) {
        // we are calling this method first to load data
        // do not remove this
        init();

        int selection = -1;

        // TODO: declare a boolean variable for nextPage and set it to true

        // TODO: declare an int variable for page and set it to 1

        // TODO: while nextPage is true and selection is equal to -1
        
            // TODO: a for loop to display recipe excerpts between page - 1 and page + 4

            // TODO: update page variable

            // TODO: if page is equal to 5 then nextPage is updated to false 

            // TODO: ask user to select recipe, or -1 for next page

            if (selection > 0) {
                
                Recipe selectedRecipe = recipes[selection - 1];

                // TODO: Ask user to enter servings

                // TODO: Adjust servings for the selectedRecipe

                selectedRecipe.displayRecipe(false);
            }
        
        // TODO: outside of while loop create a graceful exit for the user
    }

    /**
     * This is a method that reads a file and creates Recipe instances
     * which are stored in the recipes array. Do not delete this code.
     */
    public static void init() {
        // make sure you have a text file
        File file = new File("chapters\\src\\recipe_calc_assignment", "recipes.csv");
        if (file.exists()) {
            int lines;
            try (Stream<String> stream = Files.lines(file.toPath(), StandardCharsets.UTF_8)) {
                lines = (int) stream.count();
                stream.close();
                if (lines > 0) {
                    Scanner fileScan = new Scanner(file);
                    for (int i = 0; i < lines; i++) {
                        String[] nextLine = fileScan.nextLine().split(",");
                        recipes[i] = new Recipe();
                        recipes[i].id = Integer.parseInt(nextLine[0]);
                        recipes[i].name = nextLine[1];
                        recipes[i].ingredients = nextLine[2].replaceAll("[\\[\\]]", "").split(";");
                        String[] qty = nextLine[3].replaceAll("[\\[\\]]", "").split(";");
                        recipes[i].qty = new double[qty.length];
                        for (int j = 0; j < qty.length; j++) {
                            recipes[i].qty[j] = Double.parseDouble(qty[j]);
                        }
                        recipes[i].servings = Integer.parseInt(nextLine[4]);
                        recipes[i].method = nextLine[5].replaceAll("[\\[\\]]", "").split(";");
                    }
                    fileScan.close();
                }
            } catch (IOException e) {
                System.out.println("Err: Did not manage to load data.");
            }
        }
    }
}