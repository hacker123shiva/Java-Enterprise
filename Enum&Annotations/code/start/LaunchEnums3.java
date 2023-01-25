
enum Gender
{
	MALE, FEMALE, OTHERS;
	
	//final static Gender MALE=new Gender();
}


public class LaunchEnums3 {

	public static void main(String[] args)
	{
		Gender g=Gender.MALE;
		System.out.println(g);

		
		Gender[] gr=Gender.FEMALE.values(); //values() is a static method of enum
		
		for(Gender gg:gr)
		{
			System.out.println(gg + " " + gg.ordinal()); //ordinal() is a method of enum which gives the index of the enum 
		}
		
	}

}
