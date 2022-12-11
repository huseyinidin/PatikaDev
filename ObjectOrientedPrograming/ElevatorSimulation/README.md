# Ödev - Asansör Simülasyonu

Aþaðýdaki problem ifadesine göre bir sýnýf diyagramý tasarlayýn.

Nesne Yönelimli Programlamanýn ilkelerini ve sýnýflar arasý iliþki durumlarýný kullanmaya çalýþýn. (Encapsulation, Inheritance, Polymorphism, Abstraction)

Kodluyoruz Sigorta Þirketi 12 katlý bir ofis binasý inþa etmek ve onu en son asansör teknolojisi ile donatmak istiyor. Þirket, bina içindeki trafik akýþý ihtiyaçlarýný karþýlayýp karþýlamayacaklarýný görmek için binanýn asansörlerinin iþlemlerini modelleyen bir yazýlým simülatörü oluþturmanýzý istiyor.

Binada, her biri binanýn 12 katýna çýkabilecek beþ asansör bulunacaktýr. Her asansörün yaklaþýk altý yetiþkin yolcu kapasitesi vardýr. Asansörler enerji tasarruflu olacak þekilde tasarlanmýþtýr, bu nedenle yalnýzca gerektiðinde hareket ederler. Her asansörün kendi kapýsý, kat gösterge ýþýðý ve kontrol paneli vardýr. Kontrol panelinde hedef düðmeleri, kapý açma ve kapama düðmeleri ve bir acil durum sinyal düðmesi bulunur.

Binadaki her katta, beþ asansör boþluðunun her biri için bir kapý ve her kapý için bir varýþ zili vardýr. Varýþ zili, asansörlerin bir kata vardýðýný gösterir. Her kapýnýn üzerinde bulunan bir sinyal ýþýðý, asansörün geliþini ve asansörün hareket ettiði yönü gösterir. Her katta ayrýca üç set asansör çaðrý düðmesi vardýr.

Bir kiþi uygun çaðrý düðmesine (yukarý veya aþaðý) basarak bir asansörü çaðýrýr. Bir programlayýcý, aramanýn baþladýðý kata gitmek için beþ asansörden birini görevlendirir. Asansöre girdikten sonra, bir yolcu tipik olarak bir veya daha fazla hedef düðmesine basar. Asansör kattan kata hareket ederken, asansörün içindeki bir gösterge ýþýðý yolcularý asansörün konumu hakkýnda bilgilendirir. Bir asansörün bir kata varmasý, dýþ asansör kapýsýnýn üzerindeki gösterge lambasýnýn yakýlmasý ve kat zilinin çalmasýyla belirtilir. Bir asansör bir katta durduðunda, her iki kapý grubu da önceden belirlenmiþ bir süre boyunca otomatik olarak açýlarak yolcularýn asansöre girip çýkmalarýna izin verir.

Simülatör, gerçek zaman geçiþini simüle etmek ve simülasyonda meydana gelen olaylarý zaman damgasý ve günlüðe kaydetmek için bir "saat" kullanýr. Simülatör tarafýndan yolcu oluþturmak ve her yolcu için kalkýþ ve varýþ katlarýný belirlemek için rastgele bir sayý üreteci kullanýlýr.