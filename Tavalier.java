import java.util.ArrayList;

class Tavalier extends Piece{
    
    public Tavalier(){
	super('B', new Position());
    }

    public Tavalier(char couleur, Position position){
	super(couleur, position);
    }


    public String getType(){
    	return new String("tavalier");
    }
    

    public ArrayList<Position> getDeplacementPossible(Plateau pl)
    {
	ArrayList<Position> liste = new ArrayList<Position>();
	int positionDepartX = this.getPosition().getX();
	int positionDepartY = this.getPosition().getY();

