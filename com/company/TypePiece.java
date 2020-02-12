package com.company;

public class TypePiece {
    private short h;
    private short l;
    private short[][] coordonnees;
    private short nbPieces;
    private short nbPiecesRestante;


    public TypePiece(short h, short l, short nbPieces) {
        this.h = h;
        this.l = l;
        this.coordonnees = new short[nbPieces][3];
        this.nbPieces = nbPieces;
        this.nbPiecesRestante = nbPieces;

    }

    public short getH() {
        return h;
    }

    public short getL() {
        return l;
    }

    public short getNbPieces() {
        return nbPieces;
    }

    /*
    permet de placer une piece avec le coin bas gauche au coordonnés (x,y)
    numPlaque : numéro de la plaque sur laquelle mettre la pièce
     */
    boolean placer(short x, short y, short numPlaque){

        if(nbPiecesRestante >0){
            short numPiece = (short)(nbPieces - nbPiecesRestante);
            this.coordonnees[numPiece][0] = x;
            this.coordonnees[numPiece][1] = y;
            this.coordonnees[numPiece][2] = numPlaque;
            --nbPiecesRestante;
            return true;
        }
        return false;
    }
}
