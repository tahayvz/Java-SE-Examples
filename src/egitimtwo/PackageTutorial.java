package egitimtwo;
//import package'dan sonra yaz�l�r
//package com.intertech.transport; diye yazarsam com dosyas� i�inde intertech onun i�inde transport olur.
//PackageTutorial class'�da transport dosyas�nda olur.
//import com.intertech.transport.PackageTutorial; ba�ka class'da bunu import ederek bu class'a eri�irim.
//import com.intertech.transport.*; yazarsam package'daki t�m class'lar� import etmi� olurum
//import java.awt.*; import java util.*; daha da yaz�labilir bir class i�inde
//ayn� package i�inde import gerekmez farkl� package'lar import edilmeli
import egitim.TestEmployee;
public class PackageTutorial {
		
		public static void main(String[] args) {
			TestEmployee worker=new TestEmployee();

			System.out.println(worker.accesspackage);
		}
}
