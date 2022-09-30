package com.company;
    //пункт 1
public enum VrGodaName {
    WINTER(-15, " Очень холодное время года" ),
    SPRING(+10," Теплое время года"),
    SUMMER(+25, " Жаркое время года"),
    AUTUMN(+5, " Холодное время года");

    private int SrTemp;     //пункт 4,2
    private String Info;
    VrGodaName (int SrTemp, String Info){
        this.SrTemp = SrTemp;
        this.Info = Info;
    }
    public int getSrTemp(){     //пункт 4
        return SrTemp;
    }
    public String getInfo(){    //пункт 2
        return Info;
    }
    public void SwitcH(){   // пункт 3
            VrGodaName season = VrGodaName.SUMMER;
            switch (season){
                case WINTER:
                    System.out.println("Я люблю зиму");
                    break;
                case SPRING:
                    System.out.println("Я люблю весну");
                    break;
                case SUMMER :
                    System.out.println("Я люблю лето");
                    break;
                case AUTUMN:
                    System.out.println("Я люблю осень");
                    break;
            }
    }
     void getDescription (String a){     // пункт 6.1
            a = "Холодное время года";
            return;
    }
    public static void cicle () {    //пункт 7

            String[] b = new String[5];
            b[1] = String.valueOf(VrGodaName.WINTER);
            b[2] = String.valueOf(VrGodaName.SPRING);
            b[3] = String.valueOf(VrGodaName.SUMMER);
            b[4] = String.valueOf(VrGodaName.AUTUMN);

            int i;
            for (i = 0; i <= 4; i++)
                System.out.println(b[i]);
    }
}
