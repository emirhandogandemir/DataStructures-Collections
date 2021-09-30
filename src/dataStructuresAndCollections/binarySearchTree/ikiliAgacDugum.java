package dataStructuresAndCollections.binarySearchTree;

public class ikiliAgacDugum {
    public int veri;
    public ikiliAgacDugum sol;
    public ikiliAgacDugum sag;

    public ikiliAgacDugum(int deger) {
        this.veri = deger;
        this.sol = null;
        this.sag = null;

    }

    public void yazdir() {
        System.out.println("-> " + this.veri);
    }
}
