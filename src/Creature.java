/**
 * Created by k1763682 on 30/10/17.
 */
public class Creature {
    int energy, happiness, fullness;
    String name;
}

public Creature()
{
     energy = 15;
     fullness = 15;
     happiness = 15;
     this.name = name;

}
public String getName()
{
   return name;
}

public void Sleep()
{
    if(energy>=12)
    {
        System.out.println("oops, " + this.getName()+ "is not sleepy");
    }
    else
        energy+=8;
    happiness-=5;
    fullness-=5;
    if (energy>15)
        energy=15;
    System.out.println("yum, "+ this.getname()+ "really enjoyed that");


}

public void Eat()
{
    if(fullness>=12)
    {
        System.out.println("oops, " + this.getName()+ "is already full");
    }
    else
    fullness+=8;
    happiness-=6;
    energy-=4;
    if (fullness>15)
        fullness=15;
    Syatem.out.println("yum, "+ this.getname()+ "really enjoyed that");
}



public void Play()
{
 happiness+=8;
 energy-=6;
 fullness-=4;
    if (happiness>15)
        happiness=15;


}
public String CheckStatus()
{
    String status= "";
    if(happiness<=6)
    {
        status+="oh "+this.getName()+"is feelig sad\n";
    }
    if(energy<=6)
    {
       status+="Hmm "+this.getName()+" is feeling tired\n";
    }
    if(fullness<=6)
    {
        status+="Oh "+this.getName()+" is feeling hungry\n";
    }


    return status;
}