package at.htl.bank.model;

public class GiroKonto extends BankKonto{
    private double gebuehr;

    public GiroKonto(String name, double gebuehr) {
        super(name);
        this.gebuehr = gebuehr;
    }

    public GiroKonto(String name, double kontoStand, double gebuehr) {
        super(name, kontoStand);
        this.gebuehr = gebuehr;
    }

    @Override
    public void einzahlen(double betrag){
        this.kontoStand += betrag - gebuehr;
    }

    @Override
    public void abheben(double betrag){
        this.kontoStand -= betrag + gebuehr;
    }
}
