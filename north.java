import java.util.Scanner;
public class north {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int numOfDir = in.nextInt();
		String cardinal = " ";
		double degrees = 0.0;
		cardinal = in.nextLine();
		String[] result= new String[numOfDir];
		for (int i = 0; i<numOfDir; i++) {
			cardinal = in.nextLine();
			switch(cardinal) {
			  case "N":
			    degrees = 0.0;
			    break;
			  case "E":
			    degrees = 90;
			    break;
			  case "S":
			    degrees = 180;
			    break;
			  case "W":
			    degrees = 270;
			    break;
			  case "NE":
			    degrees = 45;
			    break;
			  case "SE":
			    degrees = 135;
			    break;
			  case "SW":
			    degrees = 225;
			    break;
			  case "NW":
			    degrees = 315;
			    break;
			  case "NNE":
			    degrees = 22.5;
			    break;
			  case "ENE":
			    degrees = 67.5;
			    break;
			  case "ESE":
			    degrees = 112.5;
			    break;
			  case "SSE":
			    degrees = 157.5;
			    break;
			  case "SSW":
			    degrees = 202.5;
			    break;
			  case "WSW":
			    degrees = 247.5;
			    break;
			  case "WNW":
			    degrees = 292.5;
			    break;
			  case "NNW":
			    degrees = 337.5;
			    break;
			  
			}
			result[i]=cardinal + " is " + degrees + " degrees";
		}
		
		for(int i=0;i<numOfDir;i++)
			System.out.println(result[i]);
	}

}
