package dataStructuresAndCollections.binarySearchTree;

public class ikiliAgac {

    public ikiliAgacDugum kok;

    public ikiliAgac() {
        this.kok = null;
    }

    public void ekle(int deger) {
        ikiliAgacDugum yeni = new ikiliAgacDugum(deger);
        if (this.kok == null) {
            this.kok = yeni;
            System.out.println("kok :" + deger);
            return;
        }
        ikiliAgacDugum parent = null;
        ikiliAgacDugum aktif = this.kok;
        while (true) {
            parent = aktif;
            if (deger < aktif.veri) {
                aktif = aktif.sol;
                if (aktif == null) {
                    parent.sol = yeni;
                    System.out.println("parent :" + parent.veri + "solunan eklenen :" + yeni.veri);
                    return;
                }
            } else if (deger > aktif.veri) {
                aktif = aktif.sag;
                if (aktif == null) {
                    parent.sag = yeni;
                    System.out.println("parent : " + parent.veri + " sagına eklenen : " + yeni.veri);
                    return;
                }
            } else {
                System.out.println(" bu degerden var ");
                return;
            }
        }

    }

    public ikiliAgacDugum maxDugum(ikiliAgacDugum kokDugum) {
        if (kokDugum == null) {
            return null;
        }
        ikiliAgacDugum aktif = kokDugum;
        while (aktif.sag != null) {
            aktif = aktif.sag;
        }
        return aktif;
    }

    public ikiliAgacDugum minDugum(ikiliAgacDugum kokDugum) {
        if (kokDugum == null) {
            return null;
        }
        ikiliAgacDugum aktif = kokDugum;
        while (aktif.sol != null) {
            aktif = aktif.sol;
        }
        return aktif;
    }

    public ikiliAgacDugum dugumBul(int deger) {
        if (this.kok == null) {
            return null;
        }
        ikiliAgacDugum aktif = this.kok;
        while (aktif != null) {
            if (aktif.veri == deger) {
                return aktif;
            } else if (deger < aktif.veri) {
                aktif = aktif.sol;
            } else if (deger > aktif.veri) {
                aktif = aktif.sag;
            }
        }
        return null;
    }

    public ikiliAgacDugum dugumSil(ikiliAgacDugum kokDugum, int deger) {
        if (kokDugum == null) {
            System.out.println("Silme başarısız");
            return null;
        }
        if (deger < kokDugum.veri) {
            kokDugum.sol = dugumSil(kokDugum.sol, deger);
            return kokDugum;
        } else if (deger > kokDugum.veri) {
            kokDugum.sag = dugumSil(kokDugum.sag, deger);
            return kokDugum;
        } else {
            if (kokDugum.sol != null && kokDugum.sag != null) {
                ikiliAgacDugum temp = this.minDugum(kokDugum.sag);
                kokDugum.veri = temp.veri;
                kokDugum.sag = dugumSil(kokDugum.sag, temp.veri);
                System.out.println("kontrol_sol_sag_cocuk");
                return kokDugum;
            } else if (kokDugum.sol != null) {
                kokDugum = kokDugum.sol;
                kokDugum.sol = null;
                System.out.println("kontrol_tek_sol_cocuk");
                return kokDugum;
            } else if (kokDugum.sag != null) {
                kokDugum = kokDugum.sag;
                kokDugum.sag = null;
                System.out.println("kontrol_tek_sag_cocuk");
                return kokDugum;
            } else {
                System.out.println("kontrol yaprak");
                kokDugum = null;
                return null;
            }
        }
    }

    public void inOrderTraverse(ikiliAgacDugum localRoot) {
        if (localRoot != null) {
            inOrderTraverse(localRoot.sol);
            localRoot.yazdir();
            inOrderTraverse(localRoot.sag);
        }
    }

}
