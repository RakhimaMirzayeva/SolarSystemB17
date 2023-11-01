package SolarSystem;

public class main {
    public static  void main(String[] args) {


        solarSystemBasics solarSys = new solarSystemBasics();
        solarSys.Sun = "1";
        solarSys.Moon = "2";
        solarSys.Planets = "2";
        solarSys.Stars = "10";

        //        **Feature Sun**
        FeatureSun Sun=new FeatureSun();
        Sun.name="panther";
        Sun.color="black";
        Sun.temp="-1223124kelvin";
    }
}