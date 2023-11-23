public class Nested_Try_Catch {
    public static void main(String[] args) {
        int [] marks =  new int[3];
        marks[0]=7;
        marks[1]=56;
        marks[2]=6;
        try{
            System.out.println("Welcome to video no 82");

        try{
            System.out.println(marks[9]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Sorry this index does not exits");
        }
    }
    catch (Exception e){
        System.out.println("Exception in level 1");
        }
    }
}
