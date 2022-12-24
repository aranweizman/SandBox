public class Branch {
    String branchName;
    public Branch(String name){
        System.out.println("This is the branch");
        this.branchName = name;
    }

    public String getName(){
        return branchName;
    }
}
