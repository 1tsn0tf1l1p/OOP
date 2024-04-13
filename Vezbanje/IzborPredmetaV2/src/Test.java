public class Test {
    public static void main(String[] args) {

        Predmet obicanPredmet1 = new Predmet("Matematika", 3, OznakaPlana.RN, 8);
        Predmet obicanPredmet2 = new Predmet("Programiranje", 1, OznakaPlana.RN, 8);
        Predmet obicanPredmet3 = new Predmet("Engleski", 6, OznakaPlana.S, 3);

        IzborniPredmet izborniPredmet1 = new IzborniPredmet("ASP", 4, OznakaPlana.RN, 6);
        IzborniPredmet izborniPredmet2 = new IzborniPredmet("Kvanto Racunarstvo", 2, OznakaPlana.RI, 6);
        IzborniPredmet izborniPredmet3 = new IzborniPredmet("Mobilne aplikacije", 1, OznakaPlana.S, 6);
        IzborniPredmet izborniPredmet4 = new IzborniPredmet("Web programiranje", 8, OznakaPlana.RN, 6);
        IzborniPredmet izborniPredmet5 = new IzborniPredmet("Algebra", 7, OznakaPlana.RN, 6);

        izborniPredmet1.dodajPreduslov(obicanPredmet1);
        izborniPredmet1.dodajPreduslov(obicanPredmet2);
        izborniPredmet2.dodajPreduslov(obicanPredmet3);
        izborniPredmet3.dodajPreduslov(obicanPredmet3);
        izborniPredmet3.dodajPreduslov(obicanPredmet1);
        izborniPredmet4.dodajPreduslov(obicanPredmet1);
        izborniPredmet5.dodajPreduslov(obicanPredmet1);
        izborniPredmet5.dodajPreduslov(obicanPredmet2);
        izborniPredmet5.dodajPreduslov(obicanPredmet3);


        IzbornaGrupa izbornaGrupa1 = new IzbornaGrupa();
        IzbornaGrupa izbornaGrupa2 = new IzbornaGrupa();

        Student s1 = new Student(OznakaPlana.RN, 45620, 2020);
        Student s2 = new Student(OznakaPlana.S, 1223, 2023);

        s1.getUpisaneGodine().add(2020);
        s1.getUpisaneGodine().add(2021);
        s1.getUpisaneGodine().add(2022);
        s1.getUpisaneGodine().add(2023);
        s1.getUpisaneGodine().add(2024);

        s2.getUpisaneGodine().add(2024);

        s1.getPolozeniPredmeti().add(izborniPredmet1);
        s1.getPolozeniPredmeti().add(izborniPredmet2);
        s1.getPolozeniPredmeti().add(izborniPredmet3);
        s2.getPolozeniPredmeti().add(izborniPredmet3);
        s2.getPolozeniPredmeti().add(izborniPredmet4);
        s2.getPolozeniPredmeti().add(izborniPredmet5);

        SviIzboriStudenata sviIzboriStudenata = new SviIzboriStudenata();

        sviIzboriStudenata.dodajStudenta(s1, izbornaGrupa1);
        sviIzboriStudenata.dodajStudenta(s2, izbornaGrupa2);

        sviIzboriStudenata.ispisiUFajl();

    }
}
