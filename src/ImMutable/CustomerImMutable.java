package ImMutable;

public class CustomerImMutable {
    //1. Immutable classlardan ne ucun istifade edirik ? Thread Safety e gore. yeni tehlukesizliye gore
    //2. ImMutable classlarin state leri yeni deyisenleri deyise bilmez
    //3. Performans itkisi olmayacaqsa immutable classlarla islemek ustunlukdur


   private String name=null;                   //(Bunun deyerini deyismirikse effectively Final deyilir)
    private Mercedes m = null;


    public String getName() {
        return name;
    }
    public Mercedes getM() {
        Mercedes mm = new Mercedes(); // eger 17 18 cu setir olmasaydi mercedes classindaki namei biz deyise bilirdik.
        mm.name=m.name;                 //ve bu zaman immutable olmur
        return mm;
    }




    public CustomerImMutable(String name,Mercedes m){
        Mercedes mm = new Mercedes(); // 26  27 ci setir kod olmasaydi obyektin icindeki m immutable olmurdu.
        mm.name=m.name;                 // onu biz rahatliqla deyisirdik
        this.m=mm;
        this.name=name;
    }






}
