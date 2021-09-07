class Ipl{

static String noOfTeam[]=new String[8];
public static void main(String a[]){

	noOfTeam[0] = "RCB";
	noOfTeam[1] = "RR";
	noOfTeam[2] = "KKR";
	noOfTeam[3] = "KXIP";
	noOfTeam[4] = "DC";
	noOfTeam[5] = "SRH";
	noOfTeam[6] = "MI";
	noOfTeam[7] = "CSK";
	
getNoOfTeam();
}
public static void getNoOfTeam(){

for(int i=0;i<noOfTeam.length;i++){
System.out.println(noOfTeam[i]);
}


}
}