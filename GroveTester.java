public class GroveTester {
    public static void main(String args[]){
        Grove Grove1 = new Grove("Emerald");
        System.out.println(Grove1);
        Tree tree1 = new Tree(01, 37, "Spruce");
        Grove1.Plant(tree1);
        Tree tree2 = new Tree(02, 37, "Spruce");
        Grove1.Plant(tree2);
        Tree tree3 = new Tree(03, 37, "Spruce");
        Grove1.Plant(tree3);
        Tree tree4 = new Tree(04, 37, "Spruce");
        Grove1.Plant(tree4);
        Tree tree5 = new Tree(05, 37, "Spruce");
        Grove1.Plant(tree5);
        Tree tree6 = new Tree(06, 37, "Spruce");
        Grove1.Plant(tree6);
        System.out.println(Grove1);
        Grove1.UnPlant(3);
        Grove1.UnPlant(5);
        System.out.println(Grove1);
        Tree tree7 = new Tree(07, 13, "Maple");
        Grove1.Plant(tree7);
        System.out.println(Grove1);

    }
    
}
