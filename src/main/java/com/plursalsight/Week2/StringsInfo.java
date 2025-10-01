package com.plursalsight.Week2;

public class StringsInfo {
    public static void main(String[] args) {
        // Problem: What if your text needs to contain double quotes?
        // Correct way: Solution: Use the backslash () to "escape" the quotes
        // this tells Java: "Treat this as part of the text, not as code":
        String message = "He said, \"Hi!\"";
        System.out.println(message); // Output: He said, "Hi!"

        /*\n - new line (go to next line) \t - tab (indent text)
        \\  if you actually need a backslash in your text*/
        String welcome = "Big Tex says \"Howdy\"\nWelcome to Texas!";
        System.out.println(welcome);

        String password = "secret123";
        String userInput = "Secret123";

     // RIGHT WAY - checks if text is the same
        if (password.equals(userInput)) {
            System.out.println("Access granted!");
        }

     // WRONG WAY - might fail unexpectedly
        if (password == userInput) {
            // This might not work even if text is identical!
            System.out.println("outsometing here ");
        }

        String answer = "YES";
        String userAnswer = "yes";
        if (answer.equalsIgnoreCase(userAnswer)) {
            System.out.println("Proceeding..."); // This WILL run
        }
        /*What are String methods
        String methods are built-in functions that come with every String object.
        They let you examine and manipulate text without writing complex code from scratch. */
        String fullName = "Hana _  Atinaf ";
        // and it will count the white space too
        // length here is a methods tell us how many caracter are in string
        int length = fullName.length();
        System.out.println(length); // Output: 10

        String username = "   danaw    ";
        //Why useful: Cleaning up user input, preparing data for processing.
        //.trim() is remove extra space in this case on username
        username = username.trim();
        System.out.println(username); // Output: "danaw"


        //What they do: Convert all letters to uppercase or lowercase.
        String usernames= "danaw";
        usernames = usernames.toUpperCase();
        System.out.println(usernames); // Output: "DANAW"

        String state = "New Mexico";
        state = state.toLowerCase();
        System.out.println(state); // Output: "new mexico"

        String username1 = "   danaw    ";
        username1 = username1.trim().toUpperCase();
        System.out.println(username1); // Output: "DANAW"


        String discountCode = "FAIR-150FF";
        //.startsWith() / .endsWith() - Check Beginning/End
        //What they do: Check if a string starts or ends with specific text.
        //Why useful: Validating codes, categorizing data, routing logic.
        if (discountCode.startsWith("FAIR")) {
            System.out.println("FAIR discount applied!"); // This runs
        }

        if (discountCode.endsWith("-50")) {
            System.out.println("50% off!"); // This doesn't run
        }

        /*.charAt() - Get Character at Specific Position
        What it does: Returns the character at a given index (position).
        Important: Positions start at 0, not 1!*/

        String trackingCode = "USA-12981-Y-22";
        char hasShipped = trackingCode.charAt(10);
        System.out.println(hasShipped); // Output: 'Y'
        // Let's break down the positions:
        // U S A - 1 2 9 8 1 - Y - 2 2
        // 0 1 2 3 4 5 6 7 8 9 10 11 12 13

        //.indexOf() - Find Position of Text
        //What it does: Finds the first position where a substring appears. Returns -1 if not found.
        String productCode = "ACME-12213";
        int dashPosition = productCode.indexOf("-");
        System.out.println(dashPosition); // Output: 4

       // Check if something exists:
        if (productCode.indexOf("ACME") != -1) {
            System.out.println("ACME product found!");
        }

        String productCode1 = "ACME-12213";
        int dashPosition1 = productCode1.indexOf("-");

     // Extract vendor name (from start to dash)
        String vendor = productCode1.substring(0, dashPosition1);
        System.out.println(vendor); // Output: "ACME"

     // Extract product number (from after dash to end)
        String productNum = productCode1.substring(dashPosition1 + 1);
        System.out.println(productNum); // Output: "12213"

       // .split() - Split String into Pieces
        // What it does: Cuts a string into an array of smaller strings using a delimiter.
        //Note: The pipe | has special meaning, so we escape it with \\.
        String input = "Dallas|Ft. Worth|Austin";
        String[] cities = input.split("\\|");

        System.out.println(cities[0]); // Output: "Dallas"
        System.out.println(cities[1]); // Output: "Ft. Worth"
        System.out.println(cities[2]); // Output: "Austin"

        //String[] cities = input.split(Pattern.quote("|"));
        //Why useful: Parsing CSV data, processing lists, breaking down complex strings.




    }
}
