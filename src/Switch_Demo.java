
public class Switch_Demo 
{
public static void main (String []args) {
	
	int month=9;
	String monthString;
	
	switch(month) {
	case 1:
		monthString="junary";
		break;
	case 2:
		monthString="fabruary";
		break;
	case 3:
		monthString="march";
		break;
	case 4:
		monthString="april";
		break;		
	case 5:
		monthString="may";
		break;
	case 6:
		monthString="june";
		break;
	case 7:
		monthString="july";
		break;
	case 8:
		monthString="agust";
		break;
	case 9:
		monthString="september";
		break;
	case 10:
		monthString="october";
		break;
	case 11:
		monthString="novmber";
		break;
	case 12:
		monthString="december";
		break;
		
		 default:
			 monthString="InValid Month";
		 break;
		 
	}
	System.out.println(monthString);
		
	}
}

