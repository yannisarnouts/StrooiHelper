package com.example.strooihelper.model;

import com.example.strooihelper.R;

public class Detail {
    private String stap;
    private String uitleg;
    private int img;

    public Detail(String stap, String uitleg, int img) {
        this.stap=stap;
        this.uitleg = uitleg;
        this.img = img;
    }

    public String getStap() {
        return stap;
    }

    public String getUitleg() {
        return uitleg;
    }

    public int getImg() {
        return img;
    }

    @Override
    public String toString() {
        return stap;
    }
    public static Detail[] details = {
            new Detail("Stap 1","Links boven aan aanzetten", R.drawable.scherm1),
            new Detail("Stap 2","Even geduld..", R.drawable.scherm2),
            new Detail("Stap 3","Duw op onderstaande balk", R.drawable.scherm3),
            new Detail("Stap 4","Deze fout kan voorkomen (zie volgende stap)", R.drawable.scherm4),
            new Detail("Stap 5","Komt dit in beeld deze foutmelding moet weg gedaan worden door links naast wijsvinger te duwen.", R.drawable.scherm5),
            new Detail("Stap 6","Duw op onderstaande balk", R.drawable.scherm6),
            new Detail("Stap 7","U krijgt volgend scherm te zien", R.drawable.scherm7),
            new Detail("Stap 8","klik op navigatie", R.drawable.scherm8),
            new Detail("Stap 9","Even geduld..", R.drawable.scherm9),
            new Detail("Stap 10","U Krijgt dit te zien \n" +
                    "Laat de aftakkas draaien op 540 toeren", R.drawable.scherm10),
            new Detail("Stap 11","Duw op \"A-B lijn\" om een A punt weg te zetten(zorg dat de tractor en kalkstrooier 4 meter van de kant van het veld staat)", R.drawable.scherm11),
            new Detail("Stap 12","De Avlag kleurt groen dit wil zeggen dat het A punt is geplaatst. \n" +
                    "Rij vooruit", R.drawable.scherm12),
            new Detail("Stap 13","er kleurt een groene lijn achter de blauwe balk dit is de bewerkte grond in kleurt en zo een veld tekent.", R.drawable.scherm13),
            new Detail("Stap 14","klik nogmaals op \"A-B lijn\" om het B punt te plaatsen(zorg dat de tractor en kalkstrooier 4 meter van de kant van het veld staat)", R.drawable.scherm14),
            new Detail("Stap 15","Nu verschijnen er geleidslijnen of A-B lijnen \n " +
                    "Rij het perceel verder rond", R.drawable.scherm15),
            new Detail("Stap 16","Na een ronde, maak het perceel rond door op de knop te drukken onder duim", R.drawable.scherm16),
            new Detail("Stap 17","Er verschijnt een rode lijn rond het perceel", R.drawable.scherm17),
            new Detail("Stap 18","zet de kalkstrooier in automatischestand druk op knop van duim", R.drawable.scherm18),
            new Detail("Stap 19","Onderaan wordt menu auto", R.drawable.scherm19),
            new Detail("Stap 20","Rij het veld 2x rond om straks beter te kunnen omkeren \n" +
                    "Rijd vervolgens op de geleidslijnen, zodat het veld helemaal inkleurt", R.drawable.scherm20),

    };
    public static Detail[] fouten = {
            new Detail("FOUT 1", "rood omlijnt moet weg, in het gps scherm kleurt de gps balk grijs", R.drawable.fout1),
            new Detail("FOUT 2", "krijgt u dit te zien met piepsignaal  vul dan de strooier", R.drawable.fout2),
            new Detail("FOUT 3", "rij richting gps \n" +
                    "rijdt u vooruit is de pijl geel en wijst hij naar de balk of en  kleurt hij het veld verkeerd in.", R.drawable.fout3)
    };
    public static Detail[] fout1 = {
            new Detail("OPLOSSING", "Druk op groen omcirkelt", R.drawable.oplossing1_1),
            new Detail("RESULTAAT", "krijgt u dit te zien met piepsignaal vul dan de strooier", R.drawable.oplossing1_2)
    };
    public static Detail[] fout2 = {
            new Detail("STAP 1", "druk op het groene pijltje terug", R.drawable.fout2),
            new Detail("STAP 2", "deze moet gevuld worden", R.drawable.oplossing2_1),
            new Detail("STAP 3", "druk op cirkel", R.drawable.oplossing2_2),
            new Detail("STAP 4", "druk op added in het kg vakje", R.drawable.oplossing2_3),
            new Detail("STAP 5", "het vak wordt arceerd druk nog eens op het vak", R.drawable.oplossing2_4),
            new Detail("STAP 6", "vul de geladen kg in\n" +
                    "druk de kg in en vervolgens op de groene v", R.drawable.oplossing2_5),
            new Detail("STAP 7", "de kg zijn aangepast druk op terug", R.drawable.oplossing2_6),
            new Detail("STAP 7.1", "OF \n" +
                    "druk op max hier mee vult U de strooier voller dan hij kan", R.drawable.oplossing2_61),
            new Detail("STAP 8", "de strooier is gevuld", R.drawable.oplossing2_7),
            new Detail("STAP 9", "druk op terug U kunt verder strooien kijk manueel na of er nog product in de strooier is.", R.drawable.oplossing2_8),
            new Detail("RESULTAAT", "", R.drawable.oplossing2_9)
    };
    public static Detail[] fout3 = {
            new Detail("STAP 1", "Druk dan op de knop in de cirkel", R.drawable.oplossing3_1),
            new Detail("RESULTAAT", "als u vooruit rijdt moet de pijl grijs zijn terug", R.drawable.oplossing3_2)
    };
    public static Detail[] dosering = {
            new Detail("STAP 1", "druk op tand wiel voor de kg aanpassen boven in rechthoek is de gewenste strooi hoeveelheid.", R.drawable.dosering1),
            new Detail("STAP 2", "dubbelklik op target rt in het vakje kg/ha", R.drawable.dosering2),
            new Detail("STAP 3", "pas kg aan de gewenste hoeveelheid kg druk vervolgens op groene v", R.drawable.dosering3),
            new Detail("STAP 4", "de gewenst kg verschijnen druk op terug", R.drawable.dosering4),
            new Detail("STAP 5", "hier staan ook altijd de kg die u de stroorier wil laten strooien", R.drawable.dosering5)
    };
    public static Detail[] beindigen = {
            new Detail("STAP 1", "U hebt het veld volledig gestrooid of op het scherm ingekleurd", R.drawable.eind1),
            new Detail("STAP 2", "druk bovenaan op de terug toets", R.drawable.eind2),
            new Detail("STAP 3", "druk op Ja", R.drawable.eind3),
            new Detail("STAP 4", "Druk op geheugen", R.drawable.eind4),
            new Detail("STAP 5", "komt u  op dit scherm dan wissen boven aan zie pijl.", R.drawable.eind5),
            new Detail("STAP 6", "druk op Ja", R.drawable.eind6),
            new Detail("STAP 7", "druk boven aan op terug", R.drawable.eind7),
            new Detail("STAP 8", "rij naar een nieuw perceel en druk dan op navigatie.", R.drawable.eind8),
    };
    public static Detail[] meststoffen = {
            new Detail("STAP 1", "Test voor meststoffen", R.drawable.eind1),
    };
}
