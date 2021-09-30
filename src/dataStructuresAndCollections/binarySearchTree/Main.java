package dataStructuresAndCollections.binarySearchTree;

public class Main {
    public static void main(String[] args) {
        ikiliAgac yeni = new ikiliAgac();
        yeni.ekle(10);
        yeni.ekle(5);
        yeni.ekle(15);
        yeni.ekle(3);
        yeni.ekle(7);
        yeni.ekle(12);
        yeni.ekle(20);
        yeni.ekle(8);
        System.out.println("AGACTAKİ EN BÜYÜK DEGER : " + yeni.maxDugum(yeni.kok).veri);
        System.out.println("AGACTAKİ EN KÜCÜK ELEMAN : " + yeni.minDugum(yeni.kok).veri);
        ikiliAgacDugum bulunan = yeni.dugumBul(8);
        if (bulunan != null) {
            System.out.println("bulunan veri : " + bulunan.veri);
        } else {
            System.out.println("deger bulunamadı");
        }
        yeni.inOrderTraverse(yeni.kok);
        System.out.println("---------");
        yeni.dugumSil(yeni.kok, 7);
        yeni.inOrderTraverse(yeni.kok);
    }
}
