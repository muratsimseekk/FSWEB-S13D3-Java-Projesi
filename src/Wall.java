public class Wall {
    double width ;
    double height;

    public Wall() {}

    public Wall (double width , double height) {
        this.width = width;
        this.height=height;
    }

    public double getWidth() {
        return width;
    }
    public double getHeight(){
        return height;
    }

    public void setWidth(double width) {

        if (width < 0){
            this.width =0;

        }
        else {
            this.width=width;

        }
    }
    public double setHeight(double height){
        if (height < 0){
            this.height = 0;

        }
        else {
            this.height = height;

        }
    }
    public double getArea() {
        return width*height;
    }
}
