package tutYlesanded;

public class switchJAcase {
    public static void main(String[] args) {
        int switchValue = 4;

        switch (switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;

            case 2:
                System.out.println("Value was 2");
                break;

            case 3: case 4: case 5:
                System.out.println("Value was " + switchValue);
                break;

            default:
                System.out.println("Value was not 1 or 2");
                break; // kui on viimane rida, siis võib break ka olemata olla
        }

        String month = "JANuary";
        switch (month.toLowerCase()){
            case "january":
                System.out.println("jan");
                break;
            case "june":
                System.out.println("jun");
                break;
                default:
                    System.out.println("Not sure");
        }
    }
}
