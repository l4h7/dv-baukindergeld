import java.util.Scanner;

public class KFW {
    public static void main(String[] args) {
        String[] fragen = new String[8];
        String[][] antworten = new String[8][3];
        int[] richtigeAntworten = new int[8];

        fragen[0] = "Ist Ihr neues Zuhause zum Stichtag die einzige Wohnimmobilie im Eigentum eines Haushaltsmitgliedes?";
        richtigeAntworten[0] = 0;
        antworten[0][0] = "Ja.";
        antworten[0][1] = "Nein, mir und/oder einem Haushaltsmitglied gehören weitere Wohnimmobilien.";

        fragen[1] = "Haben Sie die Immobilie von Ihren Eltern, Großeltern, Urgroßeltern oder Kindern gekauft?";
        richtigeAntworten[1] = 1;
        antworten[1][0] = "Ja.";
        antworten[1][1] = "Nein.";

        fragen[2] = "Gehört Ihr neues Zuhause Ihnen selbst (auch gemeinsam mit einem Haushaltsmitglied)?";
        richtigeAntworten[2] = 0;
        antworten[2][0] = "Ja, mir gehören 50% oder mehr.";
        antworten[2][1] = "Ja, mir gehören 50% oder weniger.";
        antworten[2][2] = "Nein.";

        fragen[3] = "Befindet sich Ihr neues Zuhause in Deutschland?";
        richtigeAntworten[3] = 0;
        antworten[3][0] = "Ja.";
        antworten[3][1] = "Nein.";

        fragen[4] = "Wann haben Sie den Kaufvertrag unterschrieben oder die Baugenehmigung erhalten?";
        richtigeAntworten[4] = 0;
        antworten[4][0] = "Zwischen dem 01.01.2018 und dem 31.12.2020.";
        antworten[4][1] = "Bis zum 31.12.2017.";

        fragen[5] = "Leben in Ihrem Haushalt Kinder unter 18 Jahren, für die Sie oder Ihr Partner Kindergeld erhalten?";
        richtigeAntworten[5] = 0;
        antworten[5][0] = "Ja.";
        antworten[5][1] = "Nein.";

        fragen[6] = "Beträgt Ihr Haushaltseinkommen maximal 90.000 Euro pro Jahr bei einem Kind plus 15.000 Euro für jedes weitere Kind?";
        richtigeAntworten[6] = 0;
        antworten[6][0] = "Ja.";
        antworten[6][1] = "Nein, mehr.";

        fragen[7] = "Sind Sie schon in Ihr neues Zuhause eingezogen?";
        richtigeAntworten[7] = 0;
        antworten[7][0] = "Ja, in den letzten 6 Monaten.";
        antworten[7][1] = "Ja, vor mehr als 6 Monaten.";
        antworten[7][2] = "Nein.";

        if(askQuestions(fragen,antworten,richtigeAntworten)  ){
            System.out.println("Sie bekommen Baukindergeld.");
        }
        else{
            System.out.println("Sie haben keinen Anspruch auf Baukindergeld.");
        }
    }


    public static boolean askQuestions(String[] fragen, String[][] antworten, int[] richtigeAntworten) {
        Scanner sc = new Scanner(System.in);

        int[] gegebeneAntworten = new int[8];

        for (int i = 0; i < fragen.length; i++) {
            System.out.println(fragen[i]);
            for (int j = 0; j < antworten[i].length; j++) {
                if (antworten[i][j] != null) {
                    System.out.println(j + ": " + antworten[i][j]);
                }
            }
            gegebeneAntworten[i] = sc.nextInt();
            if(gegebeneAntworten[i] != richtigeAntworten[i])
                return false;
        }
        return true;
    }
}
