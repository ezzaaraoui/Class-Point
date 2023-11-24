
public class Point{
    private int ordonne;
    private int abscisse;

    public Point(int abscisse, int ordonne){
        this.abscisse = abscisse;
        this.ordonne = ordonne;
    }

    public int GetAbscisse(){
        return abscisse ;
    }
    public int GetOrdonne(){
        return ordonne;
    }

    public void SetAbscisse(int newAbscisse){
        this.abscisse = newAbscisse;
    }
    public void SetOrdonne(int newOrdonne){
        this.ordonne = newOrdonne;
    }


    public double Distance(Point p1){
        int dx = abscisse - p1.GetAbscisse();
        int dy = ordonne - p1.GetOrdonne();
        return Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2)) ;
    }

    public double norme(){
        return Math.sqrt(Math.pow(abscisse, 2) + Math.pow(ordonne, 2)) ;
    }


}

