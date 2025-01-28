class Government {
    String name;
    String chiefMinister;
    String[] ministers;

    Government(String name, String chiefMinister, String[] ministers) {
        this.name = name;
        this.chiefMinister = chiefMinister;
        this.ministers = ministers;
    }

    void displayDetails() {
        System.out.println("Government: " + name);
        System.out.println("Chief Minister: " + chiefMinister);
        System.out.println("Ministers: ");
        for (String minister : ministers) {
            System.out.println("  - " + minister);
        }
    }
}

class MLA {
    String[] names;
    String[] constituencies;
    String[] parties;

    MLA(String[] names, String[] constituencies, String[] parties) {
        this.names = names;
        this.constituencies = constituencies;
        this.parties = parties;
    }

    void displayDetails() {
        System.out.println("MLAs:");
        for (int i = 0; i < names.length; i++) {
            System.out.println("  Name: " + names[i] + ", Constituency: " + constituencies[i] + ", Party: " + parties[i]);
        }
    }
}

class Scheme {
    String[] schemeNames;
    String[] objectives;
    String[] beneficiaries;

    Scheme(String[] schemeNames, String[] objectives, String[] beneficiaries) {
        this.schemeNames = schemeNames;
        this.objectives = objectives;
        this.beneficiaries = beneficiaries;
    }

    void displayDetails() {
        System.out.println("Schemes:");
        for (int i = 0; i < schemeNames.length; i++) {
            System.out.println("  Scheme: " + schemeNames[i] + ", Objective: " + objectives[i] + ", Beneficiaries: " + beneficiaries[i]);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // Government details
        String[] ministers = {"Minister A", "Minister B", "Minister C"};
        Government government = new Government("State Government", "CM Name", ministers);

        // MLA details
        String[] mlaNames = {"MLA 1", "MLA 2", "MLA 3"};
        String[] constituencies = {"Constituency 1", "Constituency 2", "Constituency 3"};
        String[] parties = {"Party 1", "Party 2", "Party 3"};
        MLA mla = new MLA(mlaNames, constituencies, parties);

        // Scheme details
        String[] schemes = {"Scheme 1", "Scheme 2", "Scheme 3"};
        String[] objectives = {"Objective 1", "Objective 2", "Objective 3"};
        String[] beneficiaries = {"Beneficiaries 1", "Beneficiaries 2", "Beneficiaries 3"};
        Scheme scheme = new Scheme(schemes, objectives, beneficiaries);

        // Display details
        government.displayDetails();
        System.out.println();
        mla.displayDetails();
        System.out.println();
        scheme.displayDetails();
    }
}
