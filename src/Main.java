public class Main {
    public static void main(String[] args) {

        System.out.println("The midterm exam is due by 6am next Monday morning");

        String slogan1 = "I'm Lovin' it.";
        String slogan2 = "I'M lovin' IT.";
        String slogan3 = "Finger lickin' good.";
        System.out.println("Famous advertising slogans:");
        System.out.println(slogan1 + "   **   " + slogan2 + "   **   " + slogan3);

        //equalsIgnoreCase()

        if(slogan1.equalsIgnoreCase(slogan2)){
            System.out.println("These two slogans are equal");

        }//ends if slogans are equal

        else {
            System.out.println("These are not equal");
        }//ends the else
        StringBuilder sb = new StringBuilder();
        System.out.println(sb); // blank before append
        sb.append("This is lit");
        System.out.println(sb);
        sb.reverse();
        String reservedResult = sb.toString();
        System.out.println(reservedResult);
        System.out.println(sb);

    }//ends main method/driver
}//ends Main class