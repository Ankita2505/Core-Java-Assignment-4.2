package relationshipDemo;
/*
 * program to show the difference between is-a relationship and has-a relationship 
 */
class Car // Parent Class Car has some instance variable and methods
{
    private String color; 
    private int maxSpeed;
    public void carInfo()
    {
        System.out.println("Car Color= "+color + " Max Speed= " + maxSpeed);
    }
    public void setColor(String color)
    {
        this.color = color;
    }
    public void setMaxSpeed(int maxSpeed)
    {
        this.maxSpeed = maxSpeed;
    }
}
// HondaCiaz class Shows Is-A relationship with Car Class
class HondaCiaz extends Car//Child Class HondaCiaz inherits Property of Parent Class Car
{
    public void HondaCiazStartDemo()
    {
        Engine HondaCiazEngine = new Engine();// Creating object of Engine Class
        HondaCiazEngine.stop();// Call to stop() of Engine Class through object of Engine Class
    }
}
// Engine Class shows the Has-a relationship between HondaCiaz Class and Engine Class
class Engine
{
    public void start()
    {
        System.out.println(" Engine Started:");
    }
    public void stop()
    {
        System.out.println("Engine Stopped:");
    }
}
public class RelationshipDemo 
{
	public static void main(String[] args) // start of Main Class
	{
		// TODO Auto-generated method stub
		HondaCiaz myhondaCiaz = new HondaCiaz();//Creating object of Child Class HondaCiaz
		myhondaCiaz.setColor("WHITE");//Call to Method setColor() of Parent Class Car
		myhondaCiaz.setMaxSpeed(200);//Call to Method setMaxSpeed() of Parent Class Car
		myhondaCiaz.carInfo();//Call to Method carInfo() of Parent Class Car
		myhondaCiaz.HondaCiazStartDemo();//Call to Method HondaCiazStartDemo() of child Class HondaCiaz
	}// Close of Main Class
}
