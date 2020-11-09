package be.technifutur.java2020.labo1GS;

public class UserTest implements User{
    private String[] tabChar = {"1","stage1","2017-12-05T11:30:30","2019-10-05T12:00:00",
            "1","stage2","2020-01-09T08:30:00","2020-07-05T15:30:00",
            "2","4","stage1","java1","2017-12-06T08:30:00","120",
            "4","stage1","sql1","2017-12-06T11:00:00","120",
            "4","stage1","sql3","2017-12-09T08:30:00","120",
            "4","stage1","html1","2017-12-07T08:30:00","120",
            "4","stage1","java2","2017-12-07T11:00:00","120",
            "4","stage1","sql2","2017-12-08T08:30:00","180",
            "6","stage1","Ilir","Beqiri","ilir@gmail.com","SrgAth",
            "6","stage1","Ab","sang","x","x",
            "6","stage1","Al","Ias","x","Nom",
            "7","8","stage1","6","stage1","7","9"};
    private int indCourant = -1;

    @Override
    public String getString() {
             this.indCourant++;
        System.out.println(tabChar[indCourant]);
        return tabChar[indCourant];
    }
}
