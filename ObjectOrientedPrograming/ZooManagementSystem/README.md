# �dev - Hayvanat Bah�esi Y�netimi 

Bir hayvanat bah�esindeki hayvanlar hakk�ndaki bilgileri takip etmek i�in bir sistem tasarl�yoruz.

## Hayvanlar:
* Atlar (atlar, zebralar, e�ekler vb.),
* Kedigiller (kaplanlar, aslanlar vb.),
* Kemirgenler (s��anlar, kunduzlar vb.) gibi gruplardaki t�rlerle karakterize edilir.
* Hayvanlar hakk�nda depolanan bilgilerin �o�u t�m gruplamalar i�in ayn�d�r.
* T�r ad�, a��rl���, ya�� vb.
* Sistem ayr�ca her hayvan i�in belirli ila�lar�n dozaj�n� alabilmeli => **getDosage ()**
* Sistem Yem verme zamanlar�n� hesaplayabilmelidir => **getFeedSchedule ()**
* Sistemin bu i�levleri yerine getirme mant���, her gruplama i�in farkl� olacakt�r. �rne�in, atlar i�in yem verme algoritmas� farkl� olup, kaplanlar i�in farkl� olacakt�r.

Polimorfizm modelini kullanarak, yukar�da a��klanan durumu ele almak i�in bir s�n�f diyagram� tasarlay�n.