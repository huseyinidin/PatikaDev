# Ödev - Maaþ Hesaplayýcý

Java'da "Employee" adýnda fabrika çalýþanlarýný temsil eden ve metotlarý ile çalýþanlarýn maaþlarýný hesaplayan bir sýnýf yazmalýsýnýz. Bu sýnýf 4 nitelik ve 5 metoda sahip olacaktýr.

**Sýnýfýn Nitelikleri**

* name : Çalýþanýn adý ve soyadý
* salary : Çalýþanýn maaþý
* workHours : Haftalýk çalýþma saati
* hireYear : Ýþe baþlangýç yýlý

**Sýnýfýn Metotlarý**

* Employee(name,salary,workHours,hireYear) : Kurucu metot olup 4 parametre alacaktýr.
*tax() : Maaþa uygulanan vergiyi hesaplayacaktýr.
*Çalýþanýn maaþý 1000 TL'den az ise vergi uygulanmayacaktýr.
*Çalýþanýn maaþý 1000 TL'den fazla ise maaþýnýn %3'ü kadar vergi uygulanacaktýr.
*bonus() : Eðer çalýþan haftada 40 saatten fazla çalýþmýþ ise fazladan çalýþtýðý her saat baþýna 30 TL olacak þekilde bonus ücretleri hesaplayacaktýr.
*raiseSalary() : Çalýþanýn iþe baþlangýç yýlýna göre maaþ artýþýný hesaplayacaktýr. Þuan ki yýlý 2021 olarak alýn.
*Eðer çalýþan 10 yýldan az bir süredir çalýþýyorsa maaþýna %5 zam yapýlacaktýr.
*Eðer çalýþan 9 yýldan fazla ve 20 yýldan az çalýþýyorsa maaþýna %10 zam yapýlacaktýr.
*Eðer çalýþan 19 yýldan fazla çalýþýyorsa %15 zam yapýlacaktýr.
*toString() : Çalýþana ait bilgileri ekrana bastýracaktýr.

Örnek :

```
> Adý : kemal
> Maaþý : 2000.0
> Çalýþma Saati : 45
> Baþlangýç Yýlý : 1985
> Vergi : 60.0
> Bonus : 150.0
> Maaþ Artýþý : 390.0
> Vergi ve Bonuslar ile birlikte maaþ : 2090.0
> Toplam Maaþ : 2390.0
```