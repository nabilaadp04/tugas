import java.util.Scanner;
public class tugas2{
public static void main(String[]args){
Scanner id=new Scanner(System.in);

String nim;


	
	System.out.print("Masukkan NIM : ");
	nim=id.nextLine();

	switch(nim){

	case "A121" :
	System.out.println("Nama	: Wahyu");
	System.out.println("NIM	: A121");
	
	break;
	
	case "A122" :
	System.out.println("Nama	: Ari");
	System.out.println("NIM	: A122");
	
	break;

	case "A123" :
	System.out.println("Nama	: Tyas");
	System.out.println("NIM	: A123");
	
	break;

	case "A124" :
	System.out.println("Nama	: Fadhil");
	System.out.println("NIM	: A124");
	
	break;

	case "A125" :
	System.out.println("Nama	: Dede");
	System.out.println("NIM	: A125");
	
	break;

	case "A126" :
	System.out.println("Nama	: Kiky");
	System.out.println("NIM	: A126");
	
	break;

	default:
	System.out.println("Data yang dimasukkan SALAH");
	break;

//close switch

}

}
}