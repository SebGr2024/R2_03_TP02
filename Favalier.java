import java.util.ArrayList;

class Favalier extends Piece {

    public Favalier() {
        super('B', new Position());
    }

    public Favalier(char couleur, Position position) {
        super(couleur, position);
    }

    public String getType() {
        return "favalier";
    }

    public ArrayList<Position> getDeplacementPossible(Plateau pl) {
        ArrayList<Position> liste = new ArrayList<>();

        Fou f = new Fou(this.getCouleur(), this.getPosition());
        liste.addAll(f.getDeplacementPossible(pl));

     
        Cavalier c = new Cavalier(this.getCouleur(), this.getPosition());
        ArrayList<Position> deplacementsCavalier = c.getDeplacementPossible(pl);

        
        for (Position p : deplacementsCavalier) {
            if (!liste.contains(p)) {
                liste.add(p);
            }
        }

        return liste;
    }
}

