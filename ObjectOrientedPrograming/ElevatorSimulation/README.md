# �dev - Asans�r Sim�lasyonu

A�a��daki problem ifadesine g�re bir s�n�f diyagram� tasarlay�n.

Nesne Y�nelimli Programlaman�n ilkelerini ve s�n�flar aras� ili�ki durumlar�n� kullanmaya �al���n. (Encapsulation, Inheritance, Polymorphism, Abstraction)

Kodluyoruz Sigorta �irketi 12 katl� bir ofis binas� in�a etmek ve onu en son asans�r teknolojisi ile donatmak istiyor. �irket, bina i�indeki trafik ak��� ihtiya�lar�n� kar��lay�p kar��lamayacaklar�n� g�rmek i�in binan�n asans�rlerinin i�lemlerini modelleyen bir yaz�l�m sim�lat�r� olu�turman�z� istiyor.

Binada, her biri binan�n 12 kat�na ��kabilecek be� asans�r bulunacakt�r. Her asans�r�n yakla��k alt� yeti�kin yolcu kapasitesi vard�r. Asans�rler enerji tasarruflu olacak �ekilde tasarlanm��t�r, bu nedenle yaln�zca gerekti�inde hareket ederler. Her asans�r�n kendi kap�s�, kat g�sterge ����� ve kontrol paneli vard�r. Kontrol panelinde hedef d��meleri, kap� a�ma ve kapama d��meleri ve bir acil durum sinyal d��mesi bulunur.

Binadaki her katta, be� asans�r bo�lu�unun her biri i�in bir kap� ve her kap� i�in bir var�� zili vard�r. Var�� zili, asans�rlerin bir kata vard���n� g�sterir. Her kap�n�n �zerinde bulunan bir sinyal �����, asans�r�n geli�ini ve asans�r�n hareket etti�i y�n� g�sterir. Her katta ayr�ca �� set asans�r �a�r� d��mesi vard�r.

Bir ki�i uygun �a�r� d��mesine (yukar� veya a�a��) basarak bir asans�r� �a��r�r. Bir programlay�c�, araman�n ba�lad��� kata gitmek i�in be� asans�rden birini g�revlendirir. Asans�re girdikten sonra, bir yolcu tipik olarak bir veya daha fazla hedef d��mesine basar. Asans�r kattan kata hareket ederken, asans�r�n i�indeki bir g�sterge ����� yolcular� asans�r�n konumu hakk�nda bilgilendirir. Bir asans�r�n bir kata varmas�, d�� asans�r kap�s�n�n �zerindeki g�sterge lambas�n�n yak�lmas� ve kat zilinin �almas�yla belirtilir. Bir asans�r bir katta durdu�unda, her iki kap� grubu da �nceden belirlenmi� bir s�re boyunca otomatik olarak a��larak yolcular�n asans�re girip ��kmalar�na izin verir.

Sim�lat�r, ger�ek zaman ge�i�ini sim�le etmek ve sim�lasyonda meydana gelen olaylar� zaman damgas� ve g�nl��e kaydetmek i�in bir "saat" kullan�r. Sim�lat�r taraf�ndan yolcu olu�turmak ve her yolcu i�in kalk�� ve var�� katlar�n� belirlemek i�in rastgele bir say� �reteci kullan�l�r.