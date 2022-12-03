# Ödev - Hayvanat Bahçesi Yönetimi 

Bir hayvanat bahçesindeki hayvanlar hakkýndaki bilgileri takip etmek için bir sistem tasarlýyoruz.

## Hayvanlar:
* Atlar (atlar, zebralar, eþekler vb.),
* Kedigiller (kaplanlar, aslanlar vb.),
* Kemirgenler (sýçanlar, kunduzlar vb.) gibi gruplardaki türlerle karakterize edilir.
* Hayvanlar hakkýnda depolanan bilgilerin çoðu tüm gruplamalar için aynýdýr.
* Tür adý, aðýrlýðý, yaþý vb.
* Sistem ayrýca her hayvan için belirli ilaçlarýn dozajýný alabilmeli => **getDosage ()**
* Sistem Yem verme zamanlarýný hesaplayabilmelidir => **getFeedSchedule ()**
* Sistemin bu iþlevleri yerine getirme mantýðý, her gruplama için farklý olacaktýr. Örneðin, atlar için yem verme algoritmasý farklý olup, kaplanlar için farklý olacaktýr.

Polimorfizm modelini kullanarak, yukarýda açýklanan durumu ele almak için bir sýnýf diyagramý tasarlayýn.