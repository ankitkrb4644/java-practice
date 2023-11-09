 class cylinder{
        private int radius;
        private int height;
        public int getRadius(){
            return radius;
        }
        public void setRadius(int radius){
            this.radius= radius;
        }
        public int getHeight(){
            return height;
        }
        public void setHeight(int height){
            this.height = height;
        }
        public double surfaceArea(){
            return 2*3.142*radius+2*3.14*radius*height;
        }
    }
    public class access_modifier_constructor {
        public static void main(String[] args){
            cylinder mycylinder = new cylinder();
            mycylinder.setHeight(9);
            int h = mycylinder.getHeight();
            System.out.println(h);
            mycylinder.setRadius(12);
            int h1 = mycylinder.getRadius();
            System.out.println(mycylinder.surfaceArea());
        }
    }
