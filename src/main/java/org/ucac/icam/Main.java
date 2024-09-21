package org.ucac.icam;

public class Main {
    public static void main(String[] args) {
        System.out.println("*******************************************");
        dessinerUCACICAM();
        System.out.println("***********HELLLO JJENKINS***************");

    }

    public static void dessinerUCACICAM() {
        String[] pattern = {
                "U   U  CCCCC   AAAAA   CCCCC      III  CCCCC   AAAAA  M   M",
                "U   U  C       A   A   C           I   C       A   A  MM MM",
                "U   U  C       AAAAA   C    ---    I   C       AAAAA  M M M",
                "U   U  C       A   A   C           I   C       A   A  M   M",
                " UUU   CCCCC   A   A   CCCCC      III  CCCCC   A   A  M   M"
        };

        for (String ligne : pattern) {
            System.out.println(ligne);
        }
    }

}
