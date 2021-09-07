class Countries{
	
static String countryName[] = new String[4];
public static void main(String a[]){

countryName[0]="India";
countryName[1]="Sri Lanka";
countryName[2]="England";
countryName[3]="Japan";

getCountryName();
}

public static void getCountryName(){
System.out.println(countryName.length);
for(int i=0;i<countryName.length;i++){
	System.out.println(countryName[i]);

}

}

}