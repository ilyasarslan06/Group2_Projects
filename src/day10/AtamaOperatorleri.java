package  day10;

public class AtamaOperatorleri {
    public static void main(String[] args) {
      /*
      ATAMAMA OPERATÖRLERİ
      = : Sağndaki Lİteral , değişkeb veta herhangi bir expression'ın sonucunu (result) solounda bulunan
      değişkene kayadeder. (atama yapar.)
      +=
      -=
      *=
      /=
      %=
     */
        int x=5;
       String name="Ali";
       int y=x+7;
       int z=x;

       //burada DEBUG böcek çalıştrarak ve aşağıdaki kırılmış altı çizili ok ile işlem silsilesini görebilir.

        //Bir değişkenin değerini arttırıp tekrar aynı değişken içerisine saklamak.
       int t=1;
       t+=1;             // t=t+1;

       t+=3;             // t=t+3;

        //Bir değişkenin değerini eksiltip tekrar aynı değişken içerisine saklamak.

        int k=7;
        k-=2;                //k=k-2;

        //Bir değişkenin değerini bir sayı ile çarpıp tekrar aynı değişken içerisine saklamak.
        int a=8;
        a*=2;                                        //a=a*2;


        //Bir değişkenin değerini bir sayıya bölüp tekrar aynı değişken içerisine saklamak.

        int u=16;
        u/=2;                    //u=u/2;

        //Bir değişkenin değerinin modunu alıp tekrar aynı değişken içerisine saklamak.

        int mod=11;
        mod%=11;                                //mod=mod%2;

    }


}
