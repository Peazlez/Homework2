public class Grove{
    public String name;
    public Tree[] trees = new Tree[16];

    public Grove(String name){
        this.name=name;
        trees = new Tree[16];
        
    }

    public int Plant(Tree newTree){
        for (int i=0 ; i < 16; i++){
            if (this.trees[i] == null){
                this.trees[i] = newTree;
                return i;
            }

        }

        return -1;
    }

    public Tree UnPlant(int spot){
        Tree root = this.trees[spot];
        this.trees[spot] = null;
        return root;

    }

    public String toString(){
        int counter = 0;
        for (int i = 0 ; i < 16 ; i++){
            if (this.trees[i] == null){
                counter+=0;
            }
            else{
                counter+=1;
            }

        }
        return "" + counter;

    }

}
