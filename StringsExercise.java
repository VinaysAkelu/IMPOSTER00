public class StringsExercise {
        public static void main(String[] args){

            String str1 = "TRIAL";
            String str2 = "trial";
            String str3 = "SAMPLE";
            String str4 = "";
            String str5 = "Hello";
            String str6 = "World";

            System.out.println("The three strings are -\nString 1 - "+str1);
            System.out.println("String2 - "+str2+"\nString 3 - "+str3);

            // Equals to
            boolean isEqualsTo1 = str1.equals(str2);
            System.out.println("Is string 1 equal to string 2 = "+isEqualsTo1);
            boolean isEqualsTo2 = str1.equals(str3);
            System.out.println("Is string 1 equal to string 3 = "+isEqualsTo2);

            // Equals Ignore Case
            boolean ignoreCase1 = str1.equalsIgnoreCase(str2);
            System.out.println("Is string 1 ignore case equal to string 2 - "+ignoreCase1);
            boolean ignoreCase2 = str1.equalsIgnoreCase(str3);
            System.out.println("Is string 1 ignore case equal to string 3 - "+ignoreCase2);

            // Ends with
            boolean endsWith1 = str1.endsWith("L");
            System.out.println("Is str 1 ending with 'L' - "+endsWith1);
            boolean endsWith2 = str3.endsWith("PLE");
            System.out.println("Is str 3 ending with 'PLE' - "+endsWith2);

            // Last Index of
            int lastIndexof1 = str1.lastIndexOf("R");
            System.out.println("The last occurrence of 'R' in string 1 is - "+lastIndexof1);
            int lastIndexof2 = str3.lastIndexOf("PL");
            System.out.println("The last occurrence of 'PL' in string 3 is - "+lastIndexof2);

            // Is empty
            boolean isEmpty1 = str1.isEmpty();
            System.out.println("Is string 1 empty - "+isEmpty1);
            boolean isEmpty2 = str4.isEmpty();
            System.out.println("Is string 4 empty - "+isEmpty2);

            // Replace all
            System.out.println("Replacing 'SA' from string 3 and replacing it with 'TE' - "+str3.replaceAll("SA","TE"));
            System.out.println("Replacing 'trial' from string 2 and replacing it with 'Hello' - "+str2.replaceAll("trial","Hello"));

            // Splitting a string
            String[] str8 = str1.split("A");
            System.out.print("After splitting string 1 from char 'A' - ");
            for (int i = 0; i < str8.length ; i++) {
                System.out.print("\t "+str8[i]);
            }

            // Lower case
            String lowerCase1 = str1.toLowerCase();
            System.out.println("\nString 1 before lowercase - "+str1+"\nString 1 after lowercase - "+lowerCase1);

            // String concatenation
            String concatenateString = str5.concat(str6);
            System.out.println("String 5 - "+str5+ "\nString 6 - "+str6+ "\nAfter concatenation - "+concatenateString);

            // Array of Strings
            String[] arr1 = {"Hello", "World"};
            String str7 = "";
            for(int i = 0 ; i < arr1.length ; i++) {
                str7 = arr1[i];
                for (int j = 0; j < str7.length(); j++)
                    System.out.println(str7.charAt(j));
            }
            System.out.println("Thank you");

        }
    }
