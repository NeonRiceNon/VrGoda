package com.company;

public enum VrGodaName {
    
    WINTER(-15, " Очень холодное время года" ),
    SPRING(+10," Теплое время года"),
    SUMMER(+25, " Жаркое время года"),
    AUTUMN(+5, " Холодное время года");

    public static VrGodaName getDescription;
    private int SrTemp;     
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


    public String getDescription(VrGodaName season) {
        if (season.getSrTemp() < 16){
            System.out.println("Холодное время года");
        }
        else{
            System.out.println("Теплое время года");
        }
         return null;
     }
   
     static VrGodaName SwitcH(){
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
         return season;
    }
    public static VrGodaName cicle () {    

            String[] b = new String[5];
            b[1] = String.valueOf(WINTER.getSrTemp() + WINTER.getInfo()  );
            b[2] = String.valueOf(SPRING.getSrTemp() + SPRING.getInfo());
            b[3] = String.valueOf(SUMMER.getSrTemp() + SUMMER.getInfo());
            b[4] = String.valueOf(AUTUMN.getSrTemp() + AUTUMN.getInfo());

            int i;
            for (i = 0; i <= 4; i++)
                System.out.println(b[i]);
            return null;
    }


}
