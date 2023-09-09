import java.util.Scanner;

class PetStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Petstore v1.0\n");

        // Pet selection
        System.out.print("Select Pet (Dog, Cat, Fish, Bird): ");
        String pet = scanner.nextLine();

        // Breed selection
        String[] breeds;
        switch (pet.toLowerCase()) {
            case "dog":
                breeds = new String[]{"Bulldog", "Poodle", "Golden Retriever", "Labrador"};
                break;
            case "cat":
                breeds = new String[]{"Manx", "Persian"};
                break;
            case "fish":
                breeds = new String[]{"Angel Fish", "Tiger Shark", "Koi", "Goldfish"};
                break;
            case "bird":
                breeds = new String[]{"Amazon Parrot", "Finch"};
                break;
            default:
                System.out.println("Invalid pet selection.");
                return;
        }

        System.out.println("Select Breed (" + String.join(", ", breeds) + "): ");
        String breed = scanner.nextLine();

        // Print header
        System.out.println("Item ID\tProduct ID\tDescription\tList Price");

        // Print items based on pet and breed (simplified)
        switch (pet.toLowerCase()) {
            case "dog":
                printDogItems(breed);
                break;
            case "cat":
                printCatItems(breed);
                break;
            case "fish":
                printFishItems(breed);
                break;
            case "bird":
                printBirdItems(breed);
                break;
        }

        scanner.close();
    }

    // Define functions to print items for each pet and breed combination (simplified)
    private static void printDogItems(String breed) {
        switch (breed.toLowerCase()) {
            case "bulldog":
                System.out.println("EST-6\t K9-BD-01\t Adult Male Bulldog\t$120.50");
                System.out.println("EST-7\t K9-BD-01\tAdult Female Bulldog\t$130.49");
                break;
            case "poodle":
                System.out.println("EST-8\tK9-PO-02\tAdult Male Puppy Poodle\t$110");
                System.out.println("EST-9\tK9-PO-02\tAdult Female Puppy Poodle\t$115.50");
                break;
            case "golden retriever":
                System.out.println("EST-10\tK9-RT-01\tAdult Male Golden Retriever\t$135.50");
                System.out.println("EST-11\tK9-RT-01\tAdult Female Golden Retriever\t$145.49");
                break;              
            case "labrador":
                System.out.println("EST-22\tK9-RT-02\tAdult Male Labrador Retriever\t$135.50");
                System.out.println("EST-23\tK9-RT-02\tAdult Female Labrador Retriever\t$145.49");
                break;
            // Add cases for other breeds
            default:
                System.out.println("Invalid breed selection for dogs.");
                break;
        }
    }

    private static void printCatItems(String breed) {
        switch (breed.toLowerCase()) {
            case "manx":
                System.out.println("EST-14\tFL-DSH-01\tTailless Manx\t$58.50");
                System.out.println("EST-15\tFL-DSH-01\tWith tail Manx\t$23.50");
                break;
            case "persian":
                System.out.println("EST-16\tFL-DLH-02\tAdult Male Persian\t$58.50");
                System.out.println("EST-17\tFL-DLH-02\tAdult Female Manx\t$23.50");
                break;
            // Add cases for other breeds
            default:
                System.out.println("Invalid breed selection for cats.");
                break;
        }
    }

    private static void printFishItems(String breed) {
        switch (breed.toLowerCase()) {
            case "angel fish":
                System.out.println("EST-1\tFI-SW-01\tLarge Angelfish\t$18.50");
                System.out.println("EST-2\tFI-SW-01\tSmall Angelfish\t$13.50");
                break;
            case "tiger shark":
                System.out.println("EST-3\tFI-SW-02\tToothless Tiger Shark\t$21");
                break;
            case "koi":
                System.out.println("EST-4\tFI-FW-01\tSpotted Koi\t$25.50");
                System.out.println("EST-5\tFI-FW-01\tSpotless Koi\t$20.50");
                break; 
            case "goldfish":
                System.out.println("EST-6\tFI-FW-02\tAdult Male Goldfish\t$18.50");
                System.out.println("EST-7\tFI-FW-02\tAdult Male Goldfish\t$18.50");
                break;
            // Add cases for other breeds
            default:
                System.out.println("Invalid breed selection for fish.");
                break;
        }
    }

    private static void printBirdItems(String breed) {
        switch (breed.toLowerCase()) {
            case "amazon parrot":
                System.out.println("EST-18\tAV-CB-01\tAdult Male Amazon Parrot\t$193.50");
                break;
            case "Finch":
                System.out.println("EST-19\tAV-SB-02\tAdult Male Finch\t$193.50");
                break;
            // Add cases for other breeds
            default:
                System.out.println("Invalid breed selection for birds.");
                break;
        }
    }
}
