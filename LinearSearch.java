import java.util.Scanner;
class LinearSearch{
	public static void main (String[]args){
	int i,j,cari;
 	int array[]={9,2,3,5,8,2,4,7,1,3}, indeks[]=new int[10];
	Scanner scan=new Scanner (System.in);
	for (i=0;i<10;i++){
		System.out.print(array[i]+" ");}
	System.out.print("\nMasukan bilangan yang dicari : ");
	cari=scan.nextInt();
	j=0;
	for (i=0;i<10;i++){
		if (array[i]==cari){
		 indeks[j]=i;
		 j++;
		 }
	 }

System.out.println ("Jumlah Data Yang Dicari Pada Array: "+j);
	if (j>0){
	System.out.print ("data ditemukan di indeks ke : ");
	for (i=0;i<j;i++)
	System.out.print (indeks[i]+" ");
	}
	else
	 System.out.print ("Data tidak ditemukan pada array");
	}
	}
	