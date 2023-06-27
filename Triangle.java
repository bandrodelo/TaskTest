package Test03;

public class Triangle {
    private Point a;
    private Point b;
    private Point c;

    public Point getA() {
        return a;
    }

    public Point getB() {
        return b;
    }

    public Point getC() {
        return c;
    }

    public Triangle(Point a, Point b, Point c) {
        if ((a.getX()-b.getX())*(c.getY()-b.getY())-(a.getY()-b.getY())*(c.getX()-b.getX())==0)
            throw new IllegalArgumentException("Triangle is degenerative");
        this.a=a;
        this.b=b;
        this.c=c;
    }

    public double area() {
        double sideA = a.distanceTo(b);
        double sideB = a.distanceTo(c);
        double sideC = b.distanceTo(c);
        double s = (sideA + sideB + sideC) / 2;
        double areaTriangle = Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
        if (areaTriangle == 0) {
            throw new IllegalArgumentException("The area triangle can't be calculated");
        }
        return areaTriangle;
    }

    public Point centroid(){
        double xc= (((a.getX()+b.getX()+c.getX())/3));
        double yc= (((a.getY()+b.getY()+c.getY())/3));
        return new Point(xc, yc);
    }

}
