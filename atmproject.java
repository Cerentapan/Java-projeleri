package gittt;

public class atmproject {

	String islemsecenekleri = "Bakiye görüntüleme-->1" + "Para çekmek-->2" + "Farklı hesaba para yatırmak için-->3"+ "Çıkış için-->q";
	Scanner scanner = new Scanner(System.in);
	
	double cerenbakiye = 5000;
	String cereniban = "TR65 878 8998 88 79 06";
	String cerenkullaniciadi = "Ceren888";
	String cerensifre ="123";
	
	
	double edabakiye = 10000;
	String edaiban= "TR56 787 9889 88 97 60";
	String edakullaniciadi = "Eda888";
	String edasifre = "321";
	
	
	System.out.println("CEROCAN ATMSİNE HOŞGELDİNİZ");
	System.out.println("Bilgilerinizi girin aw bi de rica mı etcem");

	System.out.println("Kullanıcı adı:");
	String kullaniciadi = scanner.nextLine();
	
	System.out.println("Şifre:");
	String sifre = scanner.nextLine();
	
	if (kullaniciadi.equals("Ceren888") && sifre.equals("123")) {
		
		System.out.println("Ceren888 hesabına giriş yapıldı");	    System.out.println(islemsecenekleri);
	}
		
	else {
		System.out.println("Kullanıcı bilgileriniz yanlış lütfen kontrol ediniz");
	}
	System.out.println("Lütfen bir islem seciniz");
        String secim = scanner.nextLine();
	
        switch (secim) {
       case "1":
       System.out.println("Bakiyeniz : " + cerenbakiye);
	    break;
      case "2":
        	System.out.println("Çekmek istediğiniz tutarı giriniz : ");
       int cekilecektutar = scanner.nextInt();
      if (cerenbakiye>=cekilecektutar) {
	cerenbakiye -= cekilecektutar;
    	System.out.println("İşleminiz başarıyla sonuçlanmıştır");
	    System.out.println("Kalan bakiyeniz : " + cerenbakiye);
   
      }
       else {
		System.out.println("Hesabınızda talep ettiğiniz tutar bulunmamaktadır.");
	}
        
       break;
        
        case "3":
       System.out.println("Ne kadar yatırmak istiyorsunuz : ");
        int yatcaktutar = scanner.nextInt();
      
        if (yatcaktutar <=cerenbakiye); {
        
        	
      System.out.println("İban giriniz");
       scanner.nextLine();
       String yatirilacakiban = scanner.nextLine();
    
       
     	       if (yatirilacakiban.equals(edaiban)); {
       
	   
	  System.out.println("Para eda888 kişisine yatırılıyor");
	
	   cerenbakiye-=yatcaktutar;
	   System.out.println("Kalan bakiyeniz : " + cerenbakiye);
       System.out.println("İşleminiz başarıyla tamamlanmıştır şimdi sg");
     }
       
  }
      
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
