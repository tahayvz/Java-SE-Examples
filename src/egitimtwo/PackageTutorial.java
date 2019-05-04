package egitimtwo;
//import package'dan sonra yazýlýr
//package com.intertech.transport; diye yazarsam com dosyasý içinde intertech onun içinde transport olur.
//PackageTutorial class'ýda transport dosyasýnda olur.
//import com.intertech.transport.PackageTutorial; baþka class'da bunu import ederek bu class'a eriþirim.
//import com.intertech.transport.*; yazarsam package'daki tüm class'larý import etmiþ olurum
//import java.awt.*; import java util.*; daha da yazýlabilir bir class içinde
//ayný package içinde import gerekmez farklý package'lar import edilmeli
import egitim.TestEmployee;
public class PackageTutorial {
		
		public static void main(String[] args) {
			TestEmployee worker=new TestEmployee();

			System.out.println(worker.accesspackage);
		}
}
